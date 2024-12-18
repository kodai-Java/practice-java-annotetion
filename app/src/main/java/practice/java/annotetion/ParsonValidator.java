package practice.java.annotetion;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ParsonValidator {

    public static List<String> validate(Person target) throws IllegalArgumentException, IllegalAccessException {
        Class<Person> clazz = (Class<Person>) target.getClass();
        Field[] fields = clazz.getDeclaredFields();

        List<String> errors = new ArrayList<String>();
        for (Field field: fields) {
            field.setAccessible(true);
            NotNull annotation = field.getAnnotation(NotNull.class);

            // アノテーションがついていないフィールドだった場合
            if (annotation == null) {
                continue;
            }

            // 指定したオブジェクトの指定のフィールドから値を取り出す
            // 値がnullじゃない場合
            if (field.get(target) != null) {
                continue;
            }
            String message = annotation.message();
            errors.add(message);
        }
        return errors;
    }
}