public class Main
{
	public static void main(String[] args)
	{
    
		peopleOfBand person=new peopleOfBand("Juan","arpa",5,"musician");
    System.out.println(person+"\n");
    
    peopleOfBand person1=new peopleOfBand("Paco","piano",5,"musician");
    peopleOfBand person2=new peopleOfBand("Jhon","guitar",2,"musician");

    peopleOfBand person3=new peopleOfBand("David",1,"fanatic");
    peopleOfBand person4=new peopleOfBand("Javier",2,"fanatic");
    peopleOfBand person5=new peopleOfBand("Fernando",5,"fanatic");

   
    System.out.println(person.show());
    System.out.println(person1.show());
    System.out.println(person2.show()+"\n");
    
    System.out.println(person3.show());
    System.out.println(person4.show());
    System.out.println(person5.show());

    peopleOfBand.newNameOfBand("LOS ESCARABAJOS");
    System.out.println(person5);

	}
}