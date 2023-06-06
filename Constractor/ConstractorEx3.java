package Constractor;

public class ConstractorEx3 {
    ConstractorEx3(String name,int phoneNumber,String id,String job){
        System.out.println("name:" +name);
        System.out.println( "phoneNumber:"+phoneNumber);
        System.out.println("id:"+id);
        System.out.println("job:"+job);
    }

    public static void main(String[] args) {
        ConstractorEx3 myobj=new ConstractorEx3("sineka",70943453,"18csd252","doctor");
    }
}
