/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciadeturismo.Modelo;

/**
 *
 * @author Asus
 */
public class Cliente {
    
    private int id= -1 ;/*es un objeto creado en mi aplicacion y no  
    proviene de la base de dato y asi puedo diferenciarlo*/
    private String nombre;
    private int dni;
    private double celular;

    public Cliente(String nombre, int dni, double celular) {
        this.nombre = nombre;
        this.dni = dni;
        this.celular = celular;
    }
   
   public Cliente(int id) {
   
   this.id = id;
   } 
public Cliente(){

}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getCelular() {
        return celular;
    }

    public void setCelular(double celular) {
        this.celular = celular;
    }
     
     
}
