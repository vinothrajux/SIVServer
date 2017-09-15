package com.sivserver.example.sports;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 14/07/2017.
 */
public interface TournamentDataRepository extends JpaRepository<TournamentData, String> {
    TournamentData findByTournamentid(String tournamentid);
}
