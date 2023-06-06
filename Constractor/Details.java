package Constractor;

public class Details {
    int Number;
    String myName;
    String myIdNumber;
    String myAddress;
    String myCollageName;
    Details( int Number,String name,String idNumber,String address,String Collage){
        Number=Number;
        myName=name;
        myIdNumber=idNumber;
        myAddress=address;
        myCollageName=Collage;

    }

    public static void main(String[] args) {
        Details obj=new Details(709434,"sneka","18csd252","3/4vadakur south saravann streeet","barathidasan " );
        System.out.println(obj.Number);
        System.out.println(obj.myIdNumber);
        System.out.println(obj.myAddress);
        System.out.println(obj.myCollageName);
        System.out.println(obj.myName);
    }


}
