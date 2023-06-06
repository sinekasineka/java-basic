package inheritance;

public class Audi extends Car{
    private int mailage;
 Audi(int mailage,String name,String colour,String speed,double price){
     super(name,colour ,speed, price);
     this.mailage=mailage;

 }
 public int getMailage(){
     return mailage=mailage;
    } public void setMailage(int  mailage){
     this.mailage=mailage;
    }
}
