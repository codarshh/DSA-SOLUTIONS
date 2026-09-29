class Solution {
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks, (a, b) -> (a[1] - a[0]) - (b[1] - b[0]));
        
        int energy = 0;
        for (int[] task : tasks) {
            int actual = task[0];
            int minimum = task[1];
            energy = Math.max(energy + actual, minimum);
        }
        
        return energy;
    }
}  



// class Solution {
//     public int minimumEffort(int[][] tasks) {
//         Arrays.sort(tasks, (a, b) -> {
//             int diff1 = a[1] - a[0];
//             int diff2 = b[1] - b[0];
//             return diff2 - diff1;
//         });

//         int energy = 0;

//         for (int[] task : tasks) {
//             int actual = task[0];
//             int minimum = task[1];

//             energy = Math.max(energy + actual, minimum);
//         }

//         return energy;
//     }
// }