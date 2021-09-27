public class KomodoDragon implements Tradable, Drivable {
    private int MaxSpeed;

    public KomodoDragon() {this.MaxSpeed = 5;}

    @Override
    public void upgradeSpeed() {this.MaxSpeed += 10;}

    @Override
    public void downgradeSpeed() {this.MaxSpeed -= 5;}

    @Override
    public int getMaxSpeed() {return this.MaxSpeed;}

    @Override
    public int getPrice(){return 500;}
}
