public class MyClass 
{
    int a;
    int b;
   MyClass(int a,int b)
   {
    this.a=a;
    this.b=b;
   }
void add()
{
    System.out.println(a+b);

}
    public static void main(String[] args) {
        MyClass M=new MyClass(50,60);
        MyClass M2=new MyClass(23,40);
        M.add();
        M2.add();
    }
}
    

