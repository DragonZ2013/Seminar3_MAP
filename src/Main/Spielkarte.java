package Main;

public class Spielkarte {

    private FarbeEnum farbe;
    private String wert;

    public FarbeEnum getFarbe() {
        return farbe;
    }

    public String getWert() {
        return wert;
    }

    public void setFarbe(FarbeEnum farbe) {
        this.farbe = farbe;
    }

    public void setWert(String wert) {
        this.wert = wert;
    }
    public Spielkarte(FarbeEnum farbe, String wert) {
        this.farbe = farbe;
        this.wert = wert;
    }




}
