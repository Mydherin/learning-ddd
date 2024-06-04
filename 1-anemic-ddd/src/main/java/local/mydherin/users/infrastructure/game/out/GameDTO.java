package local.mydherin.users.infrastructure.game.out;

import local.mydherin.users.infrastructure.game.out.entities.saga.SagaDTO;

import java.util.List;

public final class GameDTO {
    private final String gameId;
    private final List<SagaDTO> sagaDTOList;
    private GameDTO(String gameId, List<SagaDTO> sagaDTOList)
    {
        this.gameId = gameId;
        this.sagaDTOList = sagaDTOList;
    }

    public String getGameId()
    {
        return gameId;
    }
    public List<SagaDTO> getSagaDTOList()
    {
        return sagaDTOList;
    }

    public static GameDTO of(String gameId, List<SagaDTO> sagaDTOList)
    {
        return new GameDTO(gameId, sagaDTOList);
    }
}
