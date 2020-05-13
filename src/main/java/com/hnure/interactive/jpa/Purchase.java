package com.hnure.interactive.jpa;

import javax.persistence.*;

@Entity
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable = false)
    private User userOrder;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id", nullable = false)
    private Course courseOrder;


}
