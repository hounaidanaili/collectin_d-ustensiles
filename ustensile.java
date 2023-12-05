public  abstract class ustensile {




    protected int ann;


    public ustensile(int ann) {
        this.ann = ann;
    }


    public int getAnn() {
        return ann;
    }

    public void setAnn(int ann) {
        this.ann = ann;
    }
    public int calculerval(int anneeactuell)
    {



        if(anneeactuell-ann<50)
            return 0;
        else
            return (anneeactuell-anneeactuell-50);



    }








}
