package com.mycompany.calculadora;
import java.lang.Math;
import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args) {
        float a, b, resultadoob;
        double c, d, resultadopr;
        char operacion;
        int opc;
        resultadoob=0;
        resultadopr=0;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("\tCalculadora\n\n1.Operaciones Basicas\n2.Potencia y Raiz\n3.Funciones Trigonometricas\n4.Porcentaje de Iva\n5.Salir");
            System.out.println("Digite su opcion: ");
            opc = in.nextInt();
            switch(opc){
                case 1: 
                    System.out.println("Binevenido a la calculadora Java para Operaciones Basicas\nDigite un valor y presione enter, digite una operacion (+, -, *, /) y presione enter, digite un valor y presione enter para obtener el resultado.\n");
                    a = in.nextInt();
                    operacion = in.next().charAt(0);
                    b = in.nextInt();
                    switch (operacion) {
                        case '+':
                            resultadoob = a + b;
                            break;
                        case '-':
                            resultadoob = a - b;
                            break;
                        case '*':
                            resultadoob = a * b;
                            break;
                        case '/':
                            if (b == 0) {
                                System.out.println("¡¡¡No es posible dividir por cero!!!");
                            }
                            resultadoob = a / b;
                            break;
                        default:
                            System.out.println("El signo para la operacion no es valido.");
                            break;
                    }
                    System.out.println("El resultado es: " + resultadoob);
                    break;
                case 2: 
                    System.out.println("Binevenido a la calculadora Java para Potencia y Raiz\nDigite la base o el radicando y presione enter, digite una operacion (^, √) y presione enter, digite el exponente o radical y presione enter para obtener el resultado.\n");
                    c = in.nextInt();
                    operacion = in.next().charAt(0);
                    d = in.nextInt();
                    switch (operacion) {
                        case '^':
                            resultadopr = Math.pow(c, d);
                            break;
                        case '√':
                            if (d == 2) {
                                resultadopr = Math.sqrt(c);
                            } else {
                                if (d == 3) {
                                    resultadopr = Math.cbrt(c);
                                }
                                else {
                                    System.out.println("Solo se puede realizar raiz cuadrada o cubica.");
                                }
                            }
                            break;
                        default:
                            System.out.println("El signo para la operacion no es valido.");
                            break;
                    }
                    System.out.println("El resultado es: " + resultadopr);
                case 3: System.out.println("En proceso...");
                        break;
                case 4: System.out.println("En proceso...");
                        break;
                case 5: System.out.println("Saliendo...");
                        break;
                default:System.out.println("Opcion no valida");
                        break;
            }
        }while(opc!=5);
    }
}
