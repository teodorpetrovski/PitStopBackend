package mk.ukim.finki.pitstopbackend.web.rest;


import mk.ukim.finki.pitstopbackend.model.Driver;
import mk.ukim.finki.pitstopbackend.service.DriverService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins={"*"})
@RequestMapping("/api/drivers")
public class DriverController {


    private final DriverService driverService;

    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }


    @GetMapping
    public List<Driver> getAllDrivers()
    {
        return this.driverService.getAllDrivers();
    }

    @PostMapping("/searchByName")
    public ResponseEntity<Driver> getByName(@RequestParam String name)
    {
        return this.driverService.getDriverByName(name).map(driver -> ResponseEntity.ok().body(driver))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

}
