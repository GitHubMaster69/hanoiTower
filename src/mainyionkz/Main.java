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



    public void Rekursiv() {


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




