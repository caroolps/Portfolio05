package fatec.sp.gov.br.firstspring.controller;

import com.fasterxml.jackson.core.JsonProcessingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fatec.sp.gov.br.firstspring.dto.LoginDto;
import fatec.sp.gov.br.firstspring.utils.JwtUtils;

@RestController
@CrossOrigin
@RequestMapping(value = "/token")
public class TokenController {

    @Autowired
    private AuthenticationManager authManager;
    
    @PostMapping("")
    public LoginDto getToken(@RequestBody LoginDto loginDto) throws JsonProcessingException{

        System.out.print(loginDto.getEmail());
        System.out.print(loginDto.getPassword());

        Authentication auth = new UsernamePasswordAuthenticationToken(loginDto.getEmail(), loginDto.getPassword());
        auth = authManager.authenticate(auth);

        loginDto.setPassword(null);
        loginDto.setToken(JwtUtils.generateToken(auth));
        

        return loginDto;
    }

}
