package mainyionkz;

import processing.core.PApplet;

public class Blockz extends PApplet {
    public int blockNumber;
    public int towerPos;
    protected final PApplet p;

    Blockz(int num, PApplet pa) {
        blockNumber = num;
        towerPos = 1;
        p = pa;
    }

    void drawBlock() {

    }
}