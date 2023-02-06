import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random los = new Random();

        int licz=0;
        for(int i = 0; i < 100; i++){
            double x = los.nextInt(101)/100.0;
            double y = los.nextInt(101)/100.0;
            if(y <= Math.sin(x))
                licz++;
        }
        System.out.println("Pole = " + (licz/100.0));
    }
}
