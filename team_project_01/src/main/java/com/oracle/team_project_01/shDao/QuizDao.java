package com.oracle.team_project_01.shDao;

import com.oracle.team_project_01.model.Quiz;

public interface QuizDao {
	int 		totalQuiz();
	Quiz 		quiz(int eNum);
	int 		createQuiz(Quiz quiz);
	int 		updateQuiz(Quiz quiz);
	int 		deleteQuiz(int q_num);
}
