/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudiodecaso.pkg1_andyhidalgo;

/**
 *
 * @author Aulas Heredia
 */
public class AgenteVendedor {
    //Declaramos los atributos de la clase
    private String nombre;
    public int cedula;
    public int codigo;
    public int puntos;
    private String sucursal;
    private String vehiculo;
    
    //Inicializamos los valores
    public AgenteVendedor() {
        this.nombre = "Juan";
        this.cedula = 11199923;
        this.codigo = 434;
        this.puntos = 0;
        this.sucursal = "Heredia";
        this.vehiculo = "si";
        
        
    }
    //Declaramos los setters y getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }
}
