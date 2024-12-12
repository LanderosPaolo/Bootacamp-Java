
public class Main {
    public static void main(String[] args) {
        /*try {
            int[] a = {5, 2, 8};
            System.out.println(a[3]);
        } catch (Exception e) {
            System.out.println("hemos llegado a una excepción");
        } finally {
            System.out.println("el finally siempre se cumple");
        }*/

        //Ejercicio 2
        //verificaEdad(12);

        //Ejercicio3
        try {
            System.out.println(dividir(15,0));
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero");
        }

    }

    //Ejercicio 2
    /*static void verificaEdad(int edad) {
        if(edad < 18) {
            throw new ArithmeticException("No puedes ingresar, debe ser mayor de edad.");
        } else {
            System.out.println("Eres mayor de edad, puedes ingresar");
        }
    }*/

    //Ejercicio 3
    public static int dividir(int a, int b) throws ArithmeticException {
        int resultado = a/b;
        System.out.println(resultado);
        return resultado;
    }
}