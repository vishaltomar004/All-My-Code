package oops;

 class Cat{
    boolean hasFur;
    String color,breed;
    int legs, eyes;
public void walk() {
    System.out.println("Cat is walking");
}
public void eat() {
    System.out.println(" Eating");
}
}
class Dog{

}
public class MainClass {
    public static void main(String[] args) {

        Cat cat1= new Cat();
        cat1.walk();
        cat1.breed="ghjjhjhj";

        System.out.println(cat1.breed);


    }
}
