package es.ftoribio.dam.utils;

import java.util.Scanner;

public class Read {

        public static int typeInt(String mensaje) {
            Scanner sc = new Scanner(System.in);
            boolean ok = false;
            int num = 0;
            do {
                try {
                    System.out.println(mensaje);
                    num = sc.nextInt();
                    ok = true;
                } catch (Exception ex) {
                    System.err.println("Error: no has introducido un número entero");
                    System.out.println("Introduzca un entero");
                    ok = false;
                    sc.next();
                }
            } while(!ok);
            return num;
        }

        public static float typeFloat(String mensaje) {
            Scanner sc = new Scanner(System.in);
            boolean ok = false;
            float num = 0;
            do {
                try {
                    System.out.println(mensaje);
                    num = sc.nextFloat();
                    ok = true;
                } catch (Exception ex) {
                    System.err.println("Error: no has introducido un número entero");
                    System.out.println("Introduzca un entero");
                    ok = false;
                    sc.next();
                }
            } while(!ok);
            return num;
        }

    /**
     * Lee un boolean por teclado
     */
    public static boolean typeBoolean() {
        Scanner sc = new Scanner(System.in);
        boolean b = false;
        boolean ok = false;
        do {
            try {
                b = sc.nextBoolean();
                ok = true;
            } catch (Exception e) {
                System.err.println("Error: no es un boolean.");
                sc.next();
            }
        } while (!ok);
        return b;
    }

    /**
     * Lee una linea entrada por teclado. Devuelve el String
     *
     * @return La entrada.
     */
    public static String typeLine() {
        Scanner sc = new Scanner(System.in);
        String line = "";
        do {
            line = sc.nextLine();
        } while (line.length() == 0);
        return line;
    }
}
