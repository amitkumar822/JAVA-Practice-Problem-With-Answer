package CodingNinja.Milestone5.Graphs_1And2;

import java.util.Arrays;
import java.util.Scanner;

class Edge implements Comparable<Edge>{
    int source;
    int dest;
    int weight;

    public int compareTo(Edge o){
        return this.weight - o.weight;
    }
}
public class KruskalsFunction {
    public static int findParent(int v, int[] parent){
        if(parent[v] == v){
            return v;
        }
        return findParent(parent[v],parent);
    }
    public static void kruskals(Edge[] input, int n){
        Arrays.sort(input);
        Edge[] output = new Edge[n-1];

        int parent[] = new int[n];
        for (int i=0; i<n; i++){
            parent[i] = i;
        }
        int count=0;
        int i=0;
        while (count != n-1){
            Edge currentEdge = input[i];

            int sourceParent = findParent(currentEdge.source, parent);
            int destParent = findParent(currentEdge.dest, parent);

            if(sourceParent != destParent){
                output[count] = currentEdge;
                count++;
                parent[sourceParent] = destParent;
            }
            i++;
        }
        for (int j=0; j<n-1; j++){
            if(output[j].source < output[j].dest){
                System.out.println(output[j].source+" "+output[j].dest+" "+output[j].weight);
            }else {
                System.out.println(output[j].dest+" "+output[j].source+" "+output[j].weight);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int E = sc.nextInt();

        Edge input[] = new Edge[E];
        for (int i=0; i<E; i++){
            input[i] = new Edge();
            input[i].source = sc.nextInt();
            input[i].dest = sc.nextInt();
            input[i].weight = sc.nextInt();
        }
        kruskals(input,n);
    }
}


/*
input:-
6 11
0 1 2
0 2 4
2 3 6
1 3 1
2 4 9
4 5 5
3 5 7
4 3 11
2 5 10
2 1 8
0 3 3

output:-
1 3 1
0 1 2
0 2 4
4 5 5
3 5 7
 */