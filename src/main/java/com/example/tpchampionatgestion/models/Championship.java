package com.example.tpchampionatgestion.models;


import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "championships")
public class Championship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    private String logo;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "won_point")
    private Integer wonPoint;

    @Column(name = "lost_point")
    private Integer lostPoint;

    @Column(name = "draw_point")
    private Integer drawPoint;

    @Column(name = "type_ranking")
    private String typeRanking;

    @OneToMany(mappedBy = "championship", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<TeamChampionship> teamChampionships;

    @OneToMany(mappedBy = "championship", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Day> days;

    // Constructors
    public Championship() {}

    public Championship(String name, String logo, LocalDate startDate, LocalDate endDate,
                        Integer wonPoint, Integer lostPoint, Integer drawPoint, String typeRanking) {
        this.name = name;
        this.logo = logo;
        this.startDate = startDate;
        this.endDate = endDate;
        this.wonPoint = wonPoint;
        this.lostPoint = lostPoint;
        this.drawPoint = drawPoint;
        this.typeRanking = typeRanking;
    }

    // Getters and Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLogo() { return logo; }
    public void setLogo(String logo) { this.logo = logo; }

    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }

    public LocalDate getEndDate() { return endDate; }
    public void setEndDate(LocalDate endDate) { this.endDate = endDate; }

    public Integer getWonPoint() { return wonPoint; }
    public void setWonPoint(Integer wonPoint) { this.wonPoint = wonPoint; }

    public Integer getLostPoint() { return lostPoint; }
    public void setLostPoint(Integer lostPoint) { this.lostPoint = lostPoint; }

    public Integer getDrawPoint() { return drawPoint; }
    public void setDrawPoint(Integer drawPoint) { this.drawPoint = drawPoint; }

    public String getTypeRanking() { return typeRanking; }
    public void setTypeRanking(String typeRanking) { this.typeRanking = typeRanking; }

    public List<TeamChampionship> getTeamChampionships() { return teamChampionships; }
    public void setTeamChampionships(List<TeamChampionship> teamChampionships) { this.teamChampionships = teamChampionships; }

    public List<Day> getDays() { return days; }
    public void setDays(List<Day> days) { this.days = days; }
}