package org.practice2020.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "login", nullable = false, length = 10, unique = true)
    private String login;

    @Column(name = "password", nullable = false, length = 6)
    @JsonIgnoreProperties(allowSetters = true)
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_id")
    private Profile profile;

    public User() {
    }

    public User(String login, String password, Profile profile) {
        this.login = login;
        this.password = password;
        this.profile = profile;
    }

    public Long getId() {
        return Id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
