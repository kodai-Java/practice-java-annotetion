package practice.java.annotetion;

// マーカーインターフェースをつけた。シールを貼ったというイメージ
@Test(name = "test")
public class Item {
    private String name;

    public Item(String name) {
        super();
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
