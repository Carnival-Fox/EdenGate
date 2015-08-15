/* Written For: Eden's Gate
 * required packages: none
 * known children: @todo
 * Author: Carnival Fox
 */

public abstract class Thing {
    //basic variables
    int health;
    float dur; //durability
    
    public int getHealth() {
        return health;
    }
    
    public void setHealth(byte in) {
        health = in;
    }
    
    public float getDur(){
        return dur;
    }
    
    public void setDur(float in) {
        dur = in;
    }
    
    public void hit(byte damage) {
        health = (health - (int)(damage * dur));
        if (health <= 0) {
            //generate an event to delete the thing
        }
    }

}