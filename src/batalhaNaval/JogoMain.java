package batalhaNaval;

import java.util.ArrayList;

public class JogoMain {
	private Jogo ajudar = new Jogo();
	private ArrayList<FerramentaJogo> listaDosJogos = new ArrayList<FerramentaJogo>();
	private int numAdivinhar = 0;
	
	private void setNomesdosNavios(){
		//primeiro cria alugns objetos DotCom e fornece seus locais
		FerramentaJogo um = new FerramentaJogo();
		um.setNome("Porta-Helicópteros");
		FerramentaJogo dois = new FerramentaJogo();
		dois.setNome("Submarinos");
		FerramentaJogo tres = new FerramentaJogo();
		tres.setNome("Navios-Patrulha");
		listaDosJogos.add(um);
		listaDosJogos.add(dois);
		listaDosJogos.add(tres);
		
		System.out.println("Seu objetivo é eliminar três navios.");
		System.out.println("Porta-Helicópteros, Submarinos, Navios-Patrulha");
		System.out.println("Tente eleminar todas com o menor número de palpites");
		for(FerramentaJogo receberLocal : listaDosJogos){
			ArrayList<String> novoLocal = ajudar.lugarNavio(3);
			receberLocal.setLocationCells(novoLocal);
		}
//		Object obj;
//		int i = 5;
//		//BOXING
//		obj = i;
//	    //UNBOXING
//		i = obj;
		
	}
	
	private void começarJogo(){
		while(!listaDosJogos.isEmpty()){
			String usuarioAdivinhar = ajudar.getUserInput("Insira um palpite");
			usuAdivinhar(usuarioAdivinhar);
		}
		fimJogo();
	}
	
	private void usuAdivinhar(String usuarioAdivinhar){
		numAdivinhar++;
		String resultado = "caiu na água";
		for(FerramentaJogo testJogo : listaDosJogos){
			resultado = testJogo.checkYourself(usuarioAdivinhar);
			
			if(resultado.equals("Acertou no alvo")){
				break;
			}
			if(resultado.equals("eliminar")){
				listaDosJogos.remove(testJogo);
				break;
			}
		}
		System.out.println(resultado);
	}
	
	private void fimJogo(){
		System.out.println("Todas as Dot Coms foram eliminadas! Agora seu conjunto está vazio.");
		if(numAdivinhar <= 18){
			System.out.println("Você só usou "+numAdivinhar+" palpites.");
			System.out.println("Você saiu antes de eliminar suas oções.");
		}else{
			System.out.println("Demorou demais. "+numAdivinhar+" palpites.");
			System.out.println("Não haverá pesca com essas opções");
		}
	}
	public static void main(String[]args){
		JogoMain jogar = new JogoMain();
		jogar.setNomesdosNavios();
		jogar.começarJogo();
	}
}
