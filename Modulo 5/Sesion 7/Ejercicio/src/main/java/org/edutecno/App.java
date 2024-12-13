package org.edutecno;


import org.edutecno.dao.ListarDao;
import org.edutecno.dto.Usuario;

import java.util.List;

public class App {
    public static void main( String[] args ) {

        ListarDao dao = new ListarDao();
        List<Usuario> listarUsuarios = dao.listarUsuarios();

        System.out.println("Usuarios en la base de datos");
        System.out.println("-----------------------");
        for(Usuario usuario : listarUsuarios){
            System.out.println("ID: "+usuario.getIdUsuario() +
                    ", Nombre: "+usuario.getNombre()+
                    ", Clave: "+usuario.getClave()+
                    ", RUT: "+usuario.getRut()+
                    "-"+usuario.getDv());
            System.out.println("-----------------------");
        }
    }
}