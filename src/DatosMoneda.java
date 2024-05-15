import java.time.LocalDateTime;

import static java.lang.String.valueOf;

public class DatosMoneda {

    private String monedaInicial;
    private Double valorMonedaInicial;
    private String monedaFinal;
    private Double valorMonedaFinal;
    private Double valorMonedaUsuario;
    private Double resultado;
    private LocalDateTime hora;

    public DatosMoneda(String monedaInicial, String monedaFinal) {
        this.monedaInicial = monedaInicial;
        this.monedaFinal = monedaFinal;
//        this.valorMonedaInicial = valorMonedaInicial;
//        this.valorMonedaFinal = valorMonedaFinal;
//        this.valorMonedaUsuario = valorMonedaUsuario;
        this.hora = LocalDateTime.now();

    }

    public String getMonedaInicial() {
        return monedaInicial;
    }

    public void setMonedaInicial(String monedaInicial) {
        this.monedaInicial = monedaInicial;
    }

    public Double getValorMonedaInicial() {
        return valorMonedaInicial;
    }

    public void setValorMonedaInicial(Double valorMonedaInicial) {
        this.valorMonedaInicial = valorMonedaInicial;
    }

    public String getMonedaFinal() {
        return monedaFinal;
    }

    public void setMonedaFinal(String monedaFinal) {
        this.monedaFinal = monedaFinal;
    }

    public Double getValorMonedaUsuario() {
        return valorMonedaUsuario;
    }

    public void setValorMonedaUsuario(Double valorMonedaUsuario) {
        this.valorMonedaUsuario = valorMonedaUsuario;
    }

    public Double getValorMonedaFinal() {
        return valorMonedaFinal;
    }

    public void setValorMonedaFinal(Double valorMonedaFinal) {
        this.valorMonedaFinal = valorMonedaFinal;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }



    public void infDeLaMonedaIncial(){
        System.out.println("el nombre de la moneda inicial: " + monedaInicial);
        System.out.println("valor de la moneda inicial: " + valorMonedaInicial);
        System.out.println("el nombre de la moneda final: "+ monedaFinal);
        System.out.println("valor de la moneda final: " + valorMonedaFinal);



    }


    @Override
    public String toString() {
        return "\nLa moneda inical es: "+ monedaInicial +
                "\nEl valor de la moneda inicial es: "+valorMonedaInicial+
                "\nLa moneda final es: "+ monedaFinal+
                "\nEl valor de la moneda final es:"+ valorMonedaFinal+
                "\nEl valor a comvertir es:"+valorMonedaUsuario+
                "\nEl resultado de la comversion es:"+ resultado+
                "\nRegistro: "+ hora+
                "\n*********************";
    }
}
