package com.example.tpchampionatgestion.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "days")
public class Day {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String number;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "championship_id")
    private Championship championship;

    @OneToMany(mappedBy = "day", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Game> games;

    // Constructors
    public Day() {}

    public Day(String number) {
        this.number = number;
    }

    // Getters and Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }

    public Championship getChampionship() { return championship; }
    public void setChampionship(Championship championship) { this.championship = championship; }

    public List<Game> getGames() { return games; }
    public void setGames(List<Game> games) { this.games = games; }
}
