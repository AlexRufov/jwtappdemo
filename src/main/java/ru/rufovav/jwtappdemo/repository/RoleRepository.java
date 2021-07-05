package ru.rufovav.jwtappdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rufovav.jwtappdemo.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
