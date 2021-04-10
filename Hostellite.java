public class Hostellite extends Student{

   int roomNo ; 
   public Hostellite(String Name ,String Regno , int roomNo) 
    {
        super(Name, Regno); 
        this.roomNo = roomNo; 
    }
    public void getDetails()
    { 
        super.getDetails();
        System.out.println("room no :"+roomNo);
    }
}
