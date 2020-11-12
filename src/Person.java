public class Person
{
    private char Gender;
    private int PhoneNumber;
    private String FirstName, LastName, Address, DOB;

    public Person(String FirstName, String LastName, String Address, String DOB, int PhoneNumber, char Gender)
    {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Address = Address;
        this.DOB = DOB;
        this.PhoneNumber = PhoneNumber;
        this.Gender = Gender;
    }

    public String toString()
    {
        return "First name: " + FirstName +"\nLast name: " + LastName + "\nAddress: " + Address
                + "\nDOB: " + DOB + "\nPhone number: " + PhoneNumber + "\nGender: " + Gender;
    }
}
