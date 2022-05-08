package fatec.sp.gov.br.firstspring.service;

import java.util.List;

import fatec.sp.gov.br.firstspring.entity.Profile;

public interface ProfileService {

    public List<Profile> getAll();

    public Profile getProfileById(long id);

    public Profile postProfile(Profile profile);

    public Profile putProfile(Profile profile);

    public void deleteProfileById(Long id);
    
}
