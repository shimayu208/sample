package jp.macs.workweb.domain.repository.auth;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import jp.macs.workweb.domain.entity.auth.UserRoleAccount;

@Mapper
public interface UsersExtMapper {

	@Select("select u.id,u.name,u.password,r.role from users u,role r where u.role_id = r.role_id and u.id= #{id}")
	UserRoleAccount getUserRoleAccount(Integer Id);
}