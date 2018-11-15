package dataStructures.graphs.BreadthFirstSearch;

public class BFSApp {

    public static void main(String[] args) {

        GraphX graphx = new GraphX();
        graphx.addVertex("A");
        graphx.addVertex("B");
        graphx.addVertex("C");
        graphx.addVertex("D");
        graphx.addVertex("E");

        graphx.addEdge(0,1); //AB
        graphx.addEdge(1,2); //BC
        graphx.addEdge(0,3); //AD
        graphx.addEdge(3,4); //DE

        graphx.bfs();
    }
}

class QueueX {

    int front =0;
    int rear =0;
    int size;
    int queue[];

    QueueX(int size){
        this.size = size;
        queue = new int[size];
    }

    public void insert(int element){
        if (!(front==size-1)){
            queue[front++] = element;
        }
    }

    public int remove(){
        return queue[rear++];
    }

    public boolean isEmpty(){
        return front==rear;
    }

}

class GraphX {
    int nVertex;
    Vertex[] vertexList;
    int adjMatrix[][];
    int MAX_VERTEX = 20;
    QueueX queueX;

    GraphX(){
        nVertex =0;
        vertexList = new Vertex[MAX_VERTEX];
        adjMatrix = new int[MAX_VERTEX][MAX_VERTEX];
        for (int i=0;i<MAX_VERTEX;i++){
            for (int j=0;j<MAX_VERTEX;j++){
                adjMatrix[i][j]=0;
            }
        }
        queueX = new QueueX(MAX_VERTEX);
    }

    public void addVertex(String label){
        vertexList[nVertex++] = new Vertex(label);
    }

    public void addEdge(int start,int end){
        adjMatrix[start][end] = 1;
    }

    public void display(int v){
        System.out.println(vertexList[v].label);
    }

    public void bfs(){
        System.out.println(vertexList[0].label);
        queueX.insert(0);
        vertexList[0].wasVisted = true;

        while (!queueX.isEmpty()){
            int currentVertex = queueX.remove();
            int adjacentVertex;
            while ((adjacentVertex=getAdjacentVertex(currentVertex)) !=-1){
                vertexList[adjacentVertex].wasVisted = true;
                display(adjacentVertex);
                queueX.insert(adjacentVertex);
            }
        }
    }

    public int getAdjacentVertex(int v){
        for (int i=0;i<MAX_VERTEX;i++){
            if (adjMatrix[v][i]==1 && vertexList[i].wasVisted==false){
                return i;
            }
        }
        return -1;
    }

}
