import java.util.Scanner;

class main{
  public static void main(String[]args){
    Scanner num = new Scanner (System.in);
    int num1, num2;
    System.out.print("Ingrese el numero desde que quiere saber los pares e impares: ");
    num1=num.nextInt();
    System.out.print("Ingrese el numero hasta el que quiere saber los pares e impares: ");
    num2=num.nextInt();

    double aux=num1%2;
      
    paresImpares secuencia =new paresImpares();
    if (aux==0){
    for (num1;num1<num2;num1++){
      secuencia.pares(num1,num2);
      System.out.print(secuencia.pares(num1,num2));}
      }
    else{
      int i=1;
      num1+=i;
       while (i<num2){
      secuencia.impares(num1,num2);
      System.out.print(secuencia.impares(num1,num2));}
    }
  }
}