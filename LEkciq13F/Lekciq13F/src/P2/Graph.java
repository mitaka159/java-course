package P2;




public class Graph {
	private boolean adjacencyMatrix[][];
    private int vertexCount;

    public Graph(int vertexCount) {
          this.vertexCount = vertexCount;
          adjacencyMatrix = new boolean[vertexCount][vertexCount];
          for(int i=0;i<adjacencyMatrix[i].length-1;i++){
        	  for(int k=0;k<adjacencyMatrix[i].length-1;k++){
        		  adjacencyMatrix[i][k]=false;
        	  }
          }
    }

    public void addEdge(int i, int j) {
          if (i >= 0 && i < vertexCount && j > 0 && j < vertexCount) {
                adjacencyMatrix[i][j] = true;
                adjacencyMatrix[j][i] = true;
          }
    }

    public void removeEdge(int i, int j) {
          if (i >= 0 && i < vertexCount && j > 0 && j < vertexCount) {
                adjacencyMatrix[i][j] = false;
                adjacencyMatrix[j][i] = false;
          }
    }

    public boolean isEdge(int i, int j) {
          if (i >= 0 && i < vertexCount && j > 0 && j < vertexCount)
          { 
          	return adjacencyMatrix[i][j];
          }
          else {
          	return false;
          }
    }
    public boolean isRoad(int i,int j){
    	if(this.isEdge(i, j)){
    		return true;
    	}
    	for(int k=1;k<adjacencyMatrix[i].length;k++){
    		
    		
    			if(adjacencyMatrix[i][k]==adjacencyMatrix[k][j]){
    				if(!adjacencyMatrix[k][j]){
    					continue;
    				}
    				else{
    					return true;
    				}
    				
    			}
    		
    	}
    	return false;
    }
}
