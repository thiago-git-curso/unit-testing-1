package school.cesar.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

//@ExtendWith(MockitoExtension.class)
public class MyApplicationTest {

    //@InjectMocks private MyApplication myApplication;
   // @Mock private MessageService service;

    MessageService fakeService = new MessageService() {
        @Override
        public boolean sendMessage(String msg, String rec) {
            return Math.random() > 0.5;
        }
    };

    @Test
    public void processMessage_sendMessageIsTrue_true() {
        MessageService service = new MessageService() {
            @Override
            public boolean sendMessage(String msg, String rec) {
                return true;
            }
        };

        MyApplication application = new MyApplication();
        application.setService(service);

        Message dummy = new Message();

        Assertions.assertTrue(application.processMessage(dummy));
    }

}
