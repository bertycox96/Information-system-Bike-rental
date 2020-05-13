package com.hnure.interactive.jpa;

import javax.persistence.*;
import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long categoryId;

    @Column(name="name",nullable = false)
    private String name;
    @Column (name="description",nullable = false)
    private String description;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private List<Course> courses;

    public Category() {
        name="cat";
        description="";
    }
}
