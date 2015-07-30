package com.bodyrocks.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bodyrocks.model.GymDetails;
import com.bodyrocks.model.Status;
import com.bodyrocks.services.DataServices;
import com.bodyrocks.util.Converter;
import com.bodyrocks.util.StringsUtil;

@Controller
@RequestMapping("/gym")
public class RestController {

	@Autowired
	DataServices dataServices;

	static final Logger logger = Logger.getLogger(RestController.class);

	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody
	Status addJim(@RequestBody GymDetails jimDetail) {
		try {
			dataServices.addEntity(jimDetail);
			return new Status(1, "Jim added Successfully !");
		} catch (Exception e) {
			return new Status(0, e.toString());
		}
	}

	@RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
	public @ResponseBody
	GymDetails getJimDetail(@PathVariable("id") long id) {
		GymDetails jimDetail = null;
		try {
			jimDetail = dataServices.getEntityById(id);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return jimDetail;
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody
	String getJimList(@RequestParam(value="city", required=false, defaultValue="") String city,@RequestParam(value="location", required=false, defaultValue="") String location) {

		List<GymDetails> jimList = null;
		JSONObject jo = null;
		try {
			jimList = dataServices.getEntityList(city, location);
			jo = Converter.javaToJSON(jimList);
		} catch (Exception e) {
			e.printStackTrace();
		}

		String data = StringsUtil.replaceCharInString(jo.toString(), "\\\\", "");
		data = StringsUtil.replaceCharInString(data, "\\\"\\{", "{");
		data = StringsUtil.replaceCharInString(data, "\\}\"", "}");
		return data;
	}

	@RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
	public @ResponseBody
	Status deleteEmployee(@PathVariable("id") long id) {

		try {
			dataServices.deleteEntity(id);
			return new Status(1, "Jim deleted Successfully !");
		} catch (Exception e) {
			return new Status(0, e.toString());
		}

	}
}
