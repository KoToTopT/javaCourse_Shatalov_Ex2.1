public class Main {


    public static void main(String[] args) {
        int[] arr = new int[] {3, 22, 1, 13, 4, 6, 16, 5};

        // Задание 1
        printEven(arr);

        // Задание 2
        printTwoDigitNum(arr);

        // Задание 3
        printMaxNum(arr);

        // Задание 4
        System.out.println(arr.length);
    }

    public static void printEven(int[] num){
        int len = num.length;
        for (int i = 0; i < len; i++){
            if (num[i] % 2 == 0)
                System.out.println(num[i]);
        }
        System.out.println("-------------------------");
    }

    public static void printTwoDigitNum(int[] num){
        int len = num.length;
        for (int i = 0; i < len; i++){
            if (num[i] > 9)
                System.out.println(num[i]);
        }
        System.out.println("-------------------------");
    }

    public static void printMaxNum(int[] num){
        int len = num.length;
        int max = 0;
        for (int i = 0; i < len; i++){
            if (num[i] > max)
                max = num[i];
        }
        System.out.println(max);
        System.out.println("-------------------------");
    }

}
