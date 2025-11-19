package JAVA8;

import java.util.function.Supplier;
import java.util.UUID;

public class SupplierTest {

    public static void main(String[] args) {
        Supplier<String>uId = () -> {
            UUID uuid= new UUID(232323,2323232);
            return uuid.toString();
        };
        System.out.println(uId);

    }
}
