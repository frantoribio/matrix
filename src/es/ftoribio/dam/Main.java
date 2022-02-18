package es.ftoribio.dam;

import es.ftoribio.dam.models.Personajes;
import es.ftoribio.dam.models.matrix.Matrix;
import es.ftoribio.dam.utils.Read;
import es.ftoribio.dam.creators.PersonajesRandom;

public class Main {

    public static void main(String[] args) {
        init();
        PersonajesRandom x = new PersonajesRandom();
        x.createRandom().toString();
        System.out.println(x);
    }

    public static void init() {
        int rows = 0;
        int columns = 0;
        do {
            System.out.println("\n\nBienvenido a Matrix \n\n" +
                    "Introduce el número de filas que tendrá Matrix: ");
            rows = Read.typeInt("Introduce sólo un 5, si no no avanzarás");
            System.out.println("Introduce el número de columnas:");
            columns = Read.typeInt("Introduce sólo un 5, si no no avanzarás");
        } while (rows != 5 & columns != 5);
        Matrix<PersonajesRandom> matrix = new Matrix<>(rows, columns);
        PersonajesRandom x = new PersonajesRandom();
        //matrix.add(0, x);
        System.out.println(matrix.toString());
    }
}
