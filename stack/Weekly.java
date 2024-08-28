import java.util.Stack;

public class Weekly {
    public static int[] findNextSmallerElements(int[] heights) {
        Stack<Integer> nst = new Stack<>();
        int len = heights.length;
        int[] next = new int[len];

        // Initialize the next array for the last element
        next[len - 1] = -1;
        nst.push(len - 1);

        for (int i = len - 2; i >= 0; i--) {
            // Pop elements from the stack until the current height is less than the height at the index stored in the stack
            while (!nst.isEmpty() && heights[nst.peek()] >= heights[i]) {
                nst.pop();
            }

            // If the stack is empty, there is no smaller element to the right, so set next[i] to -1
            if (nst.isEmpty()) {
                next[i] = -1;
            } else {
                // Otherwise, the next smaller element is at the index on top of the stack
                next[i] = nst.peek();
            }

            // Push the current index onto the stack
            nst.push(i);
        }
        
        return next;
    }

    public static void main(String[] args) {
        int[] heights = {2, 1, 4, 3, 5, 6, 2}; // Example input
        int[] result = findNextSmallerElements(heights);
        for (int index : result) {
            System.out.print(index + " ");
        }
    }
}
