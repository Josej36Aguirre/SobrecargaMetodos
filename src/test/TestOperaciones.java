
package test;

import operaciones.Operaciones;


public class TestOperaciones {
    public static void main(String[] args) {
        int resultado = Operaciones.sumar(2, 3);
        System.out.println("resultado = " + resultado);
        
        double resultado2 =Operaciones.sumar(3.5, 2.5);
        System.out.println("Resultado double = "+resultado2);
        
        double resultado3 = Operaciones.sumar(3, 5L);
        System.out.println("resultado3 = " + resultado3);
        
       
    }
}
