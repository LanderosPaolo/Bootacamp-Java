package org.edutecno.prueba.dao;

import org.edutecno.prueba.entity.HibernateUtil;
import org.edutecno.prueba.entity.Inscripcion;
import org.hibernate.Session;

public class InscripcionDao {
    public int guardarInscripcion(Inscripcion inscripcion) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            int id = (int) session.save(inscripcion);
            session.getTransaction().commit();
            return id;
        }
    }
}