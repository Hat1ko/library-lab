package com.hat1ko.library.dbl.users.repositories;

import com.hat1ko.library.dbl.users.entities.UserToBookLinkEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserToBookLinksRepository extends CrudRepository<UserToBookLinkEntity, String> {
}
