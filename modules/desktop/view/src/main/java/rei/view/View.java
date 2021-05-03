package rei.view;

import rei.model.Model;

import javax.swing.*;
import java.awt.*;

public class View {
    private Model model;
    private JFrame frame;

    private AnalyzerPanel analyzerPanel;

    public View(Model model){
        this.model = model;
        this.frame = new JFrame();

        this.frame.setTitle("REI Analyzer Tool");
        this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.frame.setLocation(0, 0);

        analyzerPanel = new AnalyzerPanel(model, this);

        this.frame.setLayout(new BorderLayout());
        this.frame.add(analyzerPanel, BorderLayout.CENTER);
    }

    public JFrame getFrame() {
        return frame;
    }

    public AnalyzerPanel getAnalyzerPanel() {
        return analyzerPanel;
    }
}
