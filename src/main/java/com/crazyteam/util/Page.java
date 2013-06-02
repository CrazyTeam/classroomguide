package com.crazyteam.util;

import java.util.List;

public class Page<T> {
	private List<T> list;
	private Integer page;
	private Integer totalPage;
	private Integer totalRecords;
	private Integer pageSize;
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	public Integer getPage() {
		return (page==null||page<0) ? 0 : page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getTotalPage() {
		return (totalPage==null)?(totalRecords/pageSize):totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	public Integer getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(Integer totalRecords) {
		this.totalRecords = totalRecords;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getPrev()
	{
		return (page-1<0)?0:page--;
	}
	public Integer getNext()
	{
		return (page+1>totalPage)?totalPage:page++;
	}
}
