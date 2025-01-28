package org.edutecno.pruebafinal.repositorio;

import org.edutecno.pruebafinal.entidad.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
    Usuario findByUsername(String username);
}
