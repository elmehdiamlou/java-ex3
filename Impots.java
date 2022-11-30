import java.util.ArrayList;
import java.util.List;

public class Impots {
    private int annee;
    private double totalImpot;
    protected List<Dossier> dossiers;

    public Impots(int annee) {
        this.annee = annee;
        this.dossiers = new ArrayList<>();
    }

    public void add(Dossier dossier) {
        this.dossiers.add(dossier);
        this.totalImpot += dossier.getMontant();
    }

    public int getAnnee() {
        return annee;
    }

    @Override
    public String toString() {
        String impots = "Liste des impots " + this.annee + "\n";
        for (Dossier dossier : this.dossiers) {
            impots += dossier.toString();
        }

        impots += "Total :" + this.totalImpot;
        return impots;
    }


}
