/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipc1.tarea2_202103095;

/**
 *
 * @author naomi
 */
public class Usuario {
    int contraseña;
    String nombreUsuario;
    String apellidoUsuario;
    
    
    Usuario(int contraseña, String nombreUsuario, String apellidoUsuario){
        this.contraseña=contraseña;
        this.nombreUsuario=nombreUsuario;
        this.apellidoUsuario=apellidoUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    
    
}
