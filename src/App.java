import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int iteracao = ler.nextInt() + 1;

        for(int i = 1; i < iteracao; i++) {
            int numero = i;
            String texto = "";
            while(numero > 0) {
                texto += i;
                numero--;
            }
            System.out.println(texto);
        }
    }
}
