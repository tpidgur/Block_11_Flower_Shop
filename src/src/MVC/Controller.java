package MVC;


/**
 * Class controller:
 *
 * @author Pidhurska Tetiana
 * @version 1 (created on 22.06.2016)
 */
public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * creates the bouquet
     */
    public void processUser() {
        view.printMessage(View.CREATE_BOUQUET);
        model.createRoseBouquet();
    }


}
