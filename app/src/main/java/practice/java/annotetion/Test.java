package practice.java.annotetion;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// マーカーインターフェースは何も抽象メソッドを持たない
// プロセッサが処理をするしないを分け方をする
// マーカーインターフェースの代表例はSerializableなど
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
    String name();
}
