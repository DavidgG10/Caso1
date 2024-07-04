/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso1;
import javax.swing.JOptionPane;
/**
 *
 * @author David
 */

public class Caso1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //se crean los dialogos de la informacion del vendedor 
        String nombreVendedor = JOptionPane.showInputDialog("Ingrese el nombre del vendedor:");
        String codigoVendedor = JOptionPane.showInputDialog("Ingrese el código del vendedor:");
        String mes = JOptionPane.showInputDialog("Ingrese el mes:");
        String carro = JOptionPane.showInputDialog("Cuenta con carro?:");

        //se llama la clase vendedor 
        Vendedor vendedor = new Vendedor(nombreVendedor, codigoVendedor, mes, carro);
        //se agregra la opccion continuar 
        int continuar = JOptionPane.YES_OPTION;
        while (continuar == JOptionPane.YES_OPTION) {
            //se agregan los dialogos de la informacion del cliente 
            String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
            String cedulaCliente = JOptionPane.showInputDialog("Ingrese la cédula del cliente:");
            int codigoFactura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código de la factura:"));
            double montoFactura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la factura:"));
            int productosElectricos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos eléctricos:"));
            int productosAutomotrices = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos automotrices:"));
            int productosConstruccion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos de construcción:"));
            //se llama la clase de las facturas 
            Factura factura = new Factura(nombreCliente, cedulaCliente, codigoFactura, montoFactura,
                    productosElectricos, productosAutomotrices, productosConstruccion);
            vendedor.agregarFactura(factura);
            //se agrega el dialogo continuar
            continuar = JOptionPane.showConfirmDialog(null, "¿Desea agregar otra factura?", "Continuar", JOptionPane.YES_NO_OPTION);
        }

        vendedor.calcularResultados();
        vendedor.imprimirResultados();
    }

}
