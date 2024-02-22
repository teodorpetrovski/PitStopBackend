package mk.ukim.finki.pitstopbackend.web.rest;


import mk.ukim.finki.pitstopbackend.model.Driver;
import mk.ukim.finki.pitstopbackend.model.Team;
import mk.ukim.finki.pitstopbackend.service.TeamService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins={"http://localhost:3000"})
@RequestMapping("/api/teams")
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping
    public List<Team> getAllTeams()
    {
        return this.teamService.getAllTeams();
    }

    @PostMapping("/searchByName")
    public ResponseEntity<Team> getByName(@RequestParam String name)
    {
        return this.teamService.getTeamByName(name).map(team -> ResponseEntity.ok().body(team))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
