// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from http_client.djinni

package com.ledger.reactnative;

import co.ledger.core.Error;
import co.ledger.core.HttpMethod;
import co.ledger.core.HttpRequest;
import co.ledger.core.HttpUrlConnection;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

/**Class representing an Http request */
public class RCTCoreHttpRequest extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, HttpRequest> javaObjects;
    public Map<String, HttpRequest> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreHttpRequest(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, HttpRequest>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreHttpRequest";
    }
    @ReactMethod
    public void release(Map<String, String> currentInstance, Promise promise)
    {
        String uid = currentInstance.get("uid");
        if (uid.length() > 0)
        {
            this.javaObjects.remove(uid);
            promise.resolve(0);
        }
        else
        {
            promise.reject("Failed to release instance of RCTCoreHttpRequest", "First parameter of RCTCoreHttpRequest::release should be an instance of RCTCoreHttpRequest");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        ArrayList<String> result = new ArrayList<String>();
        for (Map.Entry<String, HttpRequest> elem : this.javaObjects.entrySet())
        {
            result.add(elem.getKey());
        }
        promise.resolve(0);
    }
    @ReactMethod
    public void flush(Promise promise)
    {
        this.javaObjects.clear();
        promise.resolve(0);
    }

    /**
     *Get method of request
     *@return HttpMethod enum entry
     */
    @ReactMethod
    public void getMethod(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            HttpRequest currentInstanceObj = this.javaObjects.get(sUid);

            HttpMethod javaResult = currentInstanceObj.getMethod();
            Map<String, HttpMethod> result = new HashMap<String, HttpMethod>();
            result.put("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get headers set in the request
     *@return Map with key and value of type string
     */
    @ReactMethod
    public void getHeaders(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            HttpRequest currentInstanceObj = this.javaObjects.get(sUid);

            HashMap<String, String> javaResult = currentInstanceObj.getHeaders();
            Map<String, HashMap<String, String>> result = new HashMap<String, HashMap<String, String>>();
            result.put("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get body of request
     *@return binary
     */
    @ReactMethod
    public void getBody(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            HttpRequest currentInstanceObj = this.javaObjects.get(sUid);

            byte[] javaResult = currentInstanceObj.getBody();
            Map<String, byte[]> result = new HashMap<String, byte[]>();
            result.put("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get Url of request
     *@return string
     */
    @ReactMethod
    public void getUrl(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            HttpRequest currentInstanceObj = this.javaObjects.get(sUid);

            String javaResult = currentInstanceObj.getUrl();
            Map<String, String> result = new HashMap<String, String>();
            result.put("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Method called when reauest is completed
     *@param response, Optional HttpUrlConnection object, response of request if succeed
     *@param error, optional Error structure, error returned in case of request failure
     */
    @ReactMethod
    public void complete(Map<String, String> currentInstance, Optional<HashMap <String, String>> response, Optional<HashMap <String, String>> error, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            HttpRequest currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreHttpUrlConnection rctParam_response = this.reactContext.getNativeModule(RCTCoreHttpUrlConnection.class);
            HttpUrlConnection javaParam_0 = rctParam_response.getJavaObjects().get(response.get().get("uid"));
            RCTCoreError rctParam_error = this.reactContext.getNativeModule(RCTCoreError.class);
            Error javaParam_1 = rctParam_error.getJavaObjects().get(error.get().get("uid"));
            currentInstanceObj.complete(javaParam_0, javaParam_1);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
