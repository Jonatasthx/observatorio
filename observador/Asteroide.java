import java.util.List;
import java.util.Objects;

public class Asteroide extends CorpoCeleste {
    private String tipOrb;
    private String gpOrb;
    private double vel;
    private double risco;
    private double dist;
    private double potPer;
    private double probImp;

    public Asteroide(String tipOrb, String gpOrb, double diam2, double vel, double risco, double dist,
                     double potPer, double probImp, String nome, Double diam, Double massa,
                     List<String> comp, List<String> orb, Double prodLuz, String localEspaco) {
        super(nome, diam, massa, comp, orb, prodLuz, localEspaco);
        this.tipOrb = tipOrb;
        this.gpOrb = gpOrb;
        this.vel = vel;
        this.risco = risco;
        this.dist = dist;
        this.potPer = potPer;
        this.probImp = probImp;
    }


    public String getTipOrb() {
        return this.tipOrb;
    }

    public void setTipOrb(String tipOrb) {
        this.tipOrb = tipOrb;
    }

    public String getGpOrb() {
        return this.gpOrb;
    }

    public void setGpOrb(String gpOrb) {
        this.gpOrb = gpOrb;
    }

    public double getVel() {
        return this.vel;
    }

    public void setVel(double vel) {
        this.vel = vel;
    }

    public double getRisco() {
        return this.risco;
    }

    public void setRisco(double risco) {
        this.risco = risco;
    }

    public double getDist() {
        return this.dist;
    }

    public void setDist(double dist) {
        this.dist = dist;
    }

    public double getPotPer() {
        return this.potPer;
    }

    public void setPotPer(double potPer) {
        this.potPer = potPer;
    }

    public double getProbImp() {
        return this.probImp;
    }

    public void setProbImp(double probImp) {
        this.probImp = probImp;
    }

}
