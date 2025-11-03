package homeworks.java.cosmo.string;

/**
 * Дана строка: ”Где мои деньги?”.
 * Необходимо собрать предложение в обратном порядке: “Деньги мои где?”.
 * Где мои деньги? -> Деньги мои где?
 * <p>
 * Подсказка: используйте методы .split(), .trim(), .replace() и .replaceFirst() класса String
 */
public class ExG {
    public static void main(String[] args) {
        String input = "Где мои деньги?";
        String[] words = input.split(" ");
        String resultFirst = words[2]
                .replace("?", "")
                .replaceFirst("д", "Д");
        String resultSecond = words[1];
        String resultThird = words[0].replaceFirst("Г", "г");
        String result = resultFirst + " " + resultSecond + " " + resultThird;
        System.out.println(result + "?");
    }
}