package mk.ukim.finki.pitstopbackend.service.implementations;

import mk.ukim.finki.pitstopbackend.model.Track;
import mk.ukim.finki.pitstopbackend.repository.TrackRepository;
import mk.ukim.finki.pitstopbackend.service.TrackService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrackServiceImplementation implements TrackService {

    private final TrackRepository trackRepository;

    public TrackServiceImplementation(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    @Override
    public List<Track> getAllTracks() {
        return trackRepository.findAll();
    }

    @Override
    public Optional<Track> getTrackByName(String name) {
        if(trackRepository.findByNameLikeIgnoreCase(name).isEmpty())
            return null;

        return trackRepository.findByNameLikeIgnoreCase(name);
    }
}
