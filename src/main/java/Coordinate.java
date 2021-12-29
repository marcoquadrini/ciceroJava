public class Coordinate {
    private int latitudine;
    private int longitudine;
    /*Costruttore */
    Coordinate(int latitudine, int longitudine){
        this.latitudine= latitudine;
        this.longitudine = longitudine;
    }
    public int getLatitudine() {
        return latitudine;
    }

    public void setLatitudine(int latitudine) {
        this.latitudine = latitudine;
    }

    public int getLongitudine() {
        return longitudine;
    }

    public void setLongitudine(int longitudine) {
        this.longitudine = longitudine;
    }
}
