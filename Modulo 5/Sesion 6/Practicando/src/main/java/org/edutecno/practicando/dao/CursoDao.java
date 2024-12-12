package org.edutecno.practicando.dao;

import org.edutecno.practicando.entidades.Curso;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class CursoDao {
    private static SessionFactory sessionFactory;
    static {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    //Agregar curso
    public void agregarCurso(Curso curso) {
        try (Session session = getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(curso);
            session.getTransaction().commit();
        }
    }

    //Listar curso
    public List<Curso> listarCursos() {
        try(Session session = sessionFactory.openSession()) {
            return session.createQuery("from Curso", Curso.class).list();
        }
    }

    //Actualizar curso
    public void actualizarCurso(Curso curso) {
        try (Session session = getSessionFactory().openSession()) {
            session.beginTransaction();
            session.update(curso);
            session.getTransaction().commit();
        }
    }

    //Buscar id
    public Curso buscarCursoPorId(int id) {
        try (Session session = getSessionFactory().openSession()) {
            return session.get(Curso.class, id);
        }
    }

    //Eliminar curso
    public void eliminarCurso(int id) {
        try (Session session = getSessionFactory().openSession()) {
            session.beginTransaction();
            Curso curso = session.load(Curso.class, id);
            if (curso != null) {
                session.delete(curso);
            }
            session.getTransaction().commit();
        }
    }
}
