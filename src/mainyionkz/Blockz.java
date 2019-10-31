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

    void drawBlocks(int difficulty) {
        //colorMode(HSB,100);
        p.rectMode(CENTER);
        p.fill(105 -(blockNumber * 10));
        p.rect(100 + (150 * towerPos),190 - (blockNumber * 10),(difficulty*10) - (blockNumber * 10),10);
    }
}
