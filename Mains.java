public class Mains {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int length = 5; 
        System.out.print("Ori Array: ");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int valueToInsert = 5;
        int[] newArray = new int[length + 1];
        newArray[0] = valueToInsert;
        for (int i = 0; i < length; i++) {
            newArray[i + 1] = array[i];
        }
        length++;
        System.out.print("Array insert at begin: ");
        for (int i = 0; i < length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
