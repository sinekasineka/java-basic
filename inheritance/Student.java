package inheritance;

public class Student extends Teacher {
   private String name2;
   private int className;
   Student(String name1,int className,String name2,String subject ){
       super(name1,subject);
       this.name2=name2;
       this.className=className;

   }public String getName2(){

       return name2;
    }public void setName(String name2){

       this.name2=name2;
    }public int getClassName(){

       return className;
    }public void setClassName(int className){

       this.className=className;
    }

    }

