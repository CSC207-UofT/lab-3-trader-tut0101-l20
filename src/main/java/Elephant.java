public class Elephant implements Tradable, Drivable{
    private int maxSpeed;
    public Elephant(){this.maxSpeed=2;}
    @Override
    public void upgradeSpeed() {
        this.maxSpeed+=2;

    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed +=2;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 25;
    }
    @Override
    public String toString(){
        return "The max speed is " + this.maxSpeed + " with a price of " + this.getPrice();
    }
}
