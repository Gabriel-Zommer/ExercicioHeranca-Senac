public class TesteFuncionarios {
    public static void main(String[] args) {
        // Criando objetos das classes filhas
        Professor professor = new Professor("João", 35, 5000.0, "Matemática");
        Administrativo administrativo = new Administrativo("Maria", 40, 3500.0, "RH");

        // Exibindo informações dos funcionários
        System.out.println("Nome do Professor: " + professor.getNome());
        System.out.println("Idade do Professor: " + professor.getIdade());
        System.out.println("Salário do Professor: " + professor.getSalario());
        System.out.println("Disciplina do Professor: " + professor.getDisciplina());

        System.out.println();

        System.out.println("Nome do Administrativo: " + administrativo.getNome());
        System.out.println("Idade do Administrativo: " + administrativo.getIdade());
        System.out.println("Salário do Administrativo: " + administrativo.getSalario());
        System.out.println("Setor do Administrativo: " + administrativo.getSetor());
    }
}
