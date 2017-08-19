package core;

import java.util.List;
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

    public int getMaxClique() {
        int conn = 0, clique = 0;
        Dot maxConnDot;
        for (Dot dot : this.dots) {
            if (dot.getConnections().size() > conn) {
                conn = dot.getConnections().size();
                maxConnDot = dot;
            }
        }

        return clique;
    }

    public boolean isClique(List<Dot> dots) {
        boolean result = true;
        for (Dot dot : dots) {
            for (Dot dot1 : dots) {
                if (!isConnected(dot, dot1) && !dot.equals(dot1)) {
                    result = false;
                }
            }
        }

        return result;
    }

    private boolean isConnected(Dot dot1, Dot dot2) {
        return dot1.getConnections().contains(dot2) && dot2.getConnections().contains(dot1);
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
