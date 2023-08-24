package com.mycompany.calculadora;

public class Operaciones {
    static double sumar(double a, double b){
        return a+b;
    }
    static double restar(double a, double b){
        return a-b;
    }
    static double multiplicar(double a, double b){
        return a*b;
    }
    static double dividir(double a, double b){
        return a/b;
    }
    
    static double potencia(double a, double b){
        return Math.pow(a, b);
    }
    static double raiz(double a, double b){
        b=1/b;
        return Math.pow(a, b);
    }
    
    static double sen(double a){
        a = Math.toRadians(a);
        return Math.sin(a);
    }
    static double cos(double a){
        a = Math.toRadians(a);
        return Math.cos(a);
    }
    static double tan(double a){
        a = Math.toRadians(a);
        return Math.tan(a);
    }
}
