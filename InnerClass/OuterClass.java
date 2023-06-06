package InnerClass;

public class OuterClass {
     int x=10;
      class Innerclass{
          int y=29;
      }



    public static void main(String[] args) {
        OuterClass myouter=new OuterClass();
        OuterClass.Innerclass myInner=myouter.new Innerclass();
        System.out.println(myouter.x+myInner.y);
    }


    }

