package jp.macs.workweb.domain.utils;

import java.util.ArrayList;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.client.RestTemplate;

import jp.macs.workweb.domain.entity.auth.UserSecurityAccount;
import net.minidev.json.JSONObject;

public class RestUtilz {

	
	private static RestTemplate myRestTemplate=null;
	
	public static void setMyTemplate(RestTemplate restTemplate) {
		myRestTemplate=restTemplate;
	}
	
	//rest通信用ヘッダーの作成
	public static HttpHeaders createHeaders() {
		ArrayList acceptableMediaTypes = new ArrayList();
		acceptableMediaTypes.add(MediaType.APPLICATION_JSON);
		HttpHeaders headers= new HttpHeaders();
		headers.setAccept(acceptableMediaTypes);
		Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
		UserSecurityAccount principal= (UserSecurityAccount) authentication.getPrincipal();
		headers.setBearerAuth(principal.getToken());
		return headers;
	}
	//rest通信テンプレート
	public static <T> ResponseEntity<T> request(String url,HttpMethod method,Class<T> responseType,Object... params){
		ResponseEntity<T> response=null;
		HttpEntity<?> httpEntity= null;
		if (method==HttpMethod.GET) {
			httpEntity=new HttpEntity<>(createHeaders());
			System.out.println(httpEntity);
			response=myRestTemplate.exchange(url, method, httpEntity,responseType,params);
		}
		else {
			//postの時パラメーターなし
			httpEntity=new HttpEntity<>(params[0],createHeaders());
			System.out.println(httpEntity);
			response=myRestTemplate.exchange(url, method, httpEntity,responseType);
		}
		return response;
	}
}
