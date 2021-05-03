package rei.view;

import rei.analysis.PropertyAnalysisReport;
import rei.common.PropertyInfo;
import rei.model.Model;

import javax.swing.*;
import java.awt.*;

public class AnalysisResultsPanel extends JPanel {
    private Model model;
    private View view;

    private PropertyAnalysisReport propertyAnalysisReport;

    private JLabel lblAddress;
    private JTabbedPane tabbedPane;
    private CoCCalculatorPanel coCCalculatorPanel;

    public AnalysisResultsPanel(Model model, View view){
        super(new BorderLayout());
        this.model = model;
        this.view = view;

        lblAddress = new JLabel("");

        JPanel northpanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        northpanel.add(lblAddress);

        tabbedPane = new JTabbedPane();
        // TODO Add PropertyInfo reports

        coCCalculatorPanel = new CoCCalculatorPanel(model, view);

        add(northpanel, BorderLayout.NORTH);
        add(tabbedPane, BorderLayout.CENTER);
        add(coCCalculatorPanel, BorderLayout.EAST);
    }

    public CoCCalculatorPanel getCoCCalculatorPanel() {
        return coCCalculatorPanel;
    }

    public void setPropertyAnalysisReport(PropertyAnalysisReport propertyAnalysisReport) {
        this.propertyAnalysisReport = propertyAnalysisReport;

        lblAddress.setText(propertyAnalysisReport.getPropertyData().getAddress().toString(true));

        while (tabbedPane.getTabCount() > 0)
            tabbedPane.removeTabAt(0);
        for (PropertyInfo propertyInfo: propertyAnalysisReport.getPropertyData().getPropertyInfo()){
            tabbedPane.addTab(propertyInfo.getSourceId(), new PropertyInfoPanel(model, view, propertyInfo));
        }

        // TODO Update COC calculator panel
    }
}
