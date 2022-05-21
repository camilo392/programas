import java.util.Scanner;

class main{

  
  public static void main(String[]args){
    
  Scanner dato=new Scanner(System.in);
  int num1, num2;
  System.out.println("Ingrese los numeros que desea operar: ");
  num1=dato.nextInt();
  num2=dato.nextInt();
    
  String oper=dato.nextLine();
  System.out.println("¿qué operación desea hacer?");
  oper=dato.nextLine();

  operaciones operar=new operaciones();
    if (oper.equals("suma")){
    operar.suma(num1,num2);
    System.out.println(operar.suma(num1,num2));
      }
    else if (oper.equals("resta")){
    operar.resta(num1,num2);
    System.out.println(+operar.resta(num1,num2));
      }
    else{
    operar.multiplicacion(num1,num2);
    System.out.println(+operar.multiplicacion(num1,num2));
      }
  }
}