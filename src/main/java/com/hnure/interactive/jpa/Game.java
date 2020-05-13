package com.hnure.interactive.jpa;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    @Column(name = "difficult_level", nullable = false)
    private Integer difficultLevel;
    @Column(name = "score_round", nullable = false)
    private Integer scoreRound;
    @Column(name = "level_score", nullable = false)
    private Integer levelScore;
    @Column(name = "multi_score", nullable = false)
    private Double multiScore;
    @Column(name = "time", nullable = false)
    private Integer time;
    @Column(name = "score_of_level", nullable = false)
    private Integer scoreOfLevel;
    @Column(name = "mulct_wrong", nullable = false)
    private Integer mulctWrong;
    @Column(name = "mulct_time", nullable = false)
    private Integer mulctTime;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "profit_level", nullable = false)
    private Integer profitLevel;

}
