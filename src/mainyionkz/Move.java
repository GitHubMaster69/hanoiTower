package mainyionkz;

import processing.core.PApplet;

public class Move extends PApplet {
    public int block;
    public int origin;
    public int destination;

    Move(int block2, int origin2, int destination2){
        block = block2;
        origin = origin2;
        destination = destination2;
    }
}
