/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author PC
 */
public class Cliente extends Persona{
    private String nit;
    
    public Cliente(){}

    public Cliente(String nit, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.nit = nit;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    
    @Override
    public String[] crear(){
        System.out.println("NIT: "+getNit());
        System.out.println("NOMBRES: "+ this.getNombres());
        System.out.println("APELLIDOS: "+ this.getApellidos());
        System.out.println("DIRECCION: "+ this.getDireccion());
        System.out.println("TELEFONO: "+ this.getTelefono());
        System.out.println("NACIMIENTO: "+ this.getFecha_nacimiento());
        return null;
    }
    
}
