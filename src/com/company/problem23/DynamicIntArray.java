package com.company.problem23;

public class DynamicIntArray {

    private int[] array = new int[0];

    public int[] add(int number) {
        int[] myArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            myArray[i] = array[i];
        }
        myArray[myArray.length - 1] = number;
        array = myArray;
        return array;
    }

    public int[] addAll(int[] arr) {
        int j = 0;
        int[] myArray = new int[array.length + arr.length];
        for (int i = 0; i < array.length; i++) {
            myArray[i] = array[i];
        }
        for (int i = array.length; i < myArray.length; i++) {
            myArray[i] = arr[j];
            j++;
        }
        array = myArray;
        return array;
    }

    public boolean contains(int number) {
        boolean checker = true;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                checker = true;
                break;
            } else {
                checker = false;
            }
        }
        return checker;
    }

    public int[] remove(int index) {
        int[] myArray = new int[array.length - 1];
        for (int i = 0; i < index; i++) {
            myArray[i] = array[i];
        }
        for (int i = index; i < myArray.length; i++) {
            myArray[i] = array[i + 1];
        }
        array = myArray;
        return array;
    }

    public int[] swap(int index1, int index2) {
        int temp;
        int[] myArray = new int[array.length];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = array[i];
            temp = myArray[index2];
            myArray[index2] = myArray[index1];
            myArray[index1] = temp;
        }
        array = myArray;
        return array;
    }

    public int size() {
        return array.length;
    }

    public int[] sort() {
        int helper;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    helper = array[j];
                    array[j] = array[i];
                    array[i] = helper;
                }
            }
        }
        return array;
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
}