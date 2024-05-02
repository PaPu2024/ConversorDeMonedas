import java.time.LocalDateTime;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {

        ConsultaMonedas consulta1 = new ConsultaMonedas();
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese la moneda");
        String direccionlocal = teclado.nextLine();
        consulta1.consulta(direccionlocal);






        System.out.println();






    }

}