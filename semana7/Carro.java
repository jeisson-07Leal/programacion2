package semana7;

import javax.swing.JOptionPane;

public abstract class Carro{
    private String marca;
    private String linea;
    private int modelo;
    private int valorComercial;
   private int prontoPago;
   private String traslado;
   private String servicioPublico;
    public Carro() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getValorComercial() {
        return valorComercial;
    }

    public void setValorComercial(int valorComercial) {
        this.valorComercial = valorComercial;
    }

    public int getProntoPago() {
        return prontoPago;
    }

    public void setProntoPago(int prontoPago) {
        this.prontoPago = prontoPago;
    }

    public String getTraslado() {
        return traslado;
    }

    public void setTraslado(String traslado) {
        this.traslado = traslado;
    }

    public String getServicioPublico() {
        return servicioPublico;
    }

    public void setServicioPublico(String servicioPublico) {
        this.servicioPublico = servicioPublico;
    }
}
