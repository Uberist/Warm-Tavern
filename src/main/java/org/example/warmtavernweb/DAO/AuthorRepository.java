package org.example.warmtavernweb.DAO;

import org.example.warmtavernweb.Entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository
        extends JpaRepository<Author, Long> {
}
