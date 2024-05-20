package org.example.warmtavernweb.DAO;

import org.example.warmtavernweb.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository
        extends JpaRepository<Book, Long> {
}
