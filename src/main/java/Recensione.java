public class Recensione {
    private String id;
    private String descrizione;
    private int valutazione;
    private Turista recensore;
    private String idEsperienza;
    /*Metodi get e set*/

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getValutazione() {
        return valutazione;
    }

    public void setValutazione(int valutazione) {
        this.valutazione = valutazione;
    }

    public Turista getRecensore() {
        return recensore;
    }

    public void setRecensore(Turista recensore) {
        this.recensore = recensore;
    }

    public String getIdEsperienza() {
        return idEsperienza;
    }

    public void setIdEsperienza(String idEsperienza) {
        this.idEsperienza = idEsperienza;
    }
}
