// There are n people standing in a line labeled from 1 to n. The first person in the line is holding a pillow initially. Every second, the person holding the pillow passes it to the next person standing in the line. Once the pillow reaches the end of the line, the direction changes, and people continue passing the pillow in the opposite direction.

// For example, once the pillow reaches the nth person they pass it to the n - 1th person, then to the n - 2th person and so on.
// Given the two positive integers n and time, return the index of the person holding the pillow after time seconds.

 

// Example 1:

// Input: n = 4, time = 5
// Output: 2
// Explanation: People pass the pillow in the following way: 1 -> 2 -> 3 -> 4 -> 3 -> 2.
// After five seconds, the 2nd person is holding the pillow.
// Example 2:

// Input: n = 3, time = 2
// Output: 3
// Explanation: People pass the pillow in the following way: 1 -> 2 -> 3.
// After two seconds, the 3rd person is holding the pillow.
 

// Constraints:

// 2 <= n <= 1000
// 1 <= time <= 1000
//    Hide Hint #1
// Simulate the process of passing the pillow.
//    Hide Hint #2
// Use a variable to keep track of the current person holding the pillow.
//    Hide Hint #3
// Use a boolean variable to keep track of the direction of passing the pillow.
//    Hide Hint #4
// Use a loop to simulate the process of passing the pillow for time seconds.
//    Hide Hint #5
// Return the index of the person holding the pillow after time seconds.
//    Hide Hint #6
// The index of the person holding the pillow is 1-based.

// Solution
// Simulate the process of passing the pillow using a loop for time seconds. Use a variable to keep track of the current person holding the pillow and a boolean variable to keep track of the direction of passing the pillow.

// If the direction is true, increment the current person by 1. If the current person is greater than n, set the direction to false and decrement the current person by 2. If the direction is false, decrement the current person by 1. If the current person is less than 1, set the direction to true and increment the current person by 2.

// After time seconds, return the current person holding the pillow.

class PassThePillow {
    public int passThePillow(int n, int time) {
        int current = 1;
        boolean direction = true;

        for (int i = 0; i < time; i++) {
            if (direction) {
                current++;
                if (current > n) {
                    direction = false;
                    current -= 2;
                }
            } else {
                current--;
                if (current < 1) {
                    direction = true;
                    current += 2;
                }
            }
        }

        return current;
    }

    public static void main(String[] args) {
        PassThePillow passThePillow = new PassThePillow();

        // Example 1
        int n1 = 4, time1 = 5;
        System.out.println(passThePillow.passThePillow(n1, time1)); // Expected output: 2

        // Example 2
        int n2 = 3, time2 = 2;
        System.out.println(passThePillow.passThePillow(n2, time2)); // Expected output: 3
    }
}