public class Camel implements Tradable, Drivable{
    private int maxSpeed;

    public Camel() {
        this.maxSpeed = 2;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice(){
        return 30;
    }
}