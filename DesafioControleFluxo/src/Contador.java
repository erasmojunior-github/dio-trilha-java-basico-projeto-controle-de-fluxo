import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        try {
            System.out.println("Insira o primeiro parâmetro:");
            int parametro1 = scanner.nextInt();
            System.out.println("Insira o segundo parâmetro");
            int parametro2 = scanner.nextInt();

            scanner.close();
            
            contarIntervalo(parametro1, parametro2);
        }
        catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contarIntervalo (int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro2 > parametro1) {
            int intervalo = parametro2 - parametro1;
            for (int imprimirIntervalo = 1; imprimirIntervalo <= intervalo; imprimirIntervalo++){
                System.out.println("Imprimindo o número " + imprimirIntervalo);
            }
        }
        else {
            throw new ParametrosInvalidosException();
        }
    }
}
