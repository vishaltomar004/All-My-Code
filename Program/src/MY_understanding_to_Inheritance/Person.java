package MY_understanding_to_Inheritance;

public class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;



    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;

}

    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }
}
