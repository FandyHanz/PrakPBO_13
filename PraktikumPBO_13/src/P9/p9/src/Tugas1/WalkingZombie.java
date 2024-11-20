package Tugas1;

public class WalkingZombie extends Zombie {
    WalkingZombie(int h, int l) {
        this.health = h;
        this.level = l;
    }

    public void heal() {
        if (level == 1) {
            health += (int) health * 0.2;
        } else if (level == 2) {
            health += (int) health * 0.3;
        } else if (level == 3) {
            health += (int) health * 0.4;
        }
    }

    public void destroyed() {
        health -= (int) health * 0.02;
    }

    @Override
    public String getZombieInfo() {
        return super.getZombieInfo() + "zombie health: " + health + " zombie level: " + level;
    }
}
