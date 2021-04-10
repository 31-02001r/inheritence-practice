public class Student {
    private String Name; 
    private String Regno ; 
    int regFees = 10000; 
    int SemFees = 95000; 

    public Student()
    {
    }
    public Student (String Name , String Regno)
    {
        Setdetails(Name, Regno);
    }

    public void Setdetails(String Name , String Regno)
    {
        this.Name = Name ; 
        this.Regno= Regno ; 
    }
    public void getDetails()
    { 
        System.out.println("Name :"+Name);
        System.out.println("Regno  :"+Regno);
    }
    @Override
    public String toString()
    {
        return Name+ "\t"+Regno; 
    }
}
