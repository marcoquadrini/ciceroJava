import java.util.Date;

public class Cicerone extends Profilo {
    private String nome;
    private String cognome;
    private Date dataNascita;

    /*Metodi generali*/
    private void modificaDisponibilita(){

    }
    private void aggiungiEsperienza(){

    }
    private void eliminaEsperienza(){

    }
    private void proponiTag(){

    }
    private void modificaEsperienza(Esperienza esperienza){

    }
    private void visualizzaEsperienzeAttive(){

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
