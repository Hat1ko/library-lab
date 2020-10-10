package com.hat1ko.library.dbl.books.repositories;

import com.hat1ko.library.dbl.books.entities.BookEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends CrudRepository<BookEntity, String> {
}
