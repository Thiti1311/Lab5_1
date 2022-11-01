package Figuras;

public class TrianguloEquilatero implements FiguraGeometrica{

    private double lado;

    public TrianguloEquilatero(double lado){
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return ((lado*lado) * Math.sqrt(3))/4;
    }

    @Override
    public double getPerimetro() {
        return 3*lado;
    }

    @Override
    public String desenharFigura() {
        return "Desenhando um Triangulo Equilatero";
    }

    @Override
    public String getInfo() {
        String info = "Figura: Triangulo Equilatero\nLado: "+ getLado() + "\nArea: "+ getArea() + "\nPerimetro: "+ getPerimetro();
        return info;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
