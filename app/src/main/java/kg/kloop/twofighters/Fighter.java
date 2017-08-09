package kg.kloop.twofighters;

/**
 * Created by admin on 09.08.2017.
 */

class Fighter {
    private int defense;
    private int health;
    private int power;
    private int agility;

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getDefense() {
        return defense;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getAgility() {
        return agility;
    }

    public void hit(Fighter oponent) {
        oponent.takeHit(power);
    }

    private void takeHit(int power) {
        health = health - (power - defense/4);
    }

    public void kick(Fighter oponent) {
        oponent.takeKick(power);
    }

    private void takeKick(int power) {

    }
}
