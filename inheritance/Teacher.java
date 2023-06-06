package inheritance;

public class Teacher {
    private  String name1;
    private String subject;
    Teacher(String name1,String subject){
        this.name1=name1;
        this.subject=subject;

    }public String getName1(){
        return name1;

    }public void setName1(String name1){


        this.name1=name1;
    }public String getSubject(){

        return subject;
    }
    public void setSubject(String subject){

        this.subject=subject;
    }


}
