package question2;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class CloseEventListener implements ApplicationListener<ContextClosedEvent> {
    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("Application Context is closed");
    }
}
