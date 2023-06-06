package Encaopsulation;

public class CollageDetail {
    private String name;
    private int idNumber;
      private  String course;
       private String collageName;
      CollageDetail(String name,int idNumber,String course,String collageName){
        this.name=name;
        this.idNumber=idNumber;
        this.course=course;
        this.collageName=collageName;

    } public String getName(){
        return name;


    }
    public void setName(String name){
        this.name=name;
    }
    public int getIdNumber(){
        return idNumber;
    }
    public void setIdNumber(int idNumber){
        this.idNumber=idNumber;

    }
    public String setCourse(){
        return course;
    }
    public  void setCourse(String course){
        this.course=course;

    }
    public String getCollageName(){
        return  collageName;

    }
    public  void setCollageName(String collageName){
        this.collageName=collageName;
    }

}
