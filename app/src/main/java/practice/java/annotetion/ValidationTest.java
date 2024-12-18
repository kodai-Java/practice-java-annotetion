package practice.java.annotetion;

import java.util.List;

public class ValidationTest {
    
    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
        Person p = new Person();
        
        p.setName("null");
        List<String> errors = ParsonValidator.validate(p);

        if (errors.isEmpty()){
            return;
        }

        for (String message: errors) {
            System.out.println(message);
        }

    }
}
