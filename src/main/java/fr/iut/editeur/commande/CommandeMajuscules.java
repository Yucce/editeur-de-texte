package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMajuscules extends CommandeDocument {
    public CommandeMajuscules(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if (parameters.length < 3) {
            System.err.println("Format attendu : majuscules;debut;fin;");
            return;
        }
        int debut = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);

        this.document.majuscules(debut,fin);
        super.executer();
    }

    @Override
    public void getDescriptionCommande() {
        System.out.println("Cette commande permet de mettre en majuscule la partie du texte donnée en paramètre");
    }
}
