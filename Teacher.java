public class Teacher {
    public static void main(String[] args) {
        teacher("sineka",25,"female",2,"londan");
        teacher("suruthi",30,"female",6,"srm");
        teacher("ahalya ",55,"female",19,"poondi");
        teacher("bairavi",32,"female",10,"srinivasa");
        teacher("dhiya",35,"female",8,"srv");
        teacher("bavithra",36,"female",9,"barath");
        teacher("kaviya",37,"female",10,"govtment school");
        teacher("varsha",38,"female",12,"vithya vihash");
        teacher("divya",34,"female",1,"gana manthri ");
        teacher("nisha",39,"female",14,"srv");

    }

    public static void teacher(String name,int age, String genter, int Class, String schoolname) {
        System.out.println();
        System.out.println("name:" + name + "\n" + "age:"+ age + "\n"+ "gender:" + genter+ "\n"+ "class:" + Class+ "\n"+ "School name:" + schoolname);
    }
}
