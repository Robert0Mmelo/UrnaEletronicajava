public class Candidatos {
private String nomeCandidato;
private int votos;
private String numeroCandidato;

    public Candidatos(String nomeCandidato, String numeroCandidato){
        this.nomeCandidato = nomeCandidato;
        this.numeroCandidato = numeroCandidato;
        this.votos = 0;
    }

    public String getnumeroCandidato() {
        return numeroCandidato;
    }
    public String getnomeCandidato(){
        return nomeCandidato;
    }
    public int getVotos(){
        return votos;
    }
    public void setvotos(){
        this.votos = votos;
    }
    public void incrementarVotos(){
        votos++;
    }
    
}