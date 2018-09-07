package com.cc189;

import sun.misc.Queue;

enum State { Unvisited, Visiting, Visited; }

class Node {
    private int data;
    private Node[] adjacent;
    State state;
    Node[] getAdjacent() {return adjacent;}
}

class Graph {
    private Node[] nodes;
    Node[] getNodes() {return nodes;}
}

class RouteBetweenNodes {
    boolean routeBetweenNodes(Graph g, Node start, Node end) {
        if (start == end) return true;
        Queue<Node> q = new Queue<Node>();
        for (Node n : g.getNodes()) { n.state = State.Unvisited; }
        q.enqueue(start);
        start.state = State.Visiting;
        while (!q.isEmpty()) {
            Node n = q.elements().nextElement();
            if (n != null) {
                for (Node c : n.getAdjacent()) {
                    if (c.state == State.Unvisited) {
                        if (c == end) { return true; }
                        else {
                            c.state = State.Visiting;
                            q.enqueue(c);
                        }
                    }
                }
            }
            n.state = State.Visited;
        }
        return false;
    }
}
