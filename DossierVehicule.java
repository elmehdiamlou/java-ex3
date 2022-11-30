public class DossierVehicule extends Dossier {
    private int nbCheveaux;
    private char categorie;

    public DossierVehicule(long id, int nbCheveaux, char categorie) {
        super(id);
        this.nbCheveaux = nbCheveaux;
        this.categorie = categorie;
        this.calculerMontant();
    }

    @Override
    protected void calculerMontant() {
        if (this.categorie == 'E') {
            if (this.nbCheveaux < 8) 
                super.montant = 350;
            else if (this.nbCheveaux >= 8 && this.nbCheveaux <= 10) 
                super.montant = 650;
            else if (this.nbCheveaux >= 11 && this.nbCheveaux <= 14) 
                super.montant = 3000;
            else 
                super.montant = 8000;
            
        } else {
            if (this.nbCheveaux < 8) 
                super.montant = 750;
            else if (this.nbCheveaux >= 8 && this.nbCheveaux <= 10) 
                super.montant = 1500;
            else if (this.nbCheveaux >= 11 && this.nbCheveaux <= 14) 
                super.montant = 6000;
            else 
                super.montant = 20000;
        }
    }

    @Override
    public String toString() {
        return "Vehicule " + this.categorie + " " + this.nbCheveaux + " CH, Montant:" + super.montant + "\n";
    }
}
