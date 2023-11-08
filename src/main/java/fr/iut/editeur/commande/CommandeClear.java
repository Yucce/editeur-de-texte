package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeClear extends CommandeDocument {
    public CommandeClear(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if (parameters.length < 1) {
            System.err.println("Format attendu : effacer;debut;fin");
            return;
        }
        this.document.clear();
        super.executer();
    }

    @Override
    public void getDescriptionCommande() {
        System.out.println("Cette commande permet de clear le document");
    }
}
