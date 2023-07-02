package jp.macs.workweb.domain.entity;

import lombok.Data;

@Data
public class Message {


	private String name;
	private String statement;
	public Message() {}
	public Message(String name, String statement) {
        this.name = name;
        this.statement = statement;
    }
}
