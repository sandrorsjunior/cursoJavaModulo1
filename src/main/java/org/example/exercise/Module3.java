package org.example.exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Module3 {
    public ArrayList<Integer> getParNumbers(int init, int end){
        ArrayList<Integer> result = new ArrayList<>();
        init = init%2 == 0 ? init : init+1;
        for (int i = init; i <= end; i += 2) {
            result.add(i);
        }
        return result;
    }

    public static ArrayList<Integer> criarSequenciaStream(int inicio, int fim) {
        return IntStream.rangeClosed(inicio, fim)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public HashMap<String, Integer> getNumbersInRange(ArrayList<Integer> numbers, int min, int max) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        int insideOfInterval = 0;
        for (int number : numbers) {
            if (number >= min && number <= max) {
                insideOfInterval += 1;
            }
        }
        result.put("inside", insideOfInterval);
        result.put("outside", numbers.size() - insideOfInterval);
        return result;
    }

}

