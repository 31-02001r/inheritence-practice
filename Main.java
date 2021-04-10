public class Main{
    public static void main (String[] args)
    { 
        System.out.println("Hello world!...");
        Student std1 = new Student("Ali pasha", "FA20-BSE-032");
        System.out.println(std1);
        Hostellite std2 = new Hostellite("Muhammad Rohan", "Fa20-bse-032", 24);
       std2.getDetails();
    }
}