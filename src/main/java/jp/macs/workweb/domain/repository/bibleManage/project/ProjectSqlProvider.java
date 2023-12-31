package jp.macs.workweb.domain.repository.bibleManage.project;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.jdbc.SQL;

import jp.macs.workweb.domain.entity.bibleManage.project.Project;
import jp.macs.workweb.domain.entity.bibleManage.project.ProjectCriteria;
import jp.macs.workweb.domain.entity.bibleManage.project.ProjectCriteria.Criteria;
import jp.macs.workweb.domain.entity.bibleManage.project.ProjectCriteria.Criterion;

public class ProjectSqlProvider {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated Wed Jan 18 20:35:13 JST 2023
     */
    public String countByExample(ProjectCriteria example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("project");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated Wed Jan 18 20:35:13 JST 2023
     */
    public String deleteByExample(ProjectCriteria example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("project");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated Wed Jan 18 20:35:13 JST 2023
     */
    public String insertSelective(Project row) {
        SQL sql = new SQL();
        sql.INSERT_INTO("project");
        
        if (row.getProjectId() != null) {
            sql.VALUES("project_id", "#{projectId,jdbcType=VARCHAR}");
        }
        
        if (row.getProjectName() != null) {
            sql.VALUES("project_name", "#{projectName,jdbcType=VARCHAR}");
        }
        
        if (row.getStaff() != null) {
            sql.VALUES("staff", "#{staff,jdbcType=VARCHAR}");
        }
        
        if (row.getReleaseDate() != null) {
            sql.VALUES("release_date", "#{releaseDate,jdbcType=DATE}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated Wed Jan 18 20:35:13 JST 2023
     */
    public String selectByExample(ProjectCriteria example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("project_id");
        } else {
            sql.SELECT("project_id");
        }
        sql.SELECT("project_name");
        sql.SELECT("staff");
        sql.SELECT("release_date");
        sql.FROM("project");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated Wed Jan 18 20:35:13 JST 2023
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        Project row = (Project) parameter.get("row");
        ProjectCriteria example = (ProjectCriteria) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("project");
        
        if (row.getProjectId() != null) {
            sql.SET("project_id = #{row.projectId,jdbcType=VARCHAR}");
        }
        
        if (row.getProjectName() != null) {
            sql.SET("project_name = #{row.projectName,jdbcType=VARCHAR}");
        }
        
        if (row.getStaff() != null) {
            sql.SET("staff = #{row.staff,jdbcType=VARCHAR}");
        }
        
        if (row.getReleaseDate() != null) {
            sql.SET("release_date = #{row.releaseDate,jdbcType=DATE}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated Wed Jan 18 20:35:13 JST 2023
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("project");
        
        sql.SET("project_id = #{row.projectId,jdbcType=VARCHAR}");
        sql.SET("project_name = #{row.projectName,jdbcType=VARCHAR}");
        sql.SET("staff = #{row.staff,jdbcType=VARCHAR}");
        sql.SET("release_date = #{row.releaseDate,jdbcType=DATE}");
        
        ProjectCriteria example = (ProjectCriteria) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated Wed Jan 18 20:35:13 JST 2023
     */
    public String updateByPrimaryKeySelective(Project row) {
        SQL sql = new SQL();
        sql.UPDATE("project");
        
        if (row.getProjectName() != null) {
            sql.SET("project_name = #{projectName,jdbcType=VARCHAR}");
        }
        
        if (row.getStaff() != null) {
            sql.SET("staff = #{staff,jdbcType=VARCHAR}");
        }
        
        if (row.getReleaseDate() != null) {
            sql.SET("release_date = #{releaseDate,jdbcType=DATE}");
        }
        
        sql.WHERE("project_id = #{projectId,jdbcType=VARCHAR}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table project
     *
     * @mbg.generated Wed Jan 18 20:35:13 JST 2023
     */
    protected void applyWhere(SQL sql, ProjectCriteria example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}