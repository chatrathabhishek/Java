package Sort;

public class Merge {

    public int[] mergesort(int[] A){

        int n = A.length;
        if (n<2)
            return A;
        int mid = n/2;
        int [] left = new int[mid];
        int [] right = new int [n-mid];

        for(int i =0; i<mid;i++)
            left[i] = A[i];
        for(int j=0; j<n-mid;j++)
            right[j] = A[mid+j];

        left = mergesort(left);
        right = mergesort(right);
        A = merge(left,right,A);

        return A;

    }

    private int[] merge(int[] left, int[] right, int [] A){

        int i=0;
        int j=0;
        int k=0;

        while((i<left.length) && (j<right.length)){

            if(left[i]<right[j]){
                A[k] = left[i];
                k++;
                i++;
            }
            else{
                A[k] = right[j];
                k++;
                j++;

            }
        }
        while(i<left.length){
            A[k] = left[i];
            k++;
            i++;
        }
        while(j<right.length){
            A[k] = right[j];
            k++;
            j++;
        }

        return A;
    }
}
