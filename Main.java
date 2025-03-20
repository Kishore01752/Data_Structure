public class Main{
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int length = 5; 
        System.out.print("Original Arr:");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int insert = 25;
        int insertPos = 2; 
        int[] newArray = new int[length + 1];
        for (int i=0;i<insertPos;i++) {
            newArray[i] = arr[i];
        }
        newArray[insertPos]=insert;
        for (int i=insertPos;i<length;i++) {
            newArray[i + 1] = arr[i];
        }
        length++;
        System.out.print("Arr insert: ");
        for (int i=0;i<length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}

