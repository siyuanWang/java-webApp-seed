package com.ericsson.util;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pagination<T> implements Serializable {

	private static Logger LOGGER = LoggerFactory.getLogger(Pagination.class);

	private static final long serialVersionUID = 1L;

	private int totalCount = 0;
	private int pageCount = 15;
	private int totalPage = 0;
	private int curPage = 1;
	private int firstResult = 0;
	private Map<String, Object> conditions;
	private List<T> list;

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getCurPage() {
		return curPage;
	}

	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}

	public int getFirstResult() {
		return firstResult;
	}

	public void setFirstResult(int firstResult) {
		this.firstResult = firstResult;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public void setConditions(Map<String, Object> conditions) {
		this.conditions = conditions;
	}

	public Map<String, Object> getConditions() {
		return conditions;
	}

	public String parsePagination() {
		String result = null;
		JSONObject pagination = new JSONObject();
		JSONArray rowArray = new JSONArray();
		try {
			pagination.put("curPage", curPage);
			pagination.put("pageCount", pageCount);
			pagination.put("totalCount", totalCount);
			pagination.put("totalPage", totalPage);
			if (totalCount > 0 && list != null && !list.isEmpty()) {
				for (T t : list) {
					if (t instanceof PaginationRow) {
						JSONObject row = ((PaginationRow) t).parseRow();
						rowArray.put(row);
					}else{
                        throw new RuntimeException("Object is not instanceof PaginationRow");
                    }
				}
				pagination.put("list", rowArray);
			} else {
				pagination.put("list", rowArray);
			}
		} catch (Exception e) {
			LOGGER.error("Parse row error:", e);
			try {
				pagination.put("list", rowArray);
			} catch (JSONException e1) {
				LOGGER.error("Error row error:", e);
			}
		} finally {
			result = pagination.toString();
		}
		return result;
	}

	public void refreshPagination() {
		int totalPage = totalCount / pageCount;
		if (totalCount % pageCount != 0) {
			totalPage++;
		}
		this.totalPage = totalPage;
		if (totalPage < curPage) {
			this.curPage = totalPage;
		}
		this.firstResult = (this.curPage - 1) * this.pageCount;
	}
}
