package listadois;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ProgramaPessoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        while (true) {
            String nome = scanner.nextLine();

            String dataStr = scanner.nextLine();
            LocalDate dataDeNascimento = LocalDate.parse(dataStr, formatter);

            String cpf = scanner.nextLine();

            double altura = scanner.nextDouble();
            scanner.nextLine();

            if (altura <= 0) {
                break;
            }

            PessoaFisica pessoa = new PessoaFisica(nome, dataDeNascimento, altura, cpf);
            
            System.out.println(pessoa.calcularIdade());
            System.out.println(pessoa.calcularIdadeNaData(LocalDate.of(2020, 1, 1)));
        }

        scanner.close();
    }
}
