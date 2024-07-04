/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudiodecaso.pkg1_andyhidalgo;

/**
 *
 * @author Aulas Heredia
 */
public class Factura {
    //Declaramos los atributos de la clase
    public String nombreCliente;
    public int cedulaCliente;
    public int codigo;
    public double monto;
    public int mes;
    public String nombreMes;
    public int producElectricos;
    public int producAutomotrices;
    public int producContruccion;

    //Creamos un metodo para cambiar la variable de integer a String
    public void mesNombre(int mes){
    switch (mes) {
        case 1 -> {
            nombreMes = "Enero";
        }
        case 2 -> {
            nombreMes = "Febrero";
        }
        case 3 -> {
            nombreMes = "Marzo";
        }
        case 4 -> {
            nombreMes = "Abril";
        }
        case 5 -> {
            nombreMes = "Mayo";
        }
        case 6 -> {
            nombreMes = "Junio";
        }
        case 7 -> {
            nombreMes = "Julio";
        }
        case 8 -> {
            nombreMes = "Agosto";
        }
        case 9 -> {
            nombreMes = "Setiembre";
        }
        case 10 -> {
            nombreMes = "Octubre";
        }
        case 11 -> {
            nombreMes = "Noviembre";
        }
        case 12 -> {
            nombreMes = "Diciembre";
        }
        default ->
            throw new AssertionError();
    }
        System.out.println(nombreMes);
    
}
    //Inicializamos los valores
    public Factura() {
        this.nombreCliente = "Alejandra";
        this.cedulaCliente = 124124124;
        this.codigo = 46543;
        this.monto = 400000;
        this.mes = 4;
        this.producElectricos = 3;
        this.producAutomotrices = 0;
        this.producContruccion = 4;
    }
    //Declaramos los setters y getters
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String getNombreMes() {
        return nombreMes;
    }

    public void setNombreMes(String nombreMes) {
        this.nombreMes = nombreMes;
    }

    public int getProducElectricos() {
        return producElectricos;
    }

    public void setProducElectricos(int producElectricos) {
        this.producElectricos = producElectricos;
    }

    public int getProducAutomotrices() {
        return producAutomotrices;
    }

    public void setProducAutomotrices(int producAutomotrices) {
        this.producAutomotrices = producAutomotrices;
    }

    public int getProducContruccion() {
        return producContruccion;
    }

    public void setProducContruccion(int producContruccion) {
        this.producContruccion = producContruccion;
    }
}