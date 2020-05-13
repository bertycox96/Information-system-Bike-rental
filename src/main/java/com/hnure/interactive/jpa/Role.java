package com.hnure.interactive.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long roleId;
    @Column(name = "name", nullable = false)
    private final String name;
    @OneToMany(mappedBy = "role", fetch = FetchType.LAZY)
    private List<User> users;

    public Role() {
        name = "user";
    }
}
