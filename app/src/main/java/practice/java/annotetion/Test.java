package practice.java.annotetion;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// マーカーインターフェースは何も抽象メソッドを持たない
// プロセッサが処理をするしないを分け方をする
// マーカーインターフェースの代表例はSerializableなど

// アノテーションを定義するためのアノテーションをメタアノテーションと呼ぶ

// リテンションポリシー
// マーカーの保持期間のこと
// class
// classファイルの中に消える
// コンパイラが処理をしたらそれ以降いらない
// デフォルトはclassになってる
// classファイルそのものをいじりたいときに必要。プログラマーには不要
// runtime
// プログラマーが使うもの
// リフレクションで読み取れる
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
    String name();
}
