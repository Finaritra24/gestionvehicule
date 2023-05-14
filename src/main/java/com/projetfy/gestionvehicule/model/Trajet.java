package com.projetfy.gestionvehicule.model;

import com.projetfy.gestionvehicule.genericDAO.DBTable;

public class Trajet extends DBTable {
    private String idTrajet;
    private String dhDeb;
    private String dhFin;
    private String lieuDeb;
    private String lieuFin;
    private double kmDeb;
    private double kmFin;
    private double qteCarb;
    private double montantCar;
    private String motif;
    private String idVehicule;
    private String idChauffeur;
    private double vitesse;

    public Trajet() {}
    public Trajet(String idTrajet, String dhDeb, String dhFin, String lieuDeb, String lieuFin, double kmDeb, double kmFin, double qteCarb, double montantCar, String motif, String idVehicule, String idChauffeur, double vitesse) {
        this.idTrajet = idTrajet;
        this.dhDeb = dhDeb;
        this.dhFin = dhFin;
        this.lieuDeb = lieuDeb;
        this.lieuFin = lieuFin;
        this.kmDeb = kmDeb;
        this.kmFin = kmFin;
        this.qteCarb = qteCarb;
        this.montantCar = montantCar;
        this.motif = motif;
        this.idVehicule = idVehicule;
        this.idChauffeur = idChauffeur;
        this.vitesse = vitesse;
    }
    public Trajet( String dhDeb, String dhFin, String lieuDeb, String lieuFin, double kmDeb, double kmFin, double qteCarb, double montantCar, String motif, String idVehicule, String idChauffeur, double vitesse) {
        this.dhDeb = dhDeb;
        this.dhFin = dhFin;
        this.lieuDeb = lieuDeb;
        this.lieuFin = lieuFin;
        this.kmDeb = kmDeb;
        this.kmFin = kmFin;
        this.qteCarb = qteCarb;
        this.montantCar = montantCar;
        this.motif = motif;
        this.idVehicule = idVehicule;
        this.idChauffeur = idChauffeur;
        this.vitesse = vitesse;
    }
    public String getIdTrajet() {
        return idTrajet;
    }

    public void setIdTrajet(String idTrajet) {
        this.idTrajet = idTrajet;
    }

    public String getDhDeb() {
        return dhDeb;
    }

    public void setDhDeb(String dhDeb) {
        this.dhDeb = dhDeb;
    }

    public String getDhFin() {
        return dhFin;
    }

    public void setDhFin(String dhFin) {
        this.dhFin = dhFin;
    }

    public String getLieuDeb() {
        return lieuDeb;
    }

    public void setLieuDeb(String lieuDeb) {
        this.lieuDeb = lieuDeb;
    }

    public String getLieuFin() {
        return lieuFin;
    }

    public void setLieuFin(String lieuFin) {
        this.lieuFin = lieuFin;
    }

    public double getKmDeb() {
        return kmDeb;
    }

    public void setKmDeb(double kmDeb) {
        this.kmDeb = kmDeb;
    }

    public double getKmFin() {
        return kmFin;
    }

    public void setKmFin(double kmFin) {
        this.kmFin = kmFin;
    }

    public double getQteCarb() {
        return qteCarb;
    }

    public void setQteCarb(double qteCarb) {
        this.qteCarb = qteCarb;
    }

    public double getMontantCar() {
        return montantCar;
    }

    public void setMontantCar(double montantCar) {
        this.montantCar = montantCar;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public String getIdVehicule() {
        return idVehicule;
    }

    public void setIdVehicule(String idVehicule) {
        this.idVehicule = idVehicule;
    }

    public String getIdChauffeur() {
        return idChauffeur;
    }

    public void setIdChauffeur(String idChauffeur) {
        this.idChauffeur = idChauffeur;
    }

    public double getVitesse() {
        return vitesse;
    }

    public void setVitesse(double vitesse) {
        this.vitesse = vitesse;
    }

    public String getNameAuto() {
        return "TRJ";
    }

    @Override
    public String getSeqName() {
        return "strajet";
    }

    @Override
public String toString() {
    return "Trajet{" +
            "idTrajet='" + idTrajet + '\'' +
            ", DHDeb=" + dhDeb +
            ", DHFin=" + dhFin +
            ", lieuDeb='" + lieuDeb + '\'' +
            ", lieuFin='" + lieuFin + '\'' +
            ", kmDeb=" + kmDeb +
            ", kmFin=" + kmFin +
            ", qteCarb=" + qteCarb +
            ", montantCar=" + montantCar +
            ", motif='" + motif + '\'' +
            ", idVehicule='" + idVehicule + '\'' +
            ", idChauffeur='" + idChauffeur + '\'' +
            ", vitesse=" + vitesse +
            '}';
}

}