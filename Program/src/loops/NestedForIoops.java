package loops;

public class NestedForIoops {
    public static void main(String[] args) {

        for (int n = 1; n <= 100; n++) {

            for(int i = 1; i <= 10; i++) {
                System.out.print(i +"        "   );
            }
            System.out.println();
        }
    }
}
