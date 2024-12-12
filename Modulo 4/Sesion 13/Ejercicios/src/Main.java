import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> paises = new HashSet<>();
        // .add no admite duplicados
        paises.add("Chile");
        paises.add("Argentina");
        paises.add("Brasil");
        paises.add("Bolivia");
        paises.add("Colombia");
        paises.add("Uruguay");
        paises.add("Argentina");
        paises.add("Colombia");

        System.out.println("Paises sin duplicados");
        System.out.println(paises);

        // .remove permite eliminar datos
        paises.remove("Uruguay");
        System.out.println("Paises despues de eliminar Uruguay");
        System.out.println(paises);

        //.contain revisa si un objeto esta contenido, regresa un boolean
        System.out.println("Existe argentina en el set?");
        System.out.println(paises.contains("Argentina"));

        //.size cuenta el largo
        System.out.println("Este es el largo de la coleccion");
        System.out.println(paises.size());


         /*
         TreeSet:
            ● Almacena los datos en función de sus valores (ordenados).
            ● Es más lento que HashSet.
         */

        Set<String> paises2 = new TreeSet<>();
        paises2.add("Chile");
        paises2.add("Argentina");
        paises2.add("Brasil");
        paises2.add("Bolivia");
        paises2.add("Colombia");
        paises2.add("Uruguay");
        paises2.add("Argentina");
        paises2.add("Colombia");

        System.out.println("\nPaises sin duplicados");
        System.out.println(paises);

        paises.remove("Uruguay");
        System.out.println("Paises despues de eliminar Uruguay");
        System.out.println(paises);

        System.out.println("Existe argentina en el set?");
        System.out.println(paises.contains("Argentina"));

        System.out.println("Este es el largo de la coleccion");
        System.out.println(paises.size());

        /*
        LINKEDHASHSET:
            ● Almacena los elementos según el orden de inserción.
         */
        Set<String> paises3 = new LinkedHashSet<>();
        paises3.add("Chile");
        paises3.add("Argentina");
        paises3.add("Brasil");
        paises3.add("Bolivia");
        paises3.add("Colombia");
        paises3.add("Uruguay");
        paises3.add("Argentina");
        paises3.add("Colombia");

        System.out.println("\nPaises sin duplicados");
        System.out.println(paises);

        paises.remove("Uruguay");
        System.out.println("Paises despues de eliminar Uruguay");
        System.out.println(paises);

        System.out.println("Existe argentina en el set?");
        System.out.println(paises.contains("Argentina"));

        System.out.println("Este es el largo de la coleccion");
        System.out.println(paises.size());
    }
}