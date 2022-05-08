package fatec.sp.gov.br.firstspring.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

// import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;

import fatec.sp.gov.br.firstspring.view.View;

@Entity
@Table(name = "profile")
public class Profile {
    
    @JsonView({View.Profile.class, View.UserProfile.class})
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @JsonView({View.Profile.class, View.UserProfile.class})
    @OneToOne
    @JoinColumn(name = "login_id", referencedColumnName = "id")
    private Login login;

    @JsonView({View.Profile.class, View.UserProfile.class})
    @Column(name = "name")
    private String name;

    @JsonView(View.Profile.class)
    @Column(name = "doc")
    private String doc;

    @JsonView(View.Profile.class)
    @Column(name = "gender")
    private String gender;

    @JsonView(View.Profile.class)
    @Column(name = "birthday")
    private Date birthday;

    @JsonView(View.Profile.class)
    @Column(name = "phone")
    private String phone;

    @JsonView(View.Profile.class)
    @Column(name = "mobile")
    private String mobile;

    @JsonView(View.Profile.class)
    @Column(name = "created_at")
    private Date created_at;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

}
