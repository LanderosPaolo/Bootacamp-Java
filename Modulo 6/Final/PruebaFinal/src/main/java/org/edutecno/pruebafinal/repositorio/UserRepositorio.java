package org.edutecno.pruebafinal.repositorio;

import org.edutecno.pruebafinal.modelo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositorio extends JpaRepository<User, Long> {
    User findByUsername(String username);
    boolean existsByUserName(String username);
}
