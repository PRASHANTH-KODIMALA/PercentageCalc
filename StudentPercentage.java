// abstract class with abstract method
abstract class Marks{
    abstract double getPercentage();
}

//class Student
class Student1 extends Marks{
    private float sub1, sub2, sub3;
  
    public Student1(float s1, float s2, float s3) {
        sub1 = s1;
    	sub2 = s2;
    	sub3 = s3;
    }
    double getPercentage() {
    	return (sub1 + sub2 + sub3)/300.0 * 100;
    }
}

//class B
class Student2 extends Marks{
    private float sub1, sub2, sub3, sub4;
  
    public Student2(float s1, float s2, float s3, float s4) {
        sub1 = s1;
    	sub2 = s2;
    	sub3 = s3;
    	sub4 = s4;
    }
    double getPercentage() {
    	return (sub1 + sub2 + sub3 +sub4)/400.0 * 100;
    }
}

//class with main method
class StudentPercentage{
	public static void main(String[] args){
		
	    Student1 a = new Student1(47, 74, 22);      
	    Student2 b = new Student2(74, 47, 56, 22); 
	  
	    double p1 = a.getPercentage();  
	    double p2 = b.getPercentage();  
	    System.out.println("Percentage of student A : " + p1);
	    System.out.println("Percentage of student B : " + p2);
	}
}

