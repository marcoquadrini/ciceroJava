import java.util.ArrayList;
import java.util.Date;

public class Esperienza {
    private String id;
    private String nome;
    private String descrizione;
    private Date data;
    private float costo;
    private int postiDisponibili;
    private String idGuida;
    private String idCreatore;
    private ArrayList<Tappa> tappe;
    private ArrayList<Partecipante> partecipante;
    private ArrayList<Toponimo> toponimo;

    /*Metodi get e set*/

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

    public String getIdGuida() {
        return idGuida;
    }

    public void setIdGuida(String idGuida) {
        this.idGuida = idGuida;
    }

    public String getIdCreatore() {
        return idCreatore;
    }

    public void setIdCreatore(String idCreatore) {
        this.idCreatore = idCreatore;
    }
    /*metodi get e set*/


}
