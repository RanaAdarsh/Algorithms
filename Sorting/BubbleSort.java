/* 
            --Properties of Bubble Sort--
    SC = O(1).   --> No Auxilary Array is used , only variables are created.
    Inplace Sorting- YES
    Stable Sorting- YES
    */



public class BubbleSort{

    static void Swap(int A[] ,int x,int y){
        int t = A[x];
        A[x] = A[y];
        A[y]= t;
    }
    /*--Time Complexity Analysis  BubbleSortBasic--

       cases.    |    No. of comparsions.     |       No of swaps.   |.    TC.  |

    Best Case    |   (n-1)(n-1)               |          0           |    θ(n^2)
    Worst Case.  |.  (n-1)(n-1)               |     n(n-1)/2         |.   θ(n^2)
    
    */
    static void BubbleSortBasic(int A[] , int n){
        for(int i =1 ;i<n;i++){
            for(int j = 0;j<n-1;j++){
                if(A[j]>A[j+1]){
                    Swap(A,j,j+1);
                }
            }
        }
    }

    /*--Time Complexity Analysis  of BubbleSortOptimized--

       cases.    |    No. of comparsions.     |       No of swaps.   |.    TC.  |

    Best Case    |     n(n-1)/2               |          0           |    Ω(n^2)
    Worst Case.  |.    n(n-1)/2               |     n(n-1)/2         |.   O(n^2)
    
    */

    static void BubbleSortOptimized(int A[] , int n){
        for(int i = 1 ;i<n;i++){
            for(int j =0;j<n-i;j++){
                if(A[j]>A[j+1]){
                    Swap(A,j,j+1);
                }
            }
        }
    }

    /*--Time Complexity Analysis  of BubbleSortBest--

       cases.    |    No. of comparsions.     |       No of swaps.   |.    TC.  |

    Best Case    |       (n-1)                |          0           |    Ω(n)
    Worst Case.  |.    n(n-1)/2               |     n(n-1)/2         |.   O(n^2)
    
    */

    static void BubbleSortBest(int A[] , int n){
        for(int i =1 ; i <n ; i++){
            int flag=0;
            for(int j=0;j<n-i;j++){
                if(A[j]>A[j+1]){
                    Swap(A,j,j+1);
                    flag = 1;
                }
            }
            if(flag==0){
                break;
            }
        }
    }


    static void Print(int A[] , int n){
        for(int i =0;i<n;i++){
            System.out.print(A[i]+" ");
        }
    }

    public static void main(String[] args){
       // int A[] = {1 ,3 ,21,45,32,67,87,3,4,4,5};
        int A[] = {1 ,2 ,3,4,5,6,7,8,9,10,11};
        int n = A.length;
        BubbleSortBest(A,n);
        Print(A,n);

    }
}