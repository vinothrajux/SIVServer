package com.sivserver.example.sports;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 14/07/2017.
 */
public interface TournamentDataRepository extends CrudRepository<TournamentData, String> {
    TournamentData findBytournamentid(String tournamentid);
}
