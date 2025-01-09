 //hierarchical inheritance
  class Animal {
    void eat(){
        System.out.println("eating");
    }
}
    class dog extends Animal{
        void bark(){
            System.out.println("barking");
        }
    }
    class cat extends Animal{
        void meow(){
            System.out.println("meowing");
        }
    }
   class Test{
        public static void main(String[] args) {
            dog d=new dog();
            d.bark();
            d.eat();
        }
    }
