package generics;

interface Container<T> {
    void add(T item);

    T get();
}

class StringContainer implements Container<String> {

    String value;

    @Override
    public void add(String item) {
        value = item;
    }

    @Override
    public String get() {
        return value;
    }
}

public class GenericInterface {
    public static void main(String[] args) {

        StringContainer container = new StringContainer();

        container.add("Hello");

        System.out.println(container.get());
    }
}

/* OUTPUT
Hello
*/