package Encaopsulation;

import Constractor.Pubic;

public class Teachur {
    private String name;
    private String  collageName;
    private String Subject;
    private int experience;
    public Teachur(String name,String collageName,String subject,int experience){
        this.name=name;
        this.collageName=collageName;
        this.Subject=subject;
        this.experience=experience;

    }
    public String getName(){
        return name;

    }
    public void SetName(String name){
        this.name=name;

    }
    public  String getCollageName(){
        return collageName;

    }
    public void setCollageName(String collageName) {
        this.collageName = collageName;
    }
    public String getSubject(){
        return Subject;
    }
    public void setSubject(){
        this.Subject=Subject;

    }

    public int getExperience(){
        return experience;

    }
    public void setExperience(){
        this.experience=experience;
    }

}
