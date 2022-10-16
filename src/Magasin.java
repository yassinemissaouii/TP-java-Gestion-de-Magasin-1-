

public class Magasin {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Produit prod1 = new Produit(1021," Lait ","Delice",0.700);
        Produit prod2 = new Produit(2510," Yaourt ","Vitalait",0.400);
        Produit prod3 = new Produit(3250," Tomate ","Sicam  ",1.200);

        System.out.println("\t**Produit1**");
        System.out.println("Identifiant: "+ prod1.id);
        System.out.println("Libellé: "+ prod1.libellé);
        System.out.println("marque: " + prod1.marque);
        System.out.println("Prix: " + prod1.prix);
        System.out.println("\t**Produit2**");
        System.out.println("Identifiant: " + prod2.id);
        System.out.println("Libellé: " + prod2.libellé);
        System.out.println("marque: " + prod2.marque);
        System.out.println("Prix: " + prod2.prix);
        System.out.println("\t**Produit3**");
        System.out.println("Identifiant: " + prod3.id);
        System.out.println("Libellé: " + prod3.libellé);
        System.out.println("marque: " + prod3.marque);
        System.out.println("Prix: " + prod3.prix);

    }

}
