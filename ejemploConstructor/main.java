class Main
{
  	public static void main(String[] args)
  	{
    	Student hector = new Student("Hector",11,3.0,3,"male","sixth");
    	System.out.println("Student Name: " + hector.name);
    	System.out.println("Student Grade: " + hector.grade);
    	System.out.println("Student GPA: " + hector.gpa);
    	
    	System.out.println("Changing GPA...");
    	hector.changeGPA(3.5);
      
    	
    	System.out.println("Student's New GPA: " + hector.gpa);
    	System.out.println(hector);
    	//uncomment the following when you've written the other tests
    	//you can uncomment by highlighting text and hitting CMD+/
    	
    	 System.out.println("Student graduated!");
    	 hector.graduate();
    	 System.out.println("Currently in grade: " + hector.grade);
    	
    	hector.checkUniform(false);
    	hector.checkUniform(false);
    	hector.checkUniform(false);
      hector.checkUniform(false);
    	System.out.println(hector.name + " went a few days without uniform..");
    	System.out.println(hector.daysWithoutUniform + " days, to be exact.");
    	
    	System.out.println("He/she is wearing his/her uniform today!");
    	hector.checkUniform(true);
    	 System.out.println("Current days without uniform for " + hector.name + ": " + hector.daysWithoutUniform);
  	}
}