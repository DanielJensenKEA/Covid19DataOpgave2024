public class Covid19Data {
    //Region, alder, bekræftede,døde, indlagteIntensiv, indlagte, dato
    private String region;
    private String aldersgruppe;
    private int bekræftedeTilfælde;
    private int døde;
    private int indlagteIntensiv;
    private int indlagte;
    private String dato;

    public String getRegion() {
        return region;
    }

    public String getAldersgruppe() {
        return aldersgruppe;
    }

    public int getBekræftedeTilfælde() {
        return bekræftedeTilfælde;
    }

    public int getDøde() {
        return døde;
    }

    public int getIndlagteIntensiv() {
        return indlagteIntensiv;
    }

    public int getIndlagte() {
        return indlagte;
    }

    public String getDato() {
        return dato;
    }

    public Covid19Data(String region, String aldersgruppe, int bekræftedeTilfælde, int døde, int indlagteIntensiv, int indlagte, String dato) {
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.bekræftedeTilfælde = bekræftedeTilfælde;
        this.døde = døde;
        this.indlagteIntensiv = indlagteIntensiv;
        this.indlagte = indlagte;
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Region="+region+" Aldersgruppe="+aldersgruppe+
                " BekræftedeTilfælde="+bekræftedeTilfælde+
                " Døde="+døde+" Indlagte Intensiv="+indlagteIntensiv+
                " Indlagte="+indlagte+"Dato="+dato;
    }


}
