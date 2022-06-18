import java.awt.Color;
import java.util.*;

class Main {
  
  public static void main(String[] args) { 

    Color blanco = new Color(255,255,255);
    
    Coche renault = new Coche();
    renault.setPlaca ("AAA555");
    System.out.println(renault.getPlaca());
    renault.setColor(blanco);
    System.out.println(renault.getColor());
    renault.setnumeroLlantas(4, true);
    System.out.println(renault.getnumeroLlantas());
    System.out.println(renault.placa);

    Coche mercedes = new Coche();
    mercedes.setPlaca ("BBB555");
    System.out.println(mercedes.getPlaca());
    mercedes.setColor(blanco);
    System.out.println(mercedes.getColor());
    mercedes.setnumeroLlantas(5, false);
    System.out.println(mercedes.getnumeroLlantas());

    Barco usnavy = new Barco();
    usnavy.setPlaca ("ERTYUI");
    System.out.println(usnavy.getPlaca());
    usnavy.setColor(blanco);
    System.out.println(usnavy.getColor());
    usnavy.setnumeroElices(1);
    System.out.println(usnavy.getnumeroElices());

    MiniBarco usnavyMini = new MiniBarco();
    usnavyMini.setPlaca ("MiniERTYUI");
    System.out.println(usnavyMini.getPlaca());
    usnavyMini.setColor(blanco);
    System.out.println(usnavyMini.getColor());
    usnavyMini.setnumeroElices(1);
    System.out.println(usnavyMini.getnumeroElices());
    usnavyMini.setNumeroRemos(2);
    System.out.println(usnavyMini.getnumeroRemos());
    
  }
}