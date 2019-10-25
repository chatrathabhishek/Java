package ctci.array1;

public class Zeromatrix {

    int [][] zeromat(int [][] mat, int m, int n){

        for(int i=0; i<m; i++){

            if(mat[i][0] != 0){
                for(int j=0; j<n;j++){
                    if(mat[i][j]==0)
                        mat[i][0] = 0;
                }
            }
        }


        for(int i=0; i<m; i++) {
            if (mat[i][0] == 0) {
                for (int j = 0; j < n; j++) {
                    mat[i][j] = 0;
                }
            }
        }
        return mat;
    }
}
