//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {


        public void autenticarUsuario(String user) throws Exception {
            if (!user.contains("admin")) {
                throw new Exception("ALTO! USUARIO NO AUTORIZADO");
            } else {
                System.out.println("Usuario autorizado.");
            }

        }
            autenticarUsuario("admin");
    }

    private static void autenticarUsuario(String admin) {
    }
}