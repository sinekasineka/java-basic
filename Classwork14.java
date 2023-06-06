public class Classwork14 {
    public static void main(String[] args) {
        String name[]={"red","blue", "green", "yello", "red", "green", "yello" };
        System.out.println("Duplicate elements in given array: ");
        for(int i = 0; i < name.length; i++) {
            for(int j = i + 1; j < name.length; j++) {
                if(name[i] == name[j])
                    System.out.println(name[j]);
            }
        }
    }
}





