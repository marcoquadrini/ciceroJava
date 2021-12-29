import javax.swing.text.Position;
import java.util.ArrayList;
import java.util.HashSet;

public class Tappa {
    private String nome;
    private String descrizione;
    private Coordinate coordinate;
    private HashSet<Tag> tag;
    /*Metodi generali */
    private void modificaTappa() {

    }
    /*Metodi get e set */

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

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public HashSet<Tag> getTag() {
        return tag;
    }

    public void setTag(HashSet<Tag> tag) {
        this.tag = tag;
    }
}
