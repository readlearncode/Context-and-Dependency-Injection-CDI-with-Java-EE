package com.readlearncode;

import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@Named
@ConversationScoped
public class SignUp implements Serializable {

    @Inject
    private FacesContext facesContext;

    @Inject
    private Conversation conversation;

    private String name;
    private String address;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void initConversation() {
        if (!facesContext.isPostback() && conversation.isTransient()) {
            conversation.begin();
        }
    }

    public String handleSecondStepSubmit() {
        return "step2?faces-redirect=true";
    }

    public String handleThirdStepSubmit() {
        return "step3?faces-redirect=true";
    }

    public String handleFourthStepSubmit() {
        return "step4?faces-redirect=true";
    }

    public String finishConversation() {
        if (!conversation.isTransient()) {
            conversation.end();
        }
        return "step1?faces-redirect=true";
    }

    public Conversation getConversation() {
        return conversation;
    }

}