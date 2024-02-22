package mk.ukim.finki.pitstopbackend.service;

import mk.ukim.finki.pitstopbackend.model.Track;

import java.util.List;
import java.util.Optional;

public interface TrackService {

    public List<Track> getAllTracks();

    public Optional<Track> getTrackByName(String name);
}
