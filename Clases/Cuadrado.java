package Clases;
public class Cuadrado {
    private float lado;
    public Cuadrado() {
    }

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }
    
    public String areaPerimetro(int eleccion){
        double perimetro = lado*4;
        double area = perimetro/2;
        switch(eleccion){
            case 1:
                return "El area del cuadrado es: " + area;
            case 2:
                return "El perimetro del cuadrado es: " + perimetro;
            default:
                return "Error";
        }
    }
}
