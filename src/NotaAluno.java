import java.util.Scanner;

public class NotaAluno {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("Digite a nota de matemática: ");
        float n1 = s.nextFloat();

        System.out.println("Digite a nota de Português: ");
        float n2 = s.nextFloat();

        System.out.println("Digite a nota de Inglês: ");
        float n3 = s.nextFloat();

        System.out.println("Digite a nota de Geografia: ");
        float n4 = s.nextFloat();

        if ((n1 + n2 + n3 + n4) / 4 >= 7){
            System.out.println("A nota final é: " + (n1 + n2 + n3 + n4) / 4 + " Aluno(a) aprovado(a)");
        }
        if ((n1 + n2 + n3 + n4) / 4 >= 5) {
            System.out.println("A nota final é: " + (n1 + n2 + n3 + n4) / 4 + " Aluno(a) em recuperação");
        }
        else{
            System.out.println("A nota final é: " + ((n1 + n2 + n3 + n4) / 4) + " Aluno(a) reprovado(a)");
        }
    }

}