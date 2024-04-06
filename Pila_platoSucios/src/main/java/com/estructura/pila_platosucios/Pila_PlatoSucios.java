/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.estructura.pila_platosucios;

/**
 *
 * @author JEZER ESTRADA
 */

import java.util.Scanner;
import java.util.Stack;

public class Pila_PlatoSucios {

    public static void main(String[] args) {
        
      //crear una pila nueva para poder almacenar los platos sucios
      Stack<String> pilaPlatos = new Stack<>();
      Scanner scanner = new Scanner(System.in);//crear un objeto para Scanner pueda leer la entrada de usuario
      //variable para controlar la salidad del bucle
      boolean salir = false;
      
      //iniciamos el bucle while, se ejecuta mientras salir sea falso
      
      while (!salir){
          System.out.println("1. Agregar un plato sucio a la pila");
          System.out.println("2. Lavar el plato superior de la pila");
          System.out.println("3. Ver el plato superior de la pila");
          System.out.println("4. Verificar si la pila esta vacia");
          System.out.println("5. Buscar plato en la pila");
          System.out.println("6. Salir");
          //solicita al usuario ingresar una opcion
          System.out.println("Ingrese una opcion: ");
          //Leer la opcion ingresada por el usuario
          int opcion = scanner.nextInt();
          //consumir el salto de linea despues de leer la opcion
          scanner.nextLine();
          
          //Inicio del bloque Switch
          switch(opcion){
              case 1:
                  //solicitar al usuario que ingrese el plato
                  System.out.print("Ingrese el plato a la pila: ");
                  //Leer el plato ingresado
                  String plato = scanner.nextLine();
                  //Agregar el plato a la pila utilizando push ()
                  pilaPlatos.push(plato);
                  //Mostrar el mensaje indicando que fue ingresado
                  System.out.println("Plato agregado a la pila");      
                  break;
                  
              case 2:
                  //verificamos si la pila esta vacia
                  if(!pilaPlatos.isEmpty()){
                  //Limpiar el plato superior = eliminarlo con pop()
                  String platoLimpio = pilaPlatos.pop();
                  System.out.println("Se lavo el plato superior: " + platoLimpio);
                  }else{
                      //indicar que la pila esta vacia
                      System.out.println("La pila esta vacia. No se puede lavar ningun plato");
                  }
                  break;
                  
              case 3:
                  //verificar si la pila no esta vacia
                   if(!pilaPlatos.isEmpty()){
                  //Limpiar el plato superior = eliminarlo con pop()
                  String platoSuperior = pilaPlatos.peek();
                  System.out.println("Plato superior de la pila es: " + platoSuperior);
                  }else{
                      //indicar que la pila esta vacia
                      System.out.println("Lapila esta vacia. No se puede mostrar ningun plato");
                  }
                  break;
                  
              case 4:
                  //verificar si la pila esta vacia
                  boolean estaVacia = pilaPlatos.isEmpty();
                  System.out.println("La pila de platos esta vacia; " + estaVacia);
                  break;
                  
              case 5:
                  //solicitar al usuario que ingrese el plato a buscar en la pila
                  System.out.println("ingrese el palto que desea buscar: ");
                  //leer el plato a buscar por el usuario
                  String platoBuscar = scanner.nextLine();
                  //Buscar el plato en la pila utilizando search()
                  int distanciaDesdeSuperior = pilaPlatos.search(platoBuscar);
                  //verifica si el plato se encuentra en la pila
                  if(distanciaDesdeSuperior != -1){
                      //Mostrar mensaje
                      System.out.println("El plato '" + platoBuscar + "'se encuentra a una distancia" + distanciaDesdeSuperior + "desde la parte superior de la pila." );
                  }else{
                      System.out.println("El plato'" + platoBuscar + "'no se encuentra en la pila");
                  }
                  break;
              case 6:
                  salir = true;
                  break;
              default:
                  //mostrar un mensaje indicando que la opcion ingresada es invalida
                  System.out.println("Opcion invalida, intente nuevamente");
                  //salir del bloque switch
                  break;
          }
          System.out.println();//imprimir una linea en blanco para separar las interacciones del bucle while
          }
          System.out.println("Hasta luego");//mostrar mensaje de despedida al salir del programa
    
    }
}
