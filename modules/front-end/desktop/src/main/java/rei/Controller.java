package rei;

import rei.analysis.DefaultPropertyAnalyzer;
import rei.analysis.PropertyAnalysisReport;
import rei.analysis.PropertyAnalyzer;
import rei.common.PropertyAddress;
import rei.view.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private Model model;
    private View view;

    private PropertyAnalyzer propertyAnalyzer;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;

        propertyAnalyzer = new DefaultPropertyAnalyzer();

        this.view.getAnalyzerPanel().getBtnSearch().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PropertyAddress property = new PropertyAddress();
                property.setAddress1(view.getAnalyzerPanel().getTfAddress1().getText());
                property.setAddress2(view.getAnalyzerPanel().getTfAddress2().getText());
                property.setCity(view.getAnalyzerPanel().getTfCity().getText());
                property.setState(view.getAnalyzerPanel().getTfState().getText());
                property.setZipcode(view.getAnalyzerPanel().getTfZipcode().getText());
                runPropertyAnalysis(property);
            }
        });
    }

    private void runPropertyAnalysis(PropertyAddress property){
        PropertyAnalysisReport report = propertyAnalyzer.analyze(property);
    }
}
