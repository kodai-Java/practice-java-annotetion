package practice.java.annotetion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
// なんでRetentionが必要なんだっけ？
@Retention(RetentionPolicy.RUNTIME)
public @interface NotNull {
    // なんでメソッドなんだっけ？
    String message();
}
