package com.mycompany.calculadora;
import java.lang.Math;
import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args) throws InterruptedException {
        float a, b, resultadoob;
        double c, d, e, f, g, resultadopr, resultadoft;
        char operacion;
        int opc, funcion;
        resultadoob=0;
        resultadopr=0;
        resultadoft=0;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("\tCalculadora\n\n1.Operaciones Basicas\n2.Potencia y Raiz\n3.Funciones Trigonometricas\n4.Porcentaje de Iva\n5.Salir");
            System.out.println("Digite su opcion: ");
            opc = in.nextInt();
            switch(opc){
                case 1: 
                    System.out.println("Binevenido a la calculadora Java para Operaciones Basicas\nDigite un valor y presione enter, digite una operacion (+, -, *, /) y presione enter, digite un valor y presione enter para obtener el resultado.\n");
                    a = in.nextFloat();
                    operacion = in.next().charAt(0);
                    b = in.nextFloat();
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
                    Thread.sleep(5000);
                    break;
                case 2: 
                    System.out.println("Binevenido a la calculadora Java para Potencia y Raiz\nDigite la base o el radicando y presione enter, digite una operacion, ^ para potencia y R para raiz y presione enter, digite el exponente o radical y presione enter para obtener el resultado.\n");
                    c = in.nextDouble();
                    operacion = in.next().charAt(0);
                    d = in.nextDouble();
                    switch (operacion) {
                        case '^':
                            resultadopr = Math.pow(c, d);
                            break;
                        case 'R':
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
                    Thread.sleep(5000);
                    break;
                case 3: 
                    System.out.println("Binevenido a la calculadora Java para Funciones Trigonometricas\nDigite un angulo y presione enter, digite una opcion de las siguientes y presione enter para obtener el resultado en radianes.\n1.Seno.\n2.Coseno.\n3.Tangente.\n");
                    e = in.nextDouble();
                    funcion = in.nextInt();
                    e = Math.toRadians(e);
                    switch (funcion) {
                        case 1:
                            resultadoft = Math.sin(e);
                            break;
                        case 2:
                            resultadoft = Math.cos(e);
                            break;
                        case 3:
                            if (Math.cos(e) == 0) {
                                System.out.println("¡¡¡Esta tangente esta indefinida!!!");
                            }
                            resultadoft = Math.tan(e);
                            break;
                        default:
                            System.out.println("La opcion no es valida.");
                            break;
                    }
                    System.out.println("El resultado es: " + resultadoft);
                    Thread.sleep(5000);
                    break;
                case 4: System.out.println("Bienvenido a la calculadora para calcular el porcentaje del IVA\nPrimeramente digite la tasa actual del IVA y presione enter, y luego digite el valor del producto del cual desea conocer el porcentaje del IVA y presione enter.");
                        f = in.nextDouble()/100;
                        g = in.nextDouble();
                        System.out.println("El valor del producto con el IVA incluido es de: "+g*(1+f)+"$\nEl valor del IVA incluido es de: "+g*f+"$");
                        Thread.sleep(5000);
                        break;
                case 5: System.out.println("Saliendo...");
                        break;
                default:System.out.println("Opcion no valida");
                        break;
            }
        }while(opc!=5);
    }
}
