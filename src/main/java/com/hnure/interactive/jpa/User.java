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
import java.util.Objects;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "login", nullable = false)
    private String login;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "birth_year", nullable = false)
    private Integer birthYear;
    @Column(name = "coins", nullable = false)
    private Integer coins;
    @OneToMany(mappedBy = "userOrder", fetch = FetchType.LAZY)
    private List<Purchase> purchases;
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;

    @OneToMany(mappedBy = "userPlayer", fetch = FetchType.LAZY)
    private List<PlayerStats> playerstats;

    public User() {
        birthYear = 0;
        password = "21";
        coins = 0;
        //login="1";
        role = new Role();
    }

    public User(String name1, String email1) {
        name = name1;
        email = email1;
        // birthYear=0;
        //  password="21";
        //  coins=0;
        //   login="1";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public Integer getCoins() {
        return coins;
    }

    public void setCoins(Integer coins) {
        this.coins = coins;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<Purchase> purchases) {
        this.purchases = purchases;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<PlayerStats> getPlayerstats() {
        return playerstats;
    }

    public void setPlayerstats(List<PlayerStats> playerstats) {
        this.playerstats = playerstats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getId().equals(user.getId()) &&
            getName().equals(user.getName()) &&
            getEmail().equals(user.getEmail()) &&
            Objects.equals(getLogin(), user.getLogin()) &&
            Objects.equals(getPassword(), user.getPassword()) &&
            Objects.equals(getBirthYear(), user.getBirthYear()) &&
            Objects.equals(getCoins(), user.getCoins()) &&
            Objects.equals(getPurchases(), user.getPurchases()) &&
            Objects.equals(getRole(), user.getRole()) &&
            Objects.equals(getPlayerstats(), user.getPlayerstats());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getEmail(), getLogin(), getPassword(), getBirthYear(), getCoins(), getPurchases(), getRole(), getPlayerstats());
    }

    @Override
    public String toString() {
        return "User{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", email='" + email + '\'' +
            ", login='" + login + '\'' +
            ", password='" + password + '\'' +
            ", birthYear=" + birthYear +
            ", coins=" + coins +
            ", purchases=" + purchases +
            ", role=" + role +
            ", playerstats=" + playerstats +
            '}';
    }
    // standard constructors / setters / getters / toString
}
