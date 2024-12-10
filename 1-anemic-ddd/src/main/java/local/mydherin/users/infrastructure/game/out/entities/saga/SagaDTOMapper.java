package local.mydherin.users.infrastructure.game.out.entities.saga;

import local.mydherin.users.domain.game.entities.saga.Saga;
import local.mydherin.users.domain.game.entities.saga.vos.GameId;
import local.mydherin.users.domain.game.entities.saga.vos.RelatedGameId;
import local.mydherin.users.domain.game.entities.saga.vos.SagaId;
import local.mydherin.users.infrastructure.shared.daos.game.entities.SagaDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class SagaDTOMapper {
    public List<Saga> toDomain(final List<SagaDTO> sagaDTOList)
    {
        return sagaDTOList
                .stream()
                .map(sagaDTO -> Saga.of(SagaId.of(sagaDTO.getSagaId()), GameId.of(sagaDTO.getGameId()), RelatedGameId.of(sagaDTO.getRelatedGameId())))
                .toList();
    }
}
