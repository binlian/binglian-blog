package com.binglian.pojo.vo;

import java.util.List;

import com.binglian.pojo.Article;

/**
 * 文章分类封装
 * 使用泛型约束
 * @author binglian
 *
 */
public class ArticlePageVO<T> {
	
	private int page;	//当前页数
	private int total;	//总页数
	private long records;	//总记录数
	private int prePage;	//上一页
	private int nextPage;	//下一页
	private List<T> rows;	//每行显示的内容
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public long getRecords() {
		return records;
	}
	public void setRecords(long records) {
		this.records = records;
	}
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	public int getPrePage() {
		return prePage;
	}
	public void setPrePage(int prePage) {
		this.prePage = prePage;
	}
	public int getNextPage() {
		return nextPage;
	}
	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}

	
	
	
	
}
