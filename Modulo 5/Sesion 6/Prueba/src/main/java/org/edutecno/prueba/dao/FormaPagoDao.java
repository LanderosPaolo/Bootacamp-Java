package org.edutecno.prueba.dao;

import org.edutecno.prueba.entity.FormaPago;
import org.edutecno.prueba.entity.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class FormaPagoDao {
    //Agregar forma de pago
    public void agregarFormaPago(FormaPago formaPago) {
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(formaPago);
            session.getTransaction().commit();
        }
    }

    //Listar formas de pago
    public List<FormaPago> obtenerFormaPagos() {
        try(Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from FormaPago", FormaPago.class).list();
        }
    }
}