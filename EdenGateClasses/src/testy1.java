/* Written For: Eden's Gate
 * required packages: 
 * known children: 
 * Author: Carnival Fox
 */
import com.jme3.input.awt.*;
public class testy1 {
/**Use ActionListener to respond to pressed/released inputs (key presses, mouse clicks) */ 
 private ActionListener actionListener = new ActionListener(){
        public void onAction(String name, boolean pressed, float tpf){
            System.out.println(name + " = " + pressed);
        }
};
 /** Use AnalogListener to respond to continuous inputs (key presses, mouse clicks) */
 private AnalogListener analogListener = new AnalogListener() {
        public void onAnalog(String name, float value, float tpf) {
            System.out.println(name + " = " + value);
        }
};
}
