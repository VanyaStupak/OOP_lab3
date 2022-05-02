import java.util.Arrays;
import java.util.Scanner;

public class OOP_lab3 {
    public static void main(String[] args) {
        Vowels vow = new Vowels();
        StringBuilder strBuilder = new StringBuilder("Митець потрібен своєму народові та й усьому світові тільки тоді, коли його творчість поєднується з криком його нації!");
        StringBuilder strBuilderout = new StringBuilder();
        System.out.print("Введіть кількість букв: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String[] array = (strBuilder.toString() + " ").split("\\p{P}?[ \\t\\n\\r]+");
        String[] array1 = strBuilder.toString().split(" ");
        System.out.println("Початкове речення: " + strBuilder.toString());
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                if (array[array.length - 1].length() != number) {
                    strBuilderout.append(array1[array1.length - 1]);
                    break;
                }
                break;
            }
            if (array1[i + 1].length() == array[i + 1].length() + 1 && array[i + 1].length() == number && !(Vowels.isVowels(array[i + 1].charAt(0)))) {
                strBuilderout.append(array1[i]).append(array1[i + 1].charAt(array1[i + 1].length() - 1)).append(" ");
            } else if (array[i].length() != number || (array1[i].length() != array[i].length() + 1 && array[i].length() != number) || Vowels.isVowels(array[i].charAt(0))) {
                strBuilderout.append(array1[i]).append(" ");
            }
        }
        System.out.println("Змінене речення:   " + strBuilderout.toString().trim());
    }

}
