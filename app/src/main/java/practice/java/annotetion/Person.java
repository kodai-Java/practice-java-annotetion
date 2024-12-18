package practice.java.annotetion;

public class Person {
    @NotNull(message = "name is not null")
    private String name;
    public void setName(String name){
        this.name = name;
    }
}
