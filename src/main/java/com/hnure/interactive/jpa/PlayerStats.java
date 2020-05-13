package com.hnure.interactive.jpa;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "player_stats")
public class PlayerStats {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long playerStatsId;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id", nullable = false)
    private Course coursePlayer;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable = false)
    private User userPlayer;

    @Column(name = "study_percent", nullable = false)
    private Double studyPercent;
    @Column(name = "score", nullable = false)
    private Integer score;
    @Column(name = "wrong_answers", nullable = false)
    private Integer wrongAnswers;
    @Column(name = "ratio", nullable = false)
    private Double ratio;


}

