package com.hnure.interactive.jpa;

import javax.persistence.*;
import java.util.List;

@Entity
public class Role {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long roleId;
        @Column(name="name",nullable = false)
        private String name;
        @OneToMany(mappedBy = "role", fetch = FetchType.LAZY)
        private List<User> users;

    public Role() {
        name="user";
    }
}
