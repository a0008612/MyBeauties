package com.qiujie.admin.dao;

import com.qiujie.admin.pojo.po.Beauties;
import com.qiujie.admin.pojo.vo.PageVO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

@Repository
public interface BeautiesDao {

    List<Beauties> listBeauties(PageVO pageVO);

    int getTotalBeauties();

    int removeBeautiesByPid(String pid);

    int addBeauties(Map map);

    int updateBeauties(Map map);
}
