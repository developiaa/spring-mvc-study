package com.developia.mvc.web.frontcontroller.v3;

import com.developia.mvc.web.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV3 {
    ModelView process(Map<String, String> paramMap);
}
