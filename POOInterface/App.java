package POOInterface;

public class App {
    public static void main(String[] args) {
        Quadrado figura1 = new Quadrado(6);
        System.out.println("Area:"+figura1.getArea()+" Perimetro:"+figura1.getPerimetro()+" Nome:"+figura1.getNomeFigura());
        Retangulo figura2 = new Retangulo(5, 4);
        System.out.println("Area:"+figura2.getArea()+" Perimetro:"+figura2.getPerimetro()+" Nome:"+figura2.getNomeFigura());
        Trapezio figura3 = new Trapezio(10, 4, 4, 5, 5);
        System.out.println("Area:"+figura3.getArea()+" Perimetro:"+figura3.getPerimetro()+" Nome:"+figura3.getNomeFigura());
    }
}
