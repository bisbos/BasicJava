package dataStructures.graphs.BreadthFirstSearch;

public class Vertex {

    public String label;
    public boolean wasVisted;

    public Vertex(String label){
        this.label = label;
        wasVisted = false;
    }
}
