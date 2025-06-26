package com.dio;

// Classe Retângulo
class Retangulo implements FiguraGeometrica {
    private double base, altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }
}
