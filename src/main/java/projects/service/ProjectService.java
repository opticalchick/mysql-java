package projects.service;

import projects.dao.ProjectDao;
import projects.entity.Project;


public class ProjectService {
	
	private ProjectDao projectDao = new ProjectDao();
	
	//calls method from Dao class to add project to DB
	public Project addProject(Project project) {
		return projectDao.insertProject(project);
	}
	
}
