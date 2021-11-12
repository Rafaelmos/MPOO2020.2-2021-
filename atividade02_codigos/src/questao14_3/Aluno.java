package questao14_3;

public class Aluno {
	private String nome;
	private int matricula;
	private double nota1;
	private double nota2;
	private double nota3;
	private double media;
	private double notaFinal;
	private double maiornota1;
	private double maiornota2;

	public Aluno(String nome, int matricula, double nota1, double nota2, double nota3, double notaFinal) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.notaFinal = notaFinal;
	}

	private void calcularMedias() {
		if (nota3 <= nota2 && nota3 <= nota1) {
			media = (nota1 + nota2) / 2;
			maiornota1 = nota1;
			maiornota2 = nota2;
		} else if (nota1 <= nota2 && nota1 <= nota3) {
			media = (nota2 + nota3) / 2;
			maiornota1 = nota2;
			maiornota2 = nota3;
		} else if (nota2 <= nota1 && nota2 <= nota3) {
			media = (nota3 + nota1) / 2;
			maiornota1 = nota1;
			maiornota2 = nota3;
		}
	}

	public void calcularMedia() {
		calcularMedias();
		System.out.println("A média é: " + media);
	}

	private void mediaFinal() {
		if (media < 7) {
			media = (media + notaFinal) / 2;
			if (media >= 5) {
				System.out.println("Aluno " + nome + " aprovado na final com a média: " + media);
			} else {
				System.out.println("Aluno " + nome + " foi reprovado com a nota: " + media);
			}
		} else {
			System.out.println("O Aluno não está na final");
		}

	}

	public void maioresNotas() {
		calcularMedias();
		System.out.println("Notas maiores " + maiornota1 + " e " + maiornota2);
	}

	public void situacaoAluno() {
		if (media >= 7) {
			System.out.println("Aluno " + nome + " aprovado.");
		} else {
			System.out.println("Aluno " + nome + " precisará fazer a prova final.");
		}
		mediaFinal();
	}

	public int getMatricula() {
		return matricula;
	}

}