import java.util.List;

public class CorpoCeleste {
    protected String nome;
    protected Double diam;
    protected Double massa;
    protected List<String> comp;
    protected List<String> orb;
    protected Double prodLuz;
    protected String localEspaco;

    public CorpoCeleste(String nome, Double diam, Double massa, List<String> comp, List<String> orb,
                         Double prodLuz, String localEspaco) {
        this.nome = nome;
        this.diam = diam;
        this.massa = massa;
        this.comp = comp;
        this.orb = orb;
        this.prodLuz = prodLuz;
        this.localEspaco = localEspaco;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getDiam() {
        return this.diam;
    }

    public void setDiam(Double diam) {
        this.diam = diam;
    }

    public Double getMassa() {
        return this.massa;
    }

    public void setMassa(Double massa) {
        this.massa = massa;
    }

    public List<String> getComp() {
        return this.comp;
    }

    public void setComp(List<String> comp) {
        this.comp = comp;
    }

    public List<String> getOrb() {
        return this.orb;
    }

    public void setOrb(List<String> orb) {
        this.orb = orb;
    }

    public Double getProdLuz() {
        return this.prodLuz;
    }

    public void setProdLuz(Double prodLuz) {
        this.prodLuz = prodLuz;
    }

    public String getLocalEspaco() {
        return this.localEspaco;
    }

    public void setLocalEspaco(String localEspaco) {
        this.localEspaco = localEspaco;
    }

}
