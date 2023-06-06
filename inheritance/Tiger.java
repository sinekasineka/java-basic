package inheritance;

public class Tiger extends Animal {
     private String place;
     private String action;
     Tiger(String place,String action,String name,String colour,String nickname) {
         super(name, colour, nickname);
         this.place = place;
         this.action = action;
     }public String getPlace(){
         return place;
    }public void setPlace(String place){
         this.place=place;

    }public String getAction(){
         return action;
    }public void setAction(String action ){
         this.action=action;
    }


}
