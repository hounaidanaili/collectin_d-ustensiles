public class assiette_ronde extends  assiette{


    protected double rayon;


    public assiette_ronde(int ann, double rayon) {
        super(ann);
        this.rayon = rayon;
    }
    public double calculersurface(){

        return(rayon*rayon*3.14);




    }








}
