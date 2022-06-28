import java.awt.Color;

public class Vehiculo{
  
  private Color color;
  private String placa;

  public Color getColor(){
    return color;
  }

  public String getPlaca(){
    return placa;
  }

  public void setColor(Color colorcito){
    this.color = colorcito;
  } 

  public void setPlaca(String placa){
    this.placa = placa;
  }
}
