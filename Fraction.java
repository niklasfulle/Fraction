public class Fraction {

    private int zaehler;
    private int nenner;

    public Fraction(int _zaehler, int _nenner) {
        zaehler = _zaehler;
        nenner = _nenner;
    }

    public int getZaehler() {
        return zaehler;
    }

    public int getNenner() {
        return nenner;
    }

    public void setZaehler(int zaehler) {
        this.zaehler = zaehler;
    }

    public void setNenner(int nenner) {
        this.nenner = nenner;
    }

    public Fraction add(Fraction b){
        int newZaehler = zaehler + b.getZaehler();
        int newNenner= nenner + b.getNenner();
        return new Fraction(newZaehler, newNenner);
    }

    public Fraction substract(Fraction b){
        int newZaehler = zaehler - b.getZaehler();
        int newNenner= nenner - b.getNenner();
        return new Fraction(newZaehler, newNenner);
    }

    public Fraction multiply(Fraction b){
        int newZaehler = zaehler * b.getZaehler();
        int newNenner= nenner * b.getNenner();
        return new Fraction(newZaehler, newNenner);
    }

    public Fraction divide(Fraction b){
        int newZaehler = zaehler * b.getNenner();
        int newNenner= nenner * b.getZaehler();
        return new Fraction(newZaehler, newNenner);
    }

    public void print(){
        String zaehlerString = zaehler+"";
        String nennerString = nenner+"";

        int zaehlerLength = zaehlerString.length();
        int nennerLength = nennerString.length();

        System.out.println(zaehler);

        if(zaehlerLength > nennerLength){
            for (int i = 0; i < zaehlerLength; i++) {
                System.out.print("-");
            }
        } else if (nennerLength > zaehlerLength) {
            for (int i = 0; i < nennerLength; i++) {
                System.out.print("-");
            }
        } else {
            for (int i = 0; i < zaehlerLength; i++) {
                System.out.print("-");
            }
        }
        System.out.println();
        System.out.println(nenner);
    }
}
