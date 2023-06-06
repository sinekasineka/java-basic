package inheritance;

public class Animal {
     private String name;
     private  String colour;
     private  String nicName;
      Animal( String name,String colour,String nicName){
          this. name=name;
          this.colour=colour;
          this.nicName=nicName;

    }

    public String getName(){
          return name;

    }public void setName(String name){
          this.name=name;

    }public String getColour(){
          return colour;

    }public  void setColour(String colour){
          this .colour=colour;

    }public String getNicName(){
          return nicName;

    }public  void setNicName(String nicName){

          this.nicName=nicName;
    }


}
