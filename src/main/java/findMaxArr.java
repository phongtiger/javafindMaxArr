import java.util.Scanner;

public class findMaxArr {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(" Enter arr size");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size must < 20");
            } else {
                array = new int[size];
                int i = 0;
                while (i<array.length) {
                    System.out.println("Enter element "+(i+1)+" : ");
                    array[i] = scanner.nextInt();
                    i++;
                }
                System.out.println("Property list: ");
                for (int j = 0 ;j<array.length;j++){
                    System.out.println(array[j]+"\t");
                }

                int max = array[0];
                int index = 1;
                for (int k = 1; k < array.length; k++) {
                    if (max < array[k]) {
                        max = array[k];
                        index = k + 1;
                    }
                }
                System.out.println("The Max of list: "+max+" is positive "+ index);
                break;
            }
        } while (size<20);
    }
}
