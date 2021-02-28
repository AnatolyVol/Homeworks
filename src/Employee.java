public class Employee
{
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int solary;
    private int age;

    public Employee(String fullName, String position, String email, String phoneNumber, int solary, int age)
    {
       this.fullName = fullName;
       this.position = position;
       this.email = email;
       this.phoneNumber = phoneNumber;
       this.solary = solary;
       this.age = age;
    }
    public int IntAge()
    {
        return age;
    }

    public void PersonInfo()
    {
        System.out.println(fullName + " " + position + " " + email + " " + phoneNumber + " " + solary + " " + age);
    }
}
