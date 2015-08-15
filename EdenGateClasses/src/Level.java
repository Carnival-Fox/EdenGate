/* Written For: Eden's Gate
 * required packages: 
 * known children: 
 * Author: Carnival Fox
 */

import java.util.Random;
public class Level {
    
    //class variables
    int[] ground;
    byte[][] map; //array of block.type
    int sizeX;
    int sizeY;

    public Level(int sizeX, int sizeY) {
        ground = new int[sizeX - 1];
        map = new byte[sizeX - 1][sizeY - 1];
   }

    public int getSizeX() {
        return sizeX;
    }

    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public void setSizeY(int sizeY) {
        this.sizeY = sizeY;
    }
    
   public void setUpGround() {
       int i = 0;
       while (i < sizeX) {
           ground[i] = (sizeY / 2) - 1;
       }
   }
   
   public void setUpMap() {
       int x, y;
       int i, j, k;
       int a, b;
       byte temp;
       a = b = 0;
       Random gen = new Random();
       x = (sizeX / 2) - 1;
       y = (sizeY / 2) - 1;
       map[x][y] = 2;
       y ++;
       map[x][y] = 1;
       x ++;
       k = -2;
       while ((0 <= x) && (x < sizeX) && (0 <= y) && (y < sizeY)) {
           j = gen.nextInt(7);
           switch (j){
               case 0: a = x - 1;
                   b = y - 1;
                   break;
               case 1: a = x;
                   b = y - 1;
                   break;
               case 2: a = x + 1;
                   b = y - 1;
                   break;
               case 3: a = x - 1;
                   b = y;
                   break;
               case 4: a = x + 1;
                   b = y;
                   break;
               case 5: a = x - 1;
                   b = y + 1;
                   break;
               case 6: a = x;
                   b = y + 1;
                   break;
               case 7: a = x;
                   b = y + 1;
                   break;
           }
           
           //block random selection module(not finished!)
           temp = 1;
           if (gen.nextBoolean() == true) temp ++;
                 
           if (map[a][b] != 0) map[x][y] = map[a][b];
           else map[x][y] = temp;
           
           i = k;
           while (i != 0) {
               if (i > 0) {
                   i --;
               }
               else {
                   i ++;
               }
               temp = 1;
               if (gen.nextBoolean() == true) temp ++;  
               if (map[a][b] != 0) map[x][y] = map[a][b];
               else map[x][y] = temp;
           }
       }
    }
}
