package com.techforwarder.bot.simplebot.controller;

import com.techforwarder.bot.simplebot.entity.Message;
import com.techforwarder.bot.simplebot.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest")
public class RestBotController {

    @Autowired
    private ChatService chatservice;


    @RequestMapping(value = "/{userRequest}", method = RequestMethod.GET)
    public Message getResponse(@PathVariable("userRequest") String userRequest, Model model) {

        Message message = new Message();
        message.setStatus("success");
        message.setMessage(chatservice.getChatResponse(userRequest));
        return message;
    }




}
