package com.hat1ko.library.dbl;

import com.hat1ko.library.dbl.books.repositories.BooksRepository;
import com.hat1ko.library.dbl.categories.repositories.CategoriesRepository;
import com.hat1ko.library.dbl.users.repositories.UserRolesRepository;
import com.hat1ko.library.dbl.users.repositories.UserToBookLinksRepository;
import com.hat1ko.library.dbl.users.repositories.UsersRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Getter
@RequiredArgsConstructor()
@Service()
public class DBLService {
    private final BooksRepository booksRepository;
    private final CategoriesRepository categoriesRepository;
    private final UserRolesRepository userRolesRepository;
    private final UsersRepository usersRepository;
    private final UserToBookLinksRepository userToBookLinksRepository;
}
