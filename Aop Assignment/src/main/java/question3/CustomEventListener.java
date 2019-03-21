package question3;

import org.springframework.context.ApplicationListener;

public class CustomEventListener implements ApplicationListener<CustomEvent> {
    
    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println("Custom event listener is invoked.");
    }
}
