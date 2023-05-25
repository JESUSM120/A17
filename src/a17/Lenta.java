package a17;


public class Lenta {
    public static void escribir (String palabra, int velocidad){
        char [] caracteres = palabra.toCharArray();
        for (int i = 0; i < 10; i++) {
            System.out.print(caracteres);
            try{
                Thread.sleep(velocidad);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
