/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciadeturismo.Modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class CompraData { 
    
 private Connection con;
      
       public CompraData (Conexion conexion) {
      con= conexion.getConexion();
    
  }
        public void guardarCompra(Compra compra){
        
       
     try {
         String sql = "INSERT INTO compra (id_cliente,id_paquete,fecha_ingreso, fecha egreso) VALUES ( ?,?,?,? );";
         
         
         PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
         ps.setInt(1, compra.getId_cliente());
         ps.setInt(2, compra.getId_paquete());
         ps.setDate(3, Date.valueOf(compra.getFecha_ingreso()));
          ps.setDate(4, Date.valueOf(compra.getFecha_egreso()));
         ps.executeUpdate();
         
         ResultSet rs = ps.getGeneratedKeys();
         
         if (rs.next()) {
             compra.setId(rs.getInt("id"));
         } else {
             System.out.println("No se pudo obtener el id luego de insertar un compra");
         }
         ps.close();
     } catch (SQLException ex) {
         Logger.getLogger(CompraData.class.getName()).log(Level.SEVERE, null, ex);
     }
          }
           
        
            
          
        
        
        public void borrarCompra(int id){
                
                  
     try {
         String sql = "DELETE FROM compra  WHERE id=?";
         
         
         PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
         ps.setInt(1, id);
         ps.executeUpdate();
         ps.close();;
     } catch (SQLException ex) {
         Logger.getLogger(CompraData.class.getName()).log(Level.SEVERE, null, ex);
     }

          } 

            
        
            
     public Compra buscarCompra(int id){
    
         Compra compra = null;
     
    try {
         
         
         String sql = "SELECT * FROM compra  WHERE id=?;";
         
         PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
         ps.setInt(1, id);
         ResultSet resultSet = ps.executeQuery();
     
         
         while(resultSet.next()){
             
             compra = new Compra();          
             compra.setId(resultSet.getInt("id"));
             compra.setId_cliente(resultSet.getInt("id_cliente"));
             compra.setId_paquete(resultSet.getInt("id_paquete"));
             compra.setFecha_ingreso(resultSet.getDate("fecha_ingreso").toLocalDate());
             compra.setFecha_egreso(resultSet.getDate("fecha_egreso").toLocalDate());
         }
         
        } catch (SQLException ex) {
         Logger.getLogger(CompraData.class.getName()).log(Level.SEVERE, null, ex);
     } 
    return compra;
     }
     
     
     

public List<Compra> obtenerCompras(){
    
    
    List<Compra> compras = new ArrayList<Compra>();
         
         
     try {
         
         
         
         String sql = "SELECT * FROM compra;";
         
         PreparedStatement ps = con.prepareStatement(sql);
         ResultSet resultSet = ps.executeQuery();
         Compra compra;
         
         while(resultSet.next()){
             
             compra= new Compra();
             compra.setId(resultSet.getInt("id"));
             compra.setId_cliente(resultSet.getInt("id_cliente"));
             compra.setId_paquete(resultSet.getInt("id_paquete"));
             compra.setFecha_ingreso(resultSet.getDate("fecha_ingreso").toLocalDate());
             compra.setFecha_egreso(resultSet.getDate("fecha_egreso").toLocalDate());
             
             compras.add(compra);
             
         }
         
         ps.close();
         
         
        
     } catch (SQLException ex) {
         Logger.getLogger(CompraData.class.getName()).log(Level.SEVERE, null, ex);
     } 
     
     return compras;
   }
    
    
    
}
