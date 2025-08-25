package com.example.tpchampionatgestion.models;

import jakarta.persistence.*;

@Entity
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "team1_point")
    private Integer team1Point;

    @Column(name = "team2_point")
    private Integer team2Point;

    @Column(name = "id_team1")
    private Integer idTeam1;

    @Column(name = "id_team2")
    private Integer idTeam2;

    @Column(name = "id_day")
    private Integer idDay;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_team1", insertable = false, updatable = false)
    private Team team1;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_team2", insertable = false, updatable = false)
    private Team team2;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_day", insertable = false, updatable = false)
    private Day day;

    // Constructors
    public Game() {}

    public Game(Integer team1Point, Integer team2Point, Integer idTeam1, Integer idTeam2, Integer idDay) {
        this.team1Point = team1Point;
        this.team2Point = team2Point;
        this.idTeam1 = idTeam1;
        this.idTeam2 = idTeam2;
        this.idDay = idDay;
    }

    // Getters and Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Integer getTeam1Point() { return team1Point; }
    public void setTeam1Point(Integer team1Point) { this.team1Point = team1Point; }

    public Integer getTeam2Point() { return team2Point; }
    public void setTeam2Point(Integer team2Point) { this.team2Point = team2Point; }

    public Integer getIdTeam1() { return idTeam1; }
    public void setIdTeam1(Integer idTeam1) { this.idTeam1 = idTeam1; }

    public Integer getIdTeam2() { return idTeam2; }
    public void setIdTeam2(Integer idTeam2) { this.idTeam2 = idTeam2; }

    public Integer getIdDay() { return idDay; }
    public void setIdDay(Integer idDay) { this.idDay = idDay; }

    public Team getTeam1() { return team1; }
    public void setTeam1(Team team1) { this.team1 = team1; }

    public Team getTeam2() { return team2; }
    public void setTeam2(Team team2) { this.team2 = team2; }

    public Day getDay() { return day; }
    public void setDay(Day day) { this.day = day; }
}
