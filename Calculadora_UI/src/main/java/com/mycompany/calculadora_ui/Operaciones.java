package com.mycompany.calculadora_ui;

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
    
    static double porciento(double a, double b){
        a = a/100;
        return b*a;
    }
}
