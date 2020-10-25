package percentualeleitores;

public class Main {

	public static void main(String[] args) {
		PercentualVotos eleicao = new PercentualVotos(8000, 100, 45);
		
		//eleicao.entrada();
		eleicao.percentualVotoValido();
		eleicao.percentualVotoBranco();
		eleicao.percentualVotoNulo();
		
		

	}

}
