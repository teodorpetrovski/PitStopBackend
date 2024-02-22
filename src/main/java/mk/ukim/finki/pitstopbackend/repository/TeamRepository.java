package mk.ukim.finki.pitstopbackend.repository;

import mk.ukim.finki.pitstopbackend.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TeamRepository extends JpaRepository<Team,Long> {

    List<Team> findAllByNameLikeIgnoreCase(String name);

    Optional<Team> findByNameContainingIgnoreCase(String name);
}
