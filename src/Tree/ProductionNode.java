package Tree;

import java.util.List;

/**
 * Created by Jimmy Ramos on 16-Feb-17.
 */
public class ProductionNode extends StatementNode {
    public String nonterminal;

    public List<String> productions;

    public ProductionNode(String nonterminal, List<String> productions) {

        this.nonterminal = nonterminal;
        this.productions = productions;
    }

}
