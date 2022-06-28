import java.util.Random;

public class Deck
{
  private Card cards []= new Card[52];
  private String suit[]={"club","Diamonds","heart","spade"};
  private String name[]={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};

  public Deck(){
    int c=0;
    for (int i=0;i<suit.length;i++){
      for (int j=0;j<name.length;j++){
        cards[c]= new Card(name[j],j+1,suit[i]);
        c++;
      }
    }
  }
  public Card draw(){
    return cards [0];
  }
  public void shuffle() {
    for (int i=0;i<cards.length;i++){
      Random random=new Random();
      int n=random.nextInt(52);
      cards [n]=cards[i];
    }
  }
}