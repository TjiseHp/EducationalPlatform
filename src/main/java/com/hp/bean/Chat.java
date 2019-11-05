package com.hp.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Chat {
    private Integer chatNum;

    private Integer uId;//发件人

    private Integer uId2;//收件人

    private Integer cSNum;

    private String chatText;

    private Date chatDate;   
    
    private User user1;
    
    private User user2;
    
    private Chat_status chat_status;

 
    public Chat_status getChat_status() {
		return chat_status;
	}

	public void setChat_status(Chat_status chat_status) {
		this.chat_status = chat_status;
	}

	public User getUser1() {
		return user1;
	}

	public void setUser1(User user1) {
		this.user1 = user1;
	}

	public User getUser2() {
		return user2;
	}

	public void setUser2(User user2) {
		this.user2 = user2;
	}

	public Integer getChatNum() {
        return chatNum;
    }

    public void setChatNum(Integer chatNum) {
        this.chatNum = chatNum;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getuId2() {
        return uId2;
    }

    public void setuId2(Integer uId2) {
        this.uId2 = uId2;
    }

    public Integer getcSNum() {
        return cSNum;
    }

    public void setcSNum(Integer cSNum) {
        this.cSNum = cSNum;
    }

    public String getChatText() {
        return chatText;
    }

    public void setChatText(String chatText) {
        this.chatText = chatText == null ? null : chatText.trim();
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date getChatDate() {
        return chatDate;
    }

    public void setChatDate(Date chatDate) {
        this.chatDate = chatDate;
    }
}