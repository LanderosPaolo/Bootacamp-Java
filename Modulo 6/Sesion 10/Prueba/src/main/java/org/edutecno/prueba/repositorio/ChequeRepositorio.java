package org.edutecno.prueba.repositorio;

import org.edutecno.prueba.entidad.Cheque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChequeRepositorio extends JpaRepository<Cheque, Long> {
}
