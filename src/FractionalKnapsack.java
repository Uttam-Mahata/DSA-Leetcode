import java.util.Arrays;

public class FractionalKnapsack {

    public class Item {
        int value, weight;
        Item(int x, int y){
            this.value = x;
            this.weight = y;
    
    }
    
}
double fractionalKnapsack(int W, Item arr[], int n) {
    Arrays.sort(arr, (a, b) -> ((b.value / b.weight) - (a.value / a.weight)));
    double res = 0.0;
    for (int i = 0; i < n; i++) {
        if (arr[i].weight <= W) {
            res += arr[i].value;
            W -= arr[i].weight;
        } else {
            res += (arr[i].value / arr[i].weight) * W;
            break;
        }
    }
    return res;    
       
}

    
}


