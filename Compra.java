/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciadeturismo.Modelo;

import java.time.LocalDate;

/**
 *
 * @author Asus
 */
public class Compra {
    
   private int id=-1;
   private int id_cliente;
   private int id_paquete;
   private LocalDate fecha_ingreso;
   private LocalDate fecha_egreso;
   
   
   public Compra (){
   
   }
   
   public Compra (int id){

this.id= id;
}

    public Compra(int id_cliente, int id_paquete, LocalDate fecha_ingreso,LocalDate fecha_egreso) {
        this.id_cliente = id_cliente;
        this.id_paquete = id_paquete;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_egreso = fecha_egreso;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_paquete() {
        return id_paquete;
    }

    public void setId_paquete(int id_paquete) {
        this.id_paquete = id_paquete;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

      

    public LocalDate getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(LocalDate fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public LocalDate getFecha_egreso() {
        return fecha_egreso;
    }

    public void setFecha_egreso(LocalDate fecha_egreso) {
        this.fecha_egreso = fecha_egreso;
    }
   
   
   
}
