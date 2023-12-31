package jp.macs.workweb.domain.repository.bibleManage.pullpush;

import java.util.List;

import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

import jp.macs.workweb.domain.entity.bibleManage.pullpush.Pullpush;
import jp.macs.workweb.domain.entity.bibleManage.pullpush.PullpushCriteria;

@Mapper
public interface PullpushMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pullpush
     *
     * @mbg.generated Sun Jan 22 15:04:47 JST 2023
     */
    @SelectProvider(type=PullpushSqlProvider.class, method="countByExample")
    long countByExample(PullpushCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pullpush
     *
     * @mbg.generated Sun Jan 22 15:04:47 JST 2023
     */
    @DeleteProvider(type=PullpushSqlProvider.class, method="deleteByExample")
    int deleteByExample(PullpushCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pullpush
     *
     * @mbg.generated Sun Jan 22 15:04:47 JST 2023
     */
    @Insert({
        "insert into pullpush (pullpush_id, each_doc_id, ",
        "file_id, folder_id, ",
        "project_id, status, ",
        "pulled_date, pushed_date)",
        "values (#{pullpushId,jdbcType=INTEGER}, #{eachDocId,jdbcType=INTEGER}, ",
        "#{fileId,jdbcType=INTEGER}, #{folderId,jdbcType=INTEGER}, ",
        "#{projectId,jdbcType=INTEGER}, #{status,jdbcType=INTEGER}, ",
        "#{pulledDate,jdbcType=DATE}, #{pushedDate,jdbcType=DATE})"
    })
    int insert(Pullpush row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pullpush
     *
     * @mbg.generated Sun Jan 22 15:04:47 JST 2023
     */
    @InsertProvider(type=PullpushSqlProvider.class, method="insertSelective")
    int insertSelective(Pullpush row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pullpush
     *
     * @mbg.generated Sun Jan 22 15:04:47 JST 2023
     */
    @SelectProvider(type=PullpushSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="pullpush_id", property="pullpushId", jdbcType=JdbcType.INTEGER),
        @Result(column="each_doc_id", property="eachDocId", jdbcType=JdbcType.INTEGER),
        @Result(column="file_id", property="fileId", jdbcType=JdbcType.INTEGER),
        @Result(column="folder_id", property="folderId", jdbcType=JdbcType.INTEGER),
        @Result(column="project_id", property="projectId", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="pulled_date", property="pulledDate", jdbcType=JdbcType.DATE),
        @Result(column="pushed_date", property="pushedDate", jdbcType=JdbcType.DATE)
    })
    List<Pullpush> selectByExample(PullpushCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pullpush
     *
     * @mbg.generated Sun Jan 22 15:04:47 JST 2023
     */
    @UpdateProvider(type=PullpushSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("row") Pullpush row, @Param("example") PullpushCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pullpush
     *
     * @mbg.generated Sun Jan 22 15:04:47 JST 2023
     */
    @UpdateProvider(type=PullpushSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("row") Pullpush row, @Param("example") PullpushCriteria example);
}