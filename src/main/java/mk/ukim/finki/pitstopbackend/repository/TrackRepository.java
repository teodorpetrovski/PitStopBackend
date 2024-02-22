package mk.ukim.finki.pitstopbackend.repository;

import mk.ukim.finki.pitstopbackend.model.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TrackRepository extends JpaRepository<Track,Long> {
    List<Track> findAllByNameLikeIgnoreCase(String name);


    Optional<Track> findByNameLikeIgnoreCase(String name);
}
