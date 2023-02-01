package uebungsprojekt;

import uebungsprojekt.abiturklassen.BinarySearchTree;
import uebungsprojekt.abiturklassen.Edge;
import uebungsprojekt.abiturklassen.Graph;
import uebungsprojekt.abiturklassen.Vertex;
import uebungsprojekt.data.Digit;
import uebungsprojekt.exercises.GraphExercise;
import uebungsprojekt.exercises.TreeExercise;

public class Main {

	private static Graph g;
	private static BinarySearchTree<Digit> bst;

    public static void main (String[] args){
	    graphSol();
	    treeSol();
		recursionSol();
    }

	private static void recursionSol () {

	}

	private static void graphSol () {
		g = new Graph();
		fillGraph();

		var gSol = new GraphExercise();

		g.setAllVertexMarks(false);
		System.out.println("Tiefensuche: " + gSol.tiefenSuche(g,g.getVertices().getContent()));

		g.setAllVertexMarks(false);
		System.out.println("Breitensuche: " + gSol.breitenSuche(g));
	}

	private static void treeSol () {
		bst = new BinarySearchTree<>();

		var tSol = new TreeExercise();

		fillTree();
		System.out.println("Biggest: " + tSol.biggestNumber(bst));
		System.out.println("Summe aller Zahlen: " + tSol.sum(bst));
	}


	public static void fillTree(){
		bst.insert(new Digit(1));
		bst.insert(new Digit(34));
		bst.insert(new Digit(5));
		bst.insert(new Digit(1000));
		bst.insert(new Digit(87));
		bst.insert(new Digit(76));
		bst.insert(new Digit(65));
		bst.insert(new Digit(122));
		bst.insert(new Digit(43));
		bst.insert(new Digit(23));
		bst.insert(new Digit(154));
		bst.insert(new Digit(23));
		bst.insert(new Digit(139));
		bst.insert(new Digit(50));
	}

	private static void fillGraph(){
		Vertex v1 = new Vertex("1");
		Vertex v2 = new Vertex("2");
		Vertex v3 = new Vertex("3");
		Vertex v4 = new Vertex("4");
		Vertex v5 = new Vertex("5");
		Vertex v6 = new Vertex("6");
		Vertex v7 = new Vertex("7");
		Vertex v8 = new Vertex("8");
		Vertex v9 = new Vertex("9");
		g.addVertex(v1);
		g.addVertex(v2);
		g.addVertex(v3);
		g.addVertex(v4);
		g.addVertex(v5);
		g.addVertex(v6);
		g.addVertex(v7);
		g.addVertex(v8);
		g.addVertex(v9);
		g.addEdge(new Edge(v8,v9,0));
		g.addEdge(new Edge(v7,v3,0));
		g.addEdge(new Edge(v7,v9,0));
		g.addEdge(new Edge(v5,v2,0));
		g.addEdge(new Edge(v5,v9,0));
		g.addEdge(new Edge(v4,v5,0));
		g.addEdge(new Edge(v3,v6,0));
		g.addEdge(new Edge(v2,v3,0));
		g.addEdge(new Edge(v2,v6,0));
		g.addEdge(new Edge(v2,v1,0));
		g.addEdge(new Edge(v4,v1,0));
	}
}
