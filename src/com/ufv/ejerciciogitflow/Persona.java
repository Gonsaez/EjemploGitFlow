package com.ufv.ejerciciogitflow;

public class Persona {

    private String nombre;
    private String apellidos;
    private int dnisinletra;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String _nombre) {
        this.nombre = _nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String _apellidos) {
        this.apellidos = _apellidos;
    }

    public int getDnisinletra() {
        return dnisinletra;
    }

    public void setDnisinletra(int _dnisinletra) {
        this.dnisinletra = _dnisinletra;
    }

    public void setEdad(int _edad) {

        if (_edad >= 18) {
            System.out.println("Ya puedes votar!!!");
        }else {
            System.out.println("Eres un bebé");
        }

        this.edad = _edad;
    }

    public int getEdad() {
        return edad;
    }
}
