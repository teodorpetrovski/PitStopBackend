package mk.ukim.finki.pitstopbackend.repository;

import mk.ukim.finki.pitstopbackend.model.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogPostRepository extends JpaRepository<BlogPost,Long> {
}
