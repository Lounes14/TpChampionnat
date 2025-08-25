package com.example.tpchampionatgestion.models;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "teams")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(name = "creation_date")
    private LocalDate creationDate;

    private String logo;

    private String coach;

    private String president;

    private String status;

    private String siege;

    private String phone;

    @Column(name = "web_site")
    private String webSite;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stadium_id")
    private Stadium stadium;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id")
    private Country country;

    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<TeamChampionship> teamChampionships;

    @OneToMany(mappedBy = "team1", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Game> gamesAsTeam1;

    @OneToMany(mappedBy = "team2", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Game> gamesAsTeam2;

    // Constructors
    public Team() {}

    public Team(String name, LocalDate creationDate, String logo, String coach,
                String president, String status, String siege, String phone, String webSite) {
        this.name = name;
        this.creationDate = creationDate;
        this.logo = logo;
        this.coach = coach;
        this.president = president;
        this.status = status;
        this.siege = siege;
        this.phone = phone;
        this.webSite = webSite;
    }

    // Getters and Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public LocalDate getCreationDate() { return creationDate; }
    public void setCreationDate(LocalDate creationDate) { this.creationDate = creationDate; }

    public String getLogo() { return logo; }
    public void setLogo(String logo) { this.logo = logo; }

    public String getCoach() { return coach; }
    public void setCoach(String coach) { this.coach = coach; }

    public String getPresident() { return president; }
    public void setPresident(String president) { this.president = president; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getSiege() { return siege; }
    public void setSiege(String siege) { this.siege = siege; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getWebSite() { return webSite; }
    public void setWebSite(String webSite) { this.webSite = webSite; }

    public Stadium getStadium() { return stadium; }
    public void setStadium(Stadium stadium) { this.stadium = stadium; }

    public Country getCountry() { return country; }
    public void setCountry(Country country) { this.country = country; }

    public List<TeamChampionship> getTeamChampionships() { return teamChampionships; }
    public void setTeamChampionships(List<TeamChampionship> teamChampionships) { this.teamChampionships = teamChampionships; }

    public List<Game> getGamesAsTeam1() { return gamesAsTeam1; }
    public void setGamesAsTeam1(List<Game> gamesAsTeam1) { this.gamesAsTeam1 = gamesAsTeam1; }

    public List<Game> getGamesAsTeam2() { return gamesAsTeam2; }
    public void setGamesAsTeam2(List<Game> gamesAsTeam2) { this.gamesAsTeam2 = gamesAsTeam2; }
}