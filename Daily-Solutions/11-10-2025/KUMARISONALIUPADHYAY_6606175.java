import java.util.Scanner;

public class KUMARISONALIUPADHYAY_6606175{

    // Function to print unique elements
    public static void printUnique(int[] nums) {
        System.out.println("Unique elements:");

        for (int i = 0; i < nums.length; i++) {
            boolean duplicate = false;

            // check if number appeared before
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.print(nums[i] + " ");
            }
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scan.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }

        // call the function
        printUnique(nums);
    }
}
