/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.encapsulamiento.visto;

import java.util.Scanner;
import edu.unal.poo.encapsulamiento.modelo.Cuenta;
/**
 *
 * @author Estudiante
 */
public class Principal {
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner (System.in);
        
        System.out.println("Creacion de Cuentas");
        
        System.out.println("Ingrese numero");
        int numero=lectura.nextInt();
        
        System.out.println("Ingrese clave");
        int clave = lectura.nextInt();
        
        System.out.println("Ingrese el nombre del duennio");
        String duennio = lectura.next();
        
        System.out.println("Ingrese saldo");
        double saldo = lectura.nextDouble();
        
        Cuenta cuenta = new Cuenta (numero,clave,duennio,saldo);
        System.out.println("Valor a consignar");
        double valor = lectura.nextDouble();
        boolean resultado = cuenta.consignar(valor);
        if(resultado==true){
            System.out.println("Consignacion exitosa");
            System.out.println("Nuevo saldo" + cuenta.getSaldo());
        }else
            System.out.println("Consignacion fallida");
    }
    
}
