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
import org.springframework.web.bind.annotation.RestController;

import fatec.sp.gov.br.firstspring.entity.Profile;
import fatec.sp.gov.br.firstspring.service.ProfileService;
import fatec.sp.gov.br.firstspring.view.View;

@RestController
@CrossOrigin
@RequestMapping(value = "/profile")
public class ProfileController {

    @Autowired
    private ProfileService profileService;
    
    @JsonView(View.Profile.class)
    @GetMapping(value = "/all")
    public List<Profile> getAllProfiles(){
        return profileService.getAll();
    }

    @JsonView(View.Profile.class)
    @GetMapping(value = "/{id}")
    public Profile getProfile(@PathVariable("id") long id){
        return profileService.getProfileById(id);
    }

    @JsonView(View.Profile.class)
    @PostMapping(value="/new")
    public Profile postProfile(@RequestBody Profile profile) {
        return profileService.postProfile(profile);
    }

    @JsonView(View.Profile.class)
    @PutMapping(value="/edit/{id}")
    public Profile putProfile(@RequestBody Profile profile){
        return profileService.putProfile(profile);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Profile> delete(@PathVariable("id") Long id) {
        profileService.deleteProfileById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
