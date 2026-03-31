/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinal;

/**
 *
 * @author frankz
 */
import java.util.Scanner;
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner lector = new Scanner(System.in);
    
        System.out.println("INGRESE SU NOMBRE: ");
        String nombre = lector.nextLine();
        System.out.printf("HOLA %S" ,nombre);
    }
    
}
