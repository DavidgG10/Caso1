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
    private String lograrBono;
// se crea el constructor 

    public Vendedor(String nombre, String codigo, String mes, String carro) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.mes = convertirMes(mes);
        this.carro = carro;
        this.lograrBono = "no";
        this.totalFacturas = totalFacturas;
        this.totalComisiones = totalComisiones;
        this.totalPuntos = totalPuntos;
        this.cantidadFacturas = cantidadFacturas;
    }
//se convierte los meses

    private String convertirMes(String mes) {
        int mesNumero = Integer.parseInt(mes);
        switch (mesNumero) {
            case 1:
                return "enero";
            case 2:
                return "febrero";
            case 3:
                return "marzo";
            case 4:
                return "abril";
            case 5:
                return "mayo";
            case 6:
                return "junio";
            case 7:
                return "julio";
            case 8:
                return "agosto";
            case 9:
                return "septiembre";
            case 10:
                return "octubre";
            case 11:
                return "noviembre";
            case 12:
                return "diciembre";
            default:
                return "mes inválido";

        }

    }

    //se agrega toda la info de facturas que tiene el vendedor  
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
            lograrBono = "si";
        }
        totalComisiones += bonoExtra;
    }

// se imprimen los resultados 
    public void imprimirResultados() {
        String resultado = "El venderor: " + nombre
                + "codigo: " + codigo + "en el mes: " + mes + "\nvendio un total: " + totalFacturas + "en facturas"
                + "\nObtuvo un tootal en comisiones: " + totalComisiones
                + "\nEl agente vendedor" + lograrBono + "logro el bono extra"
                + "\n+Puntos obtenidos por el vendedor: " + totalPuntos
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

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getLograrBono() {
        return lograrBono;
    }

    public void setLograrBono(String lograrBono) {
        this.lograrBono = lograrBono;
    }

}
