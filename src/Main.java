import com.personetics.test.ChainValidator;
import com.personetics.test.Node;
import com.personetics.test.NodeNumber;
import com.personetics.test.NodeString;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Node> nodes1 = new ArrayList<>();
        nodes1.add(new NodeNumber(36));
        nodes1.add(new NodeNumber(6));
        nodes1.add(new NodeNumber(24));
        nodes1.add(new NodeNumber(4));
        nodes1.add(new NodeNumber(47));
        nodes1.add(new NodeNumber(7));
        nodes1.add(new NodeNumber(2));
        nodes1.add(new NodeNumber(3));
        nodes1.add(new NodeNumber(27));

        System.out.println(ChainValidator.validate(nodes1)); // Valid Chain  TRUE

        List<Node> nodes2 = new ArrayList<>();
        nodes2.add(new NodeString("p"));
        nodes2.add(new NodeString("aba"));
        nodes2.add(new NodeString("a"));
        nodes2.add(new NodeString("b"));
        nodes2.add(new NodeString("perso"));
        nodes2.add(new NodeString("o"));
        nodes2.add(new NodeString("r"));
        nodes2.add(new NodeString("e"));
        nodes2.add(new NodeString("s"));

        System.out.println(ChainValidator.validate(nodes2)); // Valid Chain TRUE

        List<Node> nodes3 = new ArrayList<>();
        nodes3.add(new NodeNumber(35));
        nodes3.add(new NodeNumber(5));
        nodes3.add(new NodeNumber(65));
        nodes3.add(new NodeNumber(6));
        nodes3.add(new NodeNumber(24));
        nodes3.add(new NodeNumber(4));

        System.out.println(ChainValidator.validate(nodes3)); // Invalid Chain FALSE
    }


}