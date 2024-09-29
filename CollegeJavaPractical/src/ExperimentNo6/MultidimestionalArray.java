package ExperimentNo6;

public class MultidimestionalArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {1,2,3,4},
                {1,2,3,4,5}
        };
        System.out.println("Length of row 1:"+arr[0].length);
        System.out.println("Length of row 2:"+arr[1].length);
        System.out.println("Length of row 3:"+arr[2].length);
    }
}
