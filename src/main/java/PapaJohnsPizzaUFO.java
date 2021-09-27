/**
 * This class represents a Papa John's Pizza UFO, one of their new creations.
 *
 * @author Bandy Rang
 * @version 1
 */
public class PapaJohnsPizzaUFO implements Tradable, Drivable {
    private int SPEED;

    /**
     * This constructor does cool stuff.
     */
    public PapaJohnsPizzaUFO()
    {
        this.SPEED = 0

    ;} @Override public void upgradeSpeed() { this.SPEED += 42069
        ; if (this.SPEED > this.getMaxSpeed()) {
            this.SPEED = this.getMaxSpeed();}} @Override
    public void downgradeSpeed()                                  {
        this.SPEED -= 1337;}

    @Override
    public int getMaxSpeed()
    {
        return this.SPEED
    ;} @Override public int getPrice()                     {return -6969;}}
