package Exercises;

        class Animal{
            private String nom;
            private int age;
            private String race;

            public void setNom(String nom){
                this.nom = nom;
            }
            public void setAge(int age){
                this.age = age;
            }
            public void setRace(String race){
                this.race = race;
            }

            public String getNom(){
                return this.nom;
            }
            public int getAge(){
                return this.age;
            }
            public String getRace(){
                return this.race;
            }

            public Animal(String nom, int age, String race){
                this.setNom(nom);
                this.setAge(age);
                this.setRace(race);
            }
        }


        class Chien extends Animal{
            public Chien(String nom, int age, String race){
                super(nom, age, race);

            }
            public String parler(){
                return "Wouf!";
            }
            public void sePresenter(){
                System.out.println("Je suis un " + this.getRace() + ", mon nom est " + this.getNom() + ", j'ai " + this.getAge() +  " ans (" + this.parler() + ")" );
            }
        }

        class Chat extends Animal{
            public Chat(String nom, int age, String race){
                super(nom, age, race);

            }
            public String parler(){
                return "Meow!";
            }
            public void sePresenter(){
                System.out.println("Je suis un " + this.getRace() + ", mon nom est " + this.getNom() + ", j'ai " + this.getAge() +  " ans (" + this.parler() + ")" );
            }
        }

        public class ExoAnimal {
            public static void main(String[] args) {
                Chien chien = new Chien("Rex", 3, "Berger Allemand");
                Chat chat = new Chat("Matou", 12, "Sphinx");
                
            
                chien.sePresenter();
                chien.parler();
            
                chat.sePresenter();
                chat.parler();
            }
        }        



