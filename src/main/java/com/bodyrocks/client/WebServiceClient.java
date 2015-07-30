package com.bodyrocks.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.web.client.RestTemplate;

import com.bodyrocks.model.GymDetails;

public class WebServiceClient {

	public static void main(String[] args) {
		new WebServiceClient().testData();
//		try {
//			 
//			URL url = new URL("http://localhost:8080/SpringRestCrud/gym/add");
//			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//			conn.setDoOutput(true);
//			conn.setRequestMethod("POST");
//			conn.setRequestProperty("Content-Type", "application/json");
//			int count = 4;
//			String input = "{\"id\":4,\"name\":\"Gym 4\",\"address\":\"hjdsg sjdgf\",\"location\":\"sector 52\",\"rating\":4,\"city\":\"Noida\",\"openingTime\":\"Monday-firiday (6:30am - 9:30pm)\"}";
//	 
//			OutputStream os = conn.getOutputStream();
//			os.write(input.getBytes());
//			os.flush();
//	 
//			if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
//				throw new RuntimeException("Failed : HTTP error code : "
//					+ conn.getResponseCode());
//			}
//	 
//			BufferedReader br = new BufferedReader(new InputStreamReader(
//					(conn.getInputStream())));
//			
//			String output;
//			System.out.println("Output from Server .... \n");
//			while ((output = br.readLine()) != null) {
//				System.out.println(output);
//			}
//	 
//			conn.disconnect();
//		  } catch (MalformedURLException e) {
//			  
//				e.printStackTrace();
//		 
//			  } catch (IOException e) {
//		 
//				e.printStackTrace();
//		 
//			 }
//		 
			

	}
	private void testData(){	
		try{
		 RestTemplate restTemplate = new RestTemplate();
		 GymDetails gd = new GymDetails();
		 gd.setId(4);
		 gd.setName("Gym4 ");
		 gd.setAddress("sdkj sddb  fhjssv  f");
		 gd.setCity("Noida");
		 gd.setLocation("Sector 52");
		 gd.setRating(4);
		 
		 GymDetails responseEntity = restTemplate.postForObject("http://localhost:8080/SpringRestCrud/gym/add", gd,GymDetails.class );
	System.out.println("responseEntity :"+responseEntity);
	
	}
		catch(Exception ex){
			System.out.println("ex :::"+ex.getMessage());
		}
	}
}
