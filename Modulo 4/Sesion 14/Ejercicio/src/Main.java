import service.Auxiliar;

public class Main {
    public static void main(String[] args) {

        Auxiliar aux = new Auxiliar();

        try {
            Auxiliar.dividir(aux.getNumerador(), aux.getDenominador());
        } finally {
            System.out.println("Excepcion en el main, fin del programa.");
        }
    }
}