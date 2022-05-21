import java.util.Scanner;

class main{

  
  public static void main(String[]args){
    
  Scanner dato=new Scanner(System.in);
  int num1, num2;
  System.out.println("Ingrese los numeros que desea operar: ");
  num1=dato.nextInt();
  num2=dato.nextInt();

  operaciones operar=new operaciones();
    operar.suma(num1,num2);
    System.out.println("suma: "+operar.suma(num1,num2));
    operar.resta(num1,num2);
    System.out.println("resta: "+operar.resta(num1,num2));
    operar.multiplicacion(num1,num2);
    System.out.println("multiplicacion: "+operar.multiplicacion(num1,num2));
      
  }
}