import java.util.ArrayList;
import java.util.Scanner;

public class Logica {

    private  ArrayList<DatosMoneda> historial = new ArrayList<>();



    public void inicio(){
        String pantallaInicio= """
               -----QUE DESEA REALIZAR-----
               1. Realizar una conversion
               2. Ver historial
               3. Salir del programa
                """;
        System.out.println(pantallaInicio);
    }

    private final String menuMoneda = """
            -----LISTA DE MONEDAS-----
             ARS - Peso argentino
             BOB - Boliviano boliviano
             BRL - Real brasileño
             CLP - Peso chileno
             COP - Peso colombiano
             USD - Dólar 
             MXN - Peso mexicano
            
            """;

    public void menuMonedaVer(){
        System.out.println(menuMoneda);
    }



    public String capturadoOpciones(){
        Scanner samuel = new Scanner(System.in);

        String captura = samuel.nextLine().toLowerCase();
        while (!menuMoneda.toLowerCase().contains(captura)) {
            System.out.println("Moneda no disponible");
            System.out.println("Seleccione una del menu");
            System.out.println("**********************************************************************************");
            captura = samuel.nextLine().toLowerCase();
        }
        return captura.toUpperCase();
    }













}
