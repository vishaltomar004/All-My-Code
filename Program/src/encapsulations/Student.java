package encapsulations;

public class Student {

   private int age;
   private String name;

   public int getAge() {
       return age;
   }
   public void  setAge(int age) {

       if(age>20) {
           System.out.println("Bahut bada hai tu");
       } else {
         this.age= age;
   }

   }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name= name;
    }


}
