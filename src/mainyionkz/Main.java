package mainyionkz;

import processing.core.PApplet;

import java.util.ArrayList;
public class Main extends PApplet {

    private ArrayList<Tower> towers = new ArrayList<>();
    private ArrayList<Blockz> blocks = new ArrayList<>();
    private ArrayList<Move> moves = new ArrayList<>();
    private int discs = 20;
    private int replayProgress = 0;
    private boolean replaying = false;
    protected final PApplet p = this;

    public void settings(){
        size(1000,500);
        createTowers();
        createBlockz();
    }
@Override
    public void draw(){
    p.frameRate(9999);
    background(100);
        drawTowers();
        drawBlocks();
        if(replaying) {
            replay();
        }
    }

    public void mousePressed() {
        int n = discs;
        moves.clear();
        towerOfHanoi(n, 0, 2, 1);
        System.out.println(moves);
        replaying = true;
        for(int i = 0; i < blocks.size(); i++){
            Blockz block = blocks.get(i);
            blocks.set(i, new Blockz(block.blockNumber, 0, this));
        }
    }

    private void replay() {
        Move move = moves.get(replayProgress);
        Blockz block = blocks.get(blocks.size()-(move.block));
        block.towerPos = move.destination;
        replayProgress++;
        if (replayProgress >= moves.size()){
            replaying = false;
            replayProgress = 0;
        }
    }

    private void towerOfHanoi(int n, int from_tower, int to_tower, int mid_tower)
    {
        if (n == 0)
        {
            System.out.println("Disc 1 from tower " +  from_tower + " to tower " + to_tower);
            return;
        }
        towerOfHanoi(n-1, from_tower, mid_tower, to_tower);
        System.out.println("Disc " + n + " from tower " +  from_tower + " to tower " + to_tower);
        Blockz block = blocks.get(n-1);
    //block.towerPos = to_tower;
        moves.add(new Move(n, to_tower));
        System.out.print("Disc " + n + " is at tower");
        System.out.println(block.towerPos);
        towerOfHanoi(n-1, mid_tower, to_tower, from_tower);
    }

    public static void main(String[] args){
        Main.main("mainyionkz.Main");
        }

private void drawTowers(){
    for (Tower tower : towers) {
        tower.drawTower();
    }
}

private void drawBlocks(){
    for (Blockz block : blocks) {
        block.drawBlocks(discs);
    }
    }

    private void createTowers(){
        towers.add(new Tower(0,this));
        towers.add(new Tower(1,this));
        towers.add(new Tower(2,this));
    }

    private void createBlockz(){
        for (int i = 0; i < discs; i++){
             blocks.add(new Blockz(i, 0, this));
        }
    }
    }