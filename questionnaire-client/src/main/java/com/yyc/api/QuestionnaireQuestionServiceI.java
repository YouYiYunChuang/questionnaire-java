package com.yyc.api;

import com.alibaba.cola.dto.MultiResponse;

import java.util.List;
import java.util.Map;

/**
 * @author yuchengyao
 */
public interface QuestionnaireQuestionServiceI {

    /**
     * 问卷问题类型
     *
     * @return
     */
    List<Map<String, String>> listQuestionnaireQuestionType();

}
