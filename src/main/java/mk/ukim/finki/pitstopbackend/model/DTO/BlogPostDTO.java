package mk.ukim.finki.pitstopbackend.model.DTO;

import lombok.Data;

@Data
public class BlogPostDTO {
    private String content;
    private String imageUrl;

    public BlogPostDTO(String content, String imageUrl) {
        this.content = content;
        this.imageUrl = imageUrl;
    }
}
