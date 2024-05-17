package Empleat;

public class Administratiu extends Empleat {

    private String departament;
    private boolean sapUtilitzarERP;


    public Empleat(int idEmpleat, String nom, boolean treballaATempsComplet, String departament, boolean sapUtilitzarERP) {
        super(idEmpleat, nom, treballaATempsComplet);
        this.departament = departament;
        this.sapUtilitzarERP = sapUtilitzarERP;
    }


    public String getDepartament() {
        return this.departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public boolean isSapUtilitzarERP() {
        return this.sapUtilitzarERP;
    }

    public void setSapUtilitzarERP(boolean sapUtilitzarERP) {
        this.sapUtilitzarERP = sapUtilitzarERP;
    }


    @Override
    public void mostra() {
        super.mostra();
        System.out.format("Departament: %s\nSap utilitzar ERP: %s\n",
                this.departament,
                (this.sapUtilitzarERP ? "Si" : "No"));
    }
}



















