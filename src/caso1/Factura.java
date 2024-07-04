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
    
public class Factura {
    
    //se crean los atributos 
    private String nombreCliente;
    private String cedulaCliente;
    private int codigoFactura;
    private double montoFactura;
    private int productosElectricos;
    private int productosAutomotrices;
    private int productosConstruccion;

    // se crea el constructor 
    public Factura(String nombreCliente, String cedulaCliente, int codigoFactura, double montoFactura,
            int productosElectricos, int productosAutomotrices, int productosConstruccion) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.codigoFactura = codigoFactura;
        this.montoFactura = montoFactura;
        this.productosElectricos = productosElectricos;
        this.productosAutomotrices = productosAutomotrices;
        this.productosConstruccion = productosConstruccion;
    }

    //se calcula el bono
    public double calcularBono() {
        double bono = 0;
        if (productosElectricos > 0 && productosAutomotrices > 0 && productosConstruccion > 0) {
            bono = montoFactura * .010;
            if (montoFactura > 50000) {
                bono = 0;
            }
        } else {
            if (productosElectricos > 0) {
                bono += montoFactura * 0.02;
                if (productosElectricos > 3) {
                    bono += montoFactura * 0.02;
                }
            }
            if (productosAutomotrices > 0) {
                bono += productosAutomotrices > 4 ? montoFactura * 0.04 : montoFactura * 0.02;
            }
            if (productosConstruccion > 0) {
                bono += montoFactura * 0.08;
            }
        }

        if (montoFactura > 50000) {
            bono += montoFactura * 0.05;
        }

        return bono;
    }

    //se calculan los puntos que obtuvo el vendedor 
    public int calcularPuntos() {
        int puntos = 0;
        if (productosElectricos > 0 && productosAutomotrices > 0 && productosConstruccion > 0) {
            puntos += 3;
        }
        if (productosElectricos > 0) {
            puntos += 1;
        }
        if (productosAutomotrices > 4) {
            puntos += 1;
        }
        if (productosConstruccion > 0) {
            puntos += 2;
        }
        return puntos;
    }

    //se agregan los getter and setters 
    public double getMontoFactura() {
        return montoFactura;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public int getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(int codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public int getProductosElectricos() {
        return productosElectricos;
    }

    public void setProductosElectricos(int productosElectricos) {
        this.productosElectricos = productosElectricos;
    }

    public int getProductosAutomotrices() {
        return productosAutomotrices;
    }

    public void setProductosAutomotrices(int productosAutomotrices) {
        this.productosAutomotrices = productosAutomotrices;
    }

    public int getProductosConstruccion() {
        return productosConstruccion;
    }

    public void setProductosConstruccion(int productosConstruccion) {
        this.productosConstruccion = productosConstruccion;
    }

}
