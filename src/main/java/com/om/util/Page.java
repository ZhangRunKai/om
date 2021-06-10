package com.om.util;

/**
 * 分页功能
 * 所有的query都必须继承该类
 * @author zhang run kai
 * @version 1.0
 * @date 2021/6/9 20:56
 */
public class Page {

    /**
     * 每页数量
     */
    private Integer pageSize;

    /**
     * 第几页
     */
    private Integer pageNo;

    /**
     * 总数
     */
    private Integer total;

    /**
     * 用于mysql分页中
     * Limit offset , pageSize,
     */
    private Integer offset;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize > 0 ? 10 : pageSize;
        this.offset = getOffset();
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo > 0 ? 1 : pageNo;
        this.offset = getOffset();
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * 用于mysql分页中
     * Limit offset , pageSize,
     */
    public Integer getOffset() {
        return (pageNo - 1) * pageSize;
    }
}
