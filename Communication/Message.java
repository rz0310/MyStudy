package Communication;

import java.io.Serializable;

/*
 * ��Ϣ��
 */
public class Message implements Serializable  {
	private String from;//������
	private String to;//������
	private int type;//��Ϣ����
	private String info;//��Ϣ����
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
