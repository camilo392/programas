public class Card
{
  private String name,suit;
  int value;
  
  public Card(String name, int value,String suit){
    this.name=name;
    this.value=value;
    this.suit=suit;
  }
  public String getName(){
    return name;
  }
  public int getValue(){
    return value;
  }
  public String getSuit(){
    return suit;
  }
  public String toString(){
    
    return name+" of "+suit.substring(0,1).toUpperCase()+suit.substring(1,suit.length())+"s";
  }
}