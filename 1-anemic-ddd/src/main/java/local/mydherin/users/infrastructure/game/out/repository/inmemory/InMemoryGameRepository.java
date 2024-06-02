package local.mydherin.users.infrastructure.game.out.repository.inmemory;

import local.mydherin.users.application.game.repository.GameRepository;
import local.mydherin.users.domain.game.Game;
import local.mydherin.users.infrastructure.game.out.GameDTO;
import local.mydherin.users.infrastructure.game.out.GameDTOMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public final class InMemoryGameRepository implements GameRepository {
    private final GameDTOMapper gameDTOMapper;
    public InMemoryGameRepository(GameDTOMapper gameDTOMapper)
    {
        this.gameDTOMapper = gameDTOMapper;
    }
    @Override
    public List<Game> findBy() {
        return gameDTOMapper.toDomain(List.of(
            GameDTO.of("1")
        ));
    }
}
