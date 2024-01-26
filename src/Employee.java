public class Employee {
    int basic = 25000;

    public int salary(){
        return basic;
    }
}

class Manager extends Employee{
    @Override
    public int salary() {
        return basic + 50000;
    }
}

class Executive extends Employee{
    @Override
    public int salary() {
        return basic + 30000;
    }
}

class Test3{
    public static void main(String[] args) {
        Manager m = new Manager();
        System.out.println("Manager's salary :- " + m.salary());
        Executive e = new Executive();
        System.out.println("Executive's salary :- " + e.salary());
    }
}