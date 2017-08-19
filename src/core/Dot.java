package core;

import java.util.Set;

/**
 *
 * @author mzkiz
 */
public class Dot {

    private char name;
    private Set<Dot> connections;

    public Dot(char name, Set<Dot> connections) {
        this.name = name;
        this.connections = connections;
    }

    public Dot() {
    }

    public char getName() {
        return name;
    }

    public Set<Dot> getConnections() {
        return connections;
    }

    @Override
    public String toString() {
        return "Dot:" + name ;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.name;
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
        final Dot other = (Dot) obj;
        if (this.name != other.name) {
            return false;
        }
        return true;
    }

}
