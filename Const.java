//In this program we will see how constructors work
 class Constructors {
    int size;
    public Constructors(int set){                //Constructor overloading
        size=set;

    }
    public Constructors(){                      // For constructor overloading arguments should be different
        size=51;
    }
    
    
}
public class Const{
    public static void main(String[] args) {
        Constructors cons=new Constructors();
        System.out.println(cons.size);

        
    }
}
