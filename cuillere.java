public class cuillere extends ustensile{

    protected  double largeur ;


    public cuillere(int ann, double largeur) {
        super(ann);
        this.largeur = largeur;
    }


    public double getRayon() {
        return largeur;
    }

    public void setRayon(double rayon) {
        this.largeur = rayon;
    }
}
