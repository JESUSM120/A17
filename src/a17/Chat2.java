package a17;

import ChatBueno.Lenta;
import java.util.Scanner;
/**
 *
 * @author Jesus Maldonado Cruz
 */
public class Chat2 implements Runnable{
    @Override
    public void run(){
        String r1, r2, r3, r4, r5, r6;
        Scanner entrada = new Scanner(System.in);
        String inst = ("Who is doing these things? Complete the sentences.");
        String q1 = ("___" + " is writing an essay.");
        String q2 = ("___" + " is having coffee.");
        String q3 = ("___" + " is talking on the phone.");
        String q4 = ("___" + " is watching a baseball game.");
        String q5 = ("___" + " is shopping.");
        String q6 = ("___" + " is playing soccer.");

        Lenta.escribir("INSTRUCTIONS." + "\n" + inst, 50);
        Lenta.escribir("\n1. " + q1 + "\n", 50);
        r1 = entrada.nextLine();
        Lenta.escribir("\n2. " + q2 + "\n", 50);
        r2 = entrada.nextLine();
        Lenta.escribir("\n3. " + q3 + "\n", 50);
        r3 = entrada.nextLine();
        Lenta.escribir("\n4. " + q4 + "\n", 50);
        r4 = entrada.nextLine();
        Lenta.escribir("\n5. " + q5 + "\n", 50);
        r5 = entrada.nextLine();
        Lenta.escribir("\n6. " + q6 + "\n", 50);
        r6 = entrada.nextLine();
    }
    
    public static void main(String[] args) {
        Thread chThread = new Thread(new Chat2());
        chThread.start();
    }
}
