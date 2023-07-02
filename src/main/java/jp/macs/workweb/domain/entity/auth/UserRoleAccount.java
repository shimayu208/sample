package jp.macs.workweb.domain.entity.auth;

import lombok.Data;

@Data
public class UserRoleAccount {
	private int id;
	private String name;
	private String password;
	private String role;
}
