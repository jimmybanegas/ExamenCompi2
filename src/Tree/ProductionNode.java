package Tree;

import java.util.List;

/**
 * Created by Jimmy Ramos on 15-Feb-17.
 */
public class ProductionNode extends  StatementNode {
    public String nonTerminal;

    public List<Production> productions;

    public ProductionNode(String nonTerminal, List<Production> productions){
        this.nonTerminal = nonTerminal;
        this.productions = productions;
    }
}
