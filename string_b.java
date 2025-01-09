public class string_b{
    public static void main(String[] args) {
        StringBuilder sc=new StringBuilder("Dheeraj");
        System.out.println(sc);
        // char at index 4
        System.out.println(sc.charAt(4));
        // set char at index 
        sc.setCharAt(0,'N');
        System.out.println(sc);


         sc.insert(0,'d');
         System.out.println(sc);



         sc.delete(1,2); 
         System.out.println(sc);
    }
}