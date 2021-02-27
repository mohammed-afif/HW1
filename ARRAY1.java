public class ARRAY1 {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7};
        int array2[]={0,0,0,0,0,0,0};
        System.out.println("array 1");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println("\n");
        int n = array.length-1;
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[n];
            array[n] = temp;
            n--;
        }
        System.out.println("array 2\n");
        for (int i = 0; i <array.length ; i++) {
             array2[i] = array[i];
            System.out.print(array2[i] + "  ");
        }
       // System.out.println(array2.length-1);
    }
}