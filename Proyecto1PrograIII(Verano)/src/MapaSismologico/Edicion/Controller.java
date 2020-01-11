
package MapaSismologico.Edicion;


public class Controller {
     Model model;
    View view;
    
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        view.setModel(model);
        view.setController(this);
    }
    public void show(){
        view.setVisible(true);
    }
    
    public void hide(){
        view.setVisible(false);
    }
}
