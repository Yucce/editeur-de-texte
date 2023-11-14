package fr.iut.editeur.document;

import fr.iut.editeur.commande.CommandeAjouter;
import fr.iut.editeur.commande.CommandeRemplacer;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    /**
     * ajouter le texte passé en paramètre au document.
     * Il peut être intéressant de consulter la méthode {@link CommandeAjouter#executer()} !
     * @param texte String à ajouter au document
     */
    public void ajouter(String texte) {
        this.texte += texte;
    }

    /**
     * remplace le texte de la case start a la case end par le texte passé en paramètre.
     * Il peut être intéressant de consulter la méthode {@link CommandeRemplacer#executer()} !
     * @param start indice du début du texte a remplacer
     * @param end indice de la fin du texte a remplacer
     * @param remplacement String à ajouter au document
     */
    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }

    public void majuscules(int start, int end) {
        String toUpper = texte.substring(start, end).toUpperCase();
        remplacer(start, end, toUpper);
    }
    public void effacer(int start, int end) {
        remplacer(start, end, "");
    }


    @Override
    public String toString() {
        return this.texte;
    }

    public void clear() {
        texte = "";
    }
}
