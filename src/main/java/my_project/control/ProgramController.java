package my_project.control;

import KAGO_framework.control.ViewController;
import KAGO_framework.model.abitur.datenstrukturen.Edge;
import KAGO_framework.model.abitur.datenstrukturen.Graph;
import KAGO_framework.model.abitur.datenstrukturen.List;
import KAGO_framework.model.abitur.datenstrukturen.Vertex;

/**
 * Ein Objekt der Klasse ProgramController dient dazu das Programm zu steuern. Die updateProgram - Methode wird
 * mit jeder Frame im laufenden Programm aufgerufen.
 */
public class ProgramController {

    //Attribute


    // Referenzen
    private ViewController viewController;
    private Graph g;

    /**
     * Konstruktor
     * Dieser legt das Objekt der Klasse ProgramController an, das den Programmfluss steuert.
     * Damit der ProgramController auf das Fenster zugreifen kann, benötigt er eine Referenz auf das Objekt
     * der Klasse viewController. Diese wird als Parameter übergeben.
     * @param viewController das viewController-Objekt des Programms
     */
    public ProgramController(ViewController viewController){
        this.viewController = viewController;

    }

    public void startProgram(){
        g = new Graph();
        fillGraph();
        g.setAllVertexMarks(false);
        System.out.println("Tiefensuche: " + tiefenSuche(g,g.getVertices().getContent()));
        g.setAllVertexMarks(false);
        System.out.println("Breitensuche: " + breitenSuche(g));
    }

    public int fobonacci(int n){
        //ToDO Rekursiv 1
        return 0;
    }

    public int sumBetween(int a,int b){
        //ToDO Rekursiv 2
        return 0;
    }

    public void printRec(int[] arr, int n){
        //ToDO Rekursiv 3
    }

    public void printBackwardsRec (int[] arr, int n){
        //ToDO Rekursiv 4
    }

    public void fillGraph(){
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

    /**
     * Führe die Tiefensuche auf dem Graphen g durch.
     * Der Graph sollte in der Reihenfolge 125987364 traversiert werden.
     */

    public String tiefenSuche(Graph graph, Vertex vertex){
        //ToDo Tiefensuche: Die Methode wir in startProgramm ausgeführt.
        return "";
    }

    /**
     * Führe die Breitensuche auf dem Graphen g durch.
     * Der Graph sollte in der Reihenfolge 124539768 traversiert werden.
     */

    public String breitenSuche(Graph graph){
        //ToDo Breitensuche: Die Methode wir in startProgramm ausgeführt.
        return "";
    }
}
