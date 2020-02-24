package batalhaNaval;

import java.util.ArrayList;

public class FerramentaJogo {
//	int [] locationCells;
	private ArrayList<String> locationCells;
	private String name;
	
	public String getName() {
		return name;
	}

	public void setNome(String name) {
		this.name = name;
	}

	public ArrayList<String> getLocationCells() {
		return locationCells;
	}

	public void setLocationCells(ArrayList<String> locs){
		locationCells = locs;
	}
	
	public String checkYourself(String stringGuess){
		String result = "caiu na água";
		
		Object userInput = stringGuess.toUpperCase();
		int index = locationCells.indexOf(userInput);
		
		
		if(index >= 0){
			locationCells.remove(index);
			if(locationCells.isEmpty()){
				result ="eliminar";
				System.out.println("Ora! Você afundou "+name+"  :( ");
			}else{
				result ="acertou o alvo";
			}
		}
		return result;
	}
}
