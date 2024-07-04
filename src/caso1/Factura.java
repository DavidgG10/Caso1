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
    private int prodElectricos;
    private int prodAutomotrices;
    private int prodConstruccion;

    // se crea el constructor 
    public Factura(String nombreCliente, String cedulaCliente, int codigoFactura, double montoFactura,
            int prodElectricos, int prodAutomotrices, int prodConstruccion) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.codigoFactura = codigoFactura;
        this.montoFactura = montoFactura;
        this.prodElectricos = prodElectricos;
        this.prodAutomotrices = prodAutomotrices;
        this.prodConstruccion = prodConstruccion;
    }

    //se calcula el bono
    public double calcularBono() {
        double bono = 0;
        if (prodElectricos > 0 && prodAutomotrices > 0 && prodConstruccion > 0) {
            bono = montoFactura * .010;
            if (montoFactura > 50000) {
                bono = 0;
            }
        } else {
            if (prodElectricos > 0) {
                bono += montoFactura * 0.02;
                if (prodElectricos > 3) {
                    bono += montoFactura * 0.02;
                }
            }
            if (prodAutomotrices > 0) {
                bono += prodAutomotrices > 4 ? montoFactura * 0.04 : montoFactura * 0.02;
            }
            if (prodConstruccion > 0) {
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
        if (prodElectricos > 0 && prodAutomotrices > 0 && prodConstruccion > 0) {
            puntos += 3;
        }
        if (prodElectricos > 0) {
            puntos += 1;
        }
        if (prodAutomotrices > 4) {
            puntos += 1;
        }
        if (prodConstruccion > 0) {
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

    public int getProdElectricos() {
        return prodElectricos;
    }

    public void setProdElectricos(int prodElectricos) {
        this.prodElectricos = prodElectricos;
    }

    public int getProdAutomotrices() {
        return prodAutomotrices;
    }

    public void setProdAutomotrices(int prodAutomotrices) {
        this.prodAutomotrices = prodAutomotrices;
    }

    public int getProdConstruccion() {
        return prodConstruccion;
    }

    public void setProdConstruccion(int prodConstruccion) {
        this.prodConstruccion = prodConstruccion;
    }

}
