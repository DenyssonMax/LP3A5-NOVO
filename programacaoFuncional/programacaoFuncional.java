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

   
}


