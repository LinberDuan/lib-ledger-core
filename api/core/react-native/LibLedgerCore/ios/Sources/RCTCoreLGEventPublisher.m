// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from emitter.djinni

#import "RCTCoreLGEventPublisher.h"


@implementation RCTCoreLGEventPublisher
//Export module
RCT_EXPORT_MODULE(RCTCoreLGEventPublisher)

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
        reject(@"impl_call_error", @"Error while calling RCTCoreLGEventPublisher::release, first argument should be an instance of LGEventPublisher", nil);
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
 *Get event bus through which publisher broadcast its events
 *@return EventBus object
 */
RCT_REMAP_METHOD(getEventBus,getEventBus:(NSDictionary *)currentInstance WithResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGEventPublisher::getEventBus, first argument should be an instance of LGEventPublisher", nil);
    }
    LGEventPublisher *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGEventPublisher::getEventBus, instance of uid %@ not found", currentInstance[@"uid"]];
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
        reject(@"impl_call_error", @"Error while calling LGEventPublisher::getEventBus", nil);
    }

}

/**
 *Broadcast an event through eventbus (to all subscribed receivers to this EventBus)
 *@param event, Event object
 */
RCT_REMAP_METHOD(post,post:(NSDictionary *)currentInstance withParams:(NSDictionary *)event withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGEventPublisher::post, first argument should be an instance of LGEventPublisher", nil);
    }
    LGEventPublisher *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGEventPublisher::post, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
    }
    RCTCoreLGEvent *rctParam_event = (RCTCoreLGEvent *)[self.bridge moduleForName:@"CoreLGEvent"];
    LGEvent *objcParam_0 = (LGEvent *)[rctParam_event.objcImplementations objectForKey:event[@"uid"]];
    [currentInstanceObj post:objcParam_0];

}

/**
 *Same as post method but with an sticky event
 *@param event, Event object
 *@param tag, 32 bits integer, tag of sticky event
 */
RCT_REMAP_METHOD(postSticky,postSticky:(NSDictionary *)currentInstance withParams:(NSDictionary *)event
                                                                              tag:(int)tag withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGEventPublisher::postSticky, first argument should be an instance of LGEventPublisher", nil);
    }
    LGEventPublisher *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGEventPublisher::postSticky, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
    }
    RCTCoreLGEvent *rctParam_event = (RCTCoreLGEvent *)[self.bridge moduleForName:@"CoreLGEvent"];
    LGEvent *objcParam_0 = (LGEvent *)[rctParam_event.objcImplementations objectForKey:event[@"uid"]];
    [currentInstanceObj postSticky:objcParam_0 tag:tag];

}

/**
 *Relay an event to another EventBus (other than EventPublisher's event bus)
 *@param bus, EventBus object, through which we want to broadcast EventPublisher's event to EventPublisher's receiver
 */
RCT_REMAP_METHOD(relay,relay:(NSDictionary *)currentInstance withParams:(NSDictionary *)bus withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    if (!currentInstance[@"uid"] || !currentInstance[@"type"])
    {
        reject(@"impl_call_error", @"Error while calling RCTCoreLGEventPublisher::relay, first argument should be an instance of LGEventPublisher", nil);
    }
    LGEventPublisher *currentInstanceObj = [self.objcImplementations objectForKey:currentInstance[@"uid"]];
    if (!currentInstanceObj)
    {
        NSString *error = [NSString stringWithFormat:@"Error while calling LGEventPublisher::relay, instance of uid %@ not found", currentInstance[@"uid"]];
        reject(@"impl_call_error", error, nil);
    }
    RCTCoreLGEventBus *rctParam_bus = (RCTCoreLGEventBus *)[self.bridge moduleForName:@"CoreLGEventBus"];
    LGEventBus *objcParam_0 = (LGEventBus *)[rctParam_bus.objcImplementations objectForKey:bus[@"uid"]];
    [currentInstanceObj relay:objcParam_0];

}

/**
 *Create a new instance of EventPublisher class
 *@param context, executionContext object, context in which event publisher broadcast its events
 */
RCT_REMAP_METHOD(newInstance,newInstancewithParams:(NSDictionary *)context withResolver:(RCTPromiseResolveBlock)resolve rejecter:(RCTPromiseRejectBlock)reject) {
    RCTCoreLGExecutionContext *rctParam_context = (RCTCoreLGExecutionContext *)[self.bridge moduleForName:@"CoreLGExecutionContext"];
    id<LGExecutionContext>objcParam_0 = (id<LGExecutionContext>)[rctParam_context.objcImplementations objectForKey:context[@"uid"]];
    LGEventPublisher * objcResult = [LGEventPublisher newInstance:objcParam_0];

    NSString *uuid = [[NSUUID UUID] UUIDString];
    RCTCoreLGEventPublisher *rctImpl_objcResult = (RCTCoreLGEventPublisher *)[self.bridge moduleForName:@"CoreLGEventPublisher"];
    [rctImpl_objcResult.objcImplementations setObject:objcResult forKey:uuid];
    NSDictionary *result = @{@"type" : @"CoreLGEventPublisher", @"uid" : uuid };

    if(result)
    {
        resolve(result);
    }
    else
    {
        reject(@"impl_call_error", @"Error while calling LGEventPublisher::newInstance", nil);
    }

}
@end
