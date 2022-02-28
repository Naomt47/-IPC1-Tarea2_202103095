/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ipc1.tarea2_202103095;

/**
 *
 * @author naomi
 */
public class IPC1Tarea2_202103095 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Usuario usuario1 = new Usuario(202103095,"Angely Naomi Marroquin Tapaz");
        Usuario[] usuarios= new Usuario[3];
        usuarios[0] = new Usuario(202103095,"Angely Naomi","Marroquín Tapaz");
        login Login= new login(usuarios);
        Login.setVisible(true);
        
    }
    
}
