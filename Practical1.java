public class Practical1 { 
    public static void main(String[] args) { 
        System.out.println("Hello world"); 
    
    //variables and data types
    int age=20;
    double salary=35000.752;
    char grade='A';
    boolean isStudent=true;
    String name="Rahul";

    System.out.println("Name"+name);
    System.out.println("Age"+age);
    System.out.println("Student"+isStudent);
    System.out.println("Grade"+grade);
    System.out.println("Salary"+salary);
    System.out.println("");
     //implicit
     int number=50;
     double result=number;
     System.out.println("implicit type casting");
     System.out.println("marks:"+ number);
     System.out.println("result:"+result);
     System.out.println("");

     //explicit
     double marks=89.5;
     int TotalMarks=(int) marks;
     System.out.println("Explicit type casting");
     System.out.println("double value:"+marks);
     System.out.println("Convereted to integer:"+TotalMarks);
     System.out.println("");

}
}

