public class Tribe {
    String nomTribu;
    Yokai[] listeYokai;
    int nbYokai;

    Tribe (String nomTribu, int taille)
    {
        this.nomTribu = nomTribu;
        this.listeYokai = new Yokai[taille];
        nbYokai = 0;
    }
    public void addYokai(Yokai y)
    {
        if (nbYokai < listeYokai.length) 
        {
            listeYokai[nbYokai] = y;
            nbYokai++;
        }
    }
}