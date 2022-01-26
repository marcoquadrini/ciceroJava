import java.util.ArrayList;
import java.util.Date;

public class Esperienza {
    private String id;
    private String nome;
    private String descrizione;
    private Date data;
    private float costo;
    private int postiDisponibili;
    private int postiMinimi;
    private int postiMassimi;
    private ArrayList<Cicerone> ciceroni;
    private String idCreatore;
    private ArrayList<Tappa> tappe;
    private ArrayList<Partecipante> partecipanti;
    private ArrayList<Toponimo> toponimo;
    private ArrayList<Recensione> recensioni;

    /*Metodi get e set*/

    public int getPostiMinimi() {
        return postiMinimi;
    }

    public void setPostiMinimi(int postiMinimi) {
        this.postiMinimi = postiMinimi;
    }

    public int getPostiMassimi() {
        return postiMassimi;
    }

    public void setPostiMassimi(int postiMassimi) {
        this.postiMassimi = postiMassimi;
    }

    public ArrayList<Cicerone> getCiceroni() {
        return ciceroni;
    }

    public void setCiceroni(ArrayList<Cicerone> ciceroni) {
        this.ciceroni = ciceroni;
    }

    public ArrayList<Tappa> getTappe() {
        return tappe;
    }

    public void setTappe(ArrayList<Tappa> tappe) {
        this.tappe = tappe;
    }

    public ArrayList<Partecipante> getPartecipante() {
        return partecipanti;
    }

    public void setPartecipante(ArrayList<Partecipante> partecipante) {
        this.partecipanti = partecipante;
    }

    public ArrayList<Toponimo> getToponimo() {
        return toponimo;
    }

    public void setToponimo(ArrayList<Toponimo> toponimo) {
        this.toponimo = toponimo;
    }

    public ArrayList<Recensione> getRecensioni() {
        return recensioni;
    }

    public void setRecensioni(ArrayList<Recensione> recensioni) {
        this.recensioni = recensioni;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getPostiDisponibili() {
        return postiDisponibili;
    }

    public void setPostiDisponibili(int postiDisponibili) {
        this.postiDisponibili = postiDisponibili;
    }

    public ArrayList<Cicerone> getIdGuida() {
        return ciceroni;
    }

    public void setIdGuida(Cicerone idGuida) {
        this.ciceroni.add(idGuida);
    }

    public String getIdCreatore() {
        return idCreatore;
    }

    public void setIdCreatore(String idCreatore) {
        this.idCreatore = idCreatore;
    }
    /*metodi get e set*/

    public String condividiEsperienza(){
        //TODO
        // Vedere sistema creazione del link dell'esperienza
        return "Partecipa con me a questa esperienza: "+this.nome + this.descrizione + "LINK ESPERIENZA: " ;
    }
    private void modificaPartecipanti(){

    }
    public void eliminaTappa(Tappa tappaDaEliminare){
        tappe.remove(tappaDaEliminare);
    }
    public void modificaPosti(int postiMinimi, int postiMassimi){
        this.postiMinimi = postiMinimi;
        this.postiMassimi = postiMassimi;
    }
    public void eliminaPartecipante (String emailPartecipanteDaEliminare){
        boolean checkEliminati = false;
        for (Partecipante p : partecipanti) {
            if(p.getEmail().equals(emailPartecipanteDaEliminare)){
                checkEliminati = partecipanti.remove(emailPartecipanteDaEliminare);
            }
        }
        if (checkEliminati == false){
            throw new IllegalArgumentException("E-mail partecipante non valida o non trovata");
        }
    }
    private void associaCicerone(Cicerone ciceroneDaAssociare){
        ciceroni.add(ciceroneDaAssociare);
    }


}
