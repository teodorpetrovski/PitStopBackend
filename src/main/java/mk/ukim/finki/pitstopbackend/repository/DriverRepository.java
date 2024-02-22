package mk.ukim.finki.pitstopbackend.repository;

import mk.ukim.finki.pitstopbackend.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DriverRepository extends JpaRepository<Driver,Long> {

    List<Driver> findAllByFullNameLikeIgnoreCase(String name);

    Optional<Driver> findByFullNameLikeIgnoreCase(String name);
}
