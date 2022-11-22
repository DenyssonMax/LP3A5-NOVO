package programacaoFuncional;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class programacaoFuncional {
    public static void main(String[] args) {
        String[] animals = {"Elefante", "Gato", "Cachorro", "Agua-viva"};

        List<String> animalsList = programacaoFuncional.getList(animals);
        Set<String> animalsSet = programacaoFuncional.getSet(animals);
        Map<String, Integer> animalsMap = programacaoFuncional.getMap(animalsList);

        System.out.println("\nList");
        animalsList.forEach(System.out::println);

        System.out.println("\nSet");
        animalsSet.forEach(System.out::println);

        System.out.println("\nMap");
        animalsMap.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });

        System.out.println("\nCounting\n" + programacaoFuncional.getLength(animals));

        System.out.println("\nJoining\n" + programacaoFuncional.getJoinedString(animals));
    }

    public static List<String> getList(String[] animals) {
        return Stream.of(animals).collect(Collectors.toList());
    }

    public static Map<String, Integer> getMap(List<String> animalsList) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        animalsList.stream().forEach((animal) -> map.put(animal, animal.length()));

        return map;
    }

    public static Set<String> getSet(String[] animals) {
        return Stream.of(animals).collect(Collectors.toSet());
    }

    public static Long getLength(String[] animals) {
        return Stream.of(animals).collect(Collectors.counting());
    }

    public static String getJoinedString(String[] animals) {
        return Stream.of(animals).collect(Collectors.joining());
    }
}


