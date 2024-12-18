package practice.java.annotetion;

public class UseTest {
    public static void main(String[] args) {
        // クラスの定義情報を取り出せる
        Class<Item> clazz = Item.class;
        Test test = clazz.getAnnotation(Test.class);

        if (test == null) {
            return;
        }

        Item item = new Item(test.name());

        System.out.println(item.getName());

    }
}
