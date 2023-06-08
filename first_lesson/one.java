package first_lesson;

// import java.util.Scanner;
// программа, которая запрашивает имя пользователя
// Scanner sc = new Scanner(System.in, "cp866");// ср866 подключает кирилицу
//         System.out.print("Enter username: ");
//         String name = sc.nextLine();
//         System.out.println("Hi, " + name);
/**
 * one
 */
public class one {
    public static void main(String[] args) {
        // Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести макс кол-во подряд
        // идущих 1.
        int[] binaryArray = { 1, 1, 0, 1, 1, 1 }; // создали массив двоичных чисел
        int currentLength = 0;// объявили и инциализировали текущую длину
        int maxLength = 0;// объявили и инциализировали максимального количества идущих подряд 1
        for (int i = 0; i < binaryArray.length; i++) {
            if (binaryArray[i] == 1) {
                currentLength++;
            } else {
                if (currentLength > maxLength)
                    maxLength = currentLength;
                currentLength = 0;
            }
        }
        if (currentLength > maxLength)
            maxLength = currentLength;

        System.out.println(maxLength);
    }
}
