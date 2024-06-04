package local.mydherin.users.infrastructure.game.in.entities.saga;

import local.mydherin.users.domain.game.entities.saga.Saga;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ControllerSagaDTOMapper")
public final class SagaDTOMapper {
    public List<SagaDTO> fromDomain(List<Saga> sagaList)
    {
        return sagaList
                .stream()
                .map(saga -> SagaDTO.of(saga.getSagaId().getValue(), saga.getGameId().getValue()))
                .toList();
    }
}
