
public class Frentista implements Posto {
	
	private String nome;
	private boolean Oucupado;
	
	public void abastecer() {
		if(this.getOucupado()) {
			System.out.println("Abastecendo...");
			this.setOucupado(false);
		}else{
			System.out.println("Frentista Oucupado!");
			
		}			
		
	}
	
	public void trocarOleo() {
		if(this.getOucupado()) {
			System.out.println("Trocando Oleo...");
			this.setOucupado(false);
		}else{
			System.out.println("Frentista Oucupado!");
			
		}	
		
		
	}
	
	
	public void lavar() {
		
		if(this.getOucupado()) {
			System.out.println("Lavando carro...");
			this.setOucupado(false);
		}else{
			System.out.println("Frentista Oucupado");
			
		}	
		
		
	}

	public Frentista(String nome) {
		super();
		this.nome = nome;
		Oucupado = true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean getOucupado() {
		return Oucupado;
	}

	public void setOucupado(boolean oucupado) {
		Oucupado = oucupado;
	}
	
	
	
	
	

}
