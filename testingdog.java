class dog {
    private int size;
    void setSize(int s){
        size=s;
    }
    int getSize(){
        return size;
    }


    void bark() {
        if (size > 50) {
            System.out.println("Yufff Yuff");

        } else if (size > 60) {
            System.out.println("Ruff Ruff");
        }
    }
}
public class testdog{
    public static void main(String[] args){
        dog pets=new dog();
        pets.setSize(55);
        pets.bark();
        System.out.println("The current size is "+pets.getSize());


    }


}
