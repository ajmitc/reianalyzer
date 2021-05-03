package rei;

import rei.controller.Controller;
import rei.model.Model;
import rei.view.View;

import javax.swing.*;

public class Main {
    public static void main(String ... args){
        Model model = new Model();
        View view = new View(model);
        new Controller(model, view);

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                view.getFrame().setVisible(true);
            }
        });
    }
}
