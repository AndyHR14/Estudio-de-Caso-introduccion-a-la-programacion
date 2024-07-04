/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudiodecaso.pkg1_andyhidalgo;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class EstudioDeCaso1_AndyHidalgo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Estudio de Caso #1 Introduccion a la Programacion
        /*
        La clase main representa el sistema de control de facturas de la empresa
         */

        String cantFacturas;
        int cantFacturasNum;
        double comision = 0;
        String bonoExtra = "";
        AgenteVendedor agenteVendedor1;
        Factura factura1;

        cantFacturas = JOptionPane.showInputDialog("Ingrese la cantidad de facturas realizadas en el mes: ");
        cantFacturasNum = Integer.parseInt(cantFacturas);
        Factura factura = new Factura();
        AgenteVendedor agenteVendedor = new AgenteVendedor();
        agenteVendedor.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del agente: "));
        agenteVendedor.setVehiculo(JOptionPane.showInputDialog("El agente tiene vehiculo? Si/No; "));
        agenteVendedor.setSucursal(JOptionPane.showInputDialog("Ingrese la sucursal del agente: "));

         //Con la cantidad de facturas ejecutamos el comando for
        for (int i = 0; i < cantFacturasNum; i++) {
            if (factura.producAutomotrices > 1 && factura.producContruccion > 1 && factura.producElectricos > 1) {
                agenteVendedor.puntos += 3;
                comision = (factura.monto * 0.1) ;
                bonoExtra = "No";
            } else {
                if (factura.producElectricos >= 3) {
                agenteVendedor.puntos += 1;
                comision = (factura.monto * 0.04) ;
                bonoExtra = "No";
                } else if (factura.producElectricos < 3 && factura.producElectricos > 0) {
                agenteVendedor.puntos += 1;
                comision = (factura.monto * 0.02) ;
                bonoExtra = "No";
                }
                if (factura.producAutomotrices > 4) {
                agenteVendedor.puntos += 1;
                comision = (factura.monto * 0.04);
                bonoExtra = "No";
                } else if (factura.producAutomotrices < 4 && factura.producAutomotrices > 0) {
                agenteVendedor.puntos += 1;
                comision = (factura.monto * 0.02) ;
                bonoExtra = "No";
                } 
                if (factura.producContruccion > 0) {
                agenteVendedor.puntos += 2;
                comision = (factura.monto * 0.08) ;
                bonoExtra = "No";
                }
            if (factura.monto > 50000) {
                agenteVendedor.puntos += 1;
                comision = (factura.monto * 0.05) ;
                bonoExtra = "No";
            }
            if (cantFacturasNum > 10 || factura.monto > 300000) {
                comision += 20000;
                bonoExtra = "Si";
            }
        }  
        }
        factura.monto += comision;

        System.out.println("El vendedor " + agenteVendedor.getNombre() + " codigo: " + agenteVendedor.codigo + " en el mes de: ");
        factura.mesNombre(2);
        
        //Mostramos los datos
        System.out.println("Vendio un total de " + factura.monto + " en facturas");
        System.out.println("Obtuvo un total en comisiones de: " + comision);
        System.out.println("El agente vendedor " + bonoExtra + " logro el objetivo del Bono Extra");
        System.out.println("Puntos obtenidos por el vendedor: " + agenteVendedor.puntos);
        System.out.println("El agente vendedor " + agenteVendedor.getVehiculo() + " cuenta con vehiculo propio");
        System.out.println("Sucursal " + agenteVendedor.getSucursal());

    
    }
}