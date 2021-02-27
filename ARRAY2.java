public class ARRAY2 {
    int[] array = {1, 2, 3, 4, 5, 6};
    int[] cloneArray = array.clone();
    public void printArray() {
        System.out.println("Array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public void printcloneArray(){
        System.out.println("clone Array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(cloneArray[i] + " ");
        }
    }
    public static void main(String[] args) {
        ARRAY2 a=new ARRAY2();
        a.printArray();
        a.printcloneArray();
    }
}