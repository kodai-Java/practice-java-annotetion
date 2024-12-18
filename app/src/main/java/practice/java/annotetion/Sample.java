
package practice.java.annotetion;

import java.util.ArrayList;
import java.util.List;

public class Sample {

    private List<Object> list = new ArrayList<Object>();

    public void add(Object obj) {
        if (obj instanceof Test) {
            this.list.add(obj);
        }
    }
}
