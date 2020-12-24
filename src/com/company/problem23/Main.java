package com.company.problem23;

// DynamicIntArray dynamicIntArray = new DynamicIntArray();
//         dynamicIntArray.add(1);
//         dynamicIntArray.addAll(arrayToAdd); // int[]
//         dynamicIntArray.contains(4);
//         dynamicIntArray.remove(2); // index
//         dynamicIntArray.swap(1, 8);
//         dynamicIntArray.size();
//         dynamicIntArray.sort();
//         dynamicIntArray.print();

public class Main {
    public static void main(String[] args) {

        DynamicIntArray dynamicIntArray = new DynamicIntArray();
        dynamicIntArray.add(2);
        dynamicIntArray.add(3);
        dynamicIntArray.add(5);
        dynamicIntArray.add(8);
        dynamicIntArray.print();

        int[] justArray = new int[3];
        justArray = new int[]{9, 4, 1};

        dynamicIntArray.addAll(justArray);
        dynamicIntArray.print();

        System.out.println(dynamicIntArray.contains(4));

        dynamicIntArray.remove(2);
        dynamicIntArray.print();

        dynamicIntArray.swap(1, 3);
        dynamicIntArray.print();

        System.out.println((dynamicIntArray.size()));

        dynamicIntArray.sort();
        dynamicIntArray.print();
    }
}