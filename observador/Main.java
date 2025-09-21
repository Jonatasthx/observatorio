import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // ===== PLANETAS =====
        List<Planeta> planetas = new ArrayList<>();

        List<String> compTerra = new ArrayList<>();
        compTerra.add("Hidrogênio");
        compTerra.add("Hélio");
        List<String> orbTerra = new ArrayList<>();
        orbTerra.add("Órbita circular");
        planetas.add(new Planeta(
                1, true, true, "Sistema Solar",
                "Terra", 12742.0, 5.97e24, compTerra, orbTerra,
                0.0, "Via Láctea"
        ));

        List<String> compMarte = new ArrayList<>();
        compMarte.add("Dióxido de Carbono");
        compMarte.add("Argônio");
        List<String> orbMarte = new ArrayList<>();
        orbMarte.add("Órbita elíptica");
        planetas.add(new Planeta(
                2, false, true, "Sistema Solar",
                "Marte", 6779.0, 6.39e23, compMarte, orbMarte,
                0.0, "Via Láctea"
        ));

        // ===== ASTEROIDES =====
        List<Asteroide> asteroides = new ArrayList<>();

        List<String> compApophis = new ArrayList<>();
        compApophis.add("Níquel");
        compApophis.add("Ferro");
        List<String> orbApophis = new ArrayList<>();
        orbApophis.add("Órbita elíptica");
        asteroides.add(new Asteroide(
                "Elíptica", "Grupo Apolo", 370.0, 30.0, 8.5, 384000.0,
                75.0, 0.002,
                "Apophis", 370.0, 2.7e10, compApophis, orbApophis,
                0.0, "Via Láctea"
        ));

        List<String> compVesta = new ArrayList<>();
        compVesta.add("Basalto");
        compVesta.add("Olivina");
        List<String> orbVesta = new ArrayList<>();
        orbVesta.add("Órbita no cinturão principal");
        asteroides.add(new Asteroide(
                "Elíptica", "Cinturão Principal", 525.0, 19.34, 2.5, 353000000.0,
                50.0, 0.00001,
                "Vesta", 525.0, 2.59e20, compVesta, orbVesta,
                0.0, "Via Láctea"
        ));

        // ===== ESTRELAS =====
        List<Estrela> estrelas = new ArrayList<>();

        List<String> compSol = new ArrayList<>();
        compSol.add("Hidrogênio");
        compSol.add("Hélio");
        List<String> orbSol = new ArrayList<>();
        orbSol.add("Órbita da galáxia");
        estrelas.add(new Estrela(
                "Anã amarela", 3.828e26, "G2V", 5778.0, "Sequência Principal",
                "Sol", 1.3927e6, 1.989e30, compSol, orbSol,
                3.828e26, "Via Láctea"
        ));

        List<String> compSirius = new ArrayList<>();
        compSirius.add("Hidrogênio");
        compSirius.add("Hélio");
        compSirius.add("Oxigênio");
        List<String> orbSirius = new ArrayList<>();
        orbSirius.add("Órbita binária com Sirius B");
        estrelas.add(new Estrela(
                "Estrela branca", 2.5e28, "A1V", 9940.0, "Sequência Principal",
                "Sirius A", 2.4e6, 4.018e30, compSirius, orbSirius,
                2.5e28, "Via Láctea"
        ));

        // ===== IMPRESSÃO EM 3 ETAPAS =====
        System.out.println("=== Planetas ===");
        for (Planeta p : planetas) {
            System.out.println("Nome: " + p.getNome());
            System.out.println("Possui vida? " + p.isVida());
            System.out.println("Diâmetro: " + p.getDiam() + " km");
            System.out.println("Massa: " + p.getMassa() + " kg");
            System.out.println("Quantidade de luas: " + p.getQtdLua());
            System.out.println("Possui anel? " + p.isAnel());
            System.out.println("Sistema planetário: " + p.getSisPar());
            System.out.println("Componentes: " + p.getComp());
            System.out.println("Órbitas: " + p.getOrb());
            System.out.println("Local no espaço: " + p.getLocalEspaco());
            System.out.println();
        }

        System.out.println("=== Asteroides ===");
        for (Asteroide a : asteroides) {
            System.out.println("Nome: " + a.getNome());
            System.out.println("Risco de impacto: " + a.getRisco());
            System.out.println("Diâmetro: " + a.getDiam() + " km");
            System.out.println("Velocidade: " + a.getVel() + " km/s");
            System.out.println("Distância: " + a.getDist() + " km");
            System.out.println("Grupo orbital: " + a.getGpOrb());
            System.out.println("Órbitas: " + a.getOrb());
            System.out.println("Local no espaço: " + a.getLocalEspaco());
            System.out.println();
        }

        System.out.println("=== Estrelas ===");
        for (Estrela e : estrelas) {
            System.out.println("Nome: " + e.getNome());
            System.out.println("Diâmetro: " + e.getDiam() + " km");
            System.out.println("Massa: " + e.getMassa() + " kg");
            e.atualTipo();
            System.out.println("Luminosidade: " + e.getLum());
            System.out.println("Tempo de vida total estimado: " + e.calTempVdTotal());
            e.impCalTempVdRest();
            System.out.println("Luminosidade calculada: " + e.calcLumEst());
            System.out.println("Componentes: " + e.getComp());
            System.out.println("Órbitas: " + e.getOrb());
            System.out.println("Local no espaço: " + e.getLocalEspaco());
            System.out.println();
        }
    }
}
