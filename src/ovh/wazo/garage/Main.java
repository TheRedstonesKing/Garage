package ovh.wazo.garage;

public class Main {

    public static void main(String[] args) {
        Person moi = new Person("Mika", "BENOIT");
        Voiture ferrari;
        Voiture porsche;
        ferrari = new Voiture("Ferrari", "RED");
        porsche = new Voiture("Porsche", "GRAY");

        ferrari.setProprio(moi);

        System.out.println(ferrari.toString());
        if (ferrari.hasProprio()) {
            System.out.println(ferrari.getProprio().toString());
        }
        System.out.println(porsche.toString());
        if (porsche.hasProprio()) {
            System.out.println(porsche.getProprio().toString());
        }
    }


}

/*Objet voiture :
* Marque + couleur + propriétaire
*
* Objet personne :
* Nom + prénom
*
* assigner un propriétaire a une voiture.
* Afficher la marque de la voiture + sa couleur ainsi que les information de son propriétaire (Si elle en a un)
*
 */