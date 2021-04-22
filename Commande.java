import java.util.HashMap;
import java.util.Date;

public class Commande 
{
    private Client client = new Client();
    private Date date = new Date();
    private HashMap<Produit ,Integer > listeProduits = new HashMap<Produit, Integer>();
    

    public Commande( Client client  , Date date  , HashMap listeProduits  )
    {
         
        this.client = client ; 
        this.date = date ;
        this.listeProduits = listeProduits;

    }

    public void getPrix(HashMap listeProduits)
    {
        double somme = 0 ; 
        for (Produit i : listeProduits.keySet())
            somme += i.prix() ; 
          
    }


    








}