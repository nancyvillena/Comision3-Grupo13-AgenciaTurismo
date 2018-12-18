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
   private String descripcion;
   private Alojamiento alojamiento;
   private Traslado traslado;
  

    public Paquete(String descripcion, Alojamiento alojamiento, Traslado traslado) {
        this.descripcion = descripcion;
        this.alojamiento = alojamiento;
        this.traslado = traslado;
       
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Alojamiento getAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(Alojamiento alojamiento) {
        this.alojamiento = alojamiento;
    }

    public Traslado getTraslado() {
        return traslado;
    }

    public void setTraslado(Traslado traslado) {
        this.traslado = traslado;
    }

   
    
     
}
