package school.cesar.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MyApplicationMockedTest {

    @InjectMocks MyApplication application;
    @Mock MessageService service;

//    @Test
//    public void processMessage_sendMessageReturningTrue_true() {
//        Message dummy = new Message();
//        when(service.sendMessage(null, null)).thenReturn(true);
//        Assertions.assertTrue(application.processMessage(dummy));
//    }

    @Test
    public void processMessage_sendMessageNoMsg_false() {
        Message dummy = new Message();
        when(service.sendMessage(null, null)).thenReturn(false);
        Assertions.assertFalse(application.processMessage(dummy));
    }

    @Test
    public void processMessage_sendMessageWithMsg_true() {
        Message dummy = new Message("Hello World", "tfss@cesar.school");

        when(service.sendMessage(anyString(),anyString())).thenReturn(true);
        Assertions.assertTrue(application.processMessage(dummy));
    }

}
