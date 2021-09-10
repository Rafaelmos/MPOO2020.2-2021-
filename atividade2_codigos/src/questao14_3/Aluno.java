package questao14_3;

public class Aluno {
	private String nome;
	private int matricula;
	private double nota1;
	private double nota2;
	private double nota3;
	private double media;
	private double notaFinal;



	
	public Aluno(String nome, int matricula, double nota1, double nota2, double nota3, double notaFinal) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.notaFinal = notaFinal;
	}

	public void mediaNotas() {

		if (nota3 <= nota2 && nota3 <= nota1) {
			media = (nota1 + nota2) / 2;
		} else if (nota1 <= nota2 && nota1 <= nota3) {
			media = (nota2 + nota3) / 2;
		} else if (nota2 <= nota1 && nota2 <= nota3) {
			media = (nota3 + nota1) / 2;
			System.out.println("Notas maiores " + nota1 + " e " + nota3);
		}
		System.out.println("A média é: " + media);
	}
	
	public void mediaFinal() {
		if (media<7) {
			media=(media+notaFinal)/2;
		} else {
			System.out.println("O Aluno não está na final");
		}
	}

	public void maioresNotas() {
		if (nota3 <= nota2 && nota3 <= nota1) {
			System.out.println("Notas maiores " + nota1 + " e " + nota2);
		} else if (nota1 <= nota2 && nota1 <= nota3) {
			System.out.println("Notas maiores " + nota2 + " e " + nota3);
		} else if (nota2 <= nota1 && nota2 <= nota3) {
			System.out.println("Notas maiores " + nota1 + " e " + nota3);
		}
	}

	public void situacaoAluno() {
		if (media >= 7) {
			System.out.println("Aluno " + nome + " aprovado.");
		} else {
			System.out.println("Aluno " + nome + " precisará fazer a prova final.");
		}
	}

	public void situacaoAlunoFinal() {
		mediaFinal();
	if (media >= 5) {
		System.out.println("Aluno " + nome + " aprovado com a nota: " + media);
	} else {
		System.out.println("Aluno " + nome + " foi reprovado com a nota: " + media);
	}
}

}