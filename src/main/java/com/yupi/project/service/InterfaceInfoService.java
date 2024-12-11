package com.yupi.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.project.model.entity.InterfaceInfo;


/**
* @author Administrator
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-12-11 16:01:55
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    /**
     * 创建接口时校验
     * @param interfaceInfo
     * @param add
     * @Author wjl
     */
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);


}
