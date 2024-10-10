package exercicio3;

public class Aluno {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;

	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}
	public String status() {
		if(finalGrade() >= 60 ) {
			return "\nPASS";
		}else {
			double missing = 60 - finalGrade(); 
			return "\nFAILED" + "\nMISSING " + String.format("%.2f", missing) + " POINTS";
		}
	}
	
	public String toString() {
		return "Final Grade " + finalGrade() + status();
	}
	
}
