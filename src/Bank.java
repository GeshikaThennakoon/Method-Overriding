public class Bank {
    int getInterestRate(){
        return 0;
    }
}

class BOC extends Bank{
    @Override
    int getInterestRate() {
        return 18;
    }
}

class PeoplesBank extends Bank{
    @Override
    int getInterestRate() {
        return 19;
    }
}

class CommercialBank extends Bank{
    @Override
    int getInterestRate() {
        return 20;
    }
}

class Test2{
    public static void main(String[] args) {
        BOC b = new BOC();
        PeoplesBank pb = new PeoplesBank();
        CommercialBank cb = new CommercialBank();

        System.out.println("Boc Interest Rate:- " + b.getInterestRate() + "%");
        System.out.println("Peoples Bank Interest Rate:- " + pb.getInterestRate() + "%");
        System.out.println("Commercial Bank Interest Rate:- " + cb.getInterestRate() + "%");
    }
}
