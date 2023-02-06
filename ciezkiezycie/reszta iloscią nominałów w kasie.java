import java.io.*;
import java.io.InputStreamReader;


public class reszta {

    public static void main(String[] args) throws IOException {
        
        InputStreamReader str = new InputStreamReader(System.in);
        BufferedReader wejscie = new BufferedReader(str);
        String tekst;
        final int[] M = {500,200,100,50,20,10,5,2,1};   //nominaly  
        int[] N = {2,0,3,1,3,3,1,7,1000};  //ilosc dostepnych monet danego nominalu
        int[] ile= new int[M.length];
        
        int zl,gr,r,i=1;
        System.out.println("Podaj reszte..");
        System.out.print("zlotych: ");
        tekst = wejscie.readLine();
        zl = Integer.parseInt(tekst);
        System.out.print("groszy: ");
        tekst = wejscie.readLine();
        gr = Integer.parseInt(tekst);
        System.out.print("Reszta: ");
        r = zl * 100 + gr;
        int l=0;
        while (r > 0){
            if (r >= M[i] && N[i] > 0){ 
                ile[i]++;  
                System.out.println(M[i] / 100.0 + "zl" + "  -" + ile[i] + "x");
                r = r - M[i];
                N[i]--;
                 
            }
            else{
                i++;
                l=1;
            }
        }    
    }
}

