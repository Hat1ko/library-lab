package com.hat1ko.library.dbl.users.repositories;

import com.hat1ko.library.dbl.users.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<UserEntity, String> {
}
