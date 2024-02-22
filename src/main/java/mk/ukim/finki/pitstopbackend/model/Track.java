package mk.ukim.finki.pitstopbackend.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Track {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String country;
    private String layoutURL;
    private String description;
    private Double latitude;
    private Double longitude;


    public Track(String name, String country, String layoutURL, String description, Double latitude, Double longitude) {
        this.name = name;
        this.country = country;
        this.layoutURL = layoutURL;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
    }


    public Track() {

    }
}
