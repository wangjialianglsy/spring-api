package com.yupi.project.model.dto.interfaceinfo;

import lombok.Data;

/**
 * @Author: wjl
 * @Version: 1.0
 * @Description: 请求参数字段
 */
@Data
public class RequestParamsField {
    private String id;
    private String fieldName;
    private String type;
    private String desc;
    private String required;
}
