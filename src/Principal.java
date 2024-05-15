import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        ArrayList<DatosMoneda> historial = new ArrayList<>();
        Scanner samuel = new Scanner(System.in);
        Logica logica = new Logica();

        int navegacion = 0;

        System.out.println("Bienvenidos al coversor de monedas realizado por samuel");
        System.out.println("*********************************************\n");

        while (navegacion != 3){

            logica.inicio();
            navegacion = samuel.nextInt();

            switch (navegacion){
                case 1:
                    logica.menuMonedaVer();


                    System.out.println("ingrese el codigo de la moneda:");
                    String monedaUsuarioInicial = logica.capturadoOpciones();
                    logica.menuMonedaVer();
                    System.out.println("ingrese el codigo de la moneda a comvertir:");
                    String monedaUsuarioFinal = logica.capturadoOpciones();

                    ConsultaMonedas consultaMonedas = new ConsultaMonedas();

                    MonedaApi monedaApi = consultaMonedas.consulta(monedaUsuarioInicial);
                    DatosMoneda datosMoneda = new DatosMoneda(monedaApi.base_code(), monedaUsuarioFinal);

                    System.out.println("cuanto desea comvertir: " + "(" + monedaUsuarioInicial + ")" + ">>>>>>" + "(" + monedaUsuarioFinal + ")");
                    Double monedasUsuario = samuel.nextDouble();
                    datosMoneda.setValorMonedaUsuario(monedasUsuario);



                    Double valorUsuarioFinal = monedaApi.getConversionRate(monedaUsuarioFinal.toUpperCase());
                    Double valorUsuarioInicial = monedaApi.getConversionRate(monedaUsuarioInicial.toUpperCase());
                    datosMoneda.setValorMonedaUsuario(monedasUsuario);
                    datosMoneda.setValorMonedaInicial(valorUsuarioInicial);
                    datosMoneda.setValorMonedaFinal(valorUsuarioFinal);
                    datosMoneda.setResultado(valorUsuarioFinal*monedasUsuario);


                    System.out.println("\nEl resultado de la comversion es: "+datosMoneda.getResultado()+datosMoneda.getMonedaFinal());

                    historial.add(datosMoneda);





                    break;
                case 2:

                    if (historial.toArray().length == 0){
                        System.out.println("Historial vacio");
                    }else{
                        System.out.println(historial.toString());
                    }

                    break;
                case 3:
                    System.out.println("Gracias por utilizar nuestros servicios");
                    break;
                default:
                    System.out.println("opcion incorrecta");
            }



        }




    }
}
