class Main
{
	public static void main(String[] args)
	{
		UAGStudent s1 = new UAGStudent("Muhammed",11);
    UAGStudent s2 = new UAGStudent("Alan",11);
    UAGStudent s3 = new UAGStudent("Sophie",11);

    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3+"\n");

    UAGStudent.newPrincipal("Mr. McKoy");
    
    UAGStudent.resetID();
    UAGStudent s4 = new UAGStudent("kevin",11);
    System.out.println(s4);

	}
}