import formas.Circulo;
import formas.Rectangulo;

public class Main {
    public static void main(String[] args) {
        // Crear objetos Circulo y Rectangulo
        Circulo circulo = new Circulo(5.0);
        Rectangulo rectangulo = new Rectangulo(4.0, 6.0);

        // Calcular y mostrar resultados
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());

        System.out.println("\nÁrea del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
    }
}
