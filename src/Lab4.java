import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab4 {

    public static void main(String[] args) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите размер массива: ");
                int size = scanner.nextInt();
                if(size != 0 & size >1) {
                int[] originalArray = new int[size];

                System.out.println("Введите элементы массива: ");
                    for (int i = 0; i < size; i++) {
                        originalArray[i] = scanner.nextInt();
                    }
                        System.out.println("Введите элемент, который хотите удалить из массива: ");
                        int elemdeleted = scanner.nextInt();

                        int num = 0;
                        for (int i = 0; i < originalArray.length; i++) {
                            if (originalArray[i] == elemdeleted) {
                                num++;
                            }
                        }
                        int[] newArray = new int[size - num];
                        int index = 0;
                        for (int i = 0; i < originalArray.length; i++) {
                            if (originalArray[i] != elemdeleted) {
                                newArray[index] = originalArray[i];
                                index++;
                            }
                        }

                        System.out.println("Исходный массив: " + Arrays.toString((originalArray)));
                        System.out.println("Новый массив: " + Arrays.toString((newArray)));
                    scanner.close();
                } else System.out.println("Для выполнения данной задачи размерность массива должна быть положительной и больше единицы!");
            } catch (InputMismatchException e) {
                System.out.println("Ошибка! Необходимо ввести целое число!");
            }
        }
    }