package UI.myControllers.buttons;

import UI.myControllers.Events;
import UI.myControllers.MyControllersInterface;

import UI.myControllers.Publisher;
import javafx.scene.control.Button;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;



public class FoldButton extends Button implements MyControllersInterface
{
    public FoldButton()
    {
        setText("FOLD");
        attachEventListeners();
    }

    @Override
    public void update(Events event)
    {

    }

    @Override
    public void attachEventListeners()
    {
        setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                m_publisher.notifyControllers(Events.FOLD_BUTTON_1_CLICKED);
            }
        });
    }

    @Override
    public void setPublisher(Publisher publisher)
    {
        m_publisher = publisher;
    }

    private Publisher m_publisher;
}
