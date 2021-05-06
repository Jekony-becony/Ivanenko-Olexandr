import java.util.Scanner;

public class FirstClass {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Для начала работы введите \"Y\" ");
        Scanner sc = new Scanner(System.in);
        while (sc.nextLine().equals("Y")) {
            System.out.println("1.Составить алгоритм: если введенное число больше 7, то вывести “Привет” ");
            System.out.println("2.Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести \"Нет такого имени\"");
            System.out.println("3.Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3");
            System.out.print("Choose exercise: ");
            int variant = in.nextInt();
            in.nextLine();
            switch (variant) {
                case 1:
                    System.out.print("Enter number: ");
                    int num = in.nextInt();
                    moreThanSeven(num);
                    break;
                case 2:

                    System.out.print("Enter name: ");
                    String name = in.nextLine();
                    System.out.println(nameHelloyer(name));
                    break;
                case 3:
                    System.out.print("Enter massive length: ");
                    int length = in.nextInt();
                    int[] myArray = new int[length];
                    System.out.println("Your Array : ");
                    for (int i = 0; i < myArray.length; i++) {
                        System.out.print("[" + i +"]: ");
                        myArray[i] = in.nextInt();
                    }
                    multipleOfThree(myArray);
                    break;
            }
            System.out.println("Для продолжения работы введите \"Y\" (для окончания работы просто нажмите \"Enter\" ");
        }
    }

    private static void moreThanSeven(int num) {
        if (num > 7) {
            System.out.println("Привет");
        }
    }

    private static String nameHelloyer(String name) {
        if (name.equals("Вячеслав")) {
            return  "Привет, "+ name;
             }
        return "Нету такого имени";
    }

    private static void multipleOfThree(int[] myArray) {
        System.out.println("Елементы кратные трём: ");
        for (int i = 0; i < myArray.length; i++) {
            if ( myArray[i] != 0 && myArray[i] % 3 == 0) {
                System.out.println(myArray[i] + "  индекс:[" + i + "]");
            }


        }
    }

}



