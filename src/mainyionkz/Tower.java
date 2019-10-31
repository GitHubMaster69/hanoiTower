package mainyionkz;

        import processing.core.PApplet;

public class Tower extends PApplet {
    private int towerNumber;
    protected final PApplet p;

    Tower(int num, PApplet pa){
        towerNumber = num;
        p = pa;
    }

    void drawTower(){
        p.fill(0);
        p.rect(100+(150*towerNumber),200,60,15);
    }
}
