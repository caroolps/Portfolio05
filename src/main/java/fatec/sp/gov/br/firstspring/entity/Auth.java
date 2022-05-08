package fatec.sp.gov.br.firstspring.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

import fatec.sp.gov.br.firstspring.view.View;

@Entity
@Table(name = "auth") //table
public class Auth {
    
    @Id
    @JsonView({View.Login.class, View.Auth.class})
    @Column(name = "id") //column
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto generate of ID
    private long id;

    @JsonView({View.Login.class, View.Auth.class})
    @Column(name = "permission")
    private String permission;

    @JsonView(View.Auth.class)
    @ManyToMany(mappedBy = "authorizations", fetch = FetchType.LAZY) //mapping of relation
    private Set<Login> logins;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public Set<Login> getLogins() {
        return logins;
    }

    public void setLogins(Set<Login> logins) {
        this.logins = logins;
    }

}
