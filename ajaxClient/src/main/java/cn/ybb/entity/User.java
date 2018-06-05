package cn.ybb.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class User {
	
	private Integer user_id;
	private String user_name;
	private Integer user_age =0;
	private String user_sex;
	private Date user_birth;
	private String user_cardId;
	
	public User(){
		
	}


	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name
				+ ", user_age=" + user_age + ", user_sex=" + user_sex
				+ ", user_birth=" + user_birth + ", user_cardId=" + user_cardId
				+ "]";
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = Integer.parseInt(user_id);
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public Integer getUser_age() {
		return user_age;
	}

	public void setUser_age(String user_age) {
		this.user_age = Integer.parseInt(user_age);
	}

	public String getUser_sex() {
		return user_sex;
	}

	public void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
	}

	public Date getUser_birth() {
		return user_birth;
	}

	public void setUser_birth(String user_birth) {
		SimpleDateFormat ssf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = ssf.parse(user_birth);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.user_birth = date;
	}

	public String getUser_cardId() {
		return user_cardId;
	}

	public void setUser_cardId(String user_cardId) {
		this.user_cardId = user_cardId;
	}

}
