import java.time.LocalDateTime;

import static java.lang.String.valueOf;

public class DatosMoneda {

    private String monedaInicial;
    private double valorMonedaIncial;
    private String monedaFinal;
    private double valorMonedaFinal;
    private LocalDateTime hora;

    public DatosMoneda(String monedaInicial, String monedaFinal) {
        this.monedaInicial = moneda;
        this.monedaFinal = monedaFinal;

    }

    public DatosMoneda(MonedaApi monedaApi) {
        this.monedaInicial = monedaApi.base_code();
        this.valorMonedaIncial = 1 ;

    }

    public DatosMoneda() {

    }


    public void infDeLaMonedaIncial(){
        System.out.println("el nombre de la moneda: " + monedaInicial);
        System.out.println("valor de la moneda inicial: " + valorMonedaIncial);


    }

    public String getMonedaInicial() {
        return monedaInicial;
    }

    public void setMonedaInicial(String monedaInicial) {
        this.monedaInicial = monedaInicial;
    }

    public String getMonedaFinal() {
        return monedaFinal;
    }

    public void setMonedaFinal(String monedaFinal) {
        this.monedaFinal = monedaFinal;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }
}
