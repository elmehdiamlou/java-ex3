public abstract class Dossier {
    private long id;
    protected double montant;

    public Dossier(long id) {
        this.id = id;
    }

    public double getMontant() {
        return montant;
    }

    protected abstract void calculerMontant();
}
