package local.mydherin.users.infrastructure.shared.daos.game;

import local.mydherin.users.infrastructure.shared.daos.game.entities.SagaDTO;

import java.util.List;

public final class GameDTO {
    private final String gameId;
    private final List<SagaDTO> sagaDTOList;
    public GameDTO(String gameId, List<SagaDTO> sagaDTOList) {
        this.gameId = gameId;
        this.sagaDTOList = sagaDTOList;
    }
    public String getGameId() {
        return gameId;
    }
    public List<SagaDTO> getSagaDtoList() {
        return sagaDTOList;
    }
}
