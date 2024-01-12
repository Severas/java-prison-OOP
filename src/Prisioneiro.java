enum Crime {
    ROUBO,
	CORRUPCAO,
	ASSASSINATO,
    ASSALTO;
}

public class Prisioneiro {
    private String Nome;
	private Crime crimeCometido;
    public Prisioneiro(String nome, Crime crimeCometido){
        this.Nome=nome;
        this.crimeCometido=crimeCometido;
    }
    
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public Crime getCrimeCometido() {
        return crimeCometido;
    }
    public void setCrimeCometido(Crime crimeCometido) {
        this.crimeCometido = crimeCometido;
    }
    
    

}
