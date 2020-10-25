package percentualeleitores;

import java.util.Scanner;

/*Fa�a uma classe com 3 m�todos que calculam:

total de eleitores v�lidos
votos brancos
nulos


- o percentual do votos v�lidos em rela��o ao total de eleitores,
- o percentual de brancos em rela��o ao total de eleitores
- o percentual de nulos em rela��o ao total de eleitores.

Dica: �em rela��o ao total� significa que voc� deve dividir, por exemplo, �nulos� pelo total de 
eleitores, v�lidos pelo total de eleitores, etc�
*/

public class PercentualVotos {
	Scanner leitor = new Scanner(System.in);
	double eleitor;
	double votoBranco;
	double votoNulo;
	double votoValido;
	double percentualNulo;
	double percentualBranco;	
	
	public PercentualVotos(double eleitor, double votoBranco, double votoNulo) {
		
		this.eleitor = eleitor;
		this.votoBranco = votoBranco;
		this.votoNulo = votoNulo;
		
		/*
		 * System.out.print("Digite o n�mero de eleitores: "); eleitor =
		 * leitor.nextInt();
		 * 
		 * System.out.print("Digite o n�mero de votos brancos: "); votoBranco =
		 * leitor.nextInt();
		 * 
		 * System.out.print("Digite o n�mero de votos nulos: "); votoNulo =
		 * leitor.nextInt();
		 */
		
	}
	public void percentualVotoValido() {
		votoValido = ((eleitor - votoBranco - votoNulo )/eleitor) * 100;
		System.out.println("O percentual de votos v�lidos em rela��o a eleitores � de: " + votoValido + "%" );
	}
	
	public void percentualVotoBranco() {
		percentualBranco = ((votoBranco / eleitor)*100);
		System.out.println("O percentual de votos brancos em rela��o a eleitores � de: " + percentualBranco + "%" );
	}
	
	public void percentualVotoNulo() {
		percentualNulo = ((votoNulo / eleitor)*100);
		System.out.println("O percentual de votos nulos em rela��o a eleitores � de: " + percentualNulo +  "%" );
		
	}
	
	
}
