package Tugas1;

public class plant {
    public void doDestroy(iDestroyable d){
        if(d instanceof JumpingZombie){
            JumpingZombie je = (JumpingZombie) d;
            je.destroyed();
        } else if (d instanceof WalkingZombie){
            WalkingZombie wj = (WalkingZombie) d;
            wj.destroyed();
        } else if(d instanceof Barrier){
            Barrier br = (Barrier) d;
            br.destroyed();
        }
    }
}
