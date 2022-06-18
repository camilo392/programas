public class Coche extends Vehiculo{

  private int numeroLlantas;

  public int getnumeroLlantas(){
    return numeroLlantas;
  }

  public void setnumeroLlantas(int llantas, boolean estado){
    this.numeroLlantas = llantas;
  } 
}