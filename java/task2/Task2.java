import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Number 1");
        System.out.println(duplicateChars("Barack", "Obama"));
        System.out.println("----------------------");
        System.out.println("Number 2");
        System.out.println(dividedByThree(new int[] {3, 12, 7, 81, 52}));
        System.out.println("----------------------");
        System.out.println("Number 3");
        System.out.println(getInitials("simonov sergei evgenievich"));
        System.out.println(getInitials("kozhevnikova tatiana vitalevna"));
        System.out.println("----------------------");
        System.out.println("Number 4");
        System.out.println(Arrays.toString(normalizator(new double[]{3.5, 7.0, 1.5, 9.0, 5.5})));
        System.out.println(Arrays.toString(normalizator(new double[]{10.0, 10.0, 10.0, 10.0})));
        System.out.println("----------------------");
        System.out.println("Number 5");
        System.out.println(Arrays.toString(compressedNums(new double[]{1.6, 0, 212.3, 34.8, 0, 27.5})));
        System.out.println(Arrays.toString(compressedNums(new double[]{0, 0, 0, 5})));
        System.out.println("----------------------");
        System.out.println("Number 6");
        System.out.println(camelToSnake("helloWorld"));
        System.out.println("----------------------");
        System.out.println("Number 7");
        System.out.println(secondBiggest(new int[]{3, 5, 8, 1, 2, 4}));
        System.out.println("----------------------");
        System.out.println("Number 8");
        System.out.println(localReverse("baobab", 'b'));
        System.out.println(localReverse("Hello, I'm under the water, please help me", 'e'));
        System.out.println("----------------------");
        System.out.println("Number 9");
        System.out.println(equal(8, 1, 8));
        System.out.println(equal(5, 5, 5));
        System.out.println(equal(4, 9, 6));
        System.out.println("----------------------");
        System.out.println("Number 10");
        System.out.println(isAnagram("LISTEN", "silent")); // true
        System.out.println(isAnagram("Eleven plus two?", "Twelve plus one!")); // true
        System.out.println(isAnagram("hello", "world"));
        System.out.println("----------------------");
    }

    public static String duplicateChars(String x, String y){
        StringBuilder result = new StringBuilder();
        String z = x.toLowerCase();
        String v = y.toLowerCase();
        for (char ch : z.toCharArray()) {
            if (v.indexOf(ch) == -1) {
                result.append(ch);
            }
        }
        return result.toString(); 
    }

    public static int dividedByThree(int[] x){
        int n = 0;
        for (int i : x) {
            if (i%2!=0 && i%3==0) {
                n++;
            }
        }
        return n;
    }

    public static String getInitials(String x){
        String[] n = x.split(" ");
        String name = Character.toUpperCase(n[1].charAt(0)) + "." + Character.toUpperCase(n[2].charAt(0)) + "." + " " + Character.toUpperCase(n[0].charAt(0)) +  n[0].substring(1);
        return name;
    }

    public static double[] normalizator(double[] x) {
        double min = Arrays.stream(x).min().getAsDouble();
        double max = Arrays.stream(x).max().getAsDouble();

        if (min == max) {
            return new double[x.length];
        }
        double[] normalized = new double[x.length];
        for (int i = 0; i < x.length; i++) {
            normalized[i] = ((x[i] - min) / (max - min));
        }
        return normalized;
    }

    public static int[] compressedNums(double[] array) {
        int[] nonZeroArray = Arrays.stream(array).filter(value -> value != 0).mapToInt(value -> (int) Math.floor(value)).toArray();
        Arrays.sort(nonZeroArray);
        return nonZeroArray;
    }

    public static String camelToSnake(String str) {
        return str.replaceAll("([A-Z])", "_$1").toLowerCase();
    }

    public static int secondBiggest(int[] array) {
        if (array.length < 2) {
            return -1; 
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE; 

        for (int num : array) {
            if (num > max) {
                secondMax = max; 
                max = num; 
            } else if (num > secondMax && num < max) {
                secondMax = num; 
            }
        }

        return secondMax == Integer.MIN_VALUE ? -1 : secondMax; 
    }

    public static String localReverse(String str, char marker) {
        List<Integer> markerIndices = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == marker) {
                markerIndices.add(i);
            }
        }

        if (markerIndices.size() % 2 != 0) {
            markerIndices.remove(markerIndices.size() - 2);
        }

        StringBuilder result = new StringBuilder(str);

        for (int i = 0; i < markerIndices.size(); i += 2) {
            int start = markerIndices.get(i) + 1;
            int end = markerIndices.get(i + 1);

            String reversed = new StringBuilder(result.substring(start, end)).reverse().toString();
            result.replace(start, end, reversed);
        }

        return result.toString();
    }

    public static int equal(int a, int b, int c) {
        if (a == b && b == c) return 3;
        if (a == b || b == c || a == c) return 2;
        return 0;
    }

    public static boolean isAnagram(String str1, String str2) {
        char[] arr1 = str1.toLowerCase().replaceAll("[^a-z]", "").toCharArray();
        char[] arr2 = str2.toLowerCase().replaceAll("[^a-z]", "").toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}