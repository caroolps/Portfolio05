package fatec.sp.gov.br.firstspring.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dim_time_participation")
public class DimTime {
	
    @Id
	@Column(name = "tim_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    
	@Column(name = "chat_created_at")
	private Date create;
	
	@Column(name = "chat_disconnect")
	private String disconnect;
	
	@Column(name = "chat_hash_connect")
	private String connect;
	
	@Column(name = "chat_from")
	private String chat;
	
	@Column(name = "chat_id")
	private String chatId;

	@Column(name = "chat_user_id")
	private int chatUser;

	@Column(name = "chat_update_at")
	private Date chatUpdate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreate() {
		return create;
	}

	public void setCreate(Date create) {
		this.create = create;
	}

	public String getDisconnect() {
		return disconnect;
	}

	public void setDisconnect(String disconnect) {
		this.disconnect = disconnect;
	}

	public String getConnect() {
		return connect;
	}

	public void setConnect(String connect) {
		this.connect = connect;
	}

	public String getChat() {
		return chat;
	}

	public void setChat(String chat) {
		this.chat = chat;
	}

	public String getChatId() {
		return chatId;
	}

	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public int getChatUser() {
		return chatUser;
	}

	public void setChatUser(int chatUser) {
		this.chatUser = chatUser;
	}

	public Date getChatUpdate() {
		return chatUpdate;
	}

	public void setChatUpdate(Date chatUpdate) {
		this.chatUpdate = chatUpdate;
	}

}
