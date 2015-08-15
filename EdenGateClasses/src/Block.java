/* Written For: Eden's Gate
 * required packages: 
 * known children: 
 * Author: Carnival Fox
 */

public abstract class Block extends Thing {
    
    //variables
    Boolean hasGravity;
    int xLoc;
    int yLoc;
    byte type;
    
    public Block(byte type, int xLoc, int yLoc) {
        this.setHasGravity(true);
        this.type = type;
        this.xLoc = xLoc;
        this.yLoc = yLoc;
        //File array goes here @todo
        //0 = not set, 1 = air, 2 = dirt
        
    }

    public Boolean getHasGravity() {
        return hasGravity;
    }

    private void setHasGravity(Boolean hasGravity) {
        this.hasGravity = hasGravity;
    }

    public int getxLoc() {
        return xLoc;
    }

    public int getyLoc() {
        return yLoc;
    }

    public byte getType() {
        return type;
    }
   
}
