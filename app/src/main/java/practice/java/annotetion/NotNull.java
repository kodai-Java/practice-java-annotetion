package practice.java.annotetion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// コンストラクタ、メソッド、フィールドなどアノテーションをつける場所を制約する
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NotNull {
    // なんでメソッドなんだっけ？
    String message();
}
