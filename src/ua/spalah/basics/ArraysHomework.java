package ua.spalah.basics;

/**
 * Created by dmitry.dev on 14.12.2016.
 */

    public class ArraysHomework {

        public static void main(String[] args) {
            int arr[] = {1,3,5,6,-7,4,0,333,-52,11,1};
            System.out.println(min(arr, true));
            System.out.println(max(arr, true));
            System.out.println(min(arr, false));
            System.out.println(max(arr, false));
            System.out.println(average(arr));
            printarr(reverse(arr));
        }

        public static int max(int[] array, boolean sort) {
            if(sort) {
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array.length - i - 1; j++) {
                        if (array[j] > array[j + 1]) {
                            int tmp = array[j];
                            array[j] = array[j + 1];
                            array[j + 1] = tmp;
                        }
                    }
                }
                return array[0];
            }
            else
            {
                int result = array[0];
                for (int i = 0; i <array.length ; i++) {
                    if(array[i]>result)
                    {
                        result = array[i];
                    }
                }
                return result;
            }
        }

        public static int min(int[] array, boolean sort) {
            if(sort) {
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array.length - i - 1; j++) {

                        if (array[j] < array[j + 1]) {
                            int tmp = array[j];
                            array[j] = array[j + 1];
                            array[j + 1] = tmp;
                        }
                    }
                }
                return array[0];
            }
            else
            {
                int result = array[0];
                for (int i = 0; i <array.length ; i++) {
                    if(array[i]<result)
                    {
                        result = array[i];
                    }
                }
                return result;
            }
        }

        public static int average(int[] array) {
            int sum=0;
            for (int i: array)
            {
                sum +=i;
            }
            return sum/array.length;
        }

        public static int[] reverse(int[] array) {
            for (int i = 0; i <(array.length)/2 ; i++) {
                int tmp = array[i];
                int arrlength =array.length-1;
                array[i] = array[(arrlength-i)];
                array[(arrlength-i)] = tmp;
            }
            return array;
        }
        public static void printarr(int[] array)
        {
            for (int element: array) {
                System.out.println(element);
            }
        }
    }

