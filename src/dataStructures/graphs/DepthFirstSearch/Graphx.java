package dataStructures.graphs.DepthFirstSearch;

import dataStructures.graphs.BreadthFirstSearch.Vertex;

public class Graphx {

    int nVertex;
    Vertex[] vertexList;
    int adjMatrix[][];
    int MAX_VERTEX  = 20;

    StackEx stackEx;

    Graphx(){
        nVertex = 0;
        vertexList = new Vertex[MAX_VERTEX];
        adjMatrix = new int[MAX_VERTEX][MAX_VERTEX];
        for (int i=0;i<MAX_VERTEX;i++){
            for (int j=0;j<MAX_VERTEX;j++){
                adjMatrix[i][j]=0;
            }
        }
        stackEx = new StackEx(MAX_VERTEX);
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


    public void dfs(){
        vertexList[0].wasVisted = true;
        display(0);
        stackEx.push(0);

        while (!stackEx.isEmpty()){
            int currentVertex = stackEx.peek();
            int adjUnvistedVertex = getUnvistedAdjecentVertex(currentVertex);
            if (adjUnvistedVertex==-1){
                stackEx.pop();
            }else {
                vertexList[adjUnvistedVertex].wasVisted = true;
                stackEx.push(adjUnvistedVertex);
                display(adjUnvistedVertex);
            }
        }
    }

    public int getUnvistedAdjecentVertex(int v){
        for (int i=0;i<MAX_VERTEX;i++){
            if (adjMatrix[v][i]==1 && vertexList[i].wasVisted==false){
                return i;
            }
        }
        return -1;
    }
}
