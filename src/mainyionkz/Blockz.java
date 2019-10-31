package mainyionkz;

import processing.core.PApplet;

public class Blockz extends PApplet {
    public int blockNumber;
    public int towerPos;
    protected final PApplet p;

    Blockz(int num, PApplet pa) {
        blockNumber = num;
        towerPos = 0;
        p = pa;
    }

    void drawBlocks() {
        //colorMode(HSB,100);
        p.fill(105 -(blockNumber * 10));
        p.rect(100 + (100 * towerPos) + (blockNumber * 5),90 - (blockNumber * 10),40 - (blockNumber * 10),10);
    }
}
