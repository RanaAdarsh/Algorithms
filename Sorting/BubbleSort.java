public class BubbleSort{

    static void Swap(int A[] ,int x,int y){
        int t = A[x];
        A[x] = A[y];
        A[y]= t;
    }

    static void Algo1(int A[] , int n){
        for(int i =1 ;i<n;i++){
            for(int j = 0;j<n-1;j++){
                if(A[j]>A[j+1]){
                    Swap(A,j,j+1);
                }
            }
        }
    }

    static void Print(int A[] , int n){
        for(int i =0;i<n;i++){
            System.out.print(A[i]+" ");
        }
    }
    
    public static void main(String[] args){
        int A[] = {1 ,3 ,21,45,32,67,87,3,4,4,5};
        int n = A.length;
        Algo1(A,n);
        Print(A,n);

    }
}