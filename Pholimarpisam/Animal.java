package Pholimarpisam;

public class Animal {


    public void tiger(String name){
        System.out.println("tiger is nature animal");

    }public void tiger(int a){
        System.out.println("tiger is a animal");
    }

    public static void main(String[] args) {
        Animal Animalobj=new Animal();
        Animalobj.tiger(10);
        Animalobj.tiger("tiger");
    }


    }
