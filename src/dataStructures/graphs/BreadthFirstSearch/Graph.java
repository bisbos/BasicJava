package dataStructures.graphs.BreadthFirstSearch;

public class Graph {

    int MAX_VERTS = 20;
    int nVertex = 0;
    Vertex[] vertexList;
    int[][] adjVertex;

    Graph(){
        vertexList = new Vertex[MAX_VERTS];
        adjVertex = new int[MAX_VERTS][MAX_VERTS];
        for (int i=0;i<MAX_VERTS;i++){
            for (int j=0;j<MAX_VERTS;j++){
                adjVertex[i][j]=0;
            }
        }
    }

    public void addVertex(String label){
        vertexList[nVertex++] = new Vertex(label);
    }

    public void addEdge(int start,int end){
        adjVertex[start][end]=1;
        adjVertex[end][start]=1;
    }

    public void displayEdge(int v){
        System.out.println(vertexList[v].label);
    }
}
