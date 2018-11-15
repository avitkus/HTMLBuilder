package edu.unc.cs.htmlBuilder.css;

import edu.unc.cs.htmlBuilder.util.Offsetter;
import java.util.ArrayList;

/**
 * @author Andrew Vitkus
 *
 */
public class CSSFile implements ICSSFile {

    private final ArrayList<IRule> rules;

    public CSSFile() {
        rules = new ArrayList<>(5);
    }

    @Override
    public void addRule(IRule rule) {
        rules.add(rule);
    }

    @Override
    public String getCSS(int depth) {
        StringBuilder css = new StringBuilder(100);
        for (IRule rule : rules) {
            css.append(Offsetter.indent(depth)).append(rule.getCSS(depth)).append("\r\n");
        }
        return css.toString();
    }

    @Override
    public IRule[] getRules() {
        return rules.toArray(new IRule[rules.size()]);
    }

}
