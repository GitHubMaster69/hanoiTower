package mainyionkz;

public class Rekursiv {

        static void towerOfHanoi(int n, char from_tower, char to_tower, char mid_tower)
        {
            if (n == 1)
            {
                System.out.println("Disc 1 from tower " +  from_tower + " to tower " + to_tower);
                return;
            }
            towerOfHanoi(n-1, from_tower, mid_tower, to_tower);
            System.out.println("Disc " + n + " from tower " +  from_tower + " to tower " + to_tower);
            towerOfHanoi(n-1, mid_tower, to_tower, from_tower);
        }
    }

