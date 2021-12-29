import java.util.Date;

public class Turista extends Profilo{
    private String nome;
    private String cognome;
    private Date dataNascita;

    private void prenotaEsperienza(){

    }
    private void annullaPrenotazione(){

    }
    private void recensisciEsperienza(){

    }

    /*Metodi get e set*/
    public Date getDataNascita() {
        return dataNascita;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }
}
