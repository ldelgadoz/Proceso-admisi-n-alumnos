/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operadorelogicos3;

import java.util.Scanner;

/**
 *
 * @author DIT-MAÑANA
 */
public class Operadorelogicos3 {

    public static void main(String[] args) {
      int edad;
      float notamedia;
      float rentaanual;
      int nhf;
      boolean disponetitulo;
      boolean superaprueba;
      boolean trabaja;
      boolean perfilavanzado;
      boolean admitido;
      perfilavanzado = false;
      admitido = false;
      //Damos valor a variables
      Scanner datos=new Scanner(System.in);
      
      System.out.println("Introduzca la edad: ");
      edad = datos.nextInt();
      System.out.println("Introduzca la nota media: ");
      notamedia = datos.nextFloat();      
      System.out.println("Introduzca la renta anual: ");
      rentaanual = datos.nextFloat();
      System.out.println("Introduzca el numero de horas de formación previa: ");
      nhf = datos.nextInt();
      System.out.println("Dispone de un titulo relacionado con la informatica? (true o false): ");
      disponetitulo = datos.nextBoolean();    
      System.out.println("Usted supero la prueba? (true o false)");
      superaprueba = datos.nextBoolean();    
      System.out.println("Usted trabaja? (true o false)");
      trabaja = datos.nextBoolean();
      
      
      //Filtro para entrar, aplicamos reglas
      
      if (edad >= 16 && notamedia >=0 && notamedia <=10 && rentaanual >=0 && nhf >=0)
      {
          System.out.println("Tiene acceso");
          System.out.println("INICIANDO PROCESO DE ADMISION");  
          if (edad >= 18)
          {
             if (notamedia >= 6)
             {
                if(disponetitulo == true || (superaprueba== true && nhf >= 40))
                {
                    System.out.println("Usted fue admitido");
                    admitido = true;
                    System.out.println("Ahora comprobaremos su tipo de perfil");
                    if (notamedia >=8 && disponetitulo == true && nhf >=100)
                    {
                        System.out.println("Usted tiene un perfil avanzado");
                        perfilavanzado = true;
                        
                    }
                    else if(notamedia >=7 && superaprueba == true)
                    {
                        System.out.println("Usted tiene un perfil medio");
                    }
                    else
                    {
                        System.out.println("Usted tiene un perfil inicial");
                    }
                    //Resto del programa aqui para simular que si no se cumple algo que se "cierre" el programa
                    System.out.println("Ahora comprobaremos la beca a la que tiene acceso");
                    if (rentaanual < 20000 && (notamedia >= 9 || (perfilavanzado && nhf >= 120)))
                    {                       
                        System.out.println("Usted tiene la beca completa"); 
                    }
                    else if(rentaanual<35000 && (notamedia >= 7.5 || (superaprueba && nhf >= 80)))
                    {
                        System.out.println("Usted tiene la beca parcial");                      
                    }
                    else
                    {
                        System.out.println("No cumple ninguna de las condiciones, no tiene beca");
                    }
                    //Parte para ver si trabaja o no
                    System.out.println("Por ultimo se vera si tiene compatibilidad con el empleo");
                    if (trabaja) {
                        if (notamedia >= 8) {
                            System.out.println("Puede acceder al horario flexible");
                        } else {
                            System.out.println("Debera asistir al horario ordinario");
                        }
                    } else {
                        System.out.println("Se le asigna horario ordinario");
                    }
                }
                else
                {
                    System.out.println("La admision no fue posible ya que no tiene ningun requisito (minimo uno de estos dos)");
                    
                }
             }
             else
             {
                 System.out.println("La admision no fue posible ya que la nota media es menor que 6");
             }
          }
          else{
              System.out.println("La admision no fue posible ya que la edad no es la permitida");
          }
      } 
      else
      {
        System.out.println("Usted no tiene acceso");
      }
     datos.close();
      
      
      
      
      
    }
}
