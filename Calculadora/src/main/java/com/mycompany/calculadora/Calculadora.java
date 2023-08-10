package com.mycompany.calculadora;
import java.lang.Math;
import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args) {
        float a, b, resultado;
        char operacion;
        resultado=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Binevenido a la calculadora Java\nDigite un valor y presione enter, digite una operacion (+, -, *, /) y presione enter, digite un valor y presione enter para obtener el resultado.\n");
        a=in.nextInt();
        operacion=in.next().charAt(0);
        b=in.nextInt();
        switch(operacion){
            case '+':resultado=a+b;
                     break;
            case '-':resultado=a-b;
                     break;
            case '*':resultado=a*b;
                     break;
            case '/':resultado=a/b;
                     break;
        }
        System.out.println("El resultado es: " + resultado);
    }
}
