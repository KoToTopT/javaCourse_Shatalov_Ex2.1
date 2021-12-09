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
        printArrSumm(arr);
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
        for (int j : num) {
            if (j > 9 && j < 100)
                System.out.println(j);
        }
        System.out.println("-------------------------");
    }

    public static void printMaxNum(int[] num){
        int len = num.length;
        int max = 0;

        if (num.length == 0)
            System.out.println("Задан пустой массив");
        else max = num[0];

        for (int j : num) {
            if (j > max)
                max = j;
        }
        System.out.println(max);
        System.out.println("-------------------------");
    }

    public static void printArrSumm(int[] num){
        int len = num.length;
        int sum = 0;
        for (int j : num) {
            sum += j;
        }
        System.out.println(sum);
    }

}
