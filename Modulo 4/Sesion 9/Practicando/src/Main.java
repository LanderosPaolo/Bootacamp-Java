

public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro("San Bernardo");
        Perro perro2 = new Perro("Pastor Aleman");
        System.out.println("Metodo Equals");
        System.out.println(perro1.equals(perro2));

        System.out.println("----------------");

        System.out.println("Metodo Get Class");
        System.out.println(perro1.getClass());
        System.out.println(perro1.getClass().getName());

        System.out.println("----------------");

        System.out.println(perro1.getClass().getSimpleName());
        System.out.println(perro1.getClass().getSuperclass());

        System.out.println("----------------");

        System.out.println("Metodo To String");
        System.out.println(perro1.toString());

        System.out.println("----------------");

        System.out.println("Metodo HashCode");
        System.out.println(perro1.hashCode());


    }
}