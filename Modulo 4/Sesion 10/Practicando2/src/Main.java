
public class Main {
    public static void main(String[] args) {
        String[] listaFrutas = {"Manzana", "Pera", "Durazno", "Melon", "Frutilla"};
        String[] listaVerduras = {"Acelga", "Zanahoria", "Lechga", "Brocoli", "Espinaca"};
        int indiceFruta = buscadorIndice("Durazno", listaFrutas);
        int indiceVerdura = buscadorIndice("Brocoli", listaVerduras);

        /*for (int i = 0; i < listaFrutas.length; i++) {
            if (listaFrutas[i].equals("Durazno")) {
                indiceFruta = i;
            }
        }

        for (int i = 0; i < listaVerduras.length; i++) {
            if(listaVerduras[i].equals("Brocoli")) {
                indiceVerdura = i;
            }
        }*/

        System.out.println(indiceFruta + "\n" + indiceVerdura);
    }
    public static int buscadorIndice(String nombre, String[] lista) {
        for(int i = 0; i < lista.length; i ++) {
            if(lista[i].equals(nombre)) {
                return i;
            }
        }
        return 0;
    }
}
