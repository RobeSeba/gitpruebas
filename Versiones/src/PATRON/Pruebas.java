/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PATRON;

/**
 *
 * @author Roberto
 */
public class Pruebas {
    public static void main(String[] args) {
        Proxy asistente = new Proxy(new Asistente());
        asistente.setPermiso(true);
        asistente.descargar("Loco por ti.mp3");
    }
}
