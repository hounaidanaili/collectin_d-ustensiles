public class assiette_carre extends assiette{


    protected double cote;

    public assiette_carre(int ann, double cote) {
        super(ann);
        this.cote = cote;
    }

    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }

    public double calculersurface(){

        return(cote*cote);




    }


    public int calculval(int acc){


        return (5*super.calculerval(acc));



    }




}
