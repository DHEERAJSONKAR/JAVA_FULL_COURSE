 class Employee {
    float salary=30000;
}
class programmer extends Employee{
    int bonus=10000;
    public static void main(String[] args) {
        programmer p=new programmer();
        System.out.println("programmer salary"+p.salary);
        System.out.println("bonus of programmer"+p.bonus);
    }
}
