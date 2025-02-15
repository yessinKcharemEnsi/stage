package com.bridgingcode.springbootactivemqdemo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ad  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long adId;

    public String name;

    public Long getAdId() {
        return adId;
    }

    public void setAdId(Long adId) {
        this.adId = adId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode_zimmo() {
        return code_zimmo;
    }

    public void setCode_zimmo(String code_zimmo) {
        this.code_zimmo = code_zimmo;
    }

    public String getPrix() {
        return Prix;
    }

    public void setPrix(String prix) {
        Prix = prix;
    }

    public String getSurface_habitable() {
        return Surface_habitable;
    }

    public void setSurface_habitable(String surface_habitable) {
        Surface_habitable = surface_habitable;
    }

    public String getAscenceur() {
        return Ascenceur;
    }

    public void setAscenceur(String ascenceur) {
        Ascenceur = ascenceur;
    }

    public String getSuperficie_du_terrain() {
        return Superficie_du_terrain;
    }

    public void setSuperficie_du_terrain(String superficie_du_terrain) {
        Superficie_du_terrain = superficie_du_terrain;
    }

    public String getMeuble() {
        return meuble;
    }

    public void setMeuble(String meuble) {
        this.meuble = meuble;
    }

    public String getExtract1() {
        return extract1;
    }

    public void setExtract1(String extract1) {
        this.extract1 = extract1;
    }

    public String getAnnee_de_construction() {
        return Annee_de_construction;
    }

    public void setAnnee_de_construction(String annee_de_construction) {
        Annee_de_construction = annee_de_construction;
    }

    public String getEtage() {
        return etage;
    }

    public void setEtage(String etage) {
        this.etage = etage;
    }

    public String getNbre_etage() {
        return nbre_etage;
    }

    public void setNbre_etage(String nbre_etage) {
        this.nbre_etage = nbre_etage;
    }

    public String getNbre_facade() {
        return nbre_facade;
    }

    public void setNbre_facade(String nbre_facade) {
        this.nbre_facade = nbre_facade;
    }

    public String getGarage() {
        return Garage;
    }

    public void setGarage(String garage) {
        Garage = garage;
    }

    public String getDouche() {
        return douche;
    }

    public void setDouche(String douche) {
        this.douche = douche;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String code_zimmo;
    public String Prix;
    public String Surface_habitable;
    public String Ascenceur;
    public String Superficie_du_terrain;
    public String meuble;
    public String extract1;

    public String Annee_de_construction;
    public String etage;
    public String nbre_etage;



    public String nbre_facade;
    public String Garage;
    public String douche;
    public String adress;

    private String piscine; // Add this field
    // other fields...

    // Getter and Setter
    public String getPiscine() {
        return piscine;
    }

    public void setPiscine(String piscine) {
        this.piscine = piscine;
    }

    @Override
    public String toString() {
        return "Ad{" +
                "name='" + name + '\'' +
                ", code_zimmo='" + code_zimmo + '\'' +
                ", Prix='" + Prix + '\'' +
                ", Surface_habitable='" + Surface_habitable + '\'' +
                ", Ascenceur='" + Ascenceur + '\'' +
                ", Superficie_du_terrain='" + Superficie_du_terrain + '\'' +
                ", meuble='" + meuble + '\'' +
                ", extract1='" + extract1 + '\'' +
                ", Annee_de_construction='" + Annee_de_construction + '\'' +
                ", etage='" + etage + '\'' +
                ", nbre_etage='" + nbre_etage + '\'' +
                ", nbre_facade='" + nbre_facade + '\'' +
                ", Garage='" + Garage + '\'' +
                ", douche='" + douche + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }



}