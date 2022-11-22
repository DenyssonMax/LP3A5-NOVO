package programacaoFuncional.src;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class programacaofuncional {
    public static void main(String[] args) {
        String[] animals = {"javali", "Aguia", "Coelho", "Papagaio", "galinha", "garça"};

        List<String> animalsList = programacaofuncional.getList(animals);
        Set<String> animalsSet = programacaofuncional.getSet(animals);
        Map<String, Integer> animalsMap = programacaofuncional.getMap(animalsList);

        System.out.println("\nList");
        animalsList.forEach(System.out::println);

        System.out.println("\nSet");
        animalsSet.forEach(System.out::println);

        System.out.println("\nMap");
        animalsMap.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });

        System.out.println("\nCounting\n" + programacaofuncional.getLength(animals));

        System.out.println("\nJoining\n" + programacaofuncional.getJoinedString(animals));
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
