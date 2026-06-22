/* 
            **--Properties of Insertion Sort--**
    SC = O(1).   --> No Auxilary Array is used , only variables are created.
    Inplace Sorting- YES
    Stable Sorting- YES
    */
public class InsertionSort {

    static void Print(int A[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }

    /*. **--Time Complexity Analysis  Selection Sort--**

       cases.    |    No. of comparsions.     |       No of swaps.   |.    TC.  |

    Best Case    |         (n-1)              |             0        |    Ω(n)
    Worst Case.  |.        n(n-1)/2           |          n(n-1)/2    |.   O(n^2)
    
    */

    static void insertionSort(int A[], int n) {
        for (int j = 1; j < n; j++) {
            int key = A[j];
            int i = j - 1;
            while (i >= 0 && A[i] > key) {
                A[i + 1] = A[i];
                i--;
            }
            A[i + 1] = key;
        }
    }

    public static void main(String[] args) {
        int A[] = { 3, 4, 1, 5, 2, 67, 53, 43, 78, 74, 45, 32, 23, 23, 21, 92, 87, 56, 54 };
        int n = A.length;
        insertionSort(A, n);
        Print(A, n);
    }
}
