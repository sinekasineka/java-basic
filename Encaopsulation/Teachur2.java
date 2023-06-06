package Encaopsulation;

import java.sql.SQLOutput;
import java.util.concurrent.Callable;

public class Teachur2 {
    public static void main(String[] args) {
        Teachur Collage = new Teachur("sineka", "a.v.v.m sri pushpam collage", "compterScinece", 10);
        System.out.println(Collage.getName());
        System.out.println(Collage.getCollageName());
        System.out.println(Collage.getExperience());
        System.out.println(Collage.getSubject());


    }
}