/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.estructura.universidad.colabanco;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class UniversidadColabanco {

    public static void main(String[] args) {
    //crear una nueva cola utilizando la clase LikedList de Java
     Queue<String> colaAtencion = new LinkedList<>();
     //crear un objeto scanner para leer la entrada del usuario
     Scanner scanner = new Scanner(System.in);
     //variable para controlar la salida del bucle while
     boolean salir = false;
     //Inicio del bucle while, se ejeecuta mientras salir sea falso
     while (!salir){
      System.out.println("1. Agregar cliente a la cola de atencion");
      System.out.println("2. Atender al proximo cliente de la cola"); 
      System.out.println("3. Ver el proximo cliente de la cola"); 
      System.out.println("4. Verificar si la cola de atencion esta vacia"); 
      System.out.println("5. Salir"); 
      //Solicitar al usuario que ingrese una opcion
      System.out.println("Ingrese una opcion"); 
      //Leer la opcion ingresada por el usuario
      int opcion = scanner.nextInt();
      //consumir el salto de linea despues de leer la opcion
      scanner.nextLine();
      
      //Inicio del bloque switch, se evalua el valor de la variable opcion
      switch (opcion){
          case 1:
              //Solicitar al usuario que ingrese el nombre del cliente a agregar a la cola
              System.out.print("Ingrese el nombre del cliente a agregar a la cola: ");
              //Leer el nombre del cliente ingresado por el usuario
              String cliente = scanner.nextLine();
              //agregar al cliente a la cola utlizando el metodo add()
              colaAtencion.add(cliente);
              //Mostrar un mensaje indicando que el cliente ha sido agregado a la cola
              System.out.println("Cliente agregado a la cola de atencion.");
              break;
              
          case 2:
              //verificar si la cola de atencion no esta vacia
              if(!colaAtencion.isEmpty()){
                  //Atender al proximo cliente de la cola utilizando el metodo poll()
                  String clienteAtendido = colaAtencion.poll();
                  //Mostrar el nombre del cliente que se ha atendido
                  System.out.println("Cliente atendido:  " + clienteAtendido);
                  }else{
                    System.out.println("La cola de atencion esta vacia. No hay clientes para atender.");
              }
              break;
              
          case 3:
              //verificar si la cola no esta vacia
              if(!colaAtencion.isEmpty()){
                  //Obtener el proximo cliente de la cola sin atenderlo utlizando el metodo peek()
                  String proximoCliente = colaAtencion.peek();
                  //Mostrar el nombre del proximo cliente en la cola
                  System.out.println("Proximo cliente en la cola:  " + proximoCliente);
                  }else{
                  System.out.println("La cola de atencion esta vacia.");
              }
              break;
              
          case 4:
              //verificar si la cola de atencion esta vacia utilizando el metodo isEmpty()
              boolean estaVacia = colaAtencion.isEmpty();
              //Mostrar si la cola esta vacia o no
              System.out.println("La cola de atencion esta vacia:  " + estaVacia);
              break;
              
          case 5:
              //establecer la variable salir a true para salir del bucle while
              salir = true;
              break;
          
          default:
              //Mostrar mensaje indicando que la opcion ingresada no es valida
              System.out.println("Opcion invalida. Intente nuevamente.");
      }
       System.out.println(); //Imprimir una linea en blanco para separar las interacciones del bucle while       
     }
     System.out.println("Hasta luego");
    }
}
