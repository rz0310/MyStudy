package Communication;

import java.io.Serializable;

/*
 * 消息包
 */
public class Message implements Serializable  {
	private String from;//发送者
	private String to;//接受者
	private int type;//消息类型
	private String info;//消息内容
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	public Message() {
		super();
	}
	public Message(String from, String to, int type, String info) {
		super();
		this.from = from;
		this.to = to;
		this.type = type;
		this.info = info;
	}
	@Override
	public String toString() {
		return "Message [from=" + from + ", to=" + to + ", type=" + type + ", info=" + info + "]";
	}
	
}
