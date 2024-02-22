package mk.ukim.finki.pitstopbackend.service;

import mk.ukim.finki.pitstopbackend.model.BlogPost;
import mk.ukim.finki.pitstopbackend.model.DTO.BlogPostDTO;

import java.util.List;
import java.util.Optional;

public interface BlogPostService {
    public List<BlogPost> getAllPosts();

    public Optional<BlogPost> createPost(BlogPostDTO blogPostDTO);
}
