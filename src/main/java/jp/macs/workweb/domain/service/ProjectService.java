package jp.macs.workweb.domain.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.macs.workweb.domain.entity.bibleManage.project.Project;
import jp.macs.workweb.domain.entity.bibleManage.project.ProjectCriteria;
import jp.macs.workweb.domain.repository.bibleManage.project.ProjectMapper;
import jp.macs.workweb.ifentity.entity.bibleManage.ProjectInfo;

@Service
@Transactional
public class ProjectService {
	
	@Autowired
	ProjectMapper projectMapper; 

	/**
	 * 案件一覧
	 * @return
	 */
	public List<ProjectInfo> selectAll(){
		ProjectCriteria example= new ProjectCriteria();
		List<Project> projectList = new ArrayList();
		List<ProjectInfo> projectInfoList = new ArrayList();
		projectList=projectMapper.selectByExample(example);
		
		//プロパティのコピー（projectList→projectInfoList）
		for(Project project:projectList) {
			ProjectInfo projectInfo=new ProjectInfo();
			BeanUtils.copyProperties(project,projectInfo);
			projectInfoList.add(projectInfo);
		}
		return projectInfoList;
	}
	/**
	 * 案件取得
	 * @param project_id
	 * @return
	 */
	public ProjectInfo selectOne(String projectId){
		Project project= projectMapper.selectByPrimaryKey(projectId);
		ProjectInfo projectInfo=new ProjectInfo();
		BeanUtils.copyProperties(project, projectInfo);
		return projectInfo;
	}
	/**
	 * 案件作成
	 * @param project
	 * @return
	 */
	public int insertProject(ProjectInfo projectInfo){
		Project project= new Project();
		BeanUtils.copyProperties(projectInfo, project);
		return projectMapper.insertSelective(project);
	}
	/**
	 * 更新
	 * @param project
	 * @return
	 */
	public int updateProject(Project project){
		return projectMapper.updateByPrimaryKeySelective(project);
	}
	/**
	 * 削除
	 * @param project_id
	 * @return
	 */
	public int deleteProject(String projectId){
		return projectMapper.deleteByPrimaryKey(projectId);
	}
	
}
