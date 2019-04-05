package floydwarshall;

public class FloydWarshall {

    static void floyd_warshall(int grafo[][]) {
        int n = grafo.length, tmp;
        //crear matriz de distancia
        int caminos[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                caminos[i][j] = j;
            }
        }

        //ejecutar el método floy-marshall
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    tmp = grafo[i][k] + grafo[k][j];
                    if (tmp < grafo[i][j]) {
                        grafo[i][j] = tmp;
                        caminos[i][j] = k;
                    }
                }
            }
        }
        System.out.println("La matriz de distancias ");
        print(grafo);
        System.out.println("La matriz de caminos");
        print(caminos);
    }
    
    static void print (int M[][]){
        System.out.println("");
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                System.out.println(" "+M[i][j]);
            }
        }
    }

    public static void main(String[] args) {

    }

}
