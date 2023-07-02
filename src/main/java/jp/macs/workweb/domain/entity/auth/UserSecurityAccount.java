package jp.macs.workweb.domain.entity.auth;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

public class UserSecurityAccount implements UserDetails {

	private static final long serialVersionUID = 1L;
	private String token="";
	private UserRoleAccount account;
	private Collection<? extends GrantedAuthority> authorityList;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public UserRoleAccount getAccount() {
		return account;
	}

	public void setAccount(UserRoleAccount account) {
		this.account = account;
	}

	public UserSecurityAccount(UserRoleAccount account) {
		this.account=account;
		this.token="token##"+account.getId()+"##"+account.getPassword();
		this.authorityList = this.getAuthorities();
		authorityList=AuthorityUtils.createAuthorityList(account.getRole());
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// 全員ADMIN
		//return AuthorityUtils.createAuthorityList("ROLE_ADMIN");
		return this.authorityList;
	}

	@Override
	public String getPassword() {
		// TODO 自動生成されたメソッド・スタブ
		return account.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO 自動生成されたメソッド・スタブ
		return Integer.toString(account.getId());
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO 自動生成されたメソッド・スタブ
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO 自動生成されたメソッド・スタブ
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO 自動生成されたメソッド・スタブ
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO 自動生成されたメソッド・スタブ
		return true;
	}

}
