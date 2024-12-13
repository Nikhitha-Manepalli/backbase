package com.backbase.message;

import com.backbase.dbs.messaging_service.api.service.v2.MessageApi;
import com.backbase.dbs.messaging_service.api.service.v2.model.MessageId;
import com.backbase.dbs.messaging_service.api.service.v2.model.MessageItem;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RestController
public class ExampleController implements MessageApi {

    @RequestMapping(method = RequestMethod.GET, value = "/message", produces = {
                    "application/json"
    })
    @ResponseStatus(HttpStatus.OK)
    public Message getMessage() {
        return new Message("Hello World");
    }

    @Override
    public ResponseEntity<Void> deleteMessage(String id) {
        return null;
    }

    @Override
    public ResponseEntity<MessageItem> getMessage(String id) {
        return null;
    }

    @Override
    public ResponseEntity<List<MessageItem>> getMessages() {
        return null;
    }

    @Override
    public ResponseEntity<MessageId> postMessage(MessageItem body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> putMessage(MessageItem body) {
        return null;
    }
}