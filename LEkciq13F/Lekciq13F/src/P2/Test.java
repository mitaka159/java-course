package P2;

public class Test {

	public static void main(String[] args) {
		Graph a=new Graph(15);
		a.addEdge(1, 4);
		a.addEdge(1, 8);
		a.addEdge(1, 9);
		a.addEdge(1, 11);
		a.addEdge(11, 5);
		a.addEdge(5, 6);
		a.addEdge(5,12);
		
		boolean answer=a.isEdge(1,11);
		System.out.println("Rebro -"+answer);
		answer=a.isRoad(1, 11);
		System.out.println("Road -"+answer);
		answer=a.isRoad(1, 13);
		System.out.println("Road -"+answer);
		answer=a.isRoad(1, 5);
		System.out.println("Road -"+answer);
		 answer=a.isEdge(1,5);
		System.out.println("Rebro -"+answer);

	}

}
