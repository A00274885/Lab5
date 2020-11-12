public class Lecturer extends Person
{
    private String assignedOffice,Department;

    public Lecturer(String FirstName, String LastName, String Address, String DOB, int PhoneNumber, char Gender, String assignedOffice) {
        super(FirstName, LastName, Address, DOB, PhoneNumber, Gender);
        this.assignedOffice = assignedOffice;
    }

    public Lecturer(String FirstName, String LastName, String Address, String DOB, int PhoneNumber, char Gender, String assignedOffice,String Department) {
        super(FirstName, LastName, Address, DOB, PhoneNumber, Gender);
        this.assignedOffice = assignedOffice;
        this.Department = Department;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nOffice: " + assignedOffice + "\nDepartment: " + Department;
    }
}
