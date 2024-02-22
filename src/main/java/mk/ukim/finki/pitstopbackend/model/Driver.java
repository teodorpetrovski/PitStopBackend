package mk.ukim.finki.pitstopbackend.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String fullName;
    private int driverNumber;
    private String country;
    private LocalDate dateOfBirth;
    private String placeOfBirth;
    private String coverImageUrl;
    private double overallPoints;
    private int grandPrixEntered;
    private int worldChampionships;
    private int highestRaceFinish;
    private int numberOfHighestRaceFinishes;
    private int podiums;

   // @ManyToOne
    //private Team team;

    public Driver(String fullName, int driverNumber, String country, LocalDate dateOfBirth, String placeOfBirth, String coverImageUrl, double overallPoints, int grandPrixEntered, int worldChampionships, int highestRaceFinish, int numberOfHighestRaceFinishes, int podiums) {
        this.fullName = fullName;
        this.driverNumber = driverNumber;
        this.country = country;
        this.dateOfBirth = dateOfBirth;
        this.placeOfBirth = placeOfBirth;
        this.coverImageUrl = coverImageUrl;
        this.overallPoints = overallPoints;
        this.grandPrixEntered = grandPrixEntered;
        this.worldChampionships = worldChampionships;
        this.highestRaceFinish = highestRaceFinish;
        this.numberOfHighestRaceFinishes = numberOfHighestRaceFinishes;
        this.podiums = podiums;
    }

    public Driver() {

    }
}
