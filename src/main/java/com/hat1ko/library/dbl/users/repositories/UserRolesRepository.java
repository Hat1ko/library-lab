package com.hat1ko.library.dbl.users.repositories;

import com.hat1ko.library.dbl.users.entities.UserRoleEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRolesRepository extends CrudRepository<UserRoleEntity, String> {
}
