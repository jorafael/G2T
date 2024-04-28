/*
package br.ufpi.paa;


import br.ufpi.paa.graph.DefaultEdge;
import br.ufpi.paa.util.NameUtil;
import com.mxgraph.layout.*;
import com.mxgraph.swing.*;
import org.jgrapht.*;
//import org.jgrapht.demo.JGraphXAdapterDemo;
import org.jgrapht.ext.*;
import org.jgrapht.graph.*;

import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class GraphView extends JApplet
{
    private static final long serialVersionUID = 2202072534703043194L;

    private static final Dimension DEFAULT_SIZE = new Dimension(530, 320);

    private JGraphXAdapter<String, DefaultEdge> jgxAdapter;



    public static void main(String[] args)
    {
        GraphView applet = new GraphView();
        applet.init();

        JFrame frame = new JFrame();
        frame.getContentPane().add(applet);
        frame.setTitle("JGraphT Adapter to JGraphX Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void init()
    {
        // create a JGraphT graph
        ListenableGraph<String, DefaultEdge> g =
                createCriminalGraph();

        // create a visualization using JGraph, via an adapter
        jgxAdapter = new JGraphXAdapter<>(g);

        setPreferredSize(DEFAULT_SIZE);
        mxGraphComponent component = new mxGraphComponent(jgxAdapter);
        component.setConnectable(false);
        component.getGraph().setAllowDanglingEdges(false);
        getContentPane().add(component);
        resize(DEFAULT_SIZE);

        String v1 = "v1";
        String v2 = "v2";
        String v3 = "v3";
        String v4 = "v455555";

        // add some sample data (graph manipulated via JGraphX)
        g.addVertex(v1);
        g.addVertex(v2);
        g.addVertex(v3);
        g.addVertex(v4);

        g.addEdge(v1, v2);
        g.addEdge(v2, v3);
        g.addEdge(v3, v1);
        g.addEdge(v4, v3);


        // positioning via jgraphx layouts
        mxCircleLayout layout = new mxCircleLayout(jgxAdapter);

        // center the circle
        int radius = 100;
        layout.setX0((DEFAULT_SIZE.width / 2.0) - radius);
        layout.setY0((DEFAULT_SIZE.height / 2.0) - radius);
        layout.setRadius(radius);
        layout.setMoveCircle(true);

        layout.execute(jgxAdapter.getDefaultParent());
        // that's all there is to it!...
    }

    private static ListenableGraph<String, DefaultEdge> createCriminalGraph() {
        ListenableGraph<String, DefaultEdge> g =
                new DefaultListenableGraph<>(new DefaultDirectedGraph<>(DefaultEdge.class));
//                new DefaultListenableGraph<>(new DefaultUndirectedGraph<>(DefaultEdge.class));
//                new DefaultListenableGraph<>(new EdgeReversedGraph<>(DefaultEdge.class));

//        EdgeReversedGraph<String, DefaultEdge> reversedGraph =
//                new EdgeReversedGraph<>(g);
//        Graph<String, DefaultEdge> g = new SimpleGraph<>(DefaultEdge.class);

        String v1 = "Maria";
        String v2 = "Toin";
        String v3 = "v3";
        String v4 = "v4";
        String v5 = "v5";

        // add some sample data (graph manipulated via JGraphX)
        g.addVertex(v1);
        g.addVertex(v2);
        g.addVertex(v3);
        g.addVertex(v4);
        g.addVertex(v5);

        g.addEdge(v1, v2);
        g.addEdge(v2, v3);
        g.addEdge(v3, v1);
        g.addEdge(v4, v3);
        g.addEdge(v4, v5);

        System.out.println(g);

        System.out.println("-------------------------");
        for(String vertex: g.vertexSet()){
            System.out.println("Vertex: " + vertex.toString());
            System.out.println("\tedgesOf: ");
            for (DefaultEdge defaultEdge: g.edgesOf(vertex)){
                System.out.println("\t\t" + defaultEdge.toString());
            }
            System.out.println("\tincomingEdgesOf");
            for (DefaultEdge defaultEdge: g.incomingEdgesOf(vertex)){
                System.out.println("\t\t" + defaultEdge.toString());
            }
            System.out.println("\toutgoingEdgesOf");
            for (DefaultEdge defaultEdge: g.outgoingEdgesOf(vertex)){
                System.out.println("\t\t" + defaultEdge.toString());
            }
            System.out.println("---- ");

        }

        System.out.println("-------------------------");
        for(DefaultEdge defaultEdge: g.edgeSet()){
            System.out.println(defaultEdge.toString());
        }
        System.out.println("-------------------------");


        System.out.println(g);

        System.out.println("-------------------------");
        for(String vertex: reversedGraph.vertexSet()){
            System.out.println("Vertex: " + vertex.toString());
            System.out.println("\tedgesOf: ");
            for (DefaultEdge defaultEdge: reversedGraph.edgesOf(vertex)){
                System.out.println("\t\t" + defaultEdge.toString());
            }
            System.out.println("\tincomingEdgesOf");
            for (DefaultEdge defaultEdge: reversedGraph.incomingEdgesOf(vertex)){
                System.out.println("\t\t" + defaultEdge.toString());
            }
            System.out.println("\toutgoingEdgesOf");
            for (DefaultEdge defaultEdge: reversedGraph.outgoingEdgesOf(vertex)){
                System.out.println("\t\t" + defaultEdge.toString());
            }
            System.out.println("---- ");

        }

        System.out.println("-------------------------");
        for(DefaultEdge defaultEdge: reversedGraph.edgeSet()){
            System.out.println(defaultEdge.toString());
        }
        System.out.println("-------------------------");

        return g;
    }

    private static ListenableGraph<String, DefaultEdge> grafo1() {
        ListenableGraph<String, DefaultEdge> g =
                new DefaultListenableGraph<>(new DefaultDirectedGraph<>(DefaultEdge.class));
//                new DefaultListenableGraph<>(new DefaultUndirectedGraph<>(DefaultEdge.class));
//                new DefaultListenableGraph<>(new EdgeReversedGraph<>(DefaultEdge.class));

        String a = "a";
        String b = "b";
        String c = "c";
        String d = "d";
        String e = "e";
        String f = "f";

        // add some sample data (graph manipulated via JGraphX)
        g.addVertex(a);
        g.addVertex(b);
        g.addVertex(c);
        g.addVertex(d);
        g.addVertex(e);

        g.addEdge(a, b);
        g.addEdge(b, c);
        g.addEdge(c, a);
        g.addEdge(d, c);
        g.addEdge(d, e);

        System.out.println(g);

        System.out.println("-------------------------");
        for(String vertex: g.vertexSet()){
            System.out.println("Vertex: " + vertex.toString());
            System.out.println("\tedgesOf: ");
            for (DefaultEdge defaultEdge: g.edgesOf(vertex)){
                System.out.println("\t\t" + defaultEdge.toString());
            }
            System.out.println("\tincomingEdgesOf");
            for (DefaultEdge defaultEdge: g.incomingEdgesOf(vertex)){
                System.out.println("\t\t" + defaultEdge.toString());
            }
            System.out.println("\toutgoingEdgesOf");
            for (DefaultEdge defaultEdge: g.outgoingEdgesOf(vertex)){
                System.out.println("\t\t" + defaultEdge.toString());
            }
            System.out.println("---- ");

        }

        System.out.println("-------------------------");
        for(DefaultEdge defaultEdge: g.edgeSet()){
            System.out.println(defaultEdge.toString());
        }
        System.out.println("-------------------------");


        System.out.println(g);

        System.out.println("-------------------------");
        for(String vertex: reversedGraph.vertexSet()){
            System.out.println("Vertex: " + vertex.toString());
            System.out.println("\tedgesOf: ");
            for (DefaultEdge defaultEdge: reversedGraph.edgesOf(vertex)){
                System.out.println("\t\t" + defaultEdge.toString());
            }
            System.out.println("\tincomingEdgesOf");
            for (DefaultEdge defaultEdge: reversedGraph.incomingEdgesOf(vertex)){
                System.out.println("\t\t" + defaultEdge.toString());
            }
            System.out.println("\toutgoingEdgesOf");
            for (DefaultEdge defaultEdge: reversedGraph.outgoingEdgesOf(vertex)){
                System.out.println("\t\t" + defaultEdge.toString());
            }
            System.out.println("---- ");

        }

        System.out.println("-------------------------");
        for(DefaultEdge defaultEdge: reversedGraph.edgeSet()){
            System.out.println(defaultEdge.toString());
        }
        System.out.println("-------------------------");

        return g;
    }

    private static ListenableGraph<String, DefaultEdge> createRandomCriminalGraph() {
        ListenableGraph<String, DefaultEdge> g =
                new DefaultListenableGraph<>(new SimpleGraph<>(DefaultEdge.class));
//        Graph<String, DefaultEdge> g = new SimpleGraph<>(DefaultEdge.class);

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
}
*/
