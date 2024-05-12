import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ConsultaMonedas datos = new ConsultaMonedas();
        DatosMoneda infMonedaTeclado = new DatosMoneda();


        System.out.println("ingrese el codigo de la moneda:");
        String monedaUsiario = teclado.nextLine();
        System.out.println("ingrese el codigo de la moneda a comvertir:");
        String moneda1Usiario = teclado.nextLine();


        datos.consulta(monedaUsiario);

        infMonedaTeclado.setMonedaInicial(moneda1Usiario);

        infMonedaTeclado.infDeLaMonedaIncial();



    }

}