package com.sivserver.example.Superintendent;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Seetha on 01-Jul-17.
 */
public interface EgovSpellEntryRepository extends CrudRepository<EgovSpellEntry, String> {
    EgovSpellEntry findByspellno(String spellno);
}

