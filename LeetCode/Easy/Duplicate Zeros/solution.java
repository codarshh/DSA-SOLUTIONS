// class Solution {
//     public void duplicateZeros(int[] arr) {
//         List<Integer> list = new ArrayList<>();

//         // Add elements to the ArrayList, duplicating 0s
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == 0) {
//                 list.add(0);
//                 list.add(0);
//             } else {
//                 list.add(arr[i]);
//             }
//         }

//         // Copy back the first arr.length elements
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = list.get(i);
//         }
//     }
// }


class Solution {
    public void duplicateZeros(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length && list.size() < arr.length; i++) {
            if (arr[i] == 0) {
                list.add(0);
                if (list.size() < arr.length) {
                    list.add(0);
                }
            } else {
                list.add(arr[i]);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
    }
}