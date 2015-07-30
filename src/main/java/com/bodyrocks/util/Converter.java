/**
 * 
 */
package com.bodyrocks.util;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;

/**
 * @author user
 *
 */
public class Converter {
	public static <E> JSONObject javaToJSON(List<E> jimList ) throws JSONException{
		JSONObject jo = new JSONObject();
		Gson gson = new Gson();
		JSONArray jsonArray = new JSONArray();
		String jimData = "";
		for(E details : jimList){
			jsonArray.put(gson.toJson(details));
			
		}
		jo.put("record", jsonArray);
		return jo;
	}

}
