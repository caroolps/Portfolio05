/**
 * Configuration Class of spring security
 */

package fatec.sp.gov.br.firstspring.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import fatec.sp.gov.br.firstspring.filter.AuthFilter;

@EnableWebSecurity //Enable default spring security config
@EnableGlobalMethodSecurity(prePostEnabled = true) // Enable security by annotation. Where have annotation, its safe.
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable() //disable when front its use REST services to .
        .addFilterBefore(new AuthFilter(), UsernamePasswordAuthenticationFilter.class) //Custom filter to validate user
        .sessionManagement() //Between requests, clear memory
        .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        /**
         * How Spring make the authentication
         */
        auth.userDetailsService(userDetailsService);
    }

    @Bean
    public PasswordEncoder passwordEnconderBean(){
        /**
         * Use Spring Bycrypt Password. Not is possible to annotate third-party class.
         * If change Password Crypt type, this change can make here.
         */
        return new BCryptPasswordEncoder();
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        /**
         * Spring not allow the method. Is necessary set a Bean and Override to enable this method
         */
        return super.authenticationManagerBean();
    }
}
