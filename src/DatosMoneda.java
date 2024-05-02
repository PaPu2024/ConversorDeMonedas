import java.time.LocalDateTime;

public class DatosMoneda {

    private String monedaInicial;
    private double valorMonedaIncial;
    private String monedaFinal;
    private double valorMonedaFinal;
    private LocalDateTime hora;

    public DatosMoneda(String monedaInicial, double valorMonedaIncial, String monedaFinal, double valorMonedaFinal) {
        this.monedaInicial = monedaInicial;
        this.valorMonedaIncial = valorMonedaIncial;
        this.monedaFinal = monedaFinal;
        this.valorMonedaFinal = valorMonedaFinal;
        this.hora = LocalDateTime.now();
    }

    

    public String getMonedaInicial() {
        return monedaInicial;
    }

    public void setMonedaInicial(String monedaInicial) {
        this.monedaInicial = monedaInicial;
    }

    public double getValorMonedaIncial() {
        return valorMonedaIncial;
    }

    public void setValorMonedaIncial(double valorMonedaIncial) {
        this.valorMonedaIncial = valorMonedaIncial;
    }

    public String getMonedaFinal() {
        return monedaFinal;
    }

    public void setMonedaFinal(String monedaFinal) {
        this.monedaFinal = monedaFinal;
    }

    public double getValorMonedaFinal() {
        return valorMonedaFinal;
    }

    public void setValorMonedaFinal(double valorMonedaFinal) {
        this.valorMonedaFinal = valorMonedaFinal;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }
}
