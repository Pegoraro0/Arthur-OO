
public class Principal {

	public static void main(String[] args) {
		Frentista F = new Frentista("Marcos");
		F.abastecer();                                         // Somente uma ação por frentista 
		F.lavar();
		
		Frentista G = new Frentista("Ricardo");
		G.trocarOleo();

	}
	
	

}
