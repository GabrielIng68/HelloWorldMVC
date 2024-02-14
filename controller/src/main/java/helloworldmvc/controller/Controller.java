package helloworldmvc.controller;

import helloworldmvc.model.IModel;
import helloworldmvc.view.IView;

public class Controller {
    private IModel model;
    private IView view;

    public Controller(IModel model, IView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        view.display(model.getMessage());
    }
}
