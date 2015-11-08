package java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class _01CreateStream {
    public static void main(String[] args) {

        //Arrays.stream(<arr>)
        List<Integer> container = new ArrayList<>();


        int[] array = new int[10];
        Arrays.parallelSetAll(array, (operand -> operand *2));

        Arrays.stream(array).forEach(container::add);

        Arrays.stream(array).map(operand -> operand / 2);

        Stream.of("Kolia", "Vasia", "Oleg");
        Stream.empty();
        Stream.generate(Math::random);


        Stream.builder().add("1").add("2").add(3).build();



    }
}
