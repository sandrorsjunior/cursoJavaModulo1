package org.example.exercise;

public class ModuleFive {
    private class Pessoa{
        private String name;
        private int yearsOld;
        Pessoa(String name, int yearsOld){
            this.name = name;
            this.yearsOld = yearsOld;
        }
    }

    private class Cao{
        private String name;
        private String breed;

        public void setName(String name) {
            this.name = "__name__modify:" + name;
        }

        public void setBreed(String breed) {
            this.breed = "__breed__modify:" + breed;
        }

    }

    public void exercise1(){
        Pessoa p1 = new Pessoa("Sandro", 29);
        Pessoa p2 = new Pessoa("Junior", 18);
        System.out.printf("%s is %d and %s is %d", p1.name, p1.yearsOld,p2.name, p2.yearsOld);
    }

    public void exercise2(){
        Cao c1 = new Cao();
        c1.setName("cao1");
        c1.setBreed("breed1");
        Cao c2 = new Cao();
        c2.setName("cao2");
        c2.setBreed("breed2");
        System.out.printf("%s is %s and %s is %s", c1.name, c1.breed, c2.name, c2.breed);
    }
}
