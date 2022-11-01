package Figuras;

public class Retangulo implements FiguraGeometrica {

    private double lado;
    private double altura;

    public Retangulo(double lado, double altura){
        this.lado = lado;
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double getArea() {
        double area = altura*lado;
        return area;
    }

    @Override
    public double getPerimetro() {
        double perimetro = 2*lado + 2*altura;
        return perimetro;
    }

    @Override
    public String desenharFigura() {
        return "Desenhando um Retangulo";
    }

    @Override
    public String getInfo() {
        String info = "Figura: Retangulo\nLado: "+ getLado() + "Altura "+getAltura()+ "\nArea: "+ getArea() + "\nPerimetro: "+ getPerimetro();
        return info;
    }
    
}
