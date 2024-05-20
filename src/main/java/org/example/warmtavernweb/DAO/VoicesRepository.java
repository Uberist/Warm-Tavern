package org.example.warmtavernweb.DAO;

import org.example.warmtavernweb.Entity.Voice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface VoicesRepository extends
        JpaRepository<Voice, Long> {
}
