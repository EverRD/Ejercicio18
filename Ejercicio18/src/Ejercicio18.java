mport java.util.Scanner;

import jdk.nashorn.internal.parser.Scanner;

public class Ejercicio18{
  public static void main(String[]args){
    Scanner ingreso = new Scanner(System.in);
    int numero, i, divi = 0, iterar = 0, x = 0;
   
    System.out.println("divisor");
    System.out.print("coloque un numero: ");
    numero = ingreso.nextInt();
   
    if(numero % 2 == 0){
      iterar = numero / 2;
    }
    else{
      iterar = (numero - 1) / 2;
    }
    for(i = 1; i <= iterar; i++){
      if(numero % i == 0){
        x = numero / i;
        if(x != divi){
          divi= x;
        }
        if(i == iterar){
          System.out.println(divi);
        }
        else{
          System.out.print(divi + ",");
        }
      }
    }
  }

}
