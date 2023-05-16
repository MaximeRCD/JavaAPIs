package org.tse.mr.restAPI.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tse.mr.restAPI.domain.FootballPlayer;

public interface FootballPlayerRepository extends JpaRepository<FootballPlayer, Integer> {
}
