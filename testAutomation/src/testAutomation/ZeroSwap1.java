package testAutomation;

import java.util.Arrays;

public class ZeroSwap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Number = {5,4,2,0,1,0,1,0,4,0,4,5,0,8};
        int zero = 0;             // Pointer to place the next zero
        int nonzero = Number.length - 1;   // Pointer to place the next non-zero

        // Iterate over the array
        while (zero < nonzero) {
            if (Number[zero] != 0) {
                // If the current element is not zero, swap it with the element at the 'nonzero' index
                int temp = Number[zero];
                Number[zero] = Number[nonzero];
                Number[nonzero] = temp;
                nonzero--;
            } else {
                zero++;
            }
        }

        // Print the rearranged array
        System.out.println(Arrays.toString(Number));
    }
}
