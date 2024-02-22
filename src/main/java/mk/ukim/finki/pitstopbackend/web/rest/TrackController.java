package mk.ukim.finki.pitstopbackend.web.rest;

import mk.ukim.finki.pitstopbackend.model.Team;
import mk.ukim.finki.pitstopbackend.model.Track;
import mk.ukim.finki.pitstopbackend.service.TrackService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api/tracks")
public class TrackController {

    private final TrackService trackService;

    public TrackController(TrackService trackService) {
        this.trackService = trackService;
    }

    @GetMapping
    public List<Track> getAllTracks()
    {
        return this.trackService.getAllTracks();
    }

    @PostMapping("/searchByName")
    public ResponseEntity<Track> getByName(@RequestParam String name)
    {
        return this.trackService.getTrackByName(name).map(track -> ResponseEntity.ok().body(track))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
