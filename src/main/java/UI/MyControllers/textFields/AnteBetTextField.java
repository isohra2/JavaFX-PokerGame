package UI.myControllers.textFields;

import UI.myControllers.Events;
import UI.myControllers.MyControllersInterface;
import UI.myControllers.Publisher;
import javafx.beans.InvalidationListener;
import javafx.scene.control.TextField;

public class AnteBetTextField extends TextField implements MyControllersInterface
{
    @Override
    public void update(Events event)
    {

    }

    @Override
    public void attachEventListeners()
    {

    }

    @Override
    public void setPublisher(Publisher publisher)
    {
        m_publisher = publisher;
    }

    void setEventListeners()
    {
        textProperty().addListener((observable, oldValue, newValue ) -> {
            // TODO
        });

    }

    private Publisher m_publisher;
}
