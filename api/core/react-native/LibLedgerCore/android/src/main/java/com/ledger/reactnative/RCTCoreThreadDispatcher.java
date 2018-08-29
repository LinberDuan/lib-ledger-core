// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from thread_dispatcher.djinni

package com.ledger.reactnative;

import co.ledger.core.ExecutionContext;
import co.ledger.core.Lock;
import co.ledger.core.ThreadDispatcher;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.ledger.java.ExecutionContextImpl;
import com.ledger.java.LockImpl;
import com.ledger.java.ThreadDispatcherImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

/**Class representing a thread dispatcher */
public class RCTCoreThreadDispatcher extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, ThreadDispatcherImpl> javaObjects;
    public Map<String, ThreadDispatcherImpl> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreThreadDispatcher(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, ThreadDispatcherImpl>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreThreadDispatcher";
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
            promise.reject("Failed to release instance of RCTCoreThreadDispatcher", "First parameter of RCTCoreThreadDispatcher::release should be an instance of RCTCoreThreadDispatcher");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        ArrayList<String> result = new ArrayList<String>();
        for (Map.Entry<String, ThreadDispatcherImpl> elem : this.javaObjects.entrySet())
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
     *Get an execution context where tasks are executed sequentially
     *@param name, string, name of execution context to retrieve
     *@return ExecutionContext object
     */
    @ReactMethod
    public void getSerialExecutionContext(Map<String, String> currentInstance, String name, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            ThreadDispatcherImpl currentInstanceObj = this.javaObjects.get(sUid);

            ExecutionContext javaResult = currentInstanceObj.getSerialExecutionContext(name);

            String uuid = UUID.randomUUID().toString();
            RCTCoreExecutionContext rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreExecutionContext.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, (ExecutionContextImpl)javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreExecutionContext");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get an execution context where tasks are executed in parallel thanks to a thread pool
     *where a system of inter-thread communication was designed
     *@param name, string, name of execution context to retrieve
     *@return ExecutionContext object
     */
    @ReactMethod
    public void getThreadPoolExecutionContext(Map<String, String> currentInstance, String name, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            ThreadDispatcherImpl currentInstanceObj = this.javaObjects.get(sUid);

            ExecutionContext javaResult = currentInstanceObj.getThreadPoolExecutionContext(name);

            String uuid = UUID.randomUUID().toString();
            RCTCoreExecutionContext rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreExecutionContext.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, (ExecutionContextImpl)javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreExecutionContext");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get main execution context (generally where tasks that should never get blocked are executed)
     *@return ExecutionContext object
     */
    @ReactMethod
    public void getMainExecutionContext(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            ThreadDispatcherImpl currentInstanceObj = this.javaObjects.get(sUid);

            ExecutionContext javaResult = currentInstanceObj.getMainExecutionContext();

            String uuid = UUID.randomUUID().toString();
            RCTCoreExecutionContext rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreExecutionContext.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, (ExecutionContextImpl)javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreExecutionContext");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get lock to handle multithreading
     *@return Lock object
     */
    @ReactMethod
    public void newLock(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            ThreadDispatcherImpl currentInstanceObj = this.javaObjects.get(sUid);

            Lock javaResult = currentInstanceObj.newLock();

            String uuid = UUID.randomUUID().toString();
            RCTCoreLock rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreLock.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, (LockImpl)javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreLock");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
