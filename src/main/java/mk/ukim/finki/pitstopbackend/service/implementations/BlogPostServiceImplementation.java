package mk.ukim.finki.pitstopbackend.service.implementations;

import mk.ukim.finki.pitstopbackend.model.BlogPost;
import mk.ukim.finki.pitstopbackend.model.DTO.BlogPostDTO;
import mk.ukim.finki.pitstopbackend.repository.BlogPostRepository;
import mk.ukim.finki.pitstopbackend.service.BlogPostService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class BlogPostServiceImplementation implements BlogPostService {

    private final BlogPostRepository blogPostRepository;

    public BlogPostServiceImplementation(BlogPostRepository blogPostRepository) {
        this.blogPostRepository = blogPostRepository;
    }

    @Override
    public List<BlogPost> getAllPosts() {
        return blogPostRepository.findAll();
    }

    @Override
    public Optional<BlogPost> createPost(BlogPostDTO blogPostDTO) {
        BlogPost blogPost= new BlogPost(blogPostDTO.getContent(), blogPostDTO.getImageUrl());
        return Optional.of(blogPostRepository.save(blogPost));
    }
}
