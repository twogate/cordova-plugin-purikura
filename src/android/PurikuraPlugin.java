package com.twogate.plugins.purikura;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class PurikuraPlugin extends CordovaPlugin
{

	public PurikuraPlugin() {
		Log.i("PurikuraPlugin", "started");
	}

	@Override
	public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException
	{
		if(action.equals("sayHello"))
		{
			String name = data.getString(0);
			String message = "Hello World !! Hello, " + name;
			callbackContext.success(message);
			return true;
		}
		
		return false;
	}
}

