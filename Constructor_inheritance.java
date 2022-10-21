class Constructor{
    public Constructor(){
       
        System.out.println("Constructor created");
        

    }}
class Newconstr extends Constructor{
    public Newconstr(){
        super();
        System.out.println("New constructor created");
        

    }
}

    

public class Constructor_inheritance{

    public static void main(String[] args) {
        Newconstr con=new Newconstr();
        System.out.println(con.getClass());
        
    }


}
