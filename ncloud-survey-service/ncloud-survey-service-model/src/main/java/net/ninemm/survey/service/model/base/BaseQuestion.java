package net.ninemm.survey.service.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseQuestion<M extends BaseQuestion<M>> extends JbootModel<M> implements IBean {

	public void setId(java.lang.String id) {
		set("id", id);
	}
	
	public java.lang.String getId() {
		return getStr("id");
	}

	public void setSurveyId(java.lang.String surveyId) {
		set("survey_id", surveyId);
	}
	
	public java.lang.String getSurveyId() {
		return getStr("survey_id");
	}

	public void setType(java.lang.Integer type) {
		set("type", type);
	}
	
	public java.lang.Integer getType() {
		return getInt("type");
	}

	public void setQuestionInfo(java.lang.String questionInfo) {
		set("question_info", questionInfo);
	}
	
	public java.lang.String getQuestionInfo() {
		return getStr("question_info");
	}

	public void setScore(java.math.BigDecimal score) {
		set("score", score);
	}
	
	public java.math.BigDecimal getScore() {
		return get("score");
	}

	public void setAnswerDescription(java.lang.String answerDescription) {
		set("answer_description", answerDescription);
	}
	
	public java.lang.String getAnswerDescription() {
		return getStr("answer_description");
	}

	public void setConceptGroupId(java.lang.String conceptGroupId) {
		set("concept_group_id", conceptGroupId);
	}
	
	public java.lang.String getConceptGroupId() {
		return getStr("concept_group_id");
	}

	public void setCreateDate(java.util.Date createDate) {
		set("create_date", createDate);
	}
	
	public java.util.Date getCreateDate() {
		return get("create_date");
	}

	public void setModifyDate(java.util.Date modifyDate) {
		set("modify_date", modifyDate);
	}
	
	public java.util.Date getModifyDate() {
		return get("modify_date");
	}

}
