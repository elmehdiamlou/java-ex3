import java.util.ArrayList;
import java.util.List;

public class Societe {
    private long id;
    private String raison_social;
    private List<Impots> impots;

    public Societe(long id, String raison_social) {
        this.id = id;
        this.raison_social = raison_social;
        this.impots = new ArrayList<>();
    }


    public List<Impots> getImpots(int annee) {
        List<Impots> impots = new ArrayList<>();
        for (Impots impot : this.impots) {
            if (impot.getAnnee() == annee) 
                impots.add(impot);
        }
        return impots;
    }

    public void add(Impots impot) {
        this.impots.add(impot);
    }


    @Override
    public String toString() {
        return "Scoiété : "+ id +" - "+ raison_social;
    }

}
