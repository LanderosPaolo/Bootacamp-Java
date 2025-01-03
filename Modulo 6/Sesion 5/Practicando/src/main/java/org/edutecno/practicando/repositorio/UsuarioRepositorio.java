package org.edutecno.practicando.repositorio;

import org.edutecno.practicando.modelo.Usuario;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsuarioRepositorio {
    private final JdbcTemplate jdbcTemplate;

    public UsuarioRepositorio(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //CREATE
    public void crearUsuario(int id, String nombre) {
        String sql = "INSERT INTO usuario (id, nombre) VALUES (?, ?)";
        jdbcTemplate.update(sql, id, nombre);
    }

    //READ
    public List<Usuario> obtenerUsuarios() {
        String sql = "SELECT * FROM usuario";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Usuario.class));
    }

    //READ WHERE ID
    public Usuario obtenerUsuarioPorId(int id) {
        String sql = "SELECT * FROM usuario WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Usuario.class), id);
    }

    //UPDATE
    public void actualizarUsuario(int id, String nombre) {
        String sql = "UPDATE usuario SET nombre = ? WHERE id = ?";
        jdbcTemplate.update(sql, nombre, id);
    }

    //DELETE
    public void eliminarUsuario(int id) {
        String sql = "DELETE FROM usuario WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}
