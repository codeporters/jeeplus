package com.jeeplus.admin.common.controller;

import com.jeeplus.admin.common.services.ICommonService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by yuzp17311 on 2016/8/24.
 */
public class BaseController {

    @Autowired
    private ICommonService commonService;

}
