// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from http_client.djinni

package com.ledger.reactnative;

import co.ledger.core.HttpReadBodyResult;
import co.ledger.core.HttpUrlConnection;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

/**Class representing an Http connection */
public class RCTCoreHttpUrlConnection extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, HttpUrlConnectionImpl> javaObjects;
    public Map<String, HttpUrlConnectionImpl> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreHttpUrlConnection(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, HttpUrlConnectionImpl>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreHttpUrlConnection";
    }
    @ReactMethod
    public void newInstance(Promise promise)
    {
        HttpUrlConnectionImpl newInstance = new HttpUrlConnectionImpl(this.reactContext);
        String uuid = UUID.randomUUID().toString();
        this.javaObjects.put(uuid, newInstance);
        WritableNativeMap finalResult = new WritableNativeMap();
        finalResult.putString("type","RCTCoreHttpUrlConnection");
        finalResult.putString("uid",uuid);
        promise.resolve(finalResult);
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
            promise.reject("Failed to release instance of RCTCoreHttpUrlConnection", "First parameter of RCTCoreHttpUrlConnection::release should be an instance of RCTCoreHttpUrlConnection");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, HttpUrlConnectionImpl> elem : this.javaObjects.entrySet())
        {
            result.pushString(elem.getKey());
        }
        promise.resolve(result);
    }
    @ReactMethod
    public void flush(Promise promise)
    {
        this.javaObjects.clear();
        promise.resolve(0);
    }

    /**
     * Gets the HTTP response status code
     * @return The HTTP response status code
     */
    @ReactMethod
    public void getStatusCode(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            HttpUrlConnectionImpl currentInstanceObj = this.javaObjects.get(sUid);

            int javaResult = currentInstanceObj.getStatusCode();
            WritableNativeMap result = new WritableNativeMap();
            result.putInt("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Gets the HTTP response status text
     * @return The HTTP response status text
     */
    @ReactMethod
    public void getStatusText(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            HttpUrlConnectionImpl currentInstanceObj = this.javaObjects.get(sUid);

            String javaResult = currentInstanceObj.getStatusText();
            WritableNativeMap result = new WritableNativeMap();
            result.putString("value", javaResult);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Gets the HTTP response headers
     * @return The HTTP response headers
     */
    @ReactMethod
    public void getHeaders(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            HttpUrlConnectionImpl currentInstanceObj = this.javaObjects.get(sUid);

            HashMap<String, String> javaResult = currentInstanceObj.getHeaders();
            WritableNativeMap result = new WritableNativeMap();
            WritableNativeMap javaResult_map = new WritableNativeMap();
            for(String javaResult_key : javaResult.keySet())
            {
                String javaResult_elem_value = javaResult.get(javaResult_key);
                javaResult_map.putString(javaResult_key, javaResult_elem_value);
            }
            result.putMap("value", javaResult_map);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     * Reads available HTTP response body. This method will be called multiple times until it returns a empty bytes array.
     * @returns A chunk of the body data wrapped into a HttpReadBodyResult (for error management)
     */
    @ReactMethod
    public void readBody(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            HttpUrlConnectionImpl currentInstanceObj = this.javaObjects.get(sUid);

            HttpReadBodyResult javaResult = currentInstanceObj.readBody();

            String uuid = UUID.randomUUID().toString();
            RCTCoreHttpReadBodyResult rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreHttpReadBodyResult.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            WritableNativeMap result = new WritableNativeMap();
            result.putString("type","RCTCoreHttpReadBodyResult");
            result.putString("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
