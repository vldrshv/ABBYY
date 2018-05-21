public class Main {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        int x = 99;

        for(int a: arr){
            System.out.print(a + " ");
        }
        System.out.println();

        DeletingNums d = new DeletingNums();
        int size = d.deleteNumFromArray(arr, x);

        System.out.println("\nTransformed array:");
        System.out.println("size = " + size);
        for(int a : arr){
            System.out.print(a + " ");
        }

    }
}
