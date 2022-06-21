class peopleOfBand{
  
  static int members=1, fanatics=0;
  static String nameBand="the other beatles";
  String namePerson,instrument,answerMusician,answerFanatinc,fanaticOrMember;
  int yearsExpirencePlaying, albumsListened;


  public peopleOfBand( String namePerson, String instrument, int yearExpirencePlaying, String fanaticOrMember){
    this.namePerson=namePerson;
    this.instrument=instrument;
    this.fanaticOrMember=fanaticOrMember;
    this.yearsExpirencePlaying=yearExpirencePlaying;
    accepteOrNot(instrument, yearExpirencePlaying);
  }
  
  public peopleOfBand(String namePerson,int albumsListened, String fanaticOrMember){
    this.namePerson=namePerson;
    this.fanaticOrMember=fanaticOrMember;
    this.albumsListened=albumsListened;
    fanOrNot( albumsListened);
  }
  
  public void accepteOrNot(String instrument,int yearsExpirencePlaying){
    if (yearsExpirencePlaying>=4&(instrument.equals("guitar")||instrument.equals("bass")||instrument.equals("piano"))){
      answerMusician="congratulations you belong to the band";
      members+=1;
    }
    else
      answerMusician="we sorry, you can't belong to the band";
  }

  public void fanOrNot(int albumsListened){
    if (albumsListened==2){
      answerFanatinc="you'r fanatic";
      fanatics+=1;
    }
    else if (albumsListened>2){
      answerFanatinc="you'r a huge fanatic";
      fanatics+=1;
    }
    else
      answerFanatinc="you'r not a fancatic";
  }

  public static void newNameOfBand(String newName){
    nameBand=newName;
  }

  public String show(){
    if (fanaticOrMember.equals("musician")){
      return "Name person: "+namePerson+"\n"+"You wanted to be: a "+fanaticOrMember+"\n"+"Instrument: "+instrument+"\n"+"Experience: "+yearsExpirencePlaying+" years\n"+"Answer: "+answerMusician+"\n";}
    else
      return "Name person: "+namePerson+"\n"+"You wanted to be: a "+fanaticOrMember+"\n"+"Albums listened: "+albumsListened+"\n"+"Answer: "+answerFanatinc+"\n";
  
  }

  public String toString(){
    return "BAND NAME: "+nameBand+"\n"+"TOTAL MEMBERS OF BAND: "+members+"\n"+"TOTAL FANATICS: "+fanatics;
  }
}