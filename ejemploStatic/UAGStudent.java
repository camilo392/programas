class UAGStudent {
  String name, studentID;
  int grade;
  
  //las variables y metodos static, pertenecen a la clase, lo que significa que cuando se inicialize una variable staric y se altere en el proceso, ese valor quedara guardao en la clase, y no en el objeto.
  static String principalName="Ms.McKoy";
  static int nextID=100;
  

  public UAGStudent(String name, int grade){
    String aux=nextID+"";
    studentID=name.charAt(0)+aux;
    studentID=studentID.toUpperCase();
    this.name=name;
    nextID+=1;
  }
  public static void newPrincipal(String newPrincipalName){
    principalName=newPrincipalName;
  }
  public static void resetID(){
    nextID=100;
  }
  public String toString(){
    return "name is "+name+", and the stundent's ID is "+studentID;
  }
}