import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int idade;
        int somaMaior = 0;
        int soma = 0;
        double mediaMaior = 0.0;
        int nPessoas;
        
        System.out.println("Informe quantos pessoas deseja: ");
        nPessoas = scan.nextInt();

        for (int i = nPessoas; i > 0; i--){
            System.out.println("Digite a idade: ");
            idade = scan.nextInt();

            if (idade >= 18){
            somaMaior = idade + somaMaior;
            mediaMaior = somaMaior / nPessoas;
            }else {
                soma = idade + soma;
            }
        }
        System.out.println("A soma das pessoas maiores de idades é " +somaMaior);
        System.out.println("A média de idade das pessoas maiores de idade é "+mediaMaior);
    }
}
