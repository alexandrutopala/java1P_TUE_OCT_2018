public class Produs {
    private String nume;
    private double pret;
    private int stoc;
    
    public Produs(String nume, double pret, int stoc) {
        this.nume = nume;
        this.pret = pret;
        this.stoc = stoc;
    }
    
    public String getNume() {
        return nume;
    }
    
    public void setNume(String nume) {
        this.nume = nume;
    }
    
    public double getPret() {
        return pret;
    }
    
    public void setPret(double pret) {
        this.pret = pret;
    }
    
    public int getStoc() {
        return stoc;
    }
    
    public void setStoc(int stoc) {
        this.stoc = stoc;
    }
    
    @Override
    public String toString() {
        return nume;// + " " + pret + " " + stoc;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}