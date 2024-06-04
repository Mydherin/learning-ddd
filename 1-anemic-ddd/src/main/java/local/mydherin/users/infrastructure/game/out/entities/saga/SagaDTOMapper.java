package local.mydherin.users.infrastructure.game.out.entities.saga;

import local.mydherin.users.domain.game.entities.saga.Saga;
import local.mydherin.users.domain.game.entities.saga.vos.SagaId;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class SagaDTOMapper {
    public List<SagaDTO> fromSharedDTO(final List<local.mydherin.users.infrastructure.shared.daos.game.entities.SagaDTO> sagaDTOList)
    {
        return sagaDTOList
                .stream()
                .map(sagaDTO -> SagaDTO.of(sagaDTO.getSagaId()))
                .toList();
    }

    public List<Saga> toDomain(final List<SagaDTO> sagaDTOList)
    {
        return sagaDTOList
                .stream()
                .map(sagaDTO -> Saga.of(SagaId.of(sagaDTO.getSagaId())))
                .toList();
    }
}
