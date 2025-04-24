import animals.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Cow cow = new Cow("cow", 5, 60, "male");
        Cow cow1 = new Cow("cow1", 7, 74, "female");
        Cow cow2 = new Cow("cow2", 15, 150, "male");
        Cow cow3 = new Cow("cow3", 6, 69, "female");
        Cow cow4 = new Cow("cow4", 5, 61, "male");
        Cow cow5 = new Cow("cow5", 10, 97, "female");

        Sheep sheep = new Sheep("sheep", 7, 45, "male");
        Sheep sheep1 = new Sheep("sheep1", 5, 40, "female");
        Sheep sheep2 = new Sheep("sheep2", 8, 56, "male");
        Sheep sheep3 = new Sheep("sheep3", 7, 46, "female");

        Horse horse = new Horse("horse", 9, 67, "male", "brown");
        Horse horse1 = new Horse("horse1", 10, 70, "female", "white");
        Horse horse2 = new Horse("horse2", 5, 50, "male", "black");

        Farm farm1 = new Farm("Russia", "Aleksey",
                new Cow[]{(Cow) cow, cow1, cow2, cow3, cow4},
                new Sheep[]{(Sheep) sheep, sheep1, sheep2},
                new Horse[]{(Horse) horse, horse1});

        System.out.println(farm1);

        Farm farm2 = new Farm("Bishkek", "Timur",
                new Cow[]{(Cow) cow5},
                new Sheep[]{(Sheep) sheep3},
                new Horse[]{(Horse) horse2});

        System.out.println("======================================================");

        System.out.println(farm2);

    }
}