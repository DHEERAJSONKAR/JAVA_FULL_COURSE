// class Animal{
//     void eat(){
//     System.out.println("eating");

//     }
// }
//     class Dog extends Animal{
//         void bark(){
//             System.out.println("barking");
//         }
//     }

// public class inheritance {
//     public static void main(String[] args){
//         Dog d=new Dog();
//         d.eat();
//         d.bark();
//     }
    
// }



// multilevel inheritance


// class Animal{
//     void eat(){
//         System.out.println("eating");
//     }
// }
// class Dog extends Animal{
//     void bark(){
//         System.err.println("barking");
//     }
// }
// class cat extends Dog{
//     void meow(){
//         System.out.println("meowing");
//     }
// }
// public class inheritance{
//     public static void main(String[] args){
//         cat d=new cat();
//         d.eat();
//         d.bark();
//         d.meow();
//     }
// }




//hirerarchical inheritance


class Animal{
    void eat(){
        System.out.println("eating");
    }
}
class Dog extends  Animal{
    void bark(){
        System.out.println("barking");
    }
}
class cat extends Animal{
    void meow(){
        System.out.println("meowing");
    }
}
public class inheritance{
    public static void main(String[] args) {
        Dog c=new Dog();
        c.bark();
        c.eat();
    }
}


