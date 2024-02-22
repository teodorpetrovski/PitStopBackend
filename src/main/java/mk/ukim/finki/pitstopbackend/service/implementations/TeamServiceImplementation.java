package mk.ukim.finki.pitstopbackend.service.implementations;

import mk.ukim.finki.pitstopbackend.model.Team;
import mk.ukim.finki.pitstopbackend.repository.TeamRepository;
import mk.ukim.finki.pitstopbackend.service.TeamService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class TeamServiceImplementation implements TeamService {

    private final TeamRepository teamRepository;

    public TeamServiceImplementation(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Override
    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    @Override
    public Optional<Team> getTeamByName(String name) {

        if(teamRepository.findByNameContainingIgnoreCase(name).isEmpty())
            return null;

        return teamRepository.findByNameContainingIgnoreCase(name);
    }
}
