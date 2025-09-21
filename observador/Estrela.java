import java.util.List;

public class Estrela extends CorpoCeleste {
    private String tipEsp;
    private double lum;
    private String tipo;
    private double temp;
    private String estEvol;

    public Estrela(String tipEsp, double lum, String tipo, double temp, String estEvol,
                   String nome, Double diam, Double massa, List<String> comp, List<String> orb,
                   Double prodLuz, String localEspaco) {
        super(nome, diam, massa, comp, orb, prodLuz, localEspaco);
        this.tipEsp = tipEsp;
        this.lum = lum;
        this.tipo = tipo;
        this.temp = temp;
        this.estEvol = estEvol;
    }

    public void atualTipo() {
        System.out.println("O tipo atual da estrela é:" + tipo);
    }

    public double calTempVdTotal() {
        return getMassa() / lum; 
    }

    public double calTempVdRest() {
        return calTempVdTotal() - (temp / 1000);
    }

    public double impCalTempVdRest() {
        double result = calTempVdRest();
        System.out.println("Tempo de vida restante: " + result);
        return result;
    }

    public double calcLumEst() {
        return getDiam() * temp; 
    }


    public String getTipEsp() {
        return this.tipEsp;
    }

    public void setTipEsp(String tipEsp) {
        this.tipEsp = tipEsp;
    }

    public double getLum() {
        return this.lum;
    }

    public void setLum(double lum) {
        this.lum = lum;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTemp() {
        return this.temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public String getEstEvol() {
        return this.estEvol;
    }

    public void setEstEvol(String estEvol) {
        this.estEvol = estEvol;
    }

}
