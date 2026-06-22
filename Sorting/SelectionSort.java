/* 
            --Properties of Selection Sort--
    SC = O(1).   --> No Auxilary Array is used , only variables are created.
    Inplace Sorting- YES
    Stable Sorting- No i.e .   UNSTABLE sorting.
    */
public class SelectionSort {
    static void Swap(int A[], int x, int y) {
        int t = A[x];
        A[x] = A[y];
        A[y] = t;

    }

/*--Time Complexity Analysis  Selection Sort--

       cases.    |    No. of comparsions.     |       No of swaps.   |.    TC.  |

    Best Case    |        O(n^2)              |          (n-1)       |    Ω(n^2)
    Worst Case.  |.       O(n^2)              |          (n-1)       |.   O(n^2)
    
    */

    static void selectionSort(int A[], int n) {
        for (int i = 0; i < n-1; i++) {
            int minInd = i;
            for (int j = i + 1; j < n; j++) {
                if (A[j] < A[minInd]) {
                    minInd = j;
                }

            }
            Swap(A, i, minInd);
        }
    }

    static void Print(int A[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }

    public static void main(String[] args) {
        int A[] = { 3, 4, 1, 5, 2, 67, 53, 43, 78, 74 ,45,32,23,23,21,92,87,56,54};
        int n = A.length;
        selectionSort(A, n);
        Print(A, n);
    }
}
