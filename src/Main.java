import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Im in a loop");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
            }


        }
    }
}