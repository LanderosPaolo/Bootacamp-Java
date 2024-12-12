import service.Menu;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();

        try {
            menu.mostrarMenu();
        } finally {
            System.out.println("Programa finalizado");
        }
    }
}