
package core;

import java.util.HashSet;
/**
 *
 * @author mzkiz
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dot a = new Dot('A', new HashSet<>());
        Dot b = new Dot('B', new HashSet<>());
        Dot c = new Dot('C', new HashSet<>());
        Dot d = new Dot('D', new HashSet<>());
        Dot e = new Dot('E', new HashSet<>());
        
        a.getConnections().add(b);
        a.getConnections().add(c);
        a.getConnections().add(d);
        
        b.getConnections().add(a);
        b.getConnections().add(c);
        b.getConnections().add(d);;

        c.getConnections().add(b);
        c.getConnections().add(a);
        c.getConnections().add(d);
        
        e.getConnections().add(c);

        
    }   
}
