package rei.view;

import rei.model.Model;

import javax.swing.*;
import java.awt.*;

public class AnalyzerPanel extends JPanel {

    private JTextField tfAddress1;
    private JTextField tfAddress2;
    private JTextField tfCity;
    private JTextField tfState;
    private JTextField tfZipcode;
    private JButton btnSearch;

    private AnalysisResultsPanel analysisResultsPanel;

    public AnalyzerPanel(Model model, View view){
        super();

        tfAddress1 = new JTextField();
        tfAddress2 = new JTextField();
        tfCity = new JTextField();
        tfState = new JTextField();
        tfZipcode = new JTextField();

        btnSearch = new JButton("Search");

        JPanel formpanel = new JPanel();
        new GridBagLayoutHelper(formpanel, true)
                .setGridWidth(2)
                .add(new JLabel("Search Address"))
                .resetGridWidth()
                .add(new JLabel("Address 1")).add(tfAddress1).nextRow()
                .add(new JLabel("Address 2")).add(tfAddress2).nextRow()
                .add(new JLabel("City")).add(tfCity).nextRow()
                .add(new JLabel("State")).add(tfState).nextRow()
                .add(new JLabel("Zip")).add(tfZipcode).nextRow()
                .setGridWidth(2)
                .setAnchor(GridBagConstraints.NORTHEAST)
                .add(btnSearch);

        JPanel westpanel = new JPanel();
        westpanel.setLayout(new BoxLayout(westpanel, BoxLayout.PAGE_AXIS));

        analysisResultsPanel = new AnalysisResultsPanel(model, view);

        setLayout(new BorderLayout());
        add(westpanel, BorderLayout.WEST);
        add(analysisResultsPanel, BorderLayout.CENTER);
    }

    public JTextField getTfAddress1() {
        return tfAddress1;
    }

    public JTextField getTfAddress2() {
        return tfAddress2;
    }

    public JTextField getTfCity() {
        return tfCity;
    }

    public JTextField getTfState() {
        return tfState;
    }

    public JTextField getTfZipcode() {
        return tfZipcode;
    }

    public JButton getBtnSearch() {
        return btnSearch;
    }

    public AnalysisResultsPanel getAnalysisResultsPanel() {
        return analysisResultsPanel;
    }
}
