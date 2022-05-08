package fatec.sp.gov.br.firstspring.controller;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fatec.sp.gov.br.firstspring.entity.Login;
import fatec.sp.gov.br.firstspring.entity.Profile;
import fatec.sp.gov.br.firstspring.service.LoginService;
import fatec.sp.gov.br.firstspring.view.View;

@RestController
@CrossOrigin
@RequestMapping(value = "/login")
public class LoginController {
    
    @Autowired
    private LoginService loginService;

    @JsonView(View.Login.class)
    @GetMapping(value = "/all")
    public List<Login> getAllLogins(){
        return loginService.getAll();
    }

    @JsonView(View.Login.class)
    @GetMapping(value = "/{id}")
    public Login getLoginById(@PathVariable("id") Long id){
        return loginService.getLoginById(id);
    }

    @JsonView(View.Login.class)
    @GetMapping(value = "/email")
    public Login getLoginByEmail(@RequestParam(value = "email") String email){
        return loginService.getLoginByEmail(email);
    }

    @JsonView(View.Login.class)
    @PostMapping(value="/new")
    public Login postLogin(@RequestBody Login login) {
        return loginService.postLogin(login);
    }

    @JsonView(View.Login.class)
    @PutMapping(value="/edit/{id}")
    public Login putLogin(@RequestBody Login login){
        return loginService.putLogin(login);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Login> delete(@PathVariable("id") Long id) {
        loginService.deleteLoginById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @JsonView(View.Profile.class)
    @GetMapping(value="/profile/{id}")
    public Profile getProfileByLogin (@PathVariable("id") Long id){
        return loginService.getProfileByLoginId(id);
    }

}
