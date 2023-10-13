package CodingNinja.Milestone5.Graphs_1And2;

import java.util.Queue;
import java.util.*;

public class Graph01 {
    /*----------------------DFS---------------------------*/
    //DFS-Deft First Search (Function)
    public static void printDFSHelper(int[][] edges,int sv,boolean visited[]){
        System.out.println(sv);
        visited[sv] = true;
        int n = edges.length;
        for (int i=0; i<n; i++){
            if (edges[sv][i] == 1 && !visited[i]){
                printDFSHelper(edges,i,visited);
            }
        }
    }
    public static void printDFS(int[][] edges,int sv){
        boolean[] visited = new boolean[edges.length];
        for (int i=0; i< edges.length; i++){
            if (!visited[i]){
                printDFSHelper(edges,i,visited);
            }
        }
    }

    /*----------------------END DFS---------------------------*/

    /*----------------------BFS---------------------------*/

    public static void printBFSHelper(int edges[][],int sv,boolean visited[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(sv);
        int n = edges.length;
        visited[sv] = true;
        while (!q.isEmpty()){
            int front = q.remove();
            System.out.println(front);
            for (int i=0; i<n; i++){
                if(edges[front][i] == 1 && !visited[i]){
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void BFS(int edges[][]){
        boolean visited[] = new boolean[edges.length];
        for (int i=0; i<edges.length; i++){
            if (!visited[i]){
                printBFSHelper(edges,i,visited);
            }
        }
    }

    /*----------------------END BFS---------------------------*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int[][] edges = new int[n][n];
        for (int i=0; i<e; i++){
            int fv = sc.nextInt();
            int sv = sc.nextInt();
            edges[fv][sv] = 1;
            edges[sv][fv] = 1;
        }
        System.out.println("DFS");
        printDFS(edges,0);
        System.out.println("BFS");
        BFS(edges);

    }
}

/*
input:-
5
4
0 1
1 2
0 2
3 4
output:-
0
1
2
3
4
 */