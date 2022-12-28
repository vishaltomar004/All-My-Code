package AltuFaltu;

public class Day_before {

    public static void main(String [] args){


        utility(2,19);
    }


    public static void utility(int d, int n){

        int x = n%7;
        int y =7-x;
        int ans=0;
        if(d+y<=6){
            ans=d+y;
        }
        else if(d+y>6){
            ans=(d+y)%7;
        }
        System.out.println(ans);
    }
}
