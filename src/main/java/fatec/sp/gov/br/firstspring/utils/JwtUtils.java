package fatec.sp.gov.br.firstspring.utils;

import java.io.IOException;
import java.util.Date;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import fatec.sp.gov.br.firstspring.dto.LoginDto;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtUtils {

    private static final String KEY = "spring.jwt.sec";
    
    public static String generateToken(Authentication user) throws JsonProcessingException {
        
        ObjectMapper mapper = new ObjectMapper();
        LoginDto userWithoutPass = new LoginDto();

        userWithoutPass.setEmail(user.getName());

        //IF Have permission, get permissions in user and set in new user created
        if(!user.getAuthorities().isEmpty()){
            userWithoutPass.setPermission(user.getAuthorities().iterator().next().getAuthority());
        }

        //Generate JSON with userData
        String userJson = mapper.writeValueAsString(userWithoutPass);

        Date now = new Date();
        Long hour = (1000L * 60L * 60L) * 24; //One Day

        return Jwts.builder().claim("userDetails", userJson)
            .setIssuer("br.gov.sp.fatec")
            .setSubject(user.getName())
            .setExpiration(new Date(now.getTime() + hour))
            .signWith(SignatureAlgorithm.HS512, KEY).compact();
      }
    
      public static Authentication parseToken(String token) throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();

        //Set key to read token and get userDetails data
        String credentialsJson = Jwts.parser().setSigningKey(KEY)
            .parseClaimsJws(token).getBody().get("userDetails",String.class);
        
        //Set credential details like a Login DTO
        LoginDto login = mapper.readValue(credentialsJson, LoginDto.class);

        UserDetails userDetails = User.builder().username(login.getEmail()).password("secret")
            .authorities(login.getPermission()).build();
            
        return new UsernamePasswordAuthenticationToken(login.getEmail(), login.getPassword(),
            userDetails.getAuthorities());
      }

}
