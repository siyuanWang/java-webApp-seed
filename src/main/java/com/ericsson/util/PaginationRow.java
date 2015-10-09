package com.ericsson.util;


import org.json.JSONObject;


public interface PaginationRow {
	public abstract JSONObject parseRow() throws Exception;
}
