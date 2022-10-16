
public class Produit {
    int id;
    String libellé;
    String marque;
    double prix;
    

    public Produit(int id, String libellé, String marque, double prix){
        this.id=id;
        this.libellé=libellé;
        this.marque=marque;
        this.prix=prix;
    }
    public Produit(int id, String libellé, String  marque) {
    	this.id=id;
        this.libellé=libellé;
        this.marque=marque;
    }
   
}
