package com.qiujie.admin.service;

import com.qiujie.admin.pojo.po.Beauties;
import com.qiujie.admin.pojo.vo.PageVO;

import java.util.List;
import java.util.Map;

public interface BeautiesService {

    PageVO listBeauties(Map map);

    int removeBeautiesByPid(String pid);

    int addBeauties(Map map);

    int updateBeauties(Map map);
}
