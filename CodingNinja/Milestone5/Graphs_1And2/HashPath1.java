package CodingNinja.Milestone5.Graphs_1And2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HashPath1 {
    /*----------------------HashPath---------------------------*/
    public static boolean printHshPath(int edges[][],int v1,int v2,boolean visited[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(v1);
        int n = edges.length;
        visited[v1] = true;
        while (!q.isEmpty()){
            int front = q.remove();
            // System.out.print(front+" ");
            for (int i=0; i<n; i++){
                if(edges[front][i] == 1 && !visited[i]){
                    q.add(i);
                    visited[i] = true;
                    if(visited[v2]){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean HashPath(int edges[][],int v1,int v2){
        boolean visited[] = new boolean[edges.length];
        return printHshPath(edges,v1,v2,visited);
    }

    /*----------------------END HashPath---------------------------*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int[][] edges = new int[n][n];
        for (int i = 0; i < e; i++) {
            int fv = sc.nextInt();
            int v1 = sc.nextInt();
            edges[fv][v1] = 1;
            edges[v1][fv] = 1;
        }
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        System.out.print(HashPath(edges, v1, v2));
    }
}
/*
input:-
6 3
5 3
0 1
3 4
0 3
result:-
false
 */


/*
Code : Has Path
Send Feedback
Given an undirected graph G(V, E) and two vertices v1 and v2 (as integers), check if there exists any path between them or not. Print true if the path exists and false otherwise.
Note:
1. V is the number of vertices present in graph G and vertices are numbered from 0 to V-1.
2. E is the number of edges present in graph G.
Input Format :
The first line of input contains two integers, that denote the value of V and E.
Each of the following E lines contains two integers, that denote that there exists an edge between vertex 'a' and 'b'.
The following line contain two integers, that denote the value of v1 and v2.
Output Format :
The first and only line of output contains true, if there is a path between v1 and v2 and false otherwise.
Constraints :
0 <= V <= 1000
0 <= E <= 1000
0 <= a <= V - 1
0 <= b <= V - 1
0 <= v1 <= V - 1
0 <= v2 <= V - 1
Time Limit: 1 second
Sample Input 1 :
4 4
0 1
0 3
1 2
2 3
1 3
Sample Output 1 :
true
Sample Input 2 :
6 3
5 3
0 1
3 4
0 3
Sample Output 2 :
false
 */