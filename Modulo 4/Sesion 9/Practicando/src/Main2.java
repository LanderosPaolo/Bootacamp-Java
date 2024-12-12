

public class Main2 {
    public static <T> void main(String[] args) {
        Gato <String> g1 = new Gato<String>("Eren");
        Gato <Integer> g2 = new Gato<Integer>(6);
        System.out.println(g1);
        System.out.println(g2);
    }
}