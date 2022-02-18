package es.ftoribio.dam.models;

import es.ftoribio.dam.creators.PersonajesRandom;

import java.util.Objects;

public class Personajes {
    private String nombre;
    private String ciudad;
    private int edad;

    public Personajes(){
        PersonajesRandom x = new PersonajesRandom();

    }

    public Personajes(String nombre, String ciudad, int edad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        return "Personajes{" +
                "nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", edad=" + edad +
                '}';
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Personajes)) return false;
        Personajes that = (Personajes) o;
        return getEdad() == that.getEdad() && getNombre().equals(that.getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getEdad());
    }

}
