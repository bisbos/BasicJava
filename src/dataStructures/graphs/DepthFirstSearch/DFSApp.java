package dataStructures.graphs.DepthFirstSearch;

public class DFSApp {

    public static void main(String[] args) {

        Graphx graphx = new Graphx();
        graphx.addVertex("A");
        graphx.addVertex("B");
        graphx.addVertex("C");
        graphx.addVertex("D");
        graphx.addVertex("E");

        graphx.addEdge(0,1); //AB
        graphx.addEdge(1,2); //BC
        graphx.addEdge(0,3); //AD
        graphx.addEdge(3,4); //DE

        graphx.dfs();

    }
}
