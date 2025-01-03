package org.edutecno.practicando.servicio;

import jakarta.annotation.PostConstruct;
import org.edutecno.practicando.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UsuarioServicio {
    private final UsuarioRepositorio usuarioRepositorio;

    @Autowired
    public UsuarioServicio(UsuarioRepositorio usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }

    @PostConstruct
    public void init() {
        System.out.println("CREATE:");
        System.out.println("Creando usuario Juan");
        usuarioRepositorio.crearUsuario(1 , "Juan");
        System.out.println("Creando usuario Maria");
        usuarioRepositorio.crearUsuario(2, "Maria");

        System.out.println("===========");
        System.out.println("Read:");
        //usuarioRepositorio.obtenerUsuarios().forEach(System.out::println);
        System.out.println(usuarioRepositorio.obtenerUsuarioPorId(1));
        System.out.println(usuarioRepositorio.obtenerUsuarioPorId(2));

        System.out.println("======");
        System.out.println("Update:");
        usuarioRepositorio.actualizarUsuario(1, "Destructor70");
        usuarioRepositorio.actualizarUsuario(2, "LadyDoom");
        usuarioRepositorio.obtenerUsuarios().forEach(System.out::println);

        System.out.println("======");
        System.out.println("Delete:");
        System.out.println("Borrando usuario con id 1");
        usuarioRepositorio.eliminarUsuario(1);
        usuarioRepositorio.obtenerUsuarios().forEach(System.out::println);
    }

}
