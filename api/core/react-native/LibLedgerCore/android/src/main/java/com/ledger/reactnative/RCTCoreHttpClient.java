// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from http_client.djinni

package com.ledger.reactnative;

import co.ledger.core.HttpClient;
import co.ledger.core.HttpRequest;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.ledger.java.HttpClientImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

/**Class representing the http client performing the http requests */
public class RCTCoreHttpClient extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, HttpClientImpl> javaObjects;
    public Map<String, HttpClientImpl> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreHttpClient(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, HttpClientImpl>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreHttpClient";
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
            promise.reject("Failed to release instance of RCTCoreHttpClient", "First parameter of RCTCoreHttpClient::release should be an instance of RCTCoreHttpClient");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        ArrayList<String> result = new ArrayList<String>();
        for (Map.Entry<String, HttpClientImpl> elem : this.javaObjects.entrySet())
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
     *Execute a giver Http request\
     *@param request, HttpRequest object, requestr to execute
     */
    @ReactMethod
    public void execute(Map<String, String> currentInstance, HashMap <String, String> request, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            HttpClientImpl currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreHttpRequest rctParam_request = this.reactContext.getNativeModule(RCTCoreHttpRequest.class);
            HttpRequest javaParam_0 = rctParam_request.getJavaObjects().get(request.get("uid"));
            currentInstanceObj.execute(javaParam_0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
