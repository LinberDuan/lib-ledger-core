// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet_pool.djinni

#import "RCTCoreLGWalletPool.h"


@implementation RCTCoreLGWalletPool
//Export module
RCT_EXPORT_MODULE(RCTCoreLGWalletPool)

@synthesize bridge = _bridge;

-(instancetype)init
{
    self = [super init];
    //Init Objc implementation
    if(self)
    {
        self.objcImplementations = [[NSMutableDictionary alloc] init];
    }
    return self;
}

+ (BOOL)requiresMainQueueSetup
{
    return NO;
}
RCT_REMAP_METHOD(release, release:(NSDictionary *)currentInstance withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject)
{
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGWalletPool::release, first argument should be an instance of LGWalletPool", nil);
    }
    [self.objcImplementations removeObjectForKey:currentInstance[@"uid"]];
    resolve(@(YES));
}
RCT_REMAP_METHOD(log, logWithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject)
{
    NSMutableArray *uuids = [[NSMutableArray alloc] init];
    for (id key in self.objcImplementations)
    {
        [uuids addObject:key];
    }
    NSDictionary *result = @{@"value" : uuids};
    resolve(result);
}
RCT_REMAP_METHOD(flush, flushWithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject)
{
    [self.objcImplementations removeAllObjects];
    resolve(@(YES));
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
RCT_REMAP_METHOD(newInstance,newInstancewithParams:(nonnull NSString *)name
                                          password:(nullable NSString *)password
                                        httpClient:(NSDictionary *)httpClient
                                   webSocketClient:(NSDictionary *)webSocketClient
                                      pathResolver:(NSDictionary *)pathResolver
                                        logPrinter:(NSDictionary *)logPrinter
                                        dispatcher:(NSDictionary *)dispatcher
                                               rng:(NSDictionary *)rng
                                           backend:(NSDictionary *)backend
                                     configuration:(NSDictionary *)configuration withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    RCTCoreLGHttpClient *rctParam_httpClient = (RCTCoreLGHttpClient *)[self.bridge moduleForName:@"CoreLGHttpClient"];
    id<LGHttpClient>objcParam_2 = (id<LGHttpClient>)[rctParam_httpClient.objcImplementations objectForKey:httpClient[@"uid"]];
    RCTCoreLGWebSocketClient *rctParam_webSocketClient = (RCTCoreLGWebSocketClient *)[self.bridge moduleForName:@"CoreLGWebSocketClient"];
    id<LGWebSocketClient>objcParam_3 = (id<LGWebSocketClient>)[rctParam_webSocketClient.objcImplementations objectForKey:webSocketClient[@"uid"]];
    RCTCoreLGPathResolver *rctParam_pathResolver = (RCTCoreLGPathResolver *)[self.bridge moduleForName:@"CoreLGPathResolver"];
    id<LGPathResolver>objcParam_4 = (id<LGPathResolver>)[rctParam_pathResolver.objcImplementations objectForKey:pathResolver[@"uid"]];
    RCTCoreLGLogPrinter *rctParam_logPrinter = (RCTCoreLGLogPrinter *)[self.bridge moduleForName:@"CoreLGLogPrinter"];
    id<LGLogPrinter>objcParam_5 = (id<LGLogPrinter>)[rctParam_logPrinter.objcImplementations objectForKey:logPrinter[@"uid"]];
    RCTCoreLGThreadDispatcher *rctParam_dispatcher = (RCTCoreLGThreadDispatcher *)[self.bridge moduleForName:@"CoreLGThreadDispatcher"];
    id<LGThreadDispatcher>objcParam_6 = (id<LGThreadDispatcher>)[rctParam_dispatcher.objcImplementations objectForKey:dispatcher[@"uid"]];
    RCTCoreLGRandomNumberGenerator *rctParam_rng = (RCTCoreLGRandomNumberGenerator *)[self.bridge moduleForName:@"CoreLGRandomNumberGenerator"];
    id<LGRandomNumberGenerator>objcParam_7 = (id<LGRandomNumberGenerator>)[rctParam_rng.objcImplementations objectForKey:rng[@"uid"]];
    RCTCoreLGDatabaseBackend *rctParam_backend = (RCTCoreLGDatabaseBackend *)[self.bridge moduleForName:@"CoreLGDatabaseBackend"];
    LGDatabaseBackend *objcParam_8 = (LGDatabaseBackend *)[rctParam_backend.objcImplementations objectForKey:backend[@"uid"]];
    RCTCoreLGDynamicObject *rctParam_configuration = (RCTCoreLGDynamicObject *)[self.bridge moduleForName:@"CoreLGDynamicObject"];
    LGDynamicObject *objcParam_9 = (LGDynamicObject *)[rctParam_configuration.objcImplementations objectForKey:configuration[@"uid"]];
    LGWalletPool * objcResult = [LGWalletPool newInstance:name password:password httpClient:objcParam_2 webSocketClient:objcParam_3 pathResolver:objcParam_4 logPrinter:objcParam_5 dispatcher:objcParam_6 rng:objcParam_7 backend:objcParam_8 configuration:objcParam_9];

    NSString *uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGWalletPool *rctImpl_objcResult = (RCTCoreLGWalletPool *)[self.bridge moduleForName:@"CoreLGWalletPool"];
    [rctImpl_objcResult.objcImplementations setObject:objcResult forKey:uuid];
    NSDictionary *result = @{@"type" : @"CoreLGWalletPool", @"uid" : uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGWalletPool::newInstance", nil);
    }

}

/**
 *Return used logger to dump logs in defined log path by PathResolver
 *@return Logger object
 */
RCT_REMAP_METHOD(getLogger,getLogger:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGWalletPool::getLogger, first argument should be an instance of LGWalletPool", nil);
    }
    LGWalletPool *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGWalletPool::getLogger, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
    }
    LGLogger * objcResult = [currentInstanceObj getLogger];

    NSString *uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGLogger *rctImpl_objcResult = (RCTCoreLGLogger *)[self.bridge moduleForName:@"CoreLGLogger"];
    [rctImpl_objcResult.objcImplementations setObject:objcResult forKey:uuid];
    NSDictionary *result = @{@"type" : @"CoreLGLogger", @"uid" : uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGWalletPool::getLogger", nil);
    }

}

/**
 *Return name given to wallet pool
 *@return string
 */
RCT_REMAP_METHOD(getName,getName:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGWalletPool::getName, first argument should be an instance of LGWalletPool", nil);
    }
    LGWalletPool *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGWalletPool::getName, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
    }
    NSString * objcResult = [currentInstanceObj getName];
    NSDictionary *result = @{@"value" : objcResult};
    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGWalletPool::getName", nil);
    }

}

/**
 *Return preferences of wallet pool (deduced from configuration)
 *@return Preferences object
 */
RCT_REMAP_METHOD(getPreferences,getPreferences:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGWalletPool::getPreferences, first argument should be an instance of LGWalletPool", nil);
    }
    LGWalletPool *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGWalletPool::getPreferences, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
    }
    LGPreferences * objcResult = [currentInstanceObj getPreferences];

    NSString *uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGPreferences *rctImpl_objcResult = (RCTCoreLGPreferences *)[self.bridge moduleForName:@"CoreLGPreferences"];
    [rctImpl_objcResult.objcImplementations setObject:objcResult forKey:uuid];
    NSDictionary *result = @{@"type" : @"CoreLGPreferences", @"uid" : uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGWalletPool::getPreferences", nil);
    }

}

/**
 *Return number of wallets instanciated under wallet pool
 *@param callback, Callback object returns a 32 bits integer, count of wallets
 */
RCT_REMAP_METHOD(getWalletCount,getWalletCount:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGWalletPool::getWalletCount, first argument should be an instance of LGWalletPool", nil);
    }
    LGWalletPool *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGWalletPool::getWalletCount, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
    }
    RCTCoreLGI32Callback *objcParam_0 = [[RCTCoreLGI32Callback alloc] initWithResolver:resolve rejecter:reject andBridge:self.bridge];
    [currentInstanceObj getWalletCount:objcParam_0];

}

/**
 *Get instanciated wallets having index in a given range
 *@param from, 32 bits integer, lower bound of indices to pick
 *@param to, 32 bits integer, upper bound of indices to pick
 *@param callback, ListCallback object returns a list of Wallet objects
 */
RCT_REMAP_METHOD(getWallets,getWallets:(NSDictionary *)currentInstance withParams:(int)from
                                                                             size:(int)size withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGWalletPool::getWallets, first argument should be an instance of LGWalletPool", nil);
    }
    LGWalletPool *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGWalletPool::getWallets, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
    }
    RCTCoreLGWalletListCallback *objcParam_2 = [[RCTCoreLGWalletListCallback alloc] initWithResolver:resolve rejecter:reject andBridge:self.bridge];
    [currentInstanceObj getWallets:from size:size callback:objcParam_2];

}

/**
 *Get wallet with a giver name
 *@param name, string, name of wallet to look for
 *@param callback, Callback object returns a Wallet object
 */
RCT_REMAP_METHOD(getWallet,getWallet:(NSDictionary *)currentInstance withParams:(nonnull NSString *)name withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGWalletPool::getWallet, first argument should be an instance of LGWalletPool", nil);
    }
    LGWalletPool *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGWalletPool::getWallet, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
    }
    RCTCoreLGWalletCallback *objcParam_1 = [[RCTCoreLGWalletCallback alloc] initWithResolver:resolve rejecter:reject andBridge:self.bridge];
    [currentInstanceObj getWallet:name callback:objcParam_1];

}

/**
 *Instanciate a new wallet under wallet pool
 *@param name, string, name of newly created wallet
 *@param currency, Currency object, currency of the wallet
 *@param configuration, DynamicObject object, configuration of wallet (preferences)
 *@param callback, Callback object returning a Wallet object
 */
RCT_REMAP_METHOD(createWallet,createWallet:(NSDictionary *)currentInstance withParams:(nonnull NSString *)name
                                                                             currency:(NSDictionary *)currency
                                                                        configuration:(NSDictionary *)configuration withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGWalletPool::createWallet, first argument should be an instance of LGWalletPool", nil);
    }
    LGWalletPool *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGWalletPool::createWallet, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
    }
    RCTCoreLGCurrency *rctParam_currency = (RCTCoreLGCurrency *)[self.bridge moduleForName:@"CoreLGCurrency"];
    LGCurrency *objcParam_1 = (LGCurrency *)[rctParam_currency.objcImplementations objectForKey:currency[@"uid"]];
    RCTCoreLGDynamicObject *rctParam_configuration = (RCTCoreLGDynamicObject *)[self.bridge moduleForName:@"CoreLGDynamicObject"];
    LGDynamicObject *objcParam_2 = (LGDynamicObject *)[rctParam_configuration.objcImplementations objectForKey:configuration[@"uid"]];
    RCTCoreLGWalletCallback *objcParam_3 = [[RCTCoreLGWalletCallback alloc] initWithResolver:resolve rejecter:reject andBridge:self.bridge];
    [currentInstanceObj createWallet:name currency:objcParam_1 configuration:objcParam_2 callback:objcParam_3];

}

/**
 *Return all supported currencies by wallet pool, at least one wallet support one of returned currencies
 *@param callback, ListCallback object, returns a list of Currency objects
 */
RCT_REMAP_METHOD(getCurrencies,getCurrencies:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGWalletPool::getCurrencies, first argument should be an instance of LGWalletPool", nil);
    }
    LGWalletPool *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGWalletPool::getCurrencies, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
    }
    RCTCoreLGCurrencyListCallback *objcParam_0 = [[RCTCoreLGCurrencyListCallback alloc] initWithResolver:resolve rejecter:reject andBridge:self.bridge];
    [currentInstanceObj getCurrencies:objcParam_0];

}

/**
 *Return currency of a specific wallet
 *@param name, wallet's name to look for
 *@param callback, Callback object returning a Currency object
 */
RCT_REMAP_METHOD(getCurrency,getCurrency:(NSDictionary *)currentInstance withParams:(nonnull NSString *)name withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGWalletPool::getCurrency, first argument should be an instance of LGWalletPool", nil);
    }
    LGWalletPool *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGWalletPool::getCurrency, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
    }
    RCTCoreLGCurrencyCallback *objcParam_1 = [[RCTCoreLGCurrencyCallback alloc] initWithResolver:resolve rejecter:reject andBridge:self.bridge];
    [currentInstanceObj getCurrency:name callback:objcParam_1];

}

/**
 *Return last block of blockchain of a given currency (if it is supported by the wallet pool)
 *@param name, string, name of currency we are interested into getting it's blockchain's last block
 *@param callback, Callback object returns a Block object
 */
RCT_REMAP_METHOD(getLastBlock,getLastBlock:(NSDictionary *)currentInstance withParams:(nonnull NSString *)currencyName withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGWalletPool::getLastBlock, first argument should be an instance of LGWalletPool", nil);
    }
    LGWalletPool *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGWalletPool::getLastBlock, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
    }
    RCTCoreLGBlockCallback *objcParam_1 = [[RCTCoreLGBlockCallback alloc] initWithResolver:resolve rejecter:reject andBridge:self.bridge];
    [currentInstanceObj getLastBlock:currencyName callback:objcParam_1];

}

/**
 *Get event bus (handler) through which wallet pool observe and gets notified (explorers, DBs ...)
 *@param EventBus object
 */
RCT_REMAP_METHOD(getEventBus,getEventBus:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGWalletPool::getEventBus, first argument should be an instance of LGWalletPool", nil);
    }
    LGWalletPool *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGWalletPool::getEventBus, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
    }
    LGEventBus * objcResult = [currentInstanceObj getEventBus];

    NSString *uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGEventBus *rctImpl_objcResult = (RCTCoreLGEventBus *)[self.bridge moduleForName:@"CoreLGEventBus"];
    [rctImpl_objcResult.objcImplementations setObject:objcResult forKey:uuid];
    NSDictionary *result = @{@"type" : @"CoreLGEventBus", @"uid" : uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGWalletPool::getEventBus", nil);
    }

}

/**
 *Erase data (in user's DB) relative to wallet since given date
 *@param date, start date of data deletion
 */
RCT_REMAP_METHOD(eraseDataSince,eraseDataSince:(NSDictionary *)currentInstance withParams:(nonnull NSDate *)date withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGWalletPool::eraseDataSince, first argument should be an instance of LGWalletPool", nil);
    }
    LGWalletPool *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGWalletPool::eraseDataSince, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
    }
    RCTCoreLGErrorCodeCallback *objcParam_1 = [[RCTCoreLGErrorCodeCallback alloc] initWithResolver:resolve rejecter:reject andBridge:self.bridge];
    [currentInstanceObj eraseDataSince:date callback:objcParam_1];

}
@end
