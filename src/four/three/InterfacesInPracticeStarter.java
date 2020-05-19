package four.three;

public class InterfacesInPracticeStarter {

    public static void main(String[] args) {

    }

    private enum Event {
        KEYBOARD_DELETE,
        KEYBOARD_SPACE,
        KEYBOARD_NUM_ONE,
        //...
        MOUSE_CLICK_LEFT,
        MOUSE_CLICK_RIGHT
    }

    private class EventHandlerImpl implements IEventHandler<Event> {

        @Override
        public void handle(Event event) {
            switch (event) {
                case KEYBOARD_DELETE:
                    //delete character...
                    break;
                case MOUSE_CLICK_LEFT:

                    //delete character...
                    break;
                //...
                default:
                    //...
                    break;
            }
        }
    }
}
