public class Student
{
	//class variables/states
	public String name;
	public int grade;
	public double gpa;
	public int daysWithoutUniform;
  
	private int failedSub;
  private String gender;
  private String levelCourse;
	
  //constructor
	public Student(String name, int grade, double agpa, int failedSub, String gender, String levelCourse)
	{
		this.name = name;
		this.grade = grade;
		gpa = agpa;
		daysWithoutUniform = 0;
    this.failedSub=failedSub;
    this.gender=gender;
    this.levelCourse=levelCourse;
  
	}
	
	//methods/behaviors
	public void changeGPA(double new_gpa)
	{
		gpa = new_gpa;
	}

  public void changeName(String new_name){
    name=new_name;
  }
  public void graduate(){
    grade+=1;
  }
  public void checkUniform(boolean isWearingUniform){
    if (isWearingUniform == false)
      daysWithoutUniform+=1;
  }
  
  @Override
  public String toString(){
    return "name is "+name+", grade is "+grade+", GPA is "+gpa+", failed subjects is "+ failedSub+", level completed "+gender+", student's gender "+gender;
  }
}