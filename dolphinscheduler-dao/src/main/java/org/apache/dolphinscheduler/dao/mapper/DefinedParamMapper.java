//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.apache.dolphinscheduler.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.dolphinscheduler.dao.entity.DefinedParam;
import org.apache.ibatis.annotations.Param;

public interface DefinedParamMapper extends BaseMapper<DefinedParam> {
    List<DefinedParam> queryDefinedParambyKeys(@Param("keys") List<String> var1);
}
