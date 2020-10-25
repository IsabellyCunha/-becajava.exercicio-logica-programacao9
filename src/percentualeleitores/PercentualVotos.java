package percentualeleitores;

import java.util.Scanner;

/*Faça uma classe com 3 métodos que calculam:

total de eleitores válidos
votos brancos
nulos


- o percentual do votos válidos em relação ao total de eleitores,
- o percentual de brancos em relação ao total de eleitores
- o percentual de nulos em relação ao total de eleitores.

Dica: “em relação ao total” significa que você deve dividir, por exemplo, “nulos” pelo total de 
eleitores, válidos pelo total de eleitores, etc…
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
		 * System.out.print("Digite o número de eleitores: "); eleitor =
		 * leitor.nextInt();
		 * 
		 * System.out.print("Digite o número de votos brancos: "); votoBranco =
		 * leitor.nextInt();
		 * 
		 * System.out.print("Digite o número de votos nulos: "); votoNulo =
		 * leitor.nextInt();
		 */
		
	}
	public void percentualVotoValido() {
		votoValido = ((eleitor - votoBranco - votoNulo )/eleitor) * 100;
		System.out.println("O percentual de votos válidos em relação a eleitores é de: " + votoValido + "%" );
	}
	
	public void percentualVotoBranco() {
		percentualBranco = ((votoBranco / eleitor)*100);
		System.out.println("O percentual de votos brancos em relação a eleitores é de: " + percentualBranco + "%" );
	}
	
	public void percentualVotoNulo() {
		percentualNulo = ((votoNulo / eleitor)*100);
		System.out.println("O percentual de votos nulos em relação a eleitores é de: " + percentualNulo +  "%" );
		
	}
	
	
}
