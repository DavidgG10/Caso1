/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso1;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class Vendedor {
// se crean los atributos 

    private String nombre;
    private String codigo;
    private String mes;
    private String carro;
    private String sucursal;
    private double totalFacturas;
    private double totalComisiones;
    private int totalPuntos;
    private int cantidadFacturas;
// se crea el constructor 

    public Vendedor(String nombre, String codigo, String mes, String carro) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.mes = mes;
        this.carro = carro;
        this.totalFacturas = totalFacturas;
        this.totalComisiones = totalComisiones;
        this.totalPuntos = totalPuntos;
        this.cantidadFacturas = cantidadFacturas;
    }

    //se agregan toda la info de facturas que tiene el vendedor  
    public void agregarFactura(Factura factura) {
        totalFacturas += factura.getMontoFactura();
        totalComisiones += factura.calcularBono();
        totalPuntos += factura.calcularPuntos();
        cantidadFacturas++;
    }
//se calcula el bono extra

    public void calcularResultados() {
        double bonoExtra = 0;
        if (cantidadFacturas >= 10 || totalFacturas > 300000) {
            bonoExtra = 20000;
        }
        totalComisiones += bonoExtra;
    }
// se imprimen los resultados 

    public void imprimirResultados() {
        String resultado = "El venderor: " + nombre
                + "codigo: " + codigo + "en el mes: " + mes + "\nvendio un total: " + totalFacturas +"en facturas"
                + "\nObtuvo un tootal en comisiones: " + totalComisiones + "\n+Puntos obtenidos por el vendedor: " + totalPuntos
                + "\nEl agente vendedor" + carro + "cuenta con vehiculo propio" + "\nSucursal: Heredia";
        JOptionPane.showMessageDialog(null, resultado);
    }
//se agregana los getter and setters 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public double getTotalFacturas() {
        return totalFacturas;
    }

    public void setTotalFacturas(double totalFacturas) {
        this.totalFacturas = totalFacturas;
    }

    public double getTotalComisiones() {
        return totalComisiones;
    }

    public void setTotalComisiones(double totalComisiones) {
        this.totalComisiones = totalComisiones;
    }

    public int getTotalPuntos() {
        return totalPuntos;
    }

    public void setTotalPuntos(int totalPuntos) {
        this.totalPuntos = totalPuntos;
    }

    public int getCantidadFacturas() {
        return cantidadFacturas;
    }

    public void setCantidadFacturas(int cantidadFacturas) {
        this.cantidadFacturas = cantidadFacturas;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

}
