//In this program we will see 
//How you can convert gallons to liter
import java.util.Scanner;
class galtolit{
    public static void main(String[] args){
        double gallons;
        double liter;
        Scanner scan=new Scanner(System.in);
        int counter=0;
        for(gallons=1;gallons<=100;gallons++){
            liter=gallons*7854;
            System.out.println(gallons+" in liter is "+liter);
            counter++;
            if(counter==10){
                counter=0;
                System.out.println(" ");
            }

        }


        
  

    }

}