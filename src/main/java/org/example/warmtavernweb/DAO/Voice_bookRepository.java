package org.example.warmtavernweb.DAO;

import org.example.warmtavernweb.Entity.Voice_book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Voice_bookRepository
        extends JpaRepository<Voice_book, Long> {
}
