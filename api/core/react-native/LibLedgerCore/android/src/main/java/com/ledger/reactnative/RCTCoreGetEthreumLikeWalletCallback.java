// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from ethereum_like_wallet.djinni

package com.ledger.reactnative;

import co.ledger.core.Error;
import co.ledger.core.EthereumLikeWallet;
import co.ledger.core.GetEthreumLikeWalletCallback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.ledger.java.GetEthreumLikeWalletCallbackImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public class RCTCoreGetEthreumLikeWalletCallback extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, GetEthreumLikeWalletCallbackImpl> javaObjects;
    public Map<String, GetEthreumLikeWalletCallbackImpl> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreGetEthreumLikeWalletCallback(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, GetEthreumLikeWalletCallbackImpl>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreGetEthreumLikeWalletCallback";
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
            promise.reject("Failed to release instance of RCTCoreGetEthreumLikeWalletCallback", "First parameter of RCTCoreGetEthreumLikeWalletCallback::release should be an instance of RCTCoreGetEthreumLikeWalletCallback");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        ArrayList<String> result = new ArrayList<String>();
        for (Map.Entry<String, GetEthreumLikeWalletCallbackImpl> elem : this.javaObjects.entrySet())
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

    @ReactMethod
    public void onSuccess(Map<String, String> currentInstance, HashMap <String, String> wallet, boolean isCreated, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            GetEthreumLikeWalletCallbackImpl currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreEthereumLikeWallet rctParam_wallet = this.reactContext.getNativeModule(RCTCoreEthereumLikeWallet.class);
            EthereumLikeWallet javaParam_0 = rctParam_wallet.getJavaObjects().get(wallet.get("uid"));
            currentInstanceObj.onSuccess(javaParam_0, isCreated);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    @ReactMethod
    public void onError(Map<String, String> currentInstance, HashMap <String, String> error, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            GetEthreumLikeWalletCallbackImpl currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreError rctParam_error = this.reactContext.getNativeModule(RCTCoreError.class);
            Error javaParam_0 = rctParam_error.getJavaObjects().get(error.get("uid"));
            currentInstanceObj.onError(javaParam_0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
