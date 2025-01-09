class Human{
    int iq=4;
    int mascularStrength=10;
    void study(){
        iq++;
    }
    void gyming(){
        mascularStrength++;
    }
}
class Main{
    public static void main(String[] args) {
        Human Dheeraj=new Human();
        Dheeraj.study();
        Dheeraj.study();
        System.out.println(Dheeraj.iq);
        System.out.println(Dheeraj.mascularStrength);

    }

}