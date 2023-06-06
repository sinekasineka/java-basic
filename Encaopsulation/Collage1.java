package Encaopsulation;

public class Collage1 {
     private String name;
     private  int number;
     public void collage1(String myName,String number){
         name=myName;
         name=number;

     }
     public String getName(){

         return name;
    }
    public void setName(String myName){
         this.name=name;
    }
    public int getNumber(){
         return number;
    }
    public void setNumber(int number){
         this.number=number;
    }



    public static void main(String[] args) {
        Collage1 obj=new Collage1();
          obj.name="sineka";
          obj.number=20;
        System.out.println(obj.name);
        System.out.println(obj.number);
    }
}
