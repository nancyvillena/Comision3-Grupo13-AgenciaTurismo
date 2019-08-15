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
public class Paquete {
    
   private int id=-1;
   private String nombre_descripcion;
   private int id_alojamiento;
   private int id_traslado;
  

    public Paquete(String nombre_descripcion, int id_alojamiento, int id_traslado) {
        this.nombre_descripcion = nombre_descripcion;
        this.id_alojamiento = id_alojamiento;
        this.id_traslado = id_traslado;
       
    }
public Paquete (int id){

this.id= id;
}

public Paquete (){
}
    

public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_descripcion() {
        return nombre_descripcion;
    }

    public void setNombre_descripcion(String nombre_descripcion) {
        this.nombre_descripcion = nombre_descripcion;
    }

    public int getId_alojamiento() {
        return id_alojamiento;
    }

    public void setId_alojamiento(int id_alojamiento) {
        this.id_alojamiento = id_alojamiento;
    }

    public int getId_traslado() {
        return id_traslado;
    }

    public void setId_traslado(int id_traslado) {
        this.id_traslado = id_traslado;
    }

    

   
    
     
}
