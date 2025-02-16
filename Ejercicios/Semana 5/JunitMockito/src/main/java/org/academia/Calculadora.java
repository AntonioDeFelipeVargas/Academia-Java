package org.academia;

public class Calculadora
{

    private CalculadoraCloud calculadoraCloud;

    public double sumar(double a, double b)
    {
        return a + b;
    }
    public double restar(double a, double b)
    {
        return a - b;
    }
    public double multiplicar(double a, double b)
    {
        return a * b;
    }
    public double dividir(double a, double b)
    {
        return a / b;
    }
    public double sumarEnCloud (double a, double b)
    {
        return calculadoraCloud.operacionEnCloud(a, b);
    }
}
