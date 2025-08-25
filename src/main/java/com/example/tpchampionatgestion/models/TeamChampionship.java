package com.example.tpchampionatgestion.models;

import jakarta.persistence.*;

@Entity
@Table(name = "team_championships")
public class TeamChampionship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_championship")
    private Integer idChampionship;

    @Column(name = "id_team")
    private Integer idTeam;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_championship", insertable = false, updatable = false)
    private Championship championship;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_team", insertable = false, updatable = false)
    private Team team;

    // Constructors
    public TeamChampionship() {}

    public TeamChampionship(Integer idChampionship, Integer idTeam) {
        this.idChampionship = idChampionship;
        this.idTeam = idTeam;
    }

    // Getters and Setters
    public Integer getIdChampionship() { return idChampionship; }
    public void setIdChampionship(Integer idChampionship) { this.idChampionship = idChampionship; }

    public Integer getIdTeam() { return idTeam; }
    public void setIdTeam(Integer idTeam) { this.idTeam = idTeam; }

    public Championship getChampionship() { return championship; }
    public void setChampionship(Championship championship) { this.championship = championship; }

    public Team getTeam() { return team; }
    public void setTeam(Team team) { this.team = team; }
}

