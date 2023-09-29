class Dog{
    public Dog(int duckSize){
        size=duckSize;
        System.out.println("jounry kab aayegi  "+size);

 }
 public Dog(){
    size=20;
    System.out.println("why me only  "+size);
 }
    int size;
}
class test{
    public static void main(String[] args) {
        Dog d=new Dog(45);

    }
}
