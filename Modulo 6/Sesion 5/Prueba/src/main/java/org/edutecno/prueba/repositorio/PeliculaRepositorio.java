package org.edutecno.prueba.repositorio;

import org.edutecno.prueba.modelo.Pelicula;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PeliculaRepositorio {
    private final JdbcTemplate jdbcTemplate;

    public PeliculaRepositorio(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //COMPROBAR SI EL ID YA EXISTE
    public boolean idYaRegistrado(int id) {
        String sql = "SELECT COUNT(*) FROM pelicula WHERE id = ?";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class, id);
        return count != null && count > 0;
    }

    //CREATE
    public void crearPelicula(int id, String titulo, String director, int anio, int duracion) {
        String sql = "INSERT INTO pelicula (id, titulo, director, anio, duracion) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, id, titulo, director, anio, duracion);
    }

    //READ
    public List<Pelicula> obtenerPeliculas() {
        String sql = "SELECT * FROM pelicula";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Pelicula.class));
    }

    public Pelicula obtenerPeliculaPorId(int id) {
        String sql = "SELECT * FROM pelicula WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Pelicula.class), id);
    }

    //UPDATE
    public void actualizarPelicula(int id, String titulo, String director, int anio, int duracion) {
        String sql = "UPDATE pelicula SET titulo = ?, director = ?, anio = ?, duracion = ? WHERE id = ?";
        jdbcTemplate.update(sql, titulo, director, anio, duracion, id);
    }

    //DELETE
    public void eliminarPelicula(int id) {
        String sql = "DELETE FROM pelicula WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}