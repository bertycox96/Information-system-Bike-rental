package com.hnure.interactive.jpa;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;

    @Column(name = "price", nullable = false)
    private Integer price;
    @Column(name = "completed_num", nullable = false)
    private Integer completedNum;
    @Column(name = "rate", nullable = false)
    private Double rate;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @Column(name = "profit", nullable = false)
    private Integer profit;

    @OneToMany(mappedBy = "courseOrder", fetch = FetchType.LAZY)
    private List<Purchase> purchases;

    @OneToMany(mappedBy = "coursePlayer", fetch = FetchType.LAZY)
    private List<PlayerStats> playerstats;

    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "tittle", nullable = false)
    private String tittle;

    public Course() {
        completedNum = 0;
        rate = 0.0;
        category = new Category();
        description = "";

    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getCompletedNum() {
        return completedNum;
    }

    public void setCompletedNum(Integer completedNum) {
        this.completedNum = completedNum;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getProfit() {
        return profit;
    }

    public void setProfit(Integer profit) {
        this.profit = profit;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<Purchase> purchases) {
        this.purchases = purchases;
    }

    public List<PlayerStats> getPlayerstats() {
        return playerstats;
    }

    public void setPlayerstats(List<PlayerStats> playerstats) {
        this.playerstats = playerstats;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
}
