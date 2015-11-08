package java8.functions;

import java.util.function.BiPredicate;
import java.util.function.Supplier;

/**
 * Created by serhii on 03.11.15.
 */
public class _02TestDefaultsFunction {


    public static void main(String[] args) {
        BiPredicate predicate = ((o, o2) -> false);
        predicate.and((o, o2) -> true).or((o1, o21) -> true);

    }
}
