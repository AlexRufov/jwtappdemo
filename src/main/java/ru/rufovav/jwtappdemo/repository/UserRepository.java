package ru.rufovav.jwtappdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rufovav.jwtappdemo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String name);
}
