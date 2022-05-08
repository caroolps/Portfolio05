package fatec.sp.gov.br.firstspring.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fatec.sp.gov.br.firstspring.entity.Login;
import fatec.sp.gov.br.firstspring.entity.Profile;
import fatec.sp.gov.br.firstspring.repository.LoginRepository;
import fatec.sp.gov.br.firstspring.repository.ProfileRepository;

@Service("profileService")
public class ProfileServiceImpl implements ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    @Autowired
    private LoginRepository loginRepository;

    @Override
    public List<Profile> getAll() {
        List<Profile> profiles = new ArrayList<Profile>();
        for(Profile profile: profileRepository.findAll()){
            profiles.add(profile);
        }
        return profiles;
    }

    @Override
    @PreAuthorize("isAuthenticated()")
    public Profile getProfileById(long id) {
        Optional<Profile> profile = profileRepository.findById(id);
        if(profile.isPresent()){
            return profile.get();
        }
        throw new RuntimeException("User not found");
    }

    @Override
    @Transactional
    @PreAuthorize("isAuthenticated()")
    public Profile postProfile(Profile profile) {

        Login login = loginRepository.getById(profile.getLogin().getId());

        if(login == null){
            throw new RuntimeException("Login não encontrado");
        }else{

            profile.setLogin(login);
            profile.setName(profile.getName());
            profile.setDoc(profile.getDoc());
            profile.setGender(profile.getGender());
            profile.setBirthday(profile.getBirthday());
            profile.setPhone(profile.getPhone());
            profile.setMobile(profile.getMobile());

            profileRepository.save(profile);

            Profile newProfile = profileRepository.getById(profile.getId());

            return newProfile;
            
        }

    }

    @Override
    @PreAuthorize("isAuthenticated()")
    public void deleteProfileById(Long id) {
        profileRepository.deleteById(id);
    }

    @Override
    @PreAuthorize("isAuthenticated()")
    public Profile putProfile(Profile newProfile) {

        Profile profile = profileRepository.getById(newProfile.getId());

        if(profile == null){
            throw new RuntimeException("Perfil não encontrado");
        }else{

            profile.setName(newProfile.getName());
            profile.setDoc(newProfile.getDoc());
            profile.setGender(newProfile.getGender());
            profile.setBirthday(newProfile.getBirthday());
            profile.setPhone(newProfile.getPhone());
            profile.setMobile(newProfile.getMobile());

            profileRepository.save(profile);

            Profile updatedProfile = profileRepository.getById(profile.getId());
            return updatedProfile;
        }
    }
    
}
