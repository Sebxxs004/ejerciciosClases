package Clases;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        LocalDate fechaNacimiento = LocalDate.of(2004, 11, 15);
        Persona persona = new Persona();
        persona.calcularEdad(fechaNacimiento);
        Scanner i = new Scanner(System.in);
        System.out.println("Ingrese (1) si AREA de las 3 figuras");
        System.out.println("Ingrese (2) si PERIMETRO de las 3 figuras");
        int eleccion = i.nextInt();
        Cuadrado cuadro = new Cuadrado(12);
        Circulo circulo = new Circulo(15);
        Triangulo triangulo = new Triangulo(16, 12);
        System.out.println(cuadro.areaPerimetro(eleccion));
        System.out.println(circulo.areaPerimetro(eleccion));
        System.out.println(triangulo.areaPerimtroH(eleccion));
    }
}
