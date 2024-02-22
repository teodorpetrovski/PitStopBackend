package mk.ukim.finki.pitstopbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import mk.ukim.finki.pitstopbackend.model.enums.PowerUnit;

import java.util.List;

@Data
@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String coverImageUrl;
    private String base;
    private String teamChief;
    private String technicalChief;
    private String chassis;
    @Enumerated(EnumType.STRING)
    private PowerUnit powerUnit;
    private int firstTeamEntry;
    private int worldChampionships;
    private int totalWins;
    private int fastestLaps;

    @OneToMany
    private List<Driver> drivers;

}
