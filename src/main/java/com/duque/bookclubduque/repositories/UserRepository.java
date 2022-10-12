package com.duque.bookclubduque.repositories;

import com.duque.bookclubduque.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
