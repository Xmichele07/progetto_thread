public class Corridore extends Thread{
    private String nome;
    private int distanzaPercorsa;
    
    public Corridore(String nome) {
        this.nome = nome;
    }

    
    
    public Corridore(String nome, int distanzaPercorsa) {
        this.nome = nome;
        this.distanzaPercorsa = distanzaPercorsa;
    }

    

    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public int getDistanzaPercorsa() {
        return distanzaPercorsa;
    }



    public void setDistanzaPercorsa(int distanzaPercorsa) {
        this.distanzaPercorsa = distanzaPercorsa;
    }



    public void run() {
        for (int i=1; i <= 100; i++) {
            distanzaPercorsa = i;
            synchronized (System.out) {
                System.out.println(nome + " ha percorso " + distanzaPercorsa + " metri.");
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        synchronized (System.out) {
            System.out.println(nome + " ha raggiunto il traguardo!");
        }
    }
}
