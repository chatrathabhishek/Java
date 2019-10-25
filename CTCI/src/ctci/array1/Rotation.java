package ctci.array1;

public class Rotation {

    private int temp;

    int [][] matrixRotation(int [][] mat, int n){

        for(int i=0; i<n/2;i++)
        {
            for(int j =i; j <n-i-1; j++)
            {
                temp = mat[i][j];
                mat[i][j] = mat[n-j-1][i];
                mat[n-j-1][i] = mat[n-i-1][n-j-1];
                mat[n-i-1][n-j-1] = mat[j][n-1-i];
                mat[j][n-1-i] = temp;
            }
        }

        return mat;
    }
}
