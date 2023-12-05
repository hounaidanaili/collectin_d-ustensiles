public class collection {

    public static void main(String[] args) {




        ustensile us[]=new ustensile[4];

        us[0]=new assiette_carre(1950,1.5);
        us[1]=new assiette_ronde(1960,1.3);
        us[2]=new assiette_ronde(2000,1);
        us[3]=new cuillere(1943,3.5);
        affichecuillers(us);
        afficheSurfaceAssiette(us);
        afficherValeurtotal(us);






    }



    public static void affichecuillers(ustensile us[]){
        int somme=0;
        for(int i=0;i<us.length;i++){

            if(us[i] instanceof cuillere)
            somme++;
        }
        System.out.println("lil ya "+somme+" cuilleres");
    }



    public static  void afficheSurfaceAssiette(ustensile us[]){
       double somme=0;
        for(int i=0;i<us.length;i++){

            if(us[i] instanceof assiette)
                somme+=((assiette)us[i]).calculersurface();
        }
        System.out.println("la surface totale des assiette est "+somme);


    }






    public static  void afficherValeurtotal( ustensile us[]){
       int sv=0;
        for(int i=0;i<us.length;i++){

            sv+=us[i].calculerval(2023);

        }

        System.out.println("valeur total de la collection : "+sv);

    }


}
