package Clases;
public class Triangulo {
    private float lado1, lado2;

    public Triangulo(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Triangulo() {
    }

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + ", lado3="+'}';
    }
    
    public String areaPerimtroH(int eleccion){
       double area = (lado1 + lado2)/2;
       double hipotenusa = Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2));
       double perimetro = lado1 + lado2 + hipotenusa;
       switch(eleccion){
           case 1:
               return "El area de el triangulo es: " + area + " y su hipotenusa es: " + hipotenusa;
           case 2:
                return "El perimetro de el triangulo es: " + perimetro + " y su hipotenusa es: " + hipotenusa;
           default:
               return "Error";
       }
    }
}
