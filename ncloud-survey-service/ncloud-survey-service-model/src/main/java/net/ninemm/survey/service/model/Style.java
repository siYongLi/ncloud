package net.ninemm.survey.service.model;

import io.jboot.db.annotation.Table;
import net.ninemm.survey.service.model.base.BaseStyle;

/**
 * Generated by Jboot.
 */
@Table(tableName = "survey_style", primaryKey = "id")
public class Style extends BaseStyle<Style> {
    public static final String CACHE_NAME="survey_style";
}
