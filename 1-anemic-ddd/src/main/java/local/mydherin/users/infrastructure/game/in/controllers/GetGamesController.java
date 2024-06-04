package local.mydherin.users.infrastructure.game.in.controllers;

import local.mydherin.users.application.game.usecases.GetGameCollection;
import local.mydherin.users.infrastructure.game.in.GameDTO;
import local.mydherin.users.infrastructure.game.in.GameDTOMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public final class GetGamesController {
    private final GetGameCollection getGameCollection;
    private final GameDTOMapper mapper;

    public GetGamesController(GetGameCollection getGameCollection, GameDTOMapper mapper) {
        this.getGameCollection = getGameCollection;
        this.mapper = mapper;
    }
    @GetMapping("/games")
    public ResponseEntity<List<GameDTO>> execute() {
        final var gameCollection = getGameCollection.execute();
        return ResponseEntity.ok(mapper.fromDomain(gameCollection));
    }
}
