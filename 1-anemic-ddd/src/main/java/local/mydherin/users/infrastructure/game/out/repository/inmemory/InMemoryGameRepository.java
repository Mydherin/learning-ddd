package local.mydherin.users.infrastructure.game.out.repository.inmemory;

import local.mydherin.users.application.game.repository.GameRepository;
import local.mydherin.users.domain.game.Game;
import local.mydherin.users.infrastructure.game.out.GameDTOMapper;
import local.mydherin.users.infrastructure.shared.daos.game.GameDTO;
import local.mydherin.users.infrastructure.shared.daos.game.inmemory.GameDAO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public final class InMemoryGameRepository implements GameRepository {
    private final GameDAO gameDAO;
    private final GameDTOMapper gameDTOMapper;
    public InMemoryGameRepository(GameDTOMapper gameDTOMapper, GameDAO gameDAO)
    {
        this.gameDTOMapper = gameDTOMapper;
        this.gameDAO = gameDAO;
    }
    @Override
    public List<Game> findBy() {
        List<GameDTO> gameDTOList = gameDAO.findAll();
        return gameDTOMapper.toDomain(gameDTOList);
    }
}
