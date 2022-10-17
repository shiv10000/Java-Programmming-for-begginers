import java.util.Scanner;
// Program to check the entered number found in the array
public class array {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] Numlist={4,8,5,91,58,67};
        System.out.println("Enter the number please");
        int Num=scan.nextInt();
        scan.close();
        String status="Notfound";
        for(int number:Numlist){
            if(number==Num){
                System.out.println("Number is found in list ");
                status="found";
            }


            }
        if(status=="Notfound"){
            System.out.println("Number is not found in list ");

        }
         
        }
    
    
    }

    

