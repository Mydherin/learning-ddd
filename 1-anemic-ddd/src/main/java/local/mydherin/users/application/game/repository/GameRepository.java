package local.mydherin.users.application.game.repository;

import local.mydherin.users.domain.game.Game;

import java.util.List;

public interface GameRepository {
    List<Game> findBy();
}
