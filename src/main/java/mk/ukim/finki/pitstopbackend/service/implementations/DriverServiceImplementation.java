package mk.ukim.finki.pitstopbackend.service.implementations;

import mk.ukim.finki.pitstopbackend.model.Driver;
import mk.ukim.finki.pitstopbackend.repository.DriverRepository;
import mk.ukim.finki.pitstopbackend.service.DriverService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DriverServiceImplementation implements DriverService {

    private final DriverRepository driverRepository;

    public DriverServiceImplementation(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    @Override
    public List<Driver> getAllDrivers() {
        return driverRepository.findAll();
    }

    @Override
    public Optional<Driver> getDriverByName(String name) {

        if(driverRepository.findByFullNameLikeIgnoreCase(name).isEmpty())
            return null;// throw exception here
        return driverRepository.findByFullNameLikeIgnoreCase(name);

    }
}
