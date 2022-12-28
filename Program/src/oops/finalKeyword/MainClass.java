package oops.finalKeyword;

public class MainClass extends Student{

  public void getDescription(){
      System.out.println("insdide main class" );
  }
    public static void main(String[] args ) {

    MainClass obj = new MainClass() ;
      obj.getDescription();


    }
}
