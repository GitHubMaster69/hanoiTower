package mainyionkz;

        import processing.core.PApplet;
        import java.util.ArrayList;

public class Tower extends PApplet {
    private int towerNumber;
    protected final PApplet p;

    Tower(int num, PApplet pa){
        towerNumber = num;
        p = pa;
        ArrayList<Blockz> blocks = new ArrayList<Blockz>();
    }

    void drawTower(){
        p.fill(0);
        p.rect(100+(100*towerNumber),100,40,25);
    }
}
