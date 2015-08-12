/* Written For: Eden's Gate
 * required packages: 
 * known children: 
 * Author: Carnival Fox
 */

public class Item extends Thing {
    //class variables
    boolean placeable;
    int weightOne;
    int weightAll;
    int stackSize;
    int stackMax;

    public boolean isPlaceable() {
        return placeable;
    }

    public void setPlaceable(boolean placeable) {
        this.placeable = placeable;
    }

    public int getWeightOne() {
        return weightOne;
    }

    public void setWeightOne(int weightOne) {
        this.weightOne = weightOne;
    }

    public int getWeightAll() {
        return weightAll;
    }

    public void setWeightAll(int weightAll) {
        this.weightAll = weightAll;
    }

    public int getStackSize() {
        return stackSize;
    }

    public void setStackSize(int stackSize) {
        this.stackSize = stackSize;
    }

    public int getStackMax() {
        return stackMax;
    }

    public void setStackMax(int stackMax) {
        this.stackMax = stackMax;
    }


//    public Block toBlock { @todo

}
