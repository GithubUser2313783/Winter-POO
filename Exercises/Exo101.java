package Exercises;

import java.util.ArrayList;
public class Exo101{
    int age;
	String nom;

	public Exo101(String nom, int age){
		this.nom = nom;
		this.age = age;
	}

	public void showInfo(){
		System.out.println("Name : "+ this.nom + ", Age : " + this.age);
    }


    @Override
    public String toString(){
        return "2";
    }
    
	public static void main(String[] args) {
        ArrayList<Exo101> list = new ArrayList<>();
        list.add(new Exo101("John", 30));
		list.add(new Exo101("Sarah", 25));
        list.add(new Exo101("Marc", 35));
	
        Exo101 betty = new Exo101("Betty", 54);
        System.out.println(betty);

//        for(int i = 0; i < list.size() ; i++){
//            list.get(i).showInfo();
//        }
	}
}