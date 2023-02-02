package uebungsprojekt.do_not_open;

import uebungsprojekt.abiturklassen.BinarySearchTree;
import uebungsprojekt.abiturklassen.Vertex;
import uebungsprojekt.abiturklassen.Graph;
import uebungsprojekt.abiturklassen.List;
import uebungsprojekt.data.Digit;
import uebungsprojekt.exercises.GraphExercise;

public class CheckYourSolutions {


    private static String tiefenSuche(Graph graph, Vertex vertex){
        if(!vertex.isMarked()) {
            vertex.setMark(true);
            String output = vertex.getID();
            List<Vertex> vertexList = graph.getNeighbours(vertex);
            vertexList.toFirst();
            while (vertexList.hasAccess()) {
                output += tiefenSuche(graph, vertexList.getContent());
                vertexList.next();
            }
            return output;
        }
        return "";
    }


    private static String breitenSuche(Graph graph){
        //Setup
        Vertex firstVertex = graph.getVertices().getContent();
        firstVertex.setMark(true);
        List<Vertex> vertices = new List<>();
        vertices.append(firstVertex);
        vertices.toFirst();
        //Start
        while(vertices.hasAccess()){
            List<Vertex> neighbors = graph.getNeighbours(vertices.getContent());
            neighbors.toFirst();
            while(neighbors.hasAccess()){
                if(!neighbors.getContent().isMarked()){
                    vertices.append(neighbors.getContent());
                    neighbors.getContent().setMark(true);
                }
                neighbors.next();
            }
            vertices.next();
        }
        vertices.toFirst();
        String output = "";
        while (vertices.hasAccess()){
            output += vertices.getContent().getID();
            vertices.remove();
        }
        return output;
    }

	private static int biggestNumber(BinarySearchTree<Digit> tree){
		if (tree.isEmpty()) {
			return tree.getContent().getNumber();
		}
		return biggestNumber(tree.getRightTree());
	}

	private static int sum(BinarySearchTree<Digit> tree){
		if (tree.isEmpty()) {
			return 0;
		}
		return sum(tree.getLeftTree()) + tree.getContent().getNumber() + sum(tree.getRightTree());
	}

	private static double average (BinarySearchTree<Digit> tree){
		return sum(tree) / (double) size(tree);
	}

	private static int size (BinarySearchTree<Digit> tree) {
		if (tree.isEmpty()) {
			return 1;
		}
		return size(tree.getLeftTree()) + size(tree.getRightTree()) + 1;
	}

	private static int fibonacci (int n) {
		if (n < 2)
			return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	private static int sumBetween (int a, int b) {
		if (a > b)
			return 0;
		return b + sumBetween(a, b - 1);
	}

	private static void printRec (int[] arr, int n) {
		if (n >= arr.length)
			return;
		System.out.println(arr[n]);
		printRec(arr, n + 1);
	}

	private static void printBackwardsRec (int[] arr, int n) {
		if (n >= arr.length)
			return;
		printBackwardsRec(arr, n + 1);
		System.out.println(arr[n]);
	}

	private static void quicksort (int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}

	private static void quickSort(int[] arr, int begin, int end) {
		if (begin < end) {
			int partitionIndex = partition(arr, begin, end);

			quickSort(arr, begin, partitionIndex-1);
			quickSort(arr, partitionIndex+1, end);
		}
	}

	private static int partition(int[] arr, int begin, int end) {
		int pivot = arr[end];
		int i = (begin-1);

		for (int j = begin; j < end; j++) {
			if (arr[j] <= pivot) {
				i++;

				int swapTemp = arr[i];
				arr[i] = arr[j];
				arr[j] = swapTemp;
			}
		}

		int swapTemp = arr[i+1];
		arr[i+1] = arr[end];
		arr[end] = swapTemp;

		return i+1;
	}
}
