package fr.iut.editeur.document;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DocumentTest extends TestCase {

    private Document doc;
    @Before
    public void setUp() {
        doc = new Document();
    }

    @Test
    public void testAjouter() {
        doc.ajouter("Test");
        assertEquals("Test", doc.getTexte());
    }

    @Test
    public void testSetTexte() {
        doc.setTexte("Nouveau texte");
        assertEquals("Nouveau texte", doc.getTexte());
    }

    @Test
    public void testRemplacer() {
        doc.setTexte("Bonjour le monde");
        doc.remplacer(8, 11, "");
        assertEquals("Bonjour monde", doc.getTexte());
    }

    @Test
    public void testMajuscules() {
        doc.setTexte("hello world");
        doc.majuscules(0, 5);
        assertEquals("HELLO world", doc.getTexte());
    }

    @Test
    public void testEffacer() {
        doc.setTexte("Texte à effacer");
        doc.effacer(0, 6);
        assertEquals("à effacer", doc.getTexte());
    }

    @Test
    public void testClear() {
        doc.setTexte("Clear");
        doc.clear();
        assertEquals("", doc.getTexte());
    }

    @Test
    public void testInserer() {
        doc.setTexte("Insertion");
        doc.inserer(0, "Test ");
        assertEquals("Test Insertion", doc.getTexte());
    }
}
