class doctor {
  Boolean worksAtHospital;
  void treatPatient(){
    System.out.println(" Yes i trate all");
  }  
}
class FamilyDoctor extends doctor{
    boolean makeHousecalls;
    void treatPaatients(){
        }}
class Surgeon extends doctor{
  void doSurgicalOperation(){
    //he do some of the surgical operations 

  }
  void treatPatient(){
    super.treatPatient();
    System.out.println("Surgeon  treats well my friend");

  }
  public static void main(String[] args) {
 
    Surgeon surg=new Surgeon();
    surg.treatPatient();

  }

}
       