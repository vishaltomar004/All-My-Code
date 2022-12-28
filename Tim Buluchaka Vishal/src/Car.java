import java.util.Locale;

public class Car {
    private int wheels;
    private int doors;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model){

        String validmodel=model.toLowerCase();
        if(validmodel.equals("carrera") || validmodel.equals("comodor")){
            this.model=model;
        }
        else this.model="unknown";
    }
    public String getModel(){
        return this.model;
    }

}
