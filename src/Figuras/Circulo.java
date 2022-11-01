package Figuras;

public class Circulo implements FiguraGeometrica{
    
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double getArea() {
        double area = 3.14 * (raio*raio);
        return area;
    }

    @Override
    public double getPerimetro() {
        double perimetro = 2 * 3.14 * raio;
        return perimetro;
    }

    @Override
    public String desenharFigura() {
        return "Desenhando um Circulo";
    }

    @Override
    public String getInfo() {
        String info = "Figura: Circulo\nRaio: "+ getRaio() + "\nArea: "+ getArea() + "\nPerimetro: "+ getPerimetro();
        return info;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
}
