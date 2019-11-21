package com.collegeDao;

import java.util.List;

import com.collegeBean.CollegeBean;

public interface CollegeDao {
	void AddCollege();
	List<CollegeBean>ViewCollege();
	void ViewSpecificCollege(int cno);
	Void UpdateCollege(int cno);
	void DeleteCollege(int cno);

}
