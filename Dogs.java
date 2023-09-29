class Dog{
    public Dog(int duckSize){
        size=duckSize;
        System.out.println("the size is "+size);

 }
 public Dog(){
    size=20;
    System.out.println("the size is "+size);
 }
    int size;
}
class test{
    public static void main(String[] args) {
        Dog d=new Dog(45);

    }
}