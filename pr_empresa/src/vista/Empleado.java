/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author PC
 */
public class Empleado extends Persona{
    private String id;
    private String puesto;
    
    public Empleado(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    @Override
    public String[] crear(){
        System.out.println("ID: "+getId());
        System.out.println("PUESTO: "+getPuesto());
        System.out.println("NOMBRES: "+ this.getNombres());
        System.out.println("APELLIDOS: "+ this.getApellidos());
        System.out.println("DIRECCION: "+ this.getDireccion());
        System.out.println("TELEFONO: "+ this.getTelefono());
        System.out.println("NACIMIENTO: "+ this.getFecha_nacimiento());
        return null;
    }

   
}
