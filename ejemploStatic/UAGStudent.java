class UAGStudent {
  String name, studentID;
  int grade;

  //IMPORTENTE!!
  //las variables y metodos static, pertenecen a la clase, lo que significa que cuando se inicialize una variable staric y se altere en el proceso, ese valor quedara guardao en la clase, y no en el objeto
  //Por tanto tambien, una funcion static se puede llamar desde el main con el nombre de la clase, no con el del objeto, pues como el metodo pertenece a la clase, el resultado del proceso que se haga en dicho metodo se guardara en la clase, por tanto es irrelenvante hacerlo con el objeto o no, ya que en ambos casos se guardara en el objeto. 
  //es por esto que es importante saber que cuando la funcion no es static, se debe crear un objeto obligatoriamente, pues la informacion resultande del proceso hecho en dicha funcion, debera quedar guardada en el objeto creado y que apunta a la funcion, de lo contrario no se podra hacer, pues no estara guarda en ningun lugar.
  //tambien es importante saber que las variables static solo se pueden trabajar con metodos static
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