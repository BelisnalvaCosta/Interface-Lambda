package com.dio;

// Programa principal
public class CalculoArea {
    public static void main(String[] args) {
        FiguraGeometrica quadrado = new Quadrado(4);
        FiguraGeometrica retangulo = new Retangulo(5, 3);
        FiguraGeometrica circulo = new Circulo(2.5);

        System.out.println("Área do Quadrado: " + quadrado.calcularArea());
        System.out.println("Área do Retângulo: " + retangulo.calcularArea());
        System.out.println("Área do Círculo: " + circulo.calcularArea());

        // Exemplo com Lambda
        FiguraGeometrica triangulo = () -> (5 * 3) / 2.0;
        System.out.println("Área do Triângulo (usando lambda): " + triangulo.calcularArea());
    }
}