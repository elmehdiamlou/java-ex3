public class DossierRevenus extends Dossier {
    private double ca;

    public DossierRevenus(long id, double ca) {
        super(id);
        this.ca = ca;
        this.calculerMontant();
    }

    @Override
    protected void calculerMontant() {
        super.montant = this.ca * 15 / 100;
    }

    @Override
    public String toString() {
        return "15% de revenus " + this.ca + ", Montant:" + super.montant + "\n";
    }
}
