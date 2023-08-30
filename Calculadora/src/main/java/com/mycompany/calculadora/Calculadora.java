package com.mycompany.calculadora;
import java.lang.Math;
import java.util.Scanner;
public class Calculadora {
    static void resultado(double r) throws InterruptedException{
        System.out.println("El resultado es: " + r);
        Thread.sleep(5000);
    }
    static void error() throws InterruptedException{
        System.out.println("Error");
        Thread.sleep(5000);
    }
    public static void main(String[] args) throws InterruptedException {
        double a, b, resultado;
        char operacion;
        int opc, funcion;
        resultado=0;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("\tCalculadora\n\n1.Operaciones Basicas\n2.Potencia y Raiz\n3.Funciones Trigonometricas\n4.Porcentaje de Iva\n5.Salir");
            System.out.println("Digite su opcion: ");
            opc = in.nextInt();
            switch(opc){
                case 1: 
                    System.out.println("Binevenido a la calculadora Java para Operaciones Basicas\nDigite un valor y presione enter, digite una operacion (+, -, *, /) y presione enter, digite un valor y presione enter para obtener el resultado.\n");
                    a = in.nextDouble();
                    operacion = in.next().charAt(0);
                    b = in.nextDouble();
                    switch (operacion) {
                        case '+':
                            resultado = Operaciones.sumar(a,b);
                            break;
                        case '-':
                            resultado = Operaciones.restar(a,b);
                            break;
                        case '*':
                            resultado = Operaciones.multiplicar(a,b);
                            break;
                        case '/':
                            if (b == 0) {
                                System.out.println("¡¡¡No es posible dividir por cero!!!");
                                resultado = 0;
                                break;
                            }
                            resultado = Operaciones.dividir(a,b);
                            break;
                        default:
                            System.out.println("El signo para la operacion no es valido.");
                            break;
                    }
                    resultado(resultado);
                    break;
                case 2: 
                    System.out.println("Binevenido a la calculadora Java para Potencia y Raiz\nDigite la base o el radicando y presione enter, digite una operacion, ^ para potencia y R para raiz y presione enter, digite el exponente o radical y presione enter para obtener el resultado.\n");
                    a = in.nextDouble();
                    operacion = in.next().charAt(0);
                    b = in.nextDouble();
                    switch (operacion) {
                        case '^':
                            resultado = Operaciones.potencia(a, b);
                            break;
                        case 'R':
                            if (a >= 0)
                                resultado = Operaciones.raiz(a,b);
                            else 
                                System.out.println("Raiz de un negativo");
                            break;
                        default:
                            System.out.println("El signo para la operacion no es valido.");
                            break;
                    }
                    resultado(resultado);
                    break;
                case 3: 
                    System.out.println("Binevenido a la calculadora Java para Funciones Trigonometricas\nDigite un angulo y presione enter, digite una opcion de las siguientes y presione enter para obtener el resultado en radianes.\n1.Seno.\n2.Coseno.\n3.Tangente.\n");
                    a = in.nextDouble();
                    funcion = in.nextInt();
                    switch (funcion) {
                        case 1:
                            resultado = Operaciones.sen(a);
                            break;
                        case 2:
                            resultado = Operaciones.cos(a);
                            break;
                        case 3:
                            if (Math.cos(a) == 0) {
                                System.out.println("¡¡¡Esta tangente esta indefinida!!!");
                            }
                            resultado = Operaciones.tan(a);
                            break;
                        default:
                            System.out.println("La opcion no es valida.");
                            break;
                    }
                    resultado(resultado);
                    break;
                case 4: System.out.println("Bienvenido a la calculadora para calcular el porcentaje del IVA\nPrimeramente digite la tasa actual del IVA y presione enter, y luego digite el valor del producto del cual desea conocer el porcentaje del IVA y presione enter.");
                        a = in.nextDouble()/100;
                        b = in.nextDouble();
                        System.out.println("El valor del producto con el IVA incluido es de: "+b*(1+a)+"$\nEl valor del IVA incluido es de: "+b*a+"$");
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
