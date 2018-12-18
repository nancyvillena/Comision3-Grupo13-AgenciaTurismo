/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciadeturismo.Modelo;

import agenciadeturismo.Modelo.Conexion;
import agenciadeturismo.Modelo.Cliente;
/**
 *
 * @author Asus
 */
public class AgenciaDeTurismo {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        // PRINCIPIO MAIN *************************
        //*******************************
        
        
        // Materia math= new Materia("Matematica");
        //  Materia prog= new Materia("Programacion");
         // Materia comp= new Materia("Comprension de Textos");
     // Alumno alumno1 = new Alumno("Juan Lopez", LocalDate.of(2010,Month.DECEMBER, 12), true);
     //  Alumno alumno2 = new Alumno("Miguel Perez", LocalDate.of(2011,Month.APRIL, 18), false);
      // Cliente cliente1= new Cliente("Nancy Villena", 93086465, 2664172997l);
 //Cliente cliente2= new Cliente("Maria Eugenia Vidal",28032156, 01145896232d);
 Cliente cliente2= new Cliente();
 
 

// cliente2.setId(3);
       Conexion con=new Conexion();
       
       ClienteData cd= new ClienteData(con);
      // MateriaData md= new MateriaData(con);
      
     //cliente2 = cd.buscarCliente(4);
       
           //System.out.println("Cliente a Borrar: "+ cliente2.getId());
      // md.guardarMateria(math);
       //md.guardarMateria(prog);
       //md.guardarMateria(comp);
       
       
     // ad.guardarAlumno(alumno1);
      // ad.actualizarCliente(cliente2);
     //ad.guardarCliente(cliente2);
     //cd.borrarCliente(cliente2.getId());
       
       //System.out.println("Nueva materia id: "+ math.getId());
      // System.out.println("Nueva materia id: "+ prog.getId());
       // System.out.println("Nueva materia id: "+ comp.getId());
       
     // System.out.println("Nuevo  alumno id: "+ alumno1.getId());
       // System.out.println("Nuevo  alumno id: "+ alumno2.getId());
     // System.out.println("Nuevo  cliente id: "+ cliente2.getId());
               
       for(Cliente it:cd.obtenerClientes()){
      
          System.out.println("ID "+ it.getId());
          System.out.println("Nombre "+ it.getNombre());
       }
       
        //ad.borrarCliente(cliente4.getId());        
        
        
        // FIN MAIN ***************************
        //*******************************
    }
    
}
