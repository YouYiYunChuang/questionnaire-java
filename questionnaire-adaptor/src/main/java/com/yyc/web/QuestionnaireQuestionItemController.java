package com.yyc.web;

import com.alibaba.cola.dto.MultiResponse;
import com.yyc.access.Access;
import com.yyc.access.Role;
import com.yyc.api.QuestionnaireQuestionItemServiceI;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author yuchengyao
 */
@RequestMapping("questionnaire-question-item")
public class QuestionnaireQuestionItemController {

    @Resource
    private QuestionnaireQuestionItemServiceI questionnaireQuestionItemServiceI;

    /**
     * 问卷问题类型列表
     *
     * @return
     */
    @Access(roles = {
            Role.GENERAL_USER,
            Role.ADMIN
    })
    @GetMapping("type")
    public MultiResponse<Map<String, String>> listQuestionnaireQuestionItemType() {
        return MultiResponse.ofWithoutTotal(questionnaireQuestionItemServiceI.listQuestionnaireQuestionItemType());
    }
}
