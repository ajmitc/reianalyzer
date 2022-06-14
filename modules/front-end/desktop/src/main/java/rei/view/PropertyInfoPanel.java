package rei.view;

import rei.common.PropertyInfo;
import rei.Model;

import javax.swing.*;

public class PropertyInfoPanel extends JPanel {
    private PropertyInfo propertyInfo;

    public PropertyInfoPanel(Model model, View view, PropertyInfo info){
        super();
        propertyInfo = info;
    }
}
