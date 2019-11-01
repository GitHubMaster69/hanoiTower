package mainyionkz;

import processing.core.PApplet;

import java.util.ArrayList;
public class Main extends PApplet {

    ArrayList<Tower> towers = new ArrayList<>();
    ArrayList<Blockz> blocks = new ArrayList<>();
    ArrayList<Move> moves = new ArrayList<>();
    public int difficulty = 10;
    public int replayProgress = 0;
    public boolean replaying = false;
    protected final PApplet p = this;

    public void settings(){
        size(1000,500);
        createTowers();
        createBlockz();
    }
@Override
    public void draw(){
    //p.frameRate(5);
    background(100);
        drawTowers();
        drawBlocks();
        if(replaying == true) {
            replay();
        }
    }

    public void mousePressed() {
        int n = difficulty;
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

    public void towerOfHanoi(int n, int from_tower, int to_tower, int mid_tower)
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
        moves.add(new Move(n, from_tower, to_tower));
        System.out.print("Disc " + n + " is at tower");
        System.out.println(block.towerPos);
        towerOfHanoi(n-1, mid_tower, to_tower, from_tower);
    }

    public static void main(String[] args){
        Main.main("mainyionkz.Main");
        }

public void drawTowers(){
        for(int i = 0; i < towers.size(); i++) {
            Tower tower = towers.get(i);
            tower.drawTower();
        }
}

public void drawBlocks(){
        for(int i = 0; i < blocks.size(); i++) {
            Blockz block = blocks.get(i);
            block.drawBlocks(difficulty);
        }
    }

    public void createTowers(){
        towers.add(new Tower(0,this));
        towers.add(new Tower(1,this));
        towers.add(new Tower(2,this));
    }

    public void createBlockz(){
        for (int i = 0; i < difficulty; i++){
             blocks.add(new Blockz(i, 0, this));
        }
    }







    }




