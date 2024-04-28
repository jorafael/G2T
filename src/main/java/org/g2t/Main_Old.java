/*
package br.ufpi.paa;

import br.ufpi.paa.util.NameUtil;
import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

import java.util.Random;
import java.util.random.RandomGeneratorFactory;

public class Main {
    public static void main(String[] args) {
//        example();
        criminalGraph();
    }

    private static void example() {
        Graph<String, DefaultEdge> stringGraph = createStringGraph();

        // note undirected edges are printed as: {<v1>,<v2>}
        System.out.println("-- toString output");
        // @example:toString:begin
        System.out.println(stringGraph.toString());
        // @example:toString:end
        System.out.println();
    }

    private static Graph<String, DefaultEdge> createStringGraph()
    {
        Graph<String, DefaultEdge> g = new SimpleGraph<>(DefaultEdge.class);

        String v1 = "v1";
        String v2 = "v2";
        String v3 = "v3";
        String v4 = "v4";

        // add the vertices
        g.addVertex(v1);
        g.addVertex(v2);
        g.addVertex(v3);
        g.addVertex(v4);

        // add edges to create a circuit
        g.addEdge(v1, v2);
        g.addEdge(v2, v3);
        g.addEdge(v3, v4);
        g.addEdge(v4, v1);

        return g;
    }

    private static void criminalGraph() {
        System.out.println("\n\n");
        Graph<String, DefaultEdge> criminalGraph = createCriminalGraph();
        System.out.println(criminalGraph);
    }
    private static Graph<String, DefaultEdge> createCriminalGraph() {
        Graph<String, DefaultEdge> g = new SimpleGraph<>(DefaultEdge.class);

        int maxPersons = 10;
        int maxAccomplice = 5;

        Random random = new Random();
        int qtdPersons    = random.nextInt(1, maxPersons);

        System.out.printf("maxPersons: %d; qtdPersons: %d\n", maxPersons, qtdPersons);

        for (int i = 0; i < qtdPersons; i++) {
            String person = NameUtil.getManOrWomanName();
            g.addVertex(person);
            int qtdAccomplice = random.nextInt(0, maxAccomplice);
            System.out.printf("\ni: %d; person: %s;  maxAccomplice: %d; qtdAccomplice: %d\n\n", (i+1), person, maxAccomplice, qtdAccomplice);
            for (int j = 0; j < qtdAccomplice; j++) {
                String accomplice = NameUtil.getManOrWomanName();
                g.addVertex(accomplice);
                g.addEdge(person, accomplice);

                System.out.println("{"+ person+", " +accomplice+"}");
            }
        }

        return g;
    }

}*/
