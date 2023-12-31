package jp.macs.workweb.domain.repository.auth;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

import jp.macs.workweb.domain.entity.user.Users;
import jp.macs.workweb.domain.entity.user.UsersCriteria;

@Mapper
public interface UsersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Wed Jan 25 21:34:43 JST 2023
     */
    @SelectProvider(type=UsersSqlProvider.class, method="countByExample")
    long countByExample(UsersCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Wed Jan 25 21:34:43 JST 2023
     */
    @DeleteProvider(type=UsersSqlProvider.class, method="deleteByExample")
    int deleteByExample(UsersCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Wed Jan 25 21:34:43 JST 2023
     */
    @Delete({
        "delete from users",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Wed Jan 25 21:34:43 JST 2023
     */
    @Insert({
        "insert into users (id, password, ",
        "name, mailaddress, ",
        "role_id)",
        "values (#{id,jdbcType=INTEGER}, #{password,jdbcType=CHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{mailaddress,jdbcType=VARCHAR}, ",
        "#{roleId,jdbcType=INTEGER})"
    })
    int insert(Users row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Wed Jan 25 21:34:43 JST 2023
     */
    @InsertProvider(type=UsersSqlProvider.class, method="insertSelective")
    int insertSelective(Users row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Wed Jan 25 21:34:43 JST 2023
     */
    @SelectProvider(type=UsersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="password", property="password", jdbcType=JdbcType.CHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="mailaddress", property="mailaddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.INTEGER)
    })
    List<Users> selectByExample(UsersCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Wed Jan 25 21:34:43 JST 2023
     */
    @Select({
        "select",
        "id, password, name, mailaddress, role_id",
        "from users",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="password", property="password", jdbcType=JdbcType.CHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="mailaddress", property="mailaddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.INTEGER)
    })
    Users selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Wed Jan 25 21:34:43 JST 2023
     */
    @UpdateProvider(type=UsersSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("row") Users row, @Param("example") UsersCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Wed Jan 25 21:34:43 JST 2023
     */
    @UpdateProvider(type=UsersSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("row") Users row, @Param("example") UsersCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Wed Jan 25 21:34:43 JST 2023
     */
    @UpdateProvider(type=UsersSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Users row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbg.generated Wed Jan 25 21:34:43 JST 2023
     */
    @Update({
        "update users",
        "set password = #{password,jdbcType=CHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "mailaddress = #{mailaddress,jdbcType=VARCHAR},",
          "role_id = #{roleId,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Users row);
}