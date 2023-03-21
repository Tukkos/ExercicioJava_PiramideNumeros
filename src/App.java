public class App {
    public static void main(String[] args) throws Exception {
        int iteracao = 6;

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
