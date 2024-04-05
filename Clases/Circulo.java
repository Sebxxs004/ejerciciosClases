package Clases;
public class Circulo {
    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    
    public String areaPerimetro(int eleccion){
        double pi = Math.PI;
        double area = pi*Math.pow(radio, 2);
        double perimetro = 2*pi*radio;
        
        switch(eleccion){
            case 1:
                return "El area del circulo es: " + area;
            case 2:
                return "El perimetro del circulo es: " + perimetro;
            default:
                return "Error";
        }
    }
}
