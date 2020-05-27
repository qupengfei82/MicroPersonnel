package org.javaboy.vhr.model.dto;


public class PageDto {

	private Integer page=1;
	private Integer pageSize=2;
	public Integer getPage() {
		if(page==null || page==0) {
			page=1;
		}else {
			page=page;
		}
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

}
