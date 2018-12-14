package com.qiujie.admin.service.impl;

import com.qiujie.admin.dao.BeautiesDao;
import com.qiujie.admin.pojo.po.Beauties;
import com.qiujie.admin.pojo.vo.PageVO;
import com.qiujie.admin.service.BeautiesService;
import com.qiujie.admin.util.GetPimage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BeautiesServiceImpl implements BeautiesService {
    private final static Logger logger = LoggerFactory.getLogger(BeautiesServiceImpl.class);
    @Autowired
    private BeautiesDao beautiesDao;

    @Override
    public PageVO listBeauties(Map map) {
        List<Beauties> beauties = null;
        PageVO pageVO = new PageVO();
        pageVO.setPageSize((Integer) map.get("pagesize"));
        pageVO.setPageIndex((Integer) map.get("pageIndex"));

        try{
            beauties = beautiesDao.listBeauties(pageVO);
            pageVO.setBeauties(beauties);

            int total = beautiesDao.getTotalBeauties();
            pageVO.setTotal(total);
        }
        catch (Exception e){
            logger.info(e.getMessage(),e);
            e.printStackTrace();
        }

        return pageVO;
    }

    @Override
    public int removeBeautiesByPid(String pid) {
        int resultd = 0;
        try{
            resultd = beautiesDao.removeBeautiesByPid(pid);
        }catch (Exception e){
            logger.info(e.getMessage(),e);
            e.printStackTrace();
        }
        return resultd;
    }

    @Override
    public int addBeauties(Map map) {
        int resulta = 0;
        map.put("pimage", GetPimage.getPimage());
        try{
            resulta = beautiesDao.addBeauties(map);
        }catch (Exception e){
            logger.info(e.getMessage(),e);
            e.printStackTrace();
        }
        return resulta;
    }


    @Override
    public int updateBeauties(Map map) {
        int resultu = 0;
        try{
            resultu = beautiesDao.updateBeauties(map);
        }catch (Exception e){
            logger.info(e.getMessage(),e);
            e.printStackTrace();
        }
        return resultu;
    }
}
