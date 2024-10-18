
package STRING_GFG;

class ff {
    public static void main(String[] args) {
        int k=0;
        int i=0;
       
        while(i<3){
            k=1+k;
            System.out.println(k);
            i++;
        }
    }    
}

    // public int highest_sum(int input1) {
    //     int N = input1;
    //     int highestSquare = 0;
    //     int highestCube = 0;

    //     // Find the highest square in the range
    //     for (int i = 1; i * i <= N; i++) {
    //         highestSquare = i * i;
    //     }

    //     // Find the highest cube in the range
    //     for (int i = 1; i * i * i <= N; i++) {
    //         highestCube = i * i * i;
    //     }

    //     // Return the sum of the highest square and highest cube
    //     return highestSquare + highestCube;
    // }

    // public static void main(String[] args) {
    //     ff userCode = new ff();
    //     int result = userCode.highest_sum(64); // Example input
//         System.out.println(result); // Should output 128
//     }
// }

   
    // public int treasureUnlock(int input1, int[] input2, int[] input3, int input4) {
    //     // Example: Uncomment the line below to throw an exception if the method is not yet implemented
    //     // throw new UnsupportedOperationException("treasureUnlock(int input1, int[] input2, int[] input3, int input4)");

    //     // Logic to calculate the minimum moves needed
    //     int totalDiff = 0;

    //     for (int i = 0; i < input1; i++) {
    //         int origDigit = input2[i];
    //         int targetDigit = input3[i];
    //         int diff = Math.min(Math.abs(origDigit - targetDigit), 10 - Math.abs(origDigit - targetDigit));
    //         totalDiff += diff;
    //     }

    //     // Return totalDiff if it's less than or equal to input4, otherwise return -1
    //     return (totalDiff <= input4) ? totalDiff : -1;
    // }

    // public static void main(String[] args) {
    //     ff treasureChest = new ff();

    //     // Example input
    //     int input1 = 4; // Number of digits
    //     int[] input2 = {1, 2, 3, 4}; // Original combination
    //     int[] input3 = {5, 6, 7, 8}; // Target combination
    //     int input4 = 10; // Maximum moves allowed

    //     // Call the treasureUnlock method and print the result
    //     int result = treasureChest.treasureUnlock(input1, input2, input3, input4);
    //     System.out.println(result); // Output the minimum moves needed or -1
    // }

    // }
        
    
