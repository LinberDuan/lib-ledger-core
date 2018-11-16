// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from currency.djinni

package com.ledger.reactnative;

import co.ledger.core.BitcoinLikeNetworkParameters;
import co.ledger.core.Currency;
import co.ledger.core.CurrencyUnit;
import co.ledger.core.WalletType;
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

/**Structure of cryptocurrency */
public class RCTCoreCurrency extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;
    private Map<String, Currency> javaObjects;
    private Map<String, Map<String, ArrayList<String>>> implementationsData;
    public Map<String, Currency> getJavaObjects()
    {
        return javaObjects;
    }

    public RCTCoreCurrency(ReactApplicationContext reactContext)
    {
        super(reactContext);
        this.reactContext = reactContext;
        this.javaObjects = new HashMap<String, Currency>();
        this.implementationsData = new HashMap<String, Map<String, ArrayList<String>>>();
    }

    @Override
    public String getName()
    {
        return "RCTCoreCurrency";
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
            promise.reject("Failed to release instance of RCTCoreCurrency", "First parameter of RCTCoreCurrency::release should be an instance of RCTCoreCurrency");
        }
    }
    @ReactMethod
    public void log(Promise promise)
    {
        WritableNativeArray result = new WritableNativeArray();
        for (Map.Entry<String, Currency> elem : this.javaObjects.entrySet())
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

    @ReactMethod
    public void init(WalletType walletType, String name, int bip44CoinType, String paymentUriScheme, ArrayList <HashMap <String, String>> units, Optional<HashMap <String, String>> bitcoinLikeNetworkParameters, Promise promise) {
        Map<String, ArrayList<String>> implementationsData = new HashMap<String, ArrayList<String>>();
        ArrayList<CurrencyUnit> javaParam_4 = new ArrayList<CurrencyUnit>();
        ArrayList<String> javaParam_4_data = new ArrayList<String>();

        for (HashMap <String, String> units_elem : units)
        {
            RCTCoreCurrencyUnit rctParam_units_elem = this.reactContext.getNativeModule(RCTCoreCurrencyUnit.class);
            CurrencyUnit javaParam_4_elem = rctParam_units_elem.getJavaObjects().get(units_elem.get("uid"));
            javaParam_4_data.add(units_elem.get("uid"));
            javaParam_4.add(javaParam_4_elem);
        }
        implementationsData.put("units", javaParam_4_data);

        RCTCoreBitcoinLikeNetworkParameters rctParam_bitcoinLikeNetworkParameters = this.reactContext.getNativeModule(RCTCoreBitcoinLikeNetworkParameters.class);
        BitcoinLikeNetworkParameters javaParam_5 = rctParam_bitcoinLikeNetworkParameters.getJavaObjects().get(bitcoinLikeNetworkParameters.get().get("uid"));
        ArrayList<String> javaParam_5_tmp = new ArrayList<String>();
        javaParam_5_tmp.add(bitcoinLikeNetworkParameters.get().get("uid"));
        implementationsData.put("bitcoinLikeNetworkParameters", javaParam_5_tmp);
        Currency javaResult = new Currency(walletType, name, bip44CoinType, paymentUriScheme, javaParam_4, javaParam_5);

        String uuid = UUID.randomUUID().toString();
        this.javaObjects.put(uuid, javaResult);
        WritableNativeMap finalResult = new WritableNativeMap();
        finalResult.putString("type","RCTCoreCurrency");
        finalResult.putString("uid",uuid);
        this.implementationsData.put(uuid, implementationsData);
        promise.resolve(finalResult);
    }
    @ReactMethod
    public void getWalletType(Map<String, String> currentInstance, Promise promise)
    {
        String uid = currentInstance.get("uid");
        if (uid.length() > 0)
        {
            Currency javaObj = this.javaObjects.get(uid);
            WalletType result = javaObj.getWalletType();
            promise.resolve(result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreCurrency::getWalletType", "First parameter of RCTCoreCurrency::getWalletType should be an instance of RCTCoreCurrency");
        }
    }

    @ReactMethod
    public void getName(Map<String, String> currentInstance, Promise promise)
    {
        String uid = currentInstance.get("uid");
        if (uid.length() > 0)
        {
            Currency javaObj = this.javaObjects.get(uid);
            String result = javaObj.getName();
            promise.resolve(result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreCurrency::getName", "First parameter of RCTCoreCurrency::getName should be an instance of RCTCoreCurrency");
        }
    }

    @ReactMethod
    public void getBip44CoinType(Map<String, String> currentInstance, Promise promise)
    {
        String uid = currentInstance.get("uid");
        if (uid.length() > 0)
        {
            Currency javaObj = this.javaObjects.get(uid);
            int result = javaObj.getBip44CoinType();
            promise.resolve(result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreCurrency::getBip44CoinType", "First parameter of RCTCoreCurrency::getBip44CoinType should be an instance of RCTCoreCurrency");
        }
    }

    @ReactMethod
    public void getPaymentUriScheme(Map<String, String> currentInstance, Promise promise)
    {
        String uid = currentInstance.get("uid");
        if (uid.length() > 0)
        {
            Currency javaObj = this.javaObjects.get(uid);
            String result = javaObj.getPaymentUriScheme();
            promise.resolve(result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreCurrency::getPaymentUriScheme", "First parameter of RCTCoreCurrency::getPaymentUriScheme should be an instance of RCTCoreCurrency");
        }
    }

    @ReactMethod
    public void getUnits(Map<String, String> currentInstance, Promise promise)
    {
        String uid = currentInstance.get("uid");
        if (uid.length() > 0)
        {
            Currency javaObj = this.javaObjects.get(uid);
            Map<String, ArrayList<String>> data = this.implementationsData.get(uid);
            ArrayList<String> fieldData = data.get("units");
            WritableNativeArray nativeFieldData = new WritableNativeArray();
            for (String elem : fieldData)
            {
                nativeFieldData.pushString(elem);
            }
            WritableNativeMap result = new WritableNativeMap();
            result.putArray(uid,nativeFieldData);
            promise.resolve(result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreCurrency::getUnits", "First parameter of RCTCoreCurrency::getUnits should be an instance of RCTCoreCurrency");
        }
    }

    @ReactMethod
    public void getBitcoinLikeNetworkParameters(Map<String, String> currentInstance, Promise promise)
    {
        String uid = currentInstance.get("uid");
        if (uid.length() > 0)
        {
            Currency javaObj = this.javaObjects.get(uid);
            Map<String, ArrayList<String>> data = this.implementationsData.get(uid);
            ArrayList<String> fieldData = data.get("bitcoinLikeNetworkParameters");
            WritableNativeArray nativeFieldData = new WritableNativeArray();
            for (String elem : fieldData)
            {
                nativeFieldData.pushString(elem);
            }
            WritableNativeMap result = new WritableNativeMap();
            result.putArray(uid,nativeFieldData);
            promise.resolve(result);
        }
        else
        {
            promise.reject("Failed to call RCTCoreCurrency::getBitcoinLikeNetworkParameters", "First parameter of RCTCoreCurrency::getBitcoinLikeNetworkParameters should be an instance of RCTCoreCurrency");
        }
    }

}
