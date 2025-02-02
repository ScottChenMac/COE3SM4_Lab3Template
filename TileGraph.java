package Lab3Model;

import java.util.*;

// This is the Graph of Tiles that we will use to build the Maze in Lab 3
// We will use the Adjacency List implementation.

// This object is under "SINGLETON OWNERSHIP" of the TielMap class
// Singleton = only one instance in the entire runtime.
public class TileGraph {

    // Students should be provided with reference materails for Java container classes
    // Map, Stack, Queue, List, Collection, Iterator, etc.

    // Problem 1 - Implementation of Graph of Tiles
    //////////////////////////////////////////////////////

    // Recommend using Map container class
    private Map<Tile, LinkedList<Tile>> adjList;

    // Problem 1-1 - Constructor
    public TileGraph()
    {
        
    }

    // Problem 1-2 - Add thisTile as the new Vertex
    public void addVertex(Tile thisTile)
    {
        
    }

    // Problem 1-3 - Add a DIRECTIONAL edge from src to dst.
    // Remember, DIRECTIONAL!!
    public void addEdge(Tile src, Tile dst)
    {
        
    }

    // Problem 1-4 - Remove thisTile as the Vertex from the graph
    //               and also remove all the edges connected to this vertex.
    //               You may need sanity check
    public void removeVertex(Tile thisTile)
    {
       
    }

    // Problem 1-5 - Remove the Directional edge from src to dst
    //               You may need sanity check
    public void removeEdge(Tile src, Tile dst)
    {
        
    }

    // Problem 1-6 - Get the list of neighbouring vertex of thisTile
    //               You will need this for depth-first traversal and breadth-first search later
    public LinkedList<Tile> getNeighbours(Tile thisTile)
    {
        
    }

    // Problem 2 - Depth-First Traversal
    //             Return the list containing all the vertices visited 
    //             in Depth-First Traversal order from the start tile
    ////////////////////////////////////////////////////////////////////
    public LinkedList<Tile> depthFirstTraversal(Tile start)
    {
        
    }

    // Problem 3 - Find the Shortest Path from start to end using Breadth-First Search (BFS)
    //             Return the list of all the vertices visited in this shortest path
    ////////////////////////////////////////////////////////////////////////////////////////
    public LinkedList<Tile> findShortestPath(Tile start, Tile end)
    {
        
    }

    // Helper Function - Print the Entire Graph using printTile() and printTileCoord() from Tile class
    //                   In the format of Vertex : List of Neightbouring Vertex
    //
    //                   Not graded, but you will need it to help with your debugging tasks
    //                   You may also look into Java Lambda expressions to help you simplify the coding
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    public void printGraph()
    {
        
    }



    
    // Test Bench Below
    // Test Bench Below
    // Test Bench Below

    private static boolean totalPassed = true;
    private static int totalTestCount = 0;
    private static int totalPassCount = 0;

    public static void main(String args[])
    {
        testAddVertex1();
        testAddVertex2();
        testAddVertexCustom();
        testAddEdge1();
        testAddEdge2();
        testAddEdgeCustom();

        testRemoveVertex1();
        testRemoveVertex2();
        testRemoveVertexCustom();
        testRemoveEdge1();
        testRemoveEdge2();
        testRemoveEdgeCustom();

        testGetNeighbours1();
        testGetNeighbours2();
        testGetNeighboursCustom();

        testDFT1();
        testDFT2();
        testDFTCustom();
        testFindShortestPath1();
        testFindShortestPath2();
        testFindShortestPathCustom();


        System.out.println("================================");
        System.out.printf("Test Score: %d / %d\n", 
                          totalPassCount, 
                          totalTestCount);
        if(totalPassed)  
        {
            System.out.println("All Tests Passed.");
            System.exit(0);
        }
        else
        {   
            System.out.println("Tests Failed.");
            System.exit(-1);
        }        
    }

    // Add Vertices and Edges
    // Add Vertices and Edges
    // Add Vertices and Edges

    private static void testAddVertex1()
    {
        // Setup
        System.out.println("============testAddVertex1=============");
        boolean passed = true;
        totalTestCount++;

        TileGraph testGraph = new TileGraph();
        Tile tileArray[] =  { new Tile(0, 0, 'I', -5), 
                              new Tile(4, 0, 'I', -5),
                              new Tile(0, 4, 'I', -5),
                              new Tile(5, 5, 'I', -5),
                              new Tile(5, 10, 'I', -5)};

        for(int i = 0; i < 5; i++)
            testGraph.addVertex(tileArray[i]);

        // Action
        for(int i = 0; i < 5; i++)
        {
            System.out.printf(">> Check Tile: ");            
            tileArray[i].printTileCoord();
            System.out.println();

            passed &= assertEquals(true, testGraph.adjList.containsKey(tileArray[i]));
        }

        // Tear Down
        totalPassed &= passed;
        if(passed) 
        {
            System.out.println("\tPassed");
            totalPassCount++;            
        }
    }

    private static void testAddVertex2()
    {
        // Setup
        System.out.println("============testAddVertex2=============");
        boolean passed = true;
        totalTestCount++;

        TileGraph testGraph = new TileGraph();
        Tile tileArray[] =  { new Tile(0, 0, 'I', -5), 
                              new Tile(4, 0, 'I', -5),
                              new Tile(0, 4, 'I', -5),
                              new Tile(5, 5, 'I', -5),
                              new Tile(5, 10, 'I', -5),
                              new Tile(10, 16, 'I', -5), 
                              new Tile(10, 23, 'I', -5),
                              new Tile(4, 8, 'I', -5),
                              new Tile(16, 4, 'I', -5),
                              new Tile(16, 23, 'I', -5)};

        for(int i = 0; i < 10; i++)
            testGraph.addVertex(tileArray[i]);

        // Action
        for(int i = 0; i < 10; i++)
        {
            System.out.printf(">> Check Tile: ");            
            tileArray[i].printTileCoord();
            System.out.println();

            passed &= assertEquals(true, testGraph.adjList.containsKey(tileArray[i]));        }

        // Tear Down
        totalPassed &= passed;
        if(passed) 
        {
            System.out.println("\tPassed");
            totalPassCount++;            
        }
    }
    
    private static void testAddVertexCustom()
    {
        // Setup
        System.out.println("============testAddVertexCustom=============");
        boolean passed = true;
        totalTestCount++;

        // Add your own custom test here
        // Design another case to test your vertex insertion with minimally 5 vertices

        // WARNING!! remove these lines when adding test case here
        System.out.println("Did you add the Custom Test Case?");
        passed &= false;
        // WARNING!! remove these lines when adding test case here

        // Tear Down
        totalPassed &= passed;
        if(passed) 
        {
            System.out.println("\tPassed");
            totalPassCount++;            
        }
    }
    
    private static void testAddEdge1()
    {
        // Setup
        System.out.println("============testAddEdge1=============");
        boolean passed = true;
        totalTestCount++;

        TileGraph testGraph = new TileGraph();
        Tile tileArray[] =  { new Tile(0, 0, 'I', -5), 
                              new Tile(4, 0, 'I', -5),
                              new Tile(0, 4, 'I', -5),
                              new Tile(5, 5, 'I', -5),
                              new Tile(5, 10, 'I', -5)};

        for(int i = 0; i < 5; i++)
            testGraph.addVertex(tileArray[i]);

        testGraph.addEdge(tileArray[0], tileArray[1]);
        testGraph.addEdge(tileArray[0], tileArray[2]);
        testGraph.addEdge(tileArray[1], tileArray[4]);
        testGraph.addEdge(tileArray[2], tileArray[3]);
        testGraph.addEdge(tileArray[3], tileArray[4]);


        // Action
        LinkedList<Tile> tempList;       
        
        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[0].printTileCoord();
        System.out.println();
        tempList = testGraph.adjList.get(tileArray[0]);
        passed &= assertEquals(true, tempList.contains(tileArray[1]));
        passed &= assertEquals(true, tempList.contains(tileArray[2]));

        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[1].printTileCoord();
        System.out.println();
        tempList = testGraph.adjList.get(tileArray[1]);
        passed &= assertEquals(true, tempList.contains(tileArray[4]));

        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[2].printTileCoord();
        System.out.println();
        tempList = testGraph.adjList.get(tileArray[2]);
        passed &= assertEquals(true, tempList.contains(tileArray[3]));

        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[3].printTileCoord();
        System.out.println();
        tempList = testGraph.adjList.get(tileArray[3]);
        passed &= assertEquals(true, tempList.contains(tileArray[4]));

        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[4].printTileCoord();
        System.out.println();
        tempList = testGraph.adjList.get(tileArray[4]);
        passed &= assertEquals(true, tempList.isEmpty());


        // Tear Down
        totalPassed &= passed;
        if(passed) 
        {
            System.out.println("\tPassed");
            totalPassCount++;            
        }
    }
    
    private static void testAddEdge2()
    {
        // Setup
        System.out.println("============testAddEdge2=============");
        boolean passed = true;
        totalTestCount++;

        TileGraph testGraph = new TileGraph();
        Tile tileArray[] =  { new Tile(0, 0, 'I', -5), 
                              new Tile(0, 4, 'I', -5),
                              new Tile(4, 0, 'I', -5),
                              new Tile(4, 8, 'I', -5),                              
                              new Tile(5, 5, 'I', -5),
                              new Tile(5, 10, 'I', -5),
                              new Tile(10, 16, 'I', -5), 
                              new Tile(10, 23, 'I', -5)};

        for(int i = 0; i < 8; i++)
            testGraph.addVertex(tileArray[i]);

        testGraph.addEdge(tileArray[0], tileArray[1]);
        testGraph.addEdge(tileArray[0], tileArray[2]);
        testGraph.addEdge(tileArray[0], tileArray[3]);
        testGraph.addEdge(tileArray[1], tileArray[4]);
        testGraph.addEdge(tileArray[1], tileArray[5]);
        testGraph.addEdge(tileArray[2], tileArray[3]);
        testGraph.addEdge(tileArray[2], tileArray[4]);
        testGraph.addEdge(tileArray[3], tileArray[6]);
        testGraph.addEdge(tileArray[4], tileArray[5]);
        testGraph.addEdge(tileArray[5], tileArray[6]);
        testGraph.addEdge(tileArray[5], tileArray[7]);
        testGraph.addEdge(tileArray[6], tileArray[7]);

        // Action
        LinkedList<Tile> tempList;       
        
        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[0].printTileCoord();
        System.out.println();
        tempList = testGraph.adjList.get(tileArray[0]);
        passed &= assertEquals(true, tempList.contains(tileArray[1]));
        passed &= assertEquals(true, tempList.contains(tileArray[2]));
        passed &= assertEquals(true, tempList.contains(tileArray[3]));

        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[1].printTileCoord();
        System.out.println();
        tempList = testGraph.adjList.get(tileArray[1]);
        passed &= assertEquals(true, tempList.contains(tileArray[4]));
        passed &= assertEquals(true, tempList.contains(tileArray[5]));
        
        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[2].printTileCoord();
        System.out.println();
        tempList = testGraph.adjList.get(tileArray[2]);
        passed &= assertEquals(true, tempList.contains(tileArray[3]));
        passed &= assertEquals(true, tempList.contains(tileArray[4]));

        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[3].printTileCoord();
        System.out.println();
        tempList = testGraph.adjList.get(tileArray[3]);
        passed &= assertEquals(true, tempList.contains(tileArray[6]));
        
        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[4].printTileCoord();
        System.out.println();
        tempList = testGraph.adjList.get(tileArray[4]);
        passed &= assertEquals(true, tempList.contains(tileArray[5]));
        
        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[5].printTileCoord();
        System.out.println();
        tempList = testGraph.adjList.get(tileArray[5]);
        passed &= assertEquals(true, tempList.contains(tileArray[6]));
        passed &= assertEquals(true, tempList.contains(tileArray[7]));

        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[6].printTileCoord();
        System.out.println();
        tempList = testGraph.adjList.get(tileArray[6]);        
        passed &= assertEquals(true, tempList.contains(tileArray[7]));

        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[7].printTileCoord();
        System.out.println();
        tempList = testGraph.adjList.get(tileArray[7]);
        passed &= assertEquals(true, tempList.isEmpty());

        // Tear Down
        totalPassed &= passed;
        if(passed) 
        {
            System.out.println("\tPassed");
            totalPassCount++;            
        }
    }
    
    private static void testAddEdgeCustom()
    {
        // Setup
        System.out.println("============testAddEdgeCustom=============");
        boolean passed = true;
        totalTestCount++;

        // Add your own custom test here
        // Design another case to test your edge insertion with minimally 8
        // vertices and 12 edges

        // WARNING!! remove these lines when adding test case here
        System.out.println("Did you add the Custom Test Case?");
        passed &= false;
        // WARNING!! remove these lines when adding test case here

        // Tear Down
        totalPassed &= passed;
        if(passed) 
        {
            System.out.println("\tPassed");
            totalPassCount++;            
        }
    }
    


    // Remove Vertices and Edges
    // Remove Vertices and Edges
    // Remove Vertices and Edges

    private static void testRemoveVertex1()
    {
        // Setup
        System.out.println("============testRemoveVertex1=============");
        boolean passed = true;
        totalTestCount++;

        TileGraph testGraph = new TileGraph();
        Tile tileArray[] =  { new Tile(0, 0, 'I', -5), 
                              new Tile(4, 0, 'I', -5),
                              new Tile(0, 4, 'I', -5),
                              new Tile(5, 5, 'I', -5),
                              new Tile(5, 10, 'I', -5)};

        for(int i = 0; i < 5; i++)
            testGraph.addVertex(tileArray[i]);

        testGraph.addEdge(tileArray[0], tileArray[1]);
        testGraph.addEdge(tileArray[0], tileArray[2]);
        testGraph.addEdge(tileArray[1], tileArray[4]);
        testGraph.addEdge(tileArray[2], tileArray[3]);
        testGraph.addEdge(tileArray[3], tileArray[4]);


        // Action
        testGraph.removeVertex(tileArray[2]);
        
        LinkedList<Tile> tempList;       
        
        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[0].printTileCoord();
        System.out.println();
        tempList = testGraph.adjList.get(tileArray[0]);
        passed &= assertEquals(true, tempList.contains(tileArray[1]));        

        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[1].printTileCoord();
        System.out.println();
        tempList = testGraph.adjList.get(tileArray[1]);
        passed &= assertEquals(true, tempList.contains(tileArray[4]));
        
        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[3].printTileCoord();
        System.out.println();
        tempList = testGraph.adjList.get(tileArray[3]);
        passed &= assertEquals(true, tempList.contains(tileArray[4]));

        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[4].printTileCoord();
        System.out.println();
        tempList = testGraph.adjList.get(tileArray[4]);
        passed &= assertEquals(true, tempList.isEmpty());


        // Tear Down
        totalPassed &= passed;
        if(passed) 
        {
            System.out.println("\tPassed");
            totalPassCount++;            
        }
    }
    
    private static void testRemoveVertex2()
    {
        // Setup
        System.out.println("============testRemoveVertex2=============");
        boolean passed = true;
        totalTestCount++;

        TileGraph testGraph = new TileGraph();
        Tile tileArray[] =  { new Tile(0, 0, 'I', -5), 
                              new Tile(0, 4, 'I', -5),
                              new Tile(4, 0, 'I', -5),
                              new Tile(4, 8, 'I', -5),                              
                              new Tile(5, 5, 'I', -5),
                              new Tile(5, 10, 'I', -5),
                              new Tile(10, 16, 'I', -5), 
                              new Tile(10, 23, 'I', -5)};

        for(int i = 0; i < 8; i++)
            testGraph.addVertex(tileArray[i]);

        testGraph.addEdge(tileArray[0], tileArray[1]);
        testGraph.addEdge(tileArray[0], tileArray[2]);
        testGraph.addEdge(tileArray[0], tileArray[3]);
        testGraph.addEdge(tileArray[1], tileArray[4]);
        testGraph.addEdge(tileArray[1], tileArray[5]);
        testGraph.addEdge(tileArray[2], tileArray[3]);
        testGraph.addEdge(tileArray[2], tileArray[4]);
        testGraph.addEdge(tileArray[3], tileArray[6]);
        testGraph.addEdge(tileArray[4], tileArray[5]);
        testGraph.addEdge(tileArray[5], tileArray[6]);
        testGraph.addEdge(tileArray[5], tileArray[7]);
        testGraph.addEdge(tileArray[6], tileArray[7]);

        // Action
        testGraph.removeVertex(tileArray[1]);
        testGraph.removeVertex(tileArray[4]);
        testGraph.removeVertex(tileArray[5]);        

        LinkedList<Tile> tempList;       
        
        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[0].printTileCoord();
        System.out.println();
        tempList = testGraph.adjList.get(tileArray[0]);        
        passed &= assertEquals(true, tempList.contains(tileArray[2]));
        passed &= assertEquals(true, tempList.contains(tileArray[3]));
        
        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[2].printTileCoord();
        System.out.println();
        tempList = testGraph.adjList.get(tileArray[2]);
        passed &= assertEquals(true, tempList.contains(tileArray[3]));

        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[3].printTileCoord();
        System.out.println();
        tempList = testGraph.adjList.get(tileArray[3]);
        passed &= assertEquals(true, tempList.contains(tileArray[6]));

        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[6].printTileCoord();
        System.out.println();
        tempList = testGraph.adjList.get(tileArray[6]);        
        passed &= assertEquals(true, tempList.contains(tileArray[7]));

        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[7].printTileCoord();
        System.out.println();
        tempList = testGraph.adjList.get(tileArray[7]);
        passed &= assertEquals(true, tempList.isEmpty());

        // Tear Down
        totalPassed &= passed;
        if(passed) 
        {
            System.out.println("\tPassed");
            totalPassCount++;            
        }
    }
    
    private static void testRemoveVertexCustom()
    {
        // Setup
        System.out.println("============testRemoveVertexCustom=============");
        boolean passed = true;
        totalTestCount++;

        // Add your own custom test here
        // Design another case to test your vertex removal method
        // You must have minimally 8 vertices and 12 edges in the graph,
        // Then test remove 3 vertices for functional confirmation.

        // WARNING!! remove these lines when adding test case here
        System.out.println("Did you add the Custom Test Case?");
        passed &= false;
        // WARNING!! remove these lines when adding test case here

        // Tear Down
        totalPassed &= passed;
        if(passed) 
        {
            System.out.println("\tPassed");
            totalPassCount++;            
        }
    }
    
    private static void testRemoveEdge1()
    {
        // Setup
        System.out.println("============testRemoveEdge1=============");
        boolean passed = true;
        totalTestCount++;

        TileGraph testGraph = new TileGraph();
        Tile tileArray[] =  { new Tile(0, 0, 'I', -5), 
                              new Tile(4, 0, 'I', -5),
                              new Tile(0, 4, 'I', -5),
                              new Tile(5, 5, 'I', -5),
                              new Tile(5, 10, 'I', -5)};

        for(int i = 0; i < 5; i++)
            testGraph.addVertex(tileArray[i]);

        testGraph.addEdge(tileArray[0], tileArray[1]);
        testGraph.addEdge(tileArray[0], tileArray[2]);
        testGraph.addEdge(tileArray[1], tileArray[4]);
        testGraph.addEdge(tileArray[2], tileArray[3]);
        testGraph.addEdge(tileArray[3], tileArray[4]);

        testGraph.removeEdge(tileArray[0], tileArray[1]);
        testGraph.removeEdge(tileArray[1], tileArray[4]);


        // Action
        LinkedList<Tile> tempList;       
        
        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[0].printTileCoord();
        System.out.println();
        tempList = testGraph.adjList.get(tileArray[0]);        
        passed &= assertEquals(true, tempList.contains(tileArray[2]));

        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[1].printTileCoord();
        System.out.println();
        tempList = testGraph.adjList.get(tileArray[1]);
        passed &= assertEquals(true, tempList.isEmpty());

        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[2].printTileCoord();
        System.out.println();
        tempList = testGraph.adjList.get(tileArray[2]);
        passed &= assertEquals(true, tempList.contains(tileArray[3]));

        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[3].printTileCoord();
        System.out.println();
        tempList = testGraph.adjList.get(tileArray[3]);
        passed &= assertEquals(true, tempList.contains(tileArray[4]));

        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[4].printTileCoord();
        System.out.println();
        tempList = testGraph.adjList.get(tileArray[4]);
        passed &= assertEquals(true, tempList.isEmpty());


        // Tear Down
        totalPassed &= passed;
        if(passed) 
        {
            System.out.println("\tPassed");
            totalPassCount++;            
        }
    }
    
    private static void testRemoveEdge2()
    {
        // Setup
        System.out.println("============testRemoveEdge2=============");
        boolean passed = true;
        totalTestCount++;

        TileGraph testGraph = new TileGraph();
        Tile tileArray[] =  { new Tile(0, 0, 'I', -5), 
                              new Tile(0, 4, 'I', -5),
                              new Tile(4, 0, 'I', -5),
                              new Tile(4, 8, 'I', -5),                              
                              new Tile(5, 5, 'I', -5),
                              new Tile(5, 10, 'I', -5),
                              new Tile(10, 16, 'I', -5), 
                              new Tile(10, 23, 'I', -5)};

        for(int i = 0; i < 8; i++)
            testGraph.addVertex(tileArray[i]);

        testGraph.addEdge(tileArray[0], tileArray[1]);
        testGraph.addEdge(tileArray[0], tileArray[2]);
        testGraph.addEdge(tileArray[0], tileArray[3]);
        testGraph.addEdge(tileArray[1], tileArray[4]);
        testGraph.addEdge(tileArray[1], tileArray[5]);
        testGraph.addEdge(tileArray[2], tileArray[3]);
        testGraph.addEdge(tileArray[2], tileArray[4]);
        testGraph.addEdge(tileArray[3], tileArray[6]);
        testGraph.addEdge(tileArray[4], tileArray[5]);
        testGraph.addEdge(tileArray[5], tileArray[6]);
        testGraph.addEdge(tileArray[5], tileArray[7]);
        testGraph.addEdge(tileArray[6], tileArray[7]);

        // Action
        testGraph.removeEdge(tileArray[0], tileArray[2]);
        testGraph.removeEdge(tileArray[1], tileArray[4]);
        testGraph.removeEdge(tileArray[2], tileArray[3]);
        testGraph.removeEdge(tileArray[3], tileArray[6]);
        testGraph.removeEdge(tileArray[5], tileArray[6]);

        LinkedList<Tile> tempList;       
        
        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[0].printTileCoord();
        System.out.println();
        tempList = testGraph.adjList.get(tileArray[0]);
        passed &= assertEquals(true, tempList.contains(tileArray[1]));        
        passed &= assertEquals(true, tempList.contains(tileArray[3]));

        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[1].printTileCoord();
        System.out.println();
        tempList = testGraph.adjList.get(tileArray[1]);        
        passed &= assertEquals(true, tempList.contains(tileArray[5]));
        
        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[2].printTileCoord();
        System.out.println();
        tempList = testGraph.adjList.get(tileArray[2]);        
        passed &= assertEquals(true, tempList.contains(tileArray[4]));

        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[3].printTileCoord();
        System.out.println();
        tempList = testGraph.adjList.get(tileArray[3]);
        passed &= assertEquals(true, tempList.isEmpty());
        
        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[4].printTileCoord();
        System.out.println();
        tempList = testGraph.adjList.get(tileArray[4]);
        passed &= assertEquals(true, tempList.contains(tileArray[5]));
        
        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[5].printTileCoord();
        System.out.println();
        tempList = testGraph.adjList.get(tileArray[5]);        
        passed &= assertEquals(true, tempList.contains(tileArray[7]));

        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[6].printTileCoord();
        System.out.println();
        tempList = testGraph.adjList.get(tileArray[6]);        
        passed &= assertEquals(true, tempList.contains(tileArray[7]));

        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[7].printTileCoord();
        System.out.println();
        tempList = testGraph.adjList.get(tileArray[7]);
        passed &= assertEquals(true, tempList.isEmpty());

        // Tear Down
        totalPassed &= passed;
        if(passed) 
        {
            System.out.println("\tPassed");
            totalPassCount++;            
        }
    }
    
    private static void testRemoveEdgeCustom()
    {
        // Setup
        System.out.println("============testRemoveEdgeCustom=============");
        boolean passed = true;
        totalTestCount++;

        // Add your own custom test here
        // Design another case to test your edge removal method
        // You must have minimally 8 vertices and 12 edges in the graph,
        // Then test remove 4 edges for functional confirmation.

        // WARNING!! remove these lines when adding test case here
        System.out.println("Did you add the Custom Test Case?");
        passed &= false;
        // WARNING!! remove these lines when adding test case here

        // Tear Down
        totalPassed &= passed;
        if(passed) 
        {
            System.out.println("\tPassed");
            totalPassCount++;            
        }
    }
    


    // Get Neighbours
    // Get Neighbours
    // Get Neighbours

    private static void testGetNeighbours1()
    {
        // Setup
        System.out.println("============testGetNeighbours1=============");
        boolean passed = true;
        totalTestCount++;

        TileGraph testGraph = new TileGraph();
        Tile tileArray[] =  { new Tile(0, 0, 'I', -5), 
                              new Tile(4, 0, 'I', -5),
                              new Tile(0, 4, 'I', -5),
                              new Tile(5, 5, 'I', -5),
                              new Tile(5, 10, 'I', -5)};

        for(int i = 0; i < 5; i++)
            testGraph.addVertex(tileArray[i]);

        testGraph.addEdge(tileArray[0], tileArray[1]);
        testGraph.addEdge(tileArray[0], tileArray[2]);
        testGraph.addEdge(tileArray[1], tileArray[4]);
        testGraph.addEdge(tileArray[2], tileArray[3]);
        testGraph.addEdge(tileArray[3], tileArray[4]);


        // Action
        LinkedList<Tile> tempList;       
        
        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[0].printTileCoord();
        System.out.println();
        tempList = testGraph.getNeighbours(tileArray[0]);
        passed &= assertEquals(true, tempList.contains(tileArray[1]));
        passed &= assertEquals(true, tempList.contains(tileArray[2]));

        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[1].printTileCoord();
        System.out.println();
        tempList = testGraph.getNeighbours(tileArray[1]);
        passed &= assertEquals(true, tempList.contains(tileArray[4]));

        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[2].printTileCoord();
        System.out.println();
        tempList = testGraph.getNeighbours(tileArray[2]);
        passed &= assertEquals(true, tempList.contains(tileArray[3]));

        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[3].printTileCoord();
        System.out.println();
        tempList = testGraph.getNeighbours(tileArray[3]);
        passed &= assertEquals(true, tempList.contains(tileArray[4]));

        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[4].printTileCoord();
        System.out.println();
        tempList = testGraph.getNeighbours(tileArray[4]);
        passed &= assertEquals(true, tempList.isEmpty());



        // Tear Down
        totalPassed &= passed;
        if(passed) 
        {
            System.out.println("\tPassed");
            totalPassCount++;            
        }
    }
    
    private static void testGetNeighbours2()
    {
        // Setup
        System.out.println("============testAddEdge2=============");
        boolean passed = true;
        totalTestCount++;

        TileGraph testGraph = new TileGraph();
        Tile tileArray[] =  { new Tile(0, 0, 'I', -5), 
                              new Tile(0, 4, 'I', -5),
                              new Tile(4, 0, 'I', -5),
                              new Tile(4, 8, 'I', -5),                              
                              new Tile(5, 5, 'I', -5),
                              new Tile(5, 10, 'I', -5),
                              new Tile(10, 16, 'I', -5), 
                              new Tile(10, 23, 'I', -5)};

        for(int i = 0; i < 8; i++)
            testGraph.addVertex(tileArray[i]);

        testGraph.addEdge(tileArray[0], tileArray[1]);
        testGraph.addEdge(tileArray[0], tileArray[2]);
        testGraph.addEdge(tileArray[0], tileArray[3]);
        testGraph.addEdge(tileArray[1], tileArray[4]);
        testGraph.addEdge(tileArray[1], tileArray[5]);
        testGraph.addEdge(tileArray[2], tileArray[3]);
        testGraph.addEdge(tileArray[2], tileArray[4]);
        testGraph.addEdge(tileArray[3], tileArray[6]);
        testGraph.addEdge(tileArray[4], tileArray[5]);
        testGraph.addEdge(tileArray[5], tileArray[6]);
        testGraph.addEdge(tileArray[5], tileArray[7]);
        testGraph.addEdge(tileArray[6], tileArray[7]);

        // Action
        LinkedList<Tile> tempList;       
        
        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[0].printTileCoord();
        System.out.println();
        tempList = testGraph.getNeighbours(tileArray[0]);
        passed &= assertEquals(true, tempList.contains(tileArray[1]));
        passed &= assertEquals(true, tempList.contains(tileArray[2]));
        passed &= assertEquals(true, tempList.contains(tileArray[3]));

        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[1].printTileCoord();
        System.out.println();
        tempList = testGraph.getNeighbours(tileArray[1]);
        passed &= assertEquals(true, tempList.contains(tileArray[4]));
        passed &= assertEquals(true, tempList.contains(tileArray[5]));
        
        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[2].printTileCoord();
        System.out.println();
        tempList = testGraph.getNeighbours(tileArray[2]);
        passed &= assertEquals(true, tempList.contains(tileArray[3]));
        passed &= assertEquals(true, tempList.contains(tileArray[4]));

        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[3].printTileCoord();
        System.out.println();
        tempList = testGraph.getNeighbours(tileArray[3]);
        passed &= assertEquals(true, tempList.contains(tileArray[6]));
        
        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[4].printTileCoord();
        System.out.println();
        tempList = testGraph.getNeighbours(tileArray[4]);
        passed &= assertEquals(true, tempList.contains(tileArray[5]));
        
        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[5].printTileCoord();
        System.out.println();
        tempList = testGraph.getNeighbours(tileArray[5]);
        passed &= assertEquals(true, tempList.contains(tileArray[6]));
        passed &= assertEquals(true, tempList.contains(tileArray[7]));

        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[6].printTileCoord();
        System.out.println();
        tempList = testGraph.getNeighbours(tileArray[6]);        
        passed &= assertEquals(true, tempList.contains(tileArray[7]));

        System.out.printf(">> Check Vertex Adjacency List: ");
        tileArray[7].printTileCoord();
        System.out.println();
        tempList = testGraph.getNeighbours(tileArray[7]);
        passed &= assertEquals(true, tempList.isEmpty());

        // Tear Down
        totalPassed &= passed;
        if(passed) 
        {
            System.out.println("\tPassed");
            totalPassCount++;            
        }
    }
       
    
    private static void testGetNeighboursCustom()
    {
        // Setup
        System.out.println("============testGetNeighboursCustom=============");
        boolean passed = true;
        totalTestCount++;

        // Add your own custom test here
        // Design another case to test your get neighbour method
        // You must have minimally 5 vertices and 5 edges in the graph,
        // Then test getNeighbours from at least one selected vertices.

        // WARNING!! remove these lines when adding test case here
        System.out.println("Did you add the Custom Test Case?");
        passed &= false;
        // WARNING!! remove these lines when adding test case here

        // Tear Down
        totalPassed &= passed;
        if(passed) 
        {
            System.out.println("\tPassed");
            totalPassCount++;            
        }
    }
    


    // Depth-First Traversal
    // Depth-First Traversal
    // Depth-First Traversal

    private static void testDFT1()
    {
        // Setup
        System.out.println("============testDFT1=============");
        boolean passed = true;
        totalTestCount++;

        TileGraph testGraph = new TileGraph();
        Tile tileArray[] =  { new Tile(0, 0, 'I', -5), 
                              new Tile(4, 0, 'I', -5),
                              new Tile(0, 4, 'I', -5),
                              new Tile(5, 5, 'I', -5),
                              new Tile(5, 10, 'I', -5)};

        for(int i = 0; i < 5; i++)
            testGraph.addVertex(tileArray[i]);

        testGraph.addEdge(tileArray[0], tileArray[1]);
        testGraph.addEdge(tileArray[0], tileArray[2]);
        testGraph.addEdge(tileArray[1], tileArray[4]);
        testGraph.addEdge(tileArray[2], tileArray[3]);
        testGraph.addEdge(tileArray[3], tileArray[4]);


        // Action
        LinkedList<Tile> dftList = testGraph.depthFirstTraversal(tileArray[0]);       

        System.out.printf(">> Check DFT Resultant List: ");
        dftList.get(0).printTileCoord();
        System.out.println();
        passed &= assertEquals(tileArray[0], dftList.get(0));
        
        System.out.printf(">> Check DFT Resultant List: ");
        dftList.get(1).printTileCoord();
        System.out.println();
        passed &= assertEquals(tileArray[2], dftList.get(1));
        
        System.out.printf(">> Check DFT Resultant List: ");
        dftList.get(2).printTileCoord();
        System.out.println();
        passed &= assertEquals(tileArray[3], dftList.get(2));
        
        System.out.printf(">> Check DFT Resultant List: ");
        dftList.get(3).printTileCoord();
        System.out.println();
        passed &= assertEquals(tileArray[4], dftList.get(3));
        
        System.out.printf(">> Check DFT Resultant List: ");
        dftList.get(4).printTileCoord();
        System.out.println();
        passed &= assertEquals(tileArray[1], dftList.get(4));


        // Tear Down
        totalPassed &= passed;
        if(passed) 
        {
            System.out.println("\tPassed");
            totalPassCount++;            
        }
    }
    
    private static void testDFT2()
    {
        // Setup
        System.out.println("============testDFT2=============");
        boolean passed = true;
        totalTestCount++;

        TileGraph testGraph = new TileGraph();
        Tile tileArray[] =  { new Tile(0, 0, 'I', -5), 
                              new Tile(0, 4, 'I', -5),
                              new Tile(4, 0, 'I', -5),
                              new Tile(4, 8, 'I', -5),                              
                              new Tile(5, 5, 'I', -5),
                              new Tile(5, 10, 'I', -5),
                              new Tile(10, 16, 'I', -5), 
                              new Tile(10, 23, 'I', -5)};

        for(int i = 0; i < 8; i++)
            testGraph.addVertex(tileArray[i]);

        testGraph.addEdge(tileArray[0], tileArray[1]);
        testGraph.addEdge(tileArray[0], tileArray[2]);
        testGraph.addEdge(tileArray[0], tileArray[3]);
        testGraph.addEdge(tileArray[1], tileArray[4]);
        testGraph.addEdge(tileArray[1], tileArray[5]);
        testGraph.addEdge(tileArray[2], tileArray[3]);
        testGraph.addEdge(tileArray[2], tileArray[4]);
        testGraph.addEdge(tileArray[3], tileArray[6]);
        testGraph.addEdge(tileArray[4], tileArray[5]);
        testGraph.addEdge(tileArray[5], tileArray[6]);
        testGraph.addEdge(tileArray[5], tileArray[7]);
        testGraph.addEdge(tileArray[6], tileArray[7]);

        // Action
        LinkedList<Tile> dftList = testGraph.depthFirstTraversal(tileArray[0]);       
        
        System.out.printf(">> Check DFT Resultant List: ");
        dftList.get(0).printTileCoord();
        System.out.println();
        passed &= assertEquals(tileArray[0], dftList.get(0));

        System.out.printf(">> Check DFT Resultant List: ");
        dftList.get(1).printTileCoord();
        System.out.println();
        passed &= assertEquals(tileArray[3], dftList.get(1));

        System.out.printf(">> Check DFT Resultant List: ");
        dftList.get(2).printTileCoord();
        System.out.println();
        passed &= assertEquals(tileArray[6], dftList.get(2));

        System.out.printf(">> Check DFT Resultant List: ");
        dftList.get(3).printTileCoord();
        System.out.println();
        passed &= assertEquals(tileArray[7], dftList.get(3));

        System.out.printf(">> Check DFT Resultant List: ");
        dftList.get(4).printTileCoord();
        System.out.println();
        passed &= assertEquals(tileArray[2], dftList.get(4));

        System.out.printf(">> Check DFT Resultant List: ");
        dftList.get(5).printTileCoord();
        System.out.println();
        passed &= assertEquals(tileArray[4], dftList.get(5));

        System.out.printf(">> Check DFT Resultant List: ");
        dftList.get(6).printTileCoord();
        System.out.println();
        passed &= assertEquals(tileArray[5], dftList.get(6));

        System.out.printf(">> Check DFT Resultant List: ");
        dftList.get(7).printTileCoord();
        System.out.println();
        passed &= assertEquals(tileArray[1], dftList.get(7));

        // Tear Down
        totalPassed &= passed;
        if(passed) 
        {
            System.out.println("\tPassed");
            totalPassCount++;            
        }
    }
    
    private static void testDFTCustom()
    {
        // Setup
        System.out.println("============testDFTCustom=============");
        boolean passed = true;
        totalTestCount++;

        // Add your own custom test here
        // Design another case to test your get neighbour method
        // You must have minimally 8 vertices and 12 edges in the graph,
        // Then carry out DFT from a selected vertex.

        // WARNING!! remove these lines when adding test case here
        System.out.println("Did you add the Custom Test Case?");
        passed &= false;
        // WARNING!! remove these lines when adding test case here

        // Tear Down
        totalPassed &= passed;
        if(passed) 
        {
            System.out.println("\tPassed");
            totalPassCount++;            
        }
    }
    


    // Find Shortest Path using Breadth-First Search
    // Find Shortest Path using Breadth-First Search
    // Find Shortest Path using Breadth-First Search

    private static void testFindShortestPath1()
    {
        // Setup
        System.out.println("============testFindShortestPath1=============");
        boolean passed = true;
        totalTestCount++;

        TileGraph testGraph = new TileGraph();
        Tile tileArray[] =  { new Tile(0, 0, 'I', -5), 
                              new Tile(0, 4, 'I', -5),
                              new Tile(4, 0, 'I', -5),
                              new Tile(4, 8, 'I', -5),                              
                              new Tile(5, 5, 'I', -5),
                              new Tile(5, 10, 'I', -5),
                              new Tile(10, 16, 'I', -5), 
                              new Tile(10, 23, 'I', -5)};

        for(int i = 0; i < 8; i++)
            testGraph.addVertex(tileArray[i]);

        testGraph.addEdge(tileArray[0], tileArray[1]);
        testGraph.addEdge(tileArray[0], tileArray[2]);
        testGraph.addEdge(tileArray[0], tileArray[3]);
        testGraph.addEdge(tileArray[1], tileArray[4]);
        testGraph.addEdge(tileArray[1], tileArray[5]);
        testGraph.addEdge(tileArray[2], tileArray[3]);
        testGraph.addEdge(tileArray[2], tileArray[4]);
        testGraph.addEdge(tileArray[3], tileArray[6]);
        testGraph.addEdge(tileArray[4], tileArray[5]);
        testGraph.addEdge(tileArray[5], tileArray[6]);
        testGraph.addEdge(tileArray[5], tileArray[7]);
        testGraph.addEdge(tileArray[6], tileArray[7]);

        // Action
        LinkedList<Tile> pathList = testGraph.findShortestPath(tileArray[0], tileArray[7]);       
        
        // for(int i = 0; i < pathList.size(); i++)
        // {
        //     pathList.get(i).printTileCoord();
        //     System.out.println();
        // }

        System.out.printf(">> Check Shortest Path List (BFS): ");
        pathList.get(0).printTileCoord();
        System.out.println();
        passed &= assertEquals(tileArray[7], pathList.get(0));

        System.out.printf(">> Check Shortest Path List (BFS): ");
        pathList.get(1).printTileCoord();
        System.out.println();
        passed &= assertEquals(tileArray[5], pathList.get(1));

        System.out.printf(">> Check Shortest Path List (BFS): ");
        pathList.get(2).printTileCoord();
        System.out.println();
        passed &= assertEquals(tileArray[1], pathList.get(2));

        System.out.printf(">> Check Shortest Path List (BFS): ");
        pathList.get(3).printTileCoord();
        System.out.println();
        passed &= assertEquals(tileArray[0], pathList.get(3));

        // Tear Down
        totalPassed &= passed;
        if(passed) 
        {
            System.out.println("\tPassed");
            totalPassCount++;            
        }
    }
    
    private static void testFindShortestPath2()
    {
        // Setup
        System.out.println("============testFindShortestPath2=============");
        boolean passed = true;
        totalTestCount++;

        TileGraph testGraph = new TileGraph();
        Tile tileArray[] =  { new Tile(0, 0, 'I', -5), 
                              new Tile(0, 4, 'I', -5),
                              new Tile(4, 0, 'I', -5),
                              new Tile(4, 8, 'I', -5),                              
                              new Tile(5, 5, 'I', -5),
                              new Tile(5, 10, 'I', -5),
                              new Tile(10, 16, 'I', -5), 
                              new Tile(10, 23, 'I', -5),
                              new Tile(5, 13, 'I', -5),
                              new Tile(10, 13, 'I', -5),
                              new Tile(16, 23, 'I', -5), 
                              new Tile(16, 25, 'I', -5)};

        for(int i = 0; i < 12; i++)
            testGraph.addVertex(tileArray[i]);

        testGraph.addEdge(tileArray[0], tileArray[1]);
        testGraph.addEdge(tileArray[0], tileArray[2]);
        testGraph.addEdge(tileArray[0], tileArray[3]);
        testGraph.addEdge(tileArray[1], tileArray[4]);
        testGraph.addEdge(tileArray[1], tileArray[5]);
        testGraph.addEdge(tileArray[2], tileArray[3]);
        testGraph.addEdge(tileArray[2], tileArray[4]);
        testGraph.addEdge(tileArray[3], tileArray[6]);
        testGraph.addEdge(tileArray[3], tileArray[8]);
        testGraph.addEdge(tileArray[4], tileArray[5]);
        testGraph.addEdge(tileArray[5], tileArray[6]);
        testGraph.addEdge(tileArray[5], tileArray[7]);
        testGraph.addEdge(tileArray[5], tileArray[9]);
        testGraph.addEdge(tileArray[6], tileArray[7]);
        testGraph.addEdge(tileArray[6], tileArray[10]);
        testGraph.addEdge(tileArray[7], tileArray[11]);
        testGraph.addEdge(tileArray[8], tileArray[6]);
        testGraph.addEdge(tileArray[8], tileArray[10]);
        testGraph.addEdge(tileArray[8], tileArray[9]);
        testGraph.addEdge(tileArray[9], tileArray[11]);
        testGraph.addEdge(tileArray[10], tileArray[11]);
        

        // Action
        LinkedList<Tile> pathList = testGraph.findShortestPath(tileArray[0], tileArray[11]);       
        
        System.out.printf(">> Check Shortest Path List (BFS): ");
        pathList.get(0).printTileCoord();
        System.out.println();
        passed &= assertEquals(tileArray[11], pathList.get(0));

        System.out.printf(">> Check Shortest Path List (BFS): ");
        pathList.get(1).printTileCoord();
        System.out.println();
        passed &= assertEquals(tileArray[7], pathList.get(1));

        System.out.printf(">> Check Shortest Path List (BFS): ");
        pathList.get(2).printTileCoord();
        System.out.println();
        passed &= assertEquals(tileArray[5], pathList.get(2));

        System.out.printf(">> Check Shortest Path List (BFS): ");
        pathList.get(3).printTileCoord();
        System.out.println();
        passed &= assertEquals(tileArray[1], pathList.get(3));

        System.out.printf(">> Check Shortest Path List (BFS): ");
        pathList.get(4).printTileCoord();
        System.out.println();
        passed &= assertEquals(tileArray[0], pathList.get(4));

        // Tear Down
        totalPassed &= passed;
        if(passed) 
        {
            System.out.println("\tPassed");
            totalPassCount++;            
        }
    }
    
    private static void testFindShortestPathCustom()
    {
        // Setup
        System.out.println("============testFindShortestPathCustom=============");
        boolean passed = true;
        totalTestCount++;

        // Add your own custom test here
        // Design another case to test your get neighbour method
        // You must have minimally 8 vertices and 12 edges in the graph,
        // Then carry out Find Shortest Path from a selected Starting vertex to
        // a selected Goal vertex

        // WARNING!! remove these lines when adding test case here
        System.out.println("Did you add the Custom Test Case?");
        passed &= false;
        // WARNING!! remove these lines when adding test case here

        // Tear Down
        totalPassed &= passed;
        if(passed) 
        {
            System.out.println("\tPassed");
            totalPassCount++;            
        }
    }
    




    private static boolean assertEquals(Tile expected, Tile actual)
    {
        if(!expected.isEqual(actual))
        {
            System.out.println("\tAssert Failed!");
            System.out.printf("\tExpected:");
            expected.printTile();
            expected.printTileCoord();
            System.out.printf("\tActual:");
            actual.printTile();
            actual.printTileCoord();
            return false;
        }

        return true;
    }

    private static boolean assertEquals(boolean expected, boolean actual)
    {
        if(expected != actual)
        {
            System.out.println("\tAssert Failed!");
            System.out.printf("\tExpected: %b, Actual: %b\n\n", expected, actual);
            return false;
        }

        return true;
    }
}
