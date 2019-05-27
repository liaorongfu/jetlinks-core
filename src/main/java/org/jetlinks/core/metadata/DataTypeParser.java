package org.jetlinks.core.metadata;

import com.alibaba.fastjson.JSONObject;

/**
 * @author zhouhao
 * @since 1.0.0
 */
public interface DataTypeParser {

    String getType();

    DataType parse(JSONObject config);
}
