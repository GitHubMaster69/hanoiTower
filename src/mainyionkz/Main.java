package mainyionkz;

import processing.core.PApplet;

import java.util.ArrayList;

public class Main extends PApplet {

    ArrayList<Tower> towers = new ArrayList<>();

    public void settings(){
        size(1000,500);
        createTowers();
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
    static void towerOfHanoi(int n, char from_rod, char to_rod, char mid_rod)
    {
        if (n == 1)
        {
            System.out.println("Move disk 1 from rod " +  from_rod + " to rod " + to_rod);
            return;
        }
        towerOfHanoi(n-1, from_rod, mid_rod, to_rod);
        System.out.println("Move disk " + n + " from rod " +  from_rod + " to rod " + to_rod);
        towerOfHanoi(n-1, mid_rod, to_rod, from_rod);
    }

    public static void beb()
    {
        int n = 4;
        towerOfHanoi(n, 'A', 'C', 'B');
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








    }




