package mk.ukim.finki.pitstopbackend.web.rest;


import mk.ukim.finki.pitstopbackend.model.BlogPost;
import mk.ukim.finki.pitstopbackend.model.DTO.BlogPostDTO;
import mk.ukim.finki.pitstopbackend.service.BlogPostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins={"http://localhost:3000"})
@RequestMapping("/api/posts")
public class BlogPostController {

    private final BlogPostService blogPostService;

    public BlogPostController(BlogPostService blogPostService) {
        this.blogPostService = blogPostService;
    }


    @GetMapping
    public List<BlogPost> getAllPosts()
    {
        return this.blogPostService.getAllPosts();
    }


    @PostMapping("/add")
    public ResponseEntity<BlogPost> add(@RequestBody BlogPostDTO blogPostDTO)
    {
        return this.blogPostService.createPost(blogPostDTO).map(post -> ResponseEntity.ok().body(post))
                .orElseGet(() -> ResponseEntity.badRequest().build());
    }
}
