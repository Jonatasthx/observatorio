import java.util.List;

public class Planeta extends CorpoCeleste {
    private int qtdLua;
    private boolean anel;
    private boolean vida;
    private String sisPar;

    public Planeta(int qtdLua, boolean anel, boolean vida, String sisPar,
                   String nome, Double diam, Double massa, List<String> comp, List<String> orb,
                   Double prodLuz, String localEspaco) {
        super(nome, diam, massa, comp, orb, prodLuz, localEspaco);
        this.qtdLua = qtdLua;
        this.anel = anel;
        this.vida = vida;
        this.sisPar = sisPar;
    }


    public int getQtdLua() {
        return this.qtdLua;
    }

    public void setQtdLua(int qtdLua) {
        this.qtdLua = qtdLua;
    }

    public boolean isAnel() {
        return this.anel;
    }

    public boolean getAnel() {
        return this.anel;
    }

    public void setAnel(boolean anel) {
        this.anel = anel;
    }

    public boolean isVida() {
        return this.vida;
    }

    public boolean getVida() {
        return this.vida;
    }

    public void setVida(boolean vida) {
        this.vida = vida;
    }

    public String getSisPar() {
        return this.sisPar;
    }

    public void setSisPar(String sisPar) {
        this.sisPar = sisPar;
    }
    
}
