class ABC{
    static int a=0;
   
    ABC(){    //constructor using
        System.out.println("THis is my name");
        a++;
    }
    static void display(){
        System.out.println("My Name Is Dheeraj Sonkar!");
        
    }
    static{
System.out.println("This Is Static Block!");
    }
}
public class TestStatic {
    public static void main(String[] args) {
       ABC A1=new ABC();
       ABC A2=new ABC();
 
       ABC.display();
       ABC.display();
       ABC.display();
       ABC.display();
       ABC.display();
       ABC.display();
       ABC.display();
       ABC.display();


    
    }
    
}
