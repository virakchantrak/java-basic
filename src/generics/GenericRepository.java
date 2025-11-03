package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericRepository {
    public static void main(String[] args) {
        Repository<String> stringRepo = new Repository<>();
        stringRepo.addItem("Hello");
        stringRepo.addItem("World");

        Repository<Integer> intRepo = new Repository<>();
        intRepo.addItem(1);
        intRepo.addItem(2);
        intRepo.addItem(3);

        System.out.println("String Repository: " + stringRepo.getAllItems());
        System.out.println("Integer Repository: " + intRepo.getAllItems());
    }
    public static class Repository<T> {
        private final List<T> items = new ArrayList<>();
        public void addItem(T item) {
            items.add(item);
        }
        public T getItem(int index) {
            return items.get(index);
        }
        public List<T> getAllItems() {
            return items;
        }
    }
}
