package org.easybooks.bookstore.action;

import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.easybooks.bookstore.service.IAlarmRegularService;
import org.easybooks.bookstore.service.impl.AlarmRegularService;
import org.easybooks.bookstore.vo.Alarmregular;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;

public class AlarmRegularAction extends ActionSupport{
    @Autowired
	protected IAlarmRegularService alarmRegularService;//为使用业务层而设置的属性
	
	public String browseAlarmRegular() throws Exception{
		
		List alarmRegulars = alarmRegularService.getAllRegulars();//直接调用业务层方法
		
		int s = alarmRegulars.size();
		//System.out.println("AlarmRegularAction:alarmRegulars_size:s"+s);
		
		
		Alarmregular a0 = (Alarmregular) alarmRegulars.get(0);
		JSONArray AlarmRegular_JSONarray = JSONArray.fromObject(a0);
		
		for(int i=1;i<s;i++){
			Alarmregular a = (Alarmregular) alarmRegulars.get(i);
			//System.out.println(a.getArNo()+a.getArOutName());
			JSONObject json = JSONObject.fromObject(a);
			//System.out.println(json.toString());
			AlarmRegular_JSONarray.add(json);
		}
		
		String AlarmRegular_strJSONArray=AlarmRegular_JSONarray.toString();
		System.out.println(AlarmRegular_strJSONArray);
		
		Map request = (Map)ActionContext.getContext().get("request");
		request.put("AlarmRegular_strJSONArray", AlarmRegular_strJSONArray);
		request.put("AlarmRegular_size", alarmRegulars.size());
		return SUCCESS;
	}

	public IAlarmRegularService getAlarmRegularService() {
		return alarmRegularService;
	}

	public void setAlarmRegularService(IAlarmRegularService alarmRegularService) {
		this.alarmRegularService = alarmRegularService;
	}
	
	
	
}
