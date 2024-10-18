package arrays;

public class q11_floor_sort_element {
public static int findFloor(int  arr[], int n, int x)
{
    int low = 0; 
    int high = n - 1;
    int floorIndex = -1;

    while (low <= high) {
        int mid = (low + high) / 2;

        if (arr[mid] <= x) {
            floorIndex = mid; 
            low = mid + 1; 
        } else {
            high = mid - 1; 
    }
    }
    return floorIndex;
}

public static void main(String[] args) {
    int []arr={1,2,8,10,11,12,19};
    System.out.println(findFloor(arr, 7, 13));
}
}

