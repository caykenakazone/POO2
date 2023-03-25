package Ex1;

public class Main {
     public static void main(String[] args) {

         Aluno aluno = new Aluno("Carlos", "Sistemas para internt");
         Professor professor = new Professor("Ryann", "Sistemas da informação");
         Funcionario funcionario = new Funcionario("Ana", "Diretora");

         aluno.apresentar();
         professor.apresentar();
         funcionario.apresentar();
    }
}
