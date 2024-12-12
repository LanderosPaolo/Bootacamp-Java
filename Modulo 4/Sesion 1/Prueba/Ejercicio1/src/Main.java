public class Main {
    public static void main(String[] args) {
        //Declarar variables
        int cocina = 299990;
        int lavadora = 234540;
        int comedor = 159990;
        int televisor = 345100;
        int total;
        int cambio = 923;
        double IVA, totalConIva, totalEnDolar;

        //Total de la compra
        total = cocina + lavadora + comedor + televisor;
        //Calcular el IVA
        IVA = Math.round(total * 0.19);
        //Total con IVA
        totalConIva = total + IVA;
        //En dolares (Valor dolar 23/09/2024)
        totalEnDolar = totalConIva / cambio;

        System.out.println("El total de su compra es: " + total);
        System.out.println("El IVA es: " + (long) IVA);
        System.out.println("El total más IVA es: " + (long) totalConIva);
        System.out.printf("El total de su compra en dólares es: $%,.2f%n", totalEnDolar);
    }
}