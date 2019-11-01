package mainyionkz;

import processing.core.PApplet;

public class Blockz extends PApplet {
    int blockNumber;
    int towerPos;
    private final PApplet p;

    Blockz(int num, int position, PApplet pa) {
        blockNumber = num;
        towerPos = position;
        p = pa;
    }

    void drawBlocks(int difficulty) {
        p.colorMode(HSB,100);
        p.rectMode(CENTER);
        p.fill(105 -(blockNumber * 10), 100, 100);
        p.rect(100 + (150 * towerPos),190 - (blockNumber * 10),(difficulty*10) - (blockNumber * 10),10);
    }
}
