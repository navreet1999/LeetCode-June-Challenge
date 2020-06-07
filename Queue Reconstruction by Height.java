/*
Suppose you have a random list of people standing in a queue. Each person is described by a pair of integers (h, k), where h is the height of the person and k is the number of people in front of this person who have a height greater than or equal to h. Write an algorithm to reconstruct the queue.

Note:
The number of people is less than 1,100.

 
Example

Input:
[[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]

Output:
[[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]*/



class Solution {
    public int[][] reconstructQueue(int[][] people) {
          // Sort the array by descending order of it's heights if height is not same
        // ans if there height's are same then check the number of people in front 
        // of this person and sort it by ascending order
        Arrays.sort(people,(x,y) -> x[0] == y[0] ? (x[1] - y[1]) : (y[0] - x[0]));
		// (x[1] - y[1]) part is for descending order of there heigths and (y[0] - x[0]) is for 
		// ascending order of there k value
        
        // I have taken an ArrayList of Integer Arrays
        List<int[]> list = new ArrayList<>();
        int len = people.length;
        for(int i = 0;i < len;i++)
        {
            int k = people[i][1];    // take the k value of each person and place 
            list.add(k , people[i]); // it to the k th index position of ArrayList
        }
        
        return list.toArray(new int[len][2]); // return the array
    }
}