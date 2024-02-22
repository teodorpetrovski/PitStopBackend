package mk.ukim.finki.pitstopbackend.service;

import mk.ukim.finki.pitstopbackend.model.Driver;

import java.util.List;
import java.util.Optional;

public interface DriverService {

    public List<Driver> getAllDrivers();

    public Optional<Driver> getDriverByName(String name);
}
