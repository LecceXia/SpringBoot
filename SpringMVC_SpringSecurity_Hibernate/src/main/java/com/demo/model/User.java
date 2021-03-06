package com.demo.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="USERS")
public class User {
    @Id
    @Column(name="USERNAME")
    private String username;

    @Column(name="PASSWORD", nullable = false)
    private String password;

    @Column(name="ENABLED",nullable = false)
    private boolean enabled;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Authorities> authoritiesSet = new HashSet<>();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Set<Authorities> getAuthoritiesSet() {
        return authoritiesSet;
    }

    public void setAuthoritiesSet(Set<Authorities> authoritiesSet) {
        this.authoritiesSet = authoritiesSet;
    }
}
