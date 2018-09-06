// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from ethereum_public_key_provider.djinni

package com.ledger.reactnative;

import co.ledger.core.EthereumPublicKeyProvider;
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

public class RCTCoreEthereumPublicKeyProvider extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, EthereumPublicKeyProviderImpl> javaObjects;
    public Map<String, EthereumPublicKeyProviderImpl> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreEthereumPublicKeyProvider(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, EthereumPublicKeyProviderImpl>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreEthereumPublicKeyProvider";
    }
    @ReactMethod
    public void newInstance(Promise promise)
    {
        EthereumPublicKeyProviderImpl newInstance = new EthereumPublicKeyProviderImpl(this.reactContext);
        String uuid = UUID.randomUUID().toString();
        this.javaObjects.put(uuid, newInstance);
        WritableNativeMap finalResult = new WritableNativeMap();
        finalResult.putString("type","RCTCoreEthereumPublicKeyProvider");
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
            promise.reject("Failed to release instance of RCTCoreEthereumPublicKeyProvider", "First parameter of RCTCoreEthereumPublicKeyProvider::release should be an instance of RCTCoreEthereumPublicKeyProvider");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, EthereumPublicKeyProviderImpl> elem : this.javaObjects.entrySet())
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

}
