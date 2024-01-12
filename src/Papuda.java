public class Papuda{
    private int Capacidade;
    private int CapacidadeInicial;

    public void hospedar(Prisioneiro preso){
        if(CapacidadeInicial<Capacidade){
            CapacidadeInicial+=1;
            System.out.println("prisioneiro "+preso.getNome()+" - condenado por "+preso.getCrimeCometido() + " - preso na Papuda");
        }else if(CapacidadeInicial==Capacidade){
            CapacidadeInicial+=1;
            throw new RuntimeException("Papuda nao pode mais receber prisioneiros");
        }else{
            throw new RuntimeException("Papuda nao pode mais receber prisioneiros");
        }
    }
    public int getCapacidade() {
        return Capacidade;
    }
    public void setCapacidade(int capacidade) {
        Capacidade = capacidade;
    }
    
}

