package mk.ukim.finki.pitstopbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class BlogPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dateOfCreation;
    private String content;
    private String imageUrl;


    public BlogPost(String content, String imageUrl) {
        this.dateOfCreation=LocalDateTime.now();
        this.content = content;
        this.imageUrl = imageUrl;
    }

    public BlogPost() {

    }
}
