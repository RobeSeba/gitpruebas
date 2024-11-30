/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PATRON;

/**
 *
 * @author Roberto
 */
public class Proxy implements descargarVideo{
    private Asistente asistente;
    private boolean permiso;

    public Proxy(Asistente asistente) {
        this.asistente = asistente;
       
    }
    
    
    @Override
    public void descargar(String name) {
        if (permiso==true) {
            asistente.descargar(name);
        }else{
            System.out.println("No puede descargar este bideo");
        }
        
    }

    public void setPermiso(boolean permiso) {
        this.permiso = permiso;
    }
    
    
}
