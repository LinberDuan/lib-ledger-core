// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet_pool.djinni

package com.ledger.reactnative;

import co.ledger.core.BlockCallback;
import co.ledger.core.Currency;
import co.ledger.core.CurrencyCallback;
import co.ledger.core.CurrencyListCallback;
import co.ledger.core.DatabaseBackend;
import co.ledger.core.DynamicObject;
import co.ledger.core.ErrorCodeCallback;
import co.ledger.core.EventBus;
import co.ledger.core.HttpClient;
import co.ledger.core.I32Callback;
import co.ledger.core.LogPrinter;
import co.ledger.core.Logger;
import co.ledger.core.PathResolver;
import co.ledger.core.Preferences;
import co.ledger.core.RandomNumberGenerator;
import co.ledger.core.ThreadDispatcher;
import co.ledger.core.WalletCallback;
import co.ledger.core.WalletListCallback;
import co.ledger.core.WalletPool;
import co.ledger.core.WebSocketClient;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

/**Class respresenting a pool of wallets */
public class RCTCoreWalletPool extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private Map<String, WalletPool> javaObjects;
    public Map<String, WalletPool> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreWalletPool(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, WalletPool>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreWalletPool";
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
            promise.reject("Failed to release instance of RCTCoreWalletPool", "First parameter of RCTCoreWalletPool::release should be an instance of RCTCoreWalletPool");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        ArrayList<String> result = new ArrayList<String>();
        for (Map.Entry<String, WalletPool> elem : this.javaObjects.entrySet())
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
     *Create a new instance of WalletPool object
     *@param name, string, name of the wallet pool
     *@param password, optional string, password to lock wallet pool
     *@param http, HttpClient object, http client used for all calls made by wallet pool (and aggregated wallets)
     *@param webSocketClient, WebSocketClient object, socket through which wallet pool observe and get notified (explorer, DBs ...)
     *@param pathResolver, PathResolver Object, resolve paths to logs, databases, preferences ...
     *@param logPrinter, LogPrinter object, used to dump/log for debug purpose
     *@param dispatcher, ThreadDispatcher object, responsable of dispatching task through available threads
     *@param rng, RandomNumberGenerator object, needed for generating random numbers (for seeds, salts ...)
     *@param backend, DatabseBackend object, DB in which wallet pool store all required infos (created wallets, their options, their accounts ...)
     *@param configuration, DynamicObject object, desired configuration for this wallet pool
     *@return WalletPool object, instance of WalletPool
     */
    @ReactMethod
    public void newInstance(String name, String password, HashMap <String, String> httpClient, HashMap <String, String> webSocketClient, HashMap <String, String> pathResolver, HashMap <String, String> logPrinter, HashMap <String, String> dispatcher, HashMap <String, String> rng, HashMap <String, String> backend, HashMap <String, String> configuration, Promise promise) {
        try
        {
            RCTCoreHttpClient rctParam_httpClient = this.reactContext.getNativeModule(RCTCoreHttpClient.class);
            HttpClient javaParam_2 = rctParam_httpClient.getJavaObjects().get(httpClient.get("uid"));
            RCTCoreWebSocketClient rctParam_webSocketClient = this.reactContext.getNativeModule(RCTCoreWebSocketClient.class);
            WebSocketClient javaParam_3 = rctParam_webSocketClient.getJavaObjects().get(webSocketClient.get("uid"));
            RCTCorePathResolver rctParam_pathResolver = this.reactContext.getNativeModule(RCTCorePathResolver.class);
            PathResolver javaParam_4 = rctParam_pathResolver.getJavaObjects().get(pathResolver.get("uid"));
            RCTCoreLogPrinter rctParam_logPrinter = this.reactContext.getNativeModule(RCTCoreLogPrinter.class);
            LogPrinter javaParam_5 = rctParam_logPrinter.getJavaObjects().get(logPrinter.get("uid"));
            RCTCoreThreadDispatcher rctParam_dispatcher = this.reactContext.getNativeModule(RCTCoreThreadDispatcher.class);
            ThreadDispatcher javaParam_6 = rctParam_dispatcher.getJavaObjects().get(dispatcher.get("uid"));
            RCTCoreRandomNumberGenerator rctParam_rng = this.reactContext.getNativeModule(RCTCoreRandomNumberGenerator.class);
            RandomNumberGenerator javaParam_7 = rctParam_rng.getJavaObjects().get(rng.get("uid"));
            RCTCoreDatabaseBackend rctParam_backend = this.reactContext.getNativeModule(RCTCoreDatabaseBackend.class);
            DatabaseBackend javaParam_8 = rctParam_backend.getJavaObjects().get(backend.get("uid"));
            RCTCoreDynamicObject rctParam_configuration = this.reactContext.getNativeModule(RCTCoreDynamicObject.class);
            DynamicObject javaParam_9 = rctParam_configuration.getJavaObjects().get(configuration.get("uid"));
            WalletPool javaResult = WalletPool.newInstance(name, password, javaParam_2, javaParam_3, javaParam_4, javaParam_5, javaParam_6, javaParam_7, javaParam_8, javaParam_9);

            String uuid = UUID.randomUUID().toString();
            RCTCoreWalletPool rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreWalletPool.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreWalletPool");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Return used logger to dump logs in defined log path by PathResolver
     *@return Logger object
     */
    @ReactMethod
    public void getLogger(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            WalletPool currentInstanceObj = this.javaObjects.get(sUid);

            Logger javaResult = currentInstanceObj.getLogger();

            String uuid = UUID.randomUUID().toString();
            RCTCoreLogger rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreLogger.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreLogger");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Return name given to wallet pool
     *@return string
     */
    @ReactMethod
    public void getName(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            WalletPool currentInstanceObj = this.javaObjects.get(sUid);

            String javaResult = currentInstanceObj.getName();
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
     *Return preferences of wallet pool (deduced from configuration)
     *@return Preferences object
     */
    @ReactMethod
    public void getPreferences(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            WalletPool currentInstanceObj = this.javaObjects.get(sUid);

            Preferences javaResult = currentInstanceObj.getPreferences();

            String uuid = UUID.randomUUID().toString();
            RCTCorePreferences rctImpl_javaResult = this.reactContext.getNativeModule(RCTCorePreferences.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCorePreferences");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Return number of wallets instanciated under wallet pool
     *@param callback, Callback object returns a 32 bits integer, count of wallets
     */
    @ReactMethod
    public void getWalletCount(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            WalletPool currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreI32Callback javaParam_0 = RCTCoreI32Callback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.getWalletCount(javaParam_0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get instanciated wallets having index in a given range
     *@param from, 32 bits integer, lower bound of indices to pick
     *@param to, 32 bits integer, upper bound of indices to pick
     *@param callback, ListCallback object returns a list of Wallet objects
     */
    @ReactMethod
    public void getWallets(Map<String, String> currentInstance, int from, int size, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            WalletPool currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreWalletListCallback javaParam_2 = RCTCoreWalletListCallback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.getWallets(from, size, javaParam_2);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get wallet with a giver name
     *@param name, string, name of wallet to look for
     *@param callback, Callback object returns a Wallet object
     */
    @ReactMethod
    public void getWallet(Map<String, String> currentInstance, String name, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            WalletPool currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreWalletCallback javaParam_1 = RCTCoreWalletCallback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.getWallet(name, javaParam_1);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Instanciate a new wallet under wallet pool
     *@param name, string, name of newly created wallet
     *@param currency, Currency object, currency of the wallet
     *@param configuration, DynamicObject object, configuration of wallet (preferences)
     *@param callback, Callback object returning a Wallet object
     */
    @ReactMethod
    public void createWallet(Map<String, String> currentInstance, String name, HashMap <String, String> currency, HashMap <String, String> configuration, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            WalletPool currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreCurrency rctParam_currency = this.reactContext.getNativeModule(RCTCoreCurrency.class);
            Currency javaParam_1 = rctParam_currency.getJavaObjects().get(currency.get("uid"));
            RCTCoreDynamicObject rctParam_configuration = this.reactContext.getNativeModule(RCTCoreDynamicObject.class);
            DynamicObject javaParam_2 = rctParam_configuration.getJavaObjects().get(configuration.get("uid"));
            RCTCoreWalletCallback javaParam_3 = RCTCoreWalletCallback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.createWallet(name, javaParam_1, javaParam_2, javaParam_3);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Return all supported currencies by wallet pool, at least one wallet support one of returned currencies
     *@param callback, ListCallback object, returns a list of Currency objects
     */
    @ReactMethod
    public void getCurrencies(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            WalletPool currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreCurrencyListCallback javaParam_0 = RCTCoreCurrencyListCallback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.getCurrencies(javaParam_0);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Return currency of a specific wallet
     *@param name, wallet's name to look for
     *@param callback, Callback object returning a Currency object
     */
    @ReactMethod
    public void getCurrency(Map<String, String> currentInstance, String name, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            WalletPool currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreCurrencyCallback javaParam_1 = RCTCoreCurrencyCallback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.getCurrency(name, javaParam_1);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Return last block of blockchain of a given currency (if it is supported by the wallet pool)
     *@param name, string, name of currency we are interested into getting it's blockchain's last block
     *@param callback, Callback object returns a Block object
     */
    @ReactMethod
    public void getLastBlock(Map<String, String> currentInstance, String currencyName, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            WalletPool currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreBlockCallback javaParam_1 = RCTCoreBlockCallback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.getLastBlock(currencyName, javaParam_1);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Get event bus (handler) through which wallet pool observe and gets notified (explorers, DBs ...)
     *@param EventBus object
     */
    @ReactMethod
    public void getEventBus(Map<String, String> currentInstance, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            WalletPool currentInstanceObj = this.javaObjects.get(sUid);

            EventBus javaResult = currentInstanceObj.getEventBus();

            String uuid = UUID.randomUUID().toString();
            RCTCoreEventBus rctImpl_javaResult = this.reactContext.getNativeModule(RCTCoreEventBus.class);
            rctImpl_javaResult.getJavaObjects().put(uuid, javaResult);
            HashMap<String, String> result = new HashMap<String, String>();
            result.put("type","RCTCoreEventBus");
            result.put("uid",uuid);

            promise.resolve(result);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
    /**
     *Erase data (in user's DB) relative to wallet since given date
     *@param date, start date of data deletion
     */
    @ReactMethod
    public void eraseDataSince(Map<String, String> currentInstance, Date date, Promise promise) {
        try
        {
            String sUid = currentInstance.get("uid");

            WalletPool currentInstanceObj = this.javaObjects.get(sUid);

            RCTCoreErrorCodeCallback javaParam_1 = RCTCoreErrorCodeCallback.initWithPromise(promise, this.reactContext);
            currentInstanceObj.eraseDataSince(date, javaParam_1);
        }
        catch(Exception e)
        {
            promise.reject(e.toString(), e.getMessage());
        }
    }
}
