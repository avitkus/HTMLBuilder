package edu.unc.cs.htmlBuilder.form;

import java.util.ArrayList;
import edu.unc.cs.htmlBuilder.IHTMLElement;
import edu.unc.cs.htmlBuilder.util.AttributeManager;
import edu.unc.cs.htmlBuilder.util.EventManager;
import edu.unc.cs.htmlBuilder.util.IAttributeManager;
import edu.unc.cs.htmlBuilder.util.IEventManager;
import edu.unc.cs.htmlBuilder.util.Offsetter;
import edu.unc.cs.htmlBuilder.util.ScriptGenerator;

public class Select extends AbstractFormElement implements ISelect {

    private final IAttributeManager attrs;
    private final ArrayList<IHTMLElement> options;
    private String className;
    private String id;

    /**
     *
     */
    public Select() {
        super(false, true);
        attrs = new AttributeManager();
        options = new ArrayList<>(5);
        className = "";
        id = "";
    }

    @Override
    public void addOption(IOption option) {
        options.add(option);
    }

    @Override
    public IOption[] getOptions() {
        ArrayList<IOption> optionList = new ArrayList<>(5);
        for (IHTMLElement element : options) {
            if (element instanceof IOption) {
                optionList.add((IOption) element);
            } else if (element instanceof IOptionGroup) {
                for (IOption option : ((IOptionGroup) element).getOptions()) {
                    optionList.add(option);
                }
            }
        }
        return optionList.toArray(new IOption[optionList.size()]);
    }

    @Override
    public void addOptionGroup(IOptionGroup group) {
        options.add(group);
    }

    @Override
    public IOptionGroup[] getOptionGroups() {
        ArrayList<IOptionGroup> optionGroupList = new ArrayList<>(3);
        options.stream().filter((element) -> (element instanceof IOptionGroup))
                .forEach((element) -> optionGroupList.add((IOptionGroup) element));

        return optionGroupList.toArray(new IOptionGroup[optionGroupList.size()]);
    }

    @Override
    public String getText(int depth) {
        StringBuilder html = new StringBuilder(50);

        html.append(Offsetter.indent(depth++)).append("<select");
        if (!className.isEmpty()) {
            html.append(" class=\"").append(className).append("\"");
        }
        if (!id.isEmpty()) {
            html.append(" id=\"").append(id).append("\"");
        }
        html.append(attrs.getHTML());
        html.append(getEventManager().getHTML()).append(">\n");
        for (IHTMLElement option : options) {
            html.append(option.getText(depth)).append("\n");
        }
        html.append(Offsetter.indent(depth - 1)).append("</select>");

        return html.toString();
    }

    @Override
    public String getTagType() {
        return "select";
    }

    @Override
    public void setAutoFocus(boolean autofocus) {
        if (autofocus) {
            attrs.addAttribute("autofocus", null);
        } else {
            attrs.removeAttribute("autofocus");
        }
    }

    @Override
    public boolean getAutoFocus() {
        return attrs.hasAttribute("autofocus");
    }

    @Override
    public void setDisabled(boolean disable) {
        if (disable) {
            attrs.addAttribute("disabled", null);
        } else {
            attrs.removeAttribute("disabled");
        }
    }

    @Override
    public boolean getDisabled() {
        return attrs.hasAttribute("diabled");
    }

    @Override
    public void setForm(String form) {
        attrs.addAttribute("form", form);
    }

    @Override
    public String getForm() {
        return attrs.getAttribute("form");
    }

    @Override
    public void setMultiple(boolean multiple) {
        if (multiple) {
            attrs.addAttribute("multiple", null);
        } else {
            attrs.removeAttribute("multiple");
        }
    }

    @Override
    public boolean getMultiple() {
        return attrs.hasAttribute("multiple");
    }

    @Override
    public void setName(String name) {
        attrs.addAttribute("name", name);
    }

    @Override
    public String getName() {
        return attrs.getAttribute("name");
    }

    @Override
    public void setRequired(boolean required) {
        if (required) {
            attrs.addAttribute("required", null);
        } else {
            attrs.removeAttribute("required");
        }
    }

    @Override
    public boolean getRequired() {
        return attrs.hasAttribute("required");
    }

    @Override
    public void setSize(int size) {
        attrs.addAttribute("size", Integer.toString(size));
    }

    @Override
    public int getSize() {
        return Integer.parseInt(attrs.getAttribute("size"));
    }

    @Override
    public void addAttribute(String name, String value) {
        attrs.addAttribute(name, value);
    }

    @Override
    public void removeAttribute(String name) {
        attrs.removeAttribute(name);
    }

    @Override
    public String getAttribute(String name) {
        return attrs.getAttribute(name);
    }

    @Override
    public String[][] getAttributes() {
        return attrs.getAttributes();
    }

    @Override
    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String getClassName() {
        return className;
    }

    @Override
    public void setID(String id) {
        this.id = id;
    }

    @Override
    public String getID() {
        return id;
    }

    @Override
    public String getTagAbbr() {
        return "select";
    }
}
