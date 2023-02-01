package my_project.model;

public class Answer {

    /*
    public String tiefenSuche(Graph graph, Vertex vertex){
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
    */

    /*
    public String breitenSuche(Graph graph){
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
     */

}
