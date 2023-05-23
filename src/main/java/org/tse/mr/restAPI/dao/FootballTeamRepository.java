/**
 * This interface represents a repository for FootballTeam entities.
 */
package org.tse.mr.restAPI.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tse.mr.restAPI.domain.FootballTeam;

public interface FootballTeamRepository extends JpaRepository<FootballTeam, Integer> {
}
