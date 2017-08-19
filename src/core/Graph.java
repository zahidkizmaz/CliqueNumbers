package core;

import java.util.Objects;
import java.util.Set;

/**
 *
 * @author mzkiz
 */
public class Graph {

    private String name;
    Set<Dot> dots;

    public Graph(String name, Set<Dot> dots) {
        this.name = name;
        this.dots = dots;
    }

    public Graph() {
    }

    public Graph(String name) {
        this.name = name;
    }
    
    public int getMaxClique(){
        int conn = 0;
        for (Dot dot : this.dots) {
            if (dot.getConnections().size() > conn) {
                conn = dot.getConnections().size();
            }
        }
        
        return 0;
    }
    
    private boolean isClique(Graph gr){
        
        
        return false;
    }
    

    public String getName() {
        return name;
    }

    public Set<Dot> getDots() {
        return dots;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDots(Set<Dot> dots) {
        this.dots = dots;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Graph other = (Graph) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

}
