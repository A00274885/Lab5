public class Student extends Person
{
    private String Course;
    private char Grades;

    public Student(String FirstName, String LastName, String Address, String DOB, int PhoneNumber, char Gender, String Course)
    {
        super(FirstName, LastName, Address, DOB, PhoneNumber, Gender);
        this.Course = Course;
        Grades = 'F';
    }

    public Student(String FirstName, String LastName, String Address, String DOB, int PhoneNumber, char Gender, String Course,char Grades)
    {
        super(FirstName, LastName, Address, DOB, PhoneNumber, Gender);
        this.Course = Course;
        this.Grades = Grades;
    }

    public char getGrades() {return Grades;}

    @Override
    public String toString()
    {
        return super.toString() + "\nCourse: " +Course + "\nGrades: " + Grades;
    }
}
