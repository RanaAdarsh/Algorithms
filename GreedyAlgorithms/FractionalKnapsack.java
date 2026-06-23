import java.util.*;

class Items{
    int weight;
    int value;
    float ratio;
    Items(int weight,int value){
        this.weight = weight;
        this.value = value;
        this.ratio = (float)value/weight;
    }
}

public class FractionalKnapsack{
    public static float fractionalknapsack(Items A[],int capacity){
        Arrays.sort(A,(a,b)->Double.compare(b.ratio,a.ratio));
        float maxValue = 0;
        for(Items a:A){
            if(capacity>=a.weight){
                capacity -= a.weight;
                maxValue += a.value;
            }
            else{
                float fration =  (float) capacity/a.weight;
                maxValue += a.value*fration;
                break;
            }

        }
        return maxValue;
    }
    public static void main(String[] args) {
        Items A[] ={
            new Items(18,25),
            new Items(15,24),
            new Items(10,15),

        };
        int capacity =20;
        float maxProfits = fractionalknapsack(A,capacity);
        System.out.print(maxProfits);
    }
}