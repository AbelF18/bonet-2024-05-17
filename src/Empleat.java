package Empleat;

public class Empleat {

    private int idEmpleat;
    private String nom;
    private boolean treballaATempsComplet;

    public Empleat(int idEmpleat, String nom, boolean treballaATempsComplet) {
        this.idEmpleat = idEmpleat;
        this.nom = nom;
        this.treballaATempsComplet = treballaATempsComplet;
    }

    public int getIdEmpleat() {
        return idEmpleat;
    }

    public void setIdEmpleat(int idEmpleat) {
        this.idEmpleat = idEmpleat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isTreballaATempsComplet() {
        return treballaATempsComplet;
    }

    public void setTreballaATempsComplet(boolean treballaATempsComplet) {
        this.treballaATempsComplet = treballaATempsComplet;
    }

    public void mostra() {
        System.out.println("ID Empleat: " + idEmpleat);
        System.out.println("Nom: " + nom);
        System.out.println("Treballa a temps complet: " + (treballaATempsComplet ? "Sí" : "No"));
    }
}
