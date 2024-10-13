import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("task1");
        System.out.println(isStrangePair("ratio", "orator"));
        System.out.println(isStrangePair("sparkling", "groups"));
        System.out.println(isStrangePair("bush", "hubris"));
        System.out.println(isStrangePair("", ""));
        System.out.println("----------------------");

        System.out.println("task2");
        List<String[]> items = new ArrayList<>();
        items.add(new String[]{"Laptop", "124200"});
        items.add(new String[]{"Phone", "51450"});
        items.add(new String[]{"Headphones", "13800"});

        List<String[]> result = sale(items, 25);
        for (String[] item : result) {
            System.out.println("Product: " + item[0] + ", Price: " + item[1]);
        }
        System.out.println("----------------------");

        System.out.println("task3");
        System.out.println(successShoot(0, 0, 5, 2, 2));
        System.out.println(successShoot(-2, -3, 4, 5, -6));
        System.out.println("----------------------");

        System.out.println("task4");
        System.out.println(parityAnalysis(243));
        System.out.println(parityAnalysis(12));
        System.out.println(parityAnalysis(3));
        System.out.println("----------------------");

        System.out.println("task5");
        System.out.println(rps("rock", "paper"));
        System.out.println(rps("paper", "rock"));
        System.out.println(rps("paper", "scissors"));
        System.out.println(rps("scissors", "scissors"));
        System.out.println(rps("scissors", "paper"));
        System.out.println("----------------------");

        System.out.println("task6");
        System.out.println(bugger(39));
        System.out.println(bugger(999));
        System.out.println(bugger(4));
        System.out.println("----------------------");

        System.out.println("task7");
        String[][] itemsTop = {
            {"Скакалка", "550", "8"},
            {"Шлем", "3750", "4"},
            {"Мяч", "2900", "10"}
        };
        System.out.println(mostExpensive(itemsTop));
        System.out.println("----------------------");

        System.out.println("task8");
        System.out.println(longestUnique("abcba"));
        System.out.println(longestUnique("bbb")); 
        System.out.println("----------------------");

        System.out.println("task9");
        System.out.println(isPrefix("automation", "auto-"));
        System.out.println(isSuffix("arachnophobia", "-phobia"));
        System.out.println(isPrefix("retrospect", "sub-"));
        System.out.println(isSuffix("vocation", "-logy"));
        System.out.println("----------------------");

        System.out.println("task10");
        System.out.println(doesBrickFit(1, 1, 1, 1, 1));
        System.out.println(doesBrickFit(1, 2, 1, 1, 1)); 
        System.out.println(doesBrickFit(1, 2, 2, 1, 1)); 
    }

    public static boolean isStrangePair(String str1, String str2) {
        if (str1.isEmpty() && str2.isEmpty()) {
            return true; 
        }

        if (str1.isEmpty() || str2.isEmpty()) {
            return false;
        }
        
        return (str1.charAt(0) == str2.charAt(str2.length() - 1)) && 
               (str1.charAt(str1.length() - 1) == str2.charAt(0));
    }

    public static List<String[]> sale(List<String[]> items, int discount) {
        List<String[]> discountedItems = new ArrayList<>();

        for (String[] item : items) {
            String name = item[0];
            int price = Integer.parseInt(item[1]);

            double discountPrice = price * (1 - (discount / 100.0));
            int finalPrice = (int) Math.round(discountPrice);

            if (finalPrice < 1) {
                finalPrice = 1;
            }
            discountedItems.add(new String[]{name, String.valueOf(finalPrice)});
        }
        return discountedItems;
    }

    public static boolean successShoot(int x, int y, int r, int m, int n) {
        return (Math.pow(m - x, 2) + Math.pow(n - y, 2)) <= Math.pow(r, 2);
    }

    public static boolean parityAnalysis(int num) {
        int sum = 0;
        int n = num;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return (num % 2) == (sum % 2);
    }

    public static String rps(String player1, String player2) {
        if (player1.equals(player2)) {
            return "Tie";
        }

        if ((player1.equals("rock") && player2.equals("scissors")) ||
            (player1.equals("scissors") && player2.equals("paper")) ||
            (player1.equals("paper") && player2.equals("rock"))) {
            return "Player 1 wins";
        } else {
            return "Player 2 wins";
        }
    }

    public static int bugger(int num) {
        int count = 0;

        while (num >= 10) {
            count++;
            int product = 1;

            while (num > 0) {
                product *= num % 10;
                num /= 10;
            }
            num = product;
        }
        return count;
    }

    public static String mostExpensive(String[][] items) {
        String mostExpensiveItem = "";
        int maxCost = 0;

        for (String[] item : items) {
            String name = item[0];
            int price = Integer.parseInt(item[1]);
            int quantity = Integer.parseInt(item[2]);

            int totalCost = price * quantity;
            if (totalCost > maxCost) {
                maxCost = totalCost;
                mostExpensiveItem = name;
            }
        }

        return "Наиб. общ. стоимость у предмета " + mostExpensiveItem + " - " + maxCost;
    }

    public static String longestUnique(String str) {
        String longest = "";
        int start = 0; 

        Set<Character> uniqueChars = new HashSet<>();

        for (int end = 0; end < str.length(); end++) {
            char currentChar = str.charAt(end);

            while (uniqueChars.contains(currentChar)) {
                uniqueChars.remove(str.charAt(start));
                start++;
            }
            uniqueChars.add(currentChar);

            if (end - start + 1 > longest.length()) {
                longest = str.substring(start, end + 1);
            }
        }

        return longest;
    }

    public static boolean isPrefix(String word, String prefix) {
        return word.startsWith(prefix.substring(0, prefix.length() - 1));
    }

    public static boolean isSuffix(String word, String suffix) {
        return word.endsWith(suffix.substring(1));
    }

    public static boolean doesBrickFit(int a, int b, int c, int w, int h) {
        return (a <= w && b <= h) || (a <= h && b <= w) || 
               (a <= w && c <= h) || (a <= h && c <= w) || 
               (b <= w && c <= h) || (b <= h && c <= w) || 
               (c <= w && a <= h) || (c <= h && a <= w);
    }
}

