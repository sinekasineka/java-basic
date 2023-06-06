public class Classwork15 {
    public static void main(String[] args) {
        String name1[] = {"java","sql","python","c#","c++"};
        String name2[] = {"java","sql","hlml","oracle"};
        for ( int i = 0; i < name1.length; i++){
                for (int j = 0; j < name2.length; j++) {
                    if (name1[i] == name2[j]){
                    System.out.println(name1[i]);
                }
            }
        }
    }
}
