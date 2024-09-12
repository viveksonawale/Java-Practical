package ExperimentNo6;

public class Main {
    public static void main(String[] args) {
        //Creating an Array
        int[] arr = new int[5];
        //initializing the Values to Array
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        //printing the array using for each

        for (int value : arr) {
            System.out.println(value);
        }
        //Accessing the First and last element
        System.out.println("First Element:" + arr[0]);
        System.out.println("Last Element:" + arr[arr.length - 1]);

        //Updating the Arrays
        arr[0] = 15;
        System.out.println("updated the array 10 to 15:\t" + arr[0]);

        //Iterate over the Array
        for (int value : arr) {
            System.out.println(value);
        }
//        Array length
        System.out.println(arr.length);
    }
}
