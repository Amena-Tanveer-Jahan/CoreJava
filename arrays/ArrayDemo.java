package arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[][] ar = new int[][] {{1,2,3,4,10},{3,4,5,6}};

        for(int i=0;i<ar.length;i++) {
            for(int j=0;j<ar[i].length;j++) {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
        for(int[] a:ar) {
            for(int i:a) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

        int[][] arr = new int[3][]; //jagged array

        arr[0] = new int[2] ;
        arr[1] = new int[3];
        arr[2] = new int[1];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = i+j;
            }
        }

        for(int[] a:arr){
            for(int i:a){
                System.out.println(i);

            }
        }

    }
}
