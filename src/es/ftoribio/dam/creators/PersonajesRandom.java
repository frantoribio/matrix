package es.ftoribio.dam.creators;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Stream;

public class PersonajesRandom extends ArrayList<PersonajesRandom> {

    private String nombre = nombreRandom();
    private String ciudad = ciudadesRandom();
    private int edad = edadRandom();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonajesRandom)) return false;
        PersonajesRandom that = (PersonajesRandom) o;
        return edad == that.edad && nombre.equals(that.nombre) && ciudad.equals(that.ciudad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, ciudad, edad);
    }


    @Override
    public Stream<PersonajesRandom> stream() {
        return super.stream();
    }


    @Override
    public Stream<PersonajesRandom> parallelStream() {
        return super.parallelStream();
    }

    public PersonajesRandom createRandom(){
        PersonajesRandom personaje = new PersonajesRandom();
        return personaje;
    }

    /**
     * Genera un nombre aleatorio
     *
     * @return nombre aleatorio
     */
    private String nombreRandom() {
        String[] lista = {"Pepe", "Juan", "Ana", "Sonia", "Pedro", "Chiquito", "Elena"};
        int pos = (int) (Math.random() * lista.length);
        return lista[pos];
    }

    /**
     * Genera una ciudad aleatoria
     *
     * @return nombre ciudad aleatoria
     */
    private String ciudadesRandom(){
        String[] lista = {"Nueva York", "Pekín", "Roma", "París", "Londres", "Caracuel"};
        int pos = (int) (Math.random() * lista.length);
        return lista[pos];
    }

    /**
     * Genera una edad aleatoria entre 18 y 98 años
     *
     * @return edad aleatoria
     */
    private int edadRandom(){
        int edad = (int) (Math.random() * 80) + 18;
        return edad;
    }

    @Override
    public String toString() {
        return "Personajes{" +
                "nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", edad=" + edad +
                '}';
    }


}



