package mk.ukim.finki.pitstopbackend.service;

import mk.ukim.finki.pitstopbackend.model.Team;

import java.util.List;
import java.util.Optional;

public interface TeamService {

    public List<Team> getAllTeams();

    public Optional<Team> getTeamByName(String name);
}
