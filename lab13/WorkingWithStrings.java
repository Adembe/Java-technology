package homework14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class WorkingWithStrings {

    public WorkingWithStrings(){
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Choose: 1.encode strings 2.decode strings 3.exit");
            String option = scan.nextLine();
            if(option.equals("3")) break;
            System.out.println("Enter the string");
            String data = scan.nextLine();
            if(option.equals("1")) System.out.println(encode(data));
            else System.out.println(decode(data));
        }
    }

    public static String encode(String input) {
        return input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .map(entry -> entry.getValue() > 1 ? entry.getValue() + String.valueOf(entry.getKey()) : String.valueOf(entry.getKey()))
                .collect(Collectors.joining());
    }

    public static String decode(String input) {
        List<String> countCharPairs = new ArrayList<>();

        Pattern pattern = Pattern.compile("(\\d*)([a-zA-Z])");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String countString = matcher.group(1);
            int count = countString.isEmpty() ? 1 : Integer.parseInt(countString);
            char character = matcher.group(2).charAt(0);

            countCharPairs.add(String.valueOf(count) + character);
        }

        return countCharPairs.stream().map(pair -> {
            int count = Integer.parseInt(pair.substring(0, pair.length() - 1));
            char character = pair.charAt(pair.length() - 1);
            return String.valueOf(character).repeat(Math.max(0, count));
        }).collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
    }

    public static void main(String[] args) {
        new WorkingWithStrings();
    }
}

