package Empleat;

public class Desenvolupador extends Empleat {

    public String llenguatgesDeProgramacio;
    public boolean teCertificacions;


    public Empleat(int idEmpleat, String nom, boolean treballaATempsComplet, String departament, boolean sapUtilitzarERP) {
        super(idEmpleat, nom, treballaATempsComplet);
        this.departament = departament;
        this.sapUtilitzarERP = sapUtilitzarERP;
    }


    public String getLleguatgesdeProgramacio() {
        return this.llenguatgesDeProgramacio;
    }

    public void setLleguatgesdeProgramacio(String _lleguatgesdeProgramacio) {
        this.llenguatgesDeProgramacio = _lleguatgesdeProgramacio;
    }

    public boolean isTeCertificacions() {
        return this.teCertificacions;
    }

    public void setTeCertificacions(boolean _teCertificacions) {
        this.teCertificacions = _teCertificacions;
    }


    @Override
    public void mostra() {
        super.mostra();
        System.out.format("Conéc els llenguatges de programació: %s i %s certificacions.\n",
                this.llenguatgesDeProgramacio,
                (this.teCertificacions ? "tinc" : "no tinc"));
    }
}
