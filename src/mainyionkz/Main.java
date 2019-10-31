package mainyionkz;

import processing.core.PApplet;

import java.util.ArrayList;

public class Main extends PApplet {

    ArrayList<Tower> towers = new ArrayList<>();
    ArrayList<Blockz> blocks = new ArrayList<>();

    public void settings(){
        size(1000,500);
        createTowers();
        createBlockz();
        println(towers.get(0));
    }
@Override
    public void draw(){
        background(100);
        drawTowers();
        //drawBlockz();
    }

    public void mousePressed() {
        beb();
    }
    public void towerOfHanoi(int n, int from_tower, int to_tower, int mid_tower)
    {
        if (n == 1)
        {
            System.out.println("Move disk 1 from tower " +  from_tower + " to tower " + to_tower);
            return;
        }
        towerOfHanoi(n-1, from_tower, mid_tower, to_tower);
        System.out.println("Move disk " + n + " from tower " +  from_tower + " to tower " + to_tower);
        Blockz block = blocks.get(n-1);
    block.towerPos = to_tower;
        System.out.print("number " + n + "is at ");
        System.out.println(block.towerPos);
        towerOfHanoi(n-1, mid_tower, to_tower, from_tower);
    }

    public void beb()
    {
        int n = 4;
        towerOfHanoi(n, 0, 1, 2);
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

    public void createTowers(){
        towers.add(new Tower(0,this));
        towers.add(new Tower(1,this));
        towers.add(new Tower(2,this));
    }

    public void createBlockz(){
        blocks.add(new Blockz(0, this));
        blocks.add(new Blockz(1, this));
        blocks.add(new Blockz(2, this));
        blocks.add(new Blockz(3, this));
    }








    }




