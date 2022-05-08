package fatec.sp.gov.br.firstspring.controller;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fatec.sp.gov.br.firstspring.entity.Auth;
import fatec.sp.gov.br.firstspring.service.AuthService;
import fatec.sp.gov.br.firstspring.view.View;

@RestController
@CrossOrigin
@RequestMapping(value = "/auth")
public class AuthController {

    @Autowired
    private AuthService authService;
    
    @JsonView(View.Auth.class)
    @GetMapping(value = "/all")
    public List<Auth> getAllAuths(){
        return authService.getAll();
    }

    @JsonView(View.Auth.class)
    @GetMapping()
    public Auth getLoginByEmail(@RequestParam(value = "permission") String permission){
        return authService.getAuthByName(permission);
    }

}
