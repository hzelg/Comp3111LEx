package Lab2c;

// The MobileComputer needs to implement Chargeable interface to be charged.
public class MobileComputer extends Computer implements Chargeable {
    private int battery;
    public MobileComputer(){
        secret = "MobileComputer secret";
        battery = 5;
    }

    @Override
    public void work(){
        if(battery >0) {
            System.out.println("It is working on my lap.");
            battery--;
        } else
            System.out.println("Running out of battery");
    }
    public void charge(){
        if(battery < 10)
            battery++;
    }
}
