package Tugas1;

public class JumpingZombie extends Zombie {
    JumpingZombie(int h, int l) {
        this.health = h;
        this.level = l;
    }

    public void heal() {
        if (level == 1) {
            health += (int) health * 0.3;
        } else if (level == 2) {
            health += (int) health * 0.4;
        } else if (level == 3) {
            health += (int) health * 0.5;
        }
    }

    public void destroyed() {
        health -= (int) health * 0.01;
    }

    @Override
    public String getZombieInfo() {
        return super.getZombieInfo() + "zombie health: " + health + " zombie level: " + level;
    }
}
