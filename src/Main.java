
public class Main {
    public static void main(String[] args) {
        task1();
        task2();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Массив");
        int[] arr = generateRandomArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
      }
    }

    public static void task2(int [arr]) {
        System.out.println("Пузырьковая сортировка");
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        swapElements(arr, j, j + 1);
                    }
                }
            }
        }
    }
