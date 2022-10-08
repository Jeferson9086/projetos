package ultraemojicombat;

public class Lutador {
     //Atributo  
	private String nome; 
	private String nacionalidade; 
	private int idade; 
	private float altura; 
	private float peso; 
	private String categoria; 
	private int vitorias, derrotas, empate; 
	
	//M�todos p�blicos  
	public void apresentar() {  
		System.out.println("------------------------------------------");
		System.out.println("CHEGOU A HORA!apresentamos o lutador" + this.getNome()); 
		System.out.println("Diretament de " + this.getNacionalidade()); 
		System.out.println("Com " + this.getIdade() + " anos e " + this.altura); 
		System.out.println("peando " + this.getPeso() + "Kg"); 
		System.out.println(this.getVitorias() + " vi�rias "); 
		System.out.println(this.getDerrotas() + " derrotas e "); 
		System.out.println(this.getEmpates()  +  " empates!");
		
	} 
	public void Status() {  
		System.out.println(this.getNome() + " � um peso " + this.getCategoria()); 
		System.out.println("Ganhou "  + this.getVitorias() +  " vezes"); 
		System.out.println("Perdeu "  + this.getDerrotas() +  " vezes"); 
		System.out.println("Empatou "  + this.getEmpates() +  " vezes");
		
	} 
	public void ganharLuta() { 
		this.setVitorias(this.getVitorias() + 1);
	}
	public void perderLuta() { 
		this.setDerrotas(this.getDerrotas() + 1);
	}
	public void empatarLuta() { 
		this.setEmpates(this.getEmpates() + 1);
		
	} 
	//M�todos Especiais
	public Lutador(String no, String na, int id, float al, float pe,
			int vi, int de, int em) {
		super();
		this.nome = no;
		this.nacionalidade = na;
		this.idade = id;
		this.altura = al;
		this.setPeso(pe);
		this.vitorias = vi;
		this.derrotas = de;
		this.empate = em; 
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso; 
		this.setCategoria();
	}
	public String getCategoria() {
		return categoria;
	}
	private void setCategoria() {
        if (this.peso < 52.2) { 
        	this.categoria = "Inv�lido";
        } else if (this.peso <=70.3) {
        	this.categoria = "Leve";
        }else if (this.peso <= 83.9) { 
        	this.categoria = "M�dio";
        }else if (this.peso <=120.2) { 
        	this.categoria = "pesado";
        }else { 
        	this.categoria = "Inv�lido";
        }
        
	
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empate;
	}
	public void setEmpates(int empate) {
		this.empate = empate;
	}
	
	 
	
}
