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
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long categoryId;

    @Column(name = "name", nullable = false)
    private final String name;
    @Column(name = "description", nullable = false)
    private final String description;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private List<Course> courses;

    public Category() {
        name = "cat";
        description = "";
    }
}
