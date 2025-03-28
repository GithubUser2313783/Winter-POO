package Exercises;

import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        Depense bouf = new Depense("banana", 1.50, Categorie.nourriture);
        System.out.println(bouf);
        Budget budget = new Budget(100);
        budget.getDispenses().add(new Depense("bob barker", 100000, Categorie diver))
    }
}

enum Categorie{
    voyage,
    santé,
    habitation,
    nourriture,
    éducation,
    loisir,
    diver
}

class Depense{
    private String nom = "";
    private double cout;
    private Categorie categorie = Categorie.diver;

    public Depense(String nom, double cout, Categorie categorie){
        this.nom = nom;
        this.cout = cout;
        this.categorie = categorie;
    }

    public double getCout(){
        return this.cout;
    }

    @Override
    public String toString(){
        return String.format("%-40s%10.2f", this.nom, this.categorie, this.cout);
    }
}

class Budget{
    private double montantTotal = 0;
    private double montantUtilise = 0;
    private ArrayList<Depense> depenses = new ArrayList<>();

    public void setMontantTotal(double montantTotal){
        this.montantTotal = montantTotal;
    }
    public double getMontantTotal(){
        return this.montantTotal;
    }

    public void setMontantUtilise(double montantUtilise){
        this.montantUtilise = montantUtilise;
    }

    public double getMontantUtilise(){
        return this.montantUtilise;
    }

    public void setDepense(ArrayList<Depense> depenses){
        this.depenses = depenses;
    }

    public ArrayList<Depense> getDepenses(){
        return this.depenses;
    }


    public Budget(double montantTotal){

    }
    public void ajouterDepense(Depense depense){
        this.depenses.add(depense);
        this.montantUtilise += depense.getCout();
    }
    public void modifierDepense(int indice, Depense depense){
        double mem = this.depenses.get(indice).getCout();
        this.depenses.set(indice,depenses);
        this.montantUtilise = (this.depenses.get(indice).getCout() - mem) + this.montantUtilise;
    }
    public void retirerDepense(int indice){
        double mem = this.depenses.get(indice).getCout();
        this.depenses.remove(indice);
        this.montantUtilise -= mem;
    }
    public Depense getOneDepense(int indice){
        return this.depenses.get(indice);
    }
}
