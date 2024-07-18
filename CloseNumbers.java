import java.util.Arrays;
import java.util.Scanner;

public class CloseNumbers {
    public static void main(String[] args) {
        int[] array = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number :  ");
        int number = scanner.nextInt();

        Arrays.sort(array);

        // En yakın küçük ve büyük sayıları bulmak için başlangıç değerleri
        int closestSmaller = Integer.MIN_VALUE;
        int closestLarger = Integer.MAX_VALUE;

        // Dizi üzerinde gezinerek en yakın küçük ve büyük sayıları bulma
        for (int i : array) {
            if (i < number && i > closestSmaller) {
                closestSmaller = i;
            }
            if (i > number && i < closestLarger) {
                closestLarger = i;
            }
        }

        // Sonuçları yazdırma
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + (closestSmaller == Integer.MIN_VALUE ? "Yok" : closestSmaller));
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + (closestLarger == Integer.MAX_VALUE ? "Yok" : closestLarger));
    }
}
