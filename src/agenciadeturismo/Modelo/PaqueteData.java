/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciadeturismo.Modelo;

import java.sql.Connection;

/**
 *
 * @author Asus
 */
public class PaqueteData {
    
      private Connection con;
      
       public PaqueteData (Conexion conexion) {
      con= conexion.getConexion();
    
  }
        public void guardarPaquete(Paquete paquete){
        
        
        
        
        
        }
       
       
       


}
