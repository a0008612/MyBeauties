package com.qiujie.admin.pojo.vo;

import com.qiujie.admin.pojo.po.Beauties;

import java.util.List;

public class PageVO {
    private int pageSize;
    private int pageIndex;
    private int offset;
    private int total;
    private List<Beauties> beauties;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public void setOffset(){}

    public int getOffset() {
        return (pageIndex-1)*pageSize;
    }

    public List<Beauties> getBeauties() {
        return beauties;
    }

    public void setBeauties(List<Beauties> beauties) {
        this.beauties = beauties;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "PageVO{" +
                "pageSize=" + pageSize +
                ", pageIndex=" + pageIndex +
                ", offset=" + offset +
                ", total=" + total +
                ", beauties=" + beauties +
                '}';
    }
}
