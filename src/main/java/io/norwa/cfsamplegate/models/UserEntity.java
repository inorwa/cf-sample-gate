package io.norwa.cfsamplegate.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "users",schema = "public")
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private Long id;

	@Column(name = "login")
	private String login;

	@Column(name = "given_name")
	private String givenName;

	@Column(name = "family_name")
	private String familyName;

	public UserEntity() {
	}

	public UserEntity(String login, String givenName, String familyName) {
		this.login = login;
		this.givenName = givenName;
		this.familyName = familyName;
	}
}
