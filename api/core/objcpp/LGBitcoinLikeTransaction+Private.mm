// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from bitcoin_like_wallet.djinni

#import "LGBitcoinLikeTransaction+Private.h"
#import "LGBitcoinLikeTransaction.h"
#import "DJICppWrapperCache+Private.h"
#import "DJIError.h"
#import "DJIMarshal+Private.h"
#import "LGAmount+Private.h"
#import "LGBitcoinLikeBlock+Private.h"
#import "LGBitcoinLikeInput+Private.h"
#import "LGBitcoinLikeOutput+Private.h"
#import "LGEstimatedSize+Private.h"
#include <exception>
#include <stdexcept>
#include <utility>

static_assert(__has_feature(objc_arc), "Djinni requires ARC to be enabled for this file");

@interface LGBitcoinLikeTransaction ()

- (id)initWithCpp:(const std::shared_ptr<::ledger::core::api::BitcoinLikeTransaction>&)cppRef;

@end

@implementation LGBitcoinLikeTransaction {
    ::djinni::CppProxyCache::Handle<std::shared_ptr<::ledger::core::api::BitcoinLikeTransaction>> _cppRefHandle;
}

- (id)initWithCpp:(const std::shared_ptr<::ledger::core::api::BitcoinLikeTransaction>&)cppRef
{
    if (self = [super init]) {
        _cppRefHandle.assign(cppRef);
    }
    return self;
}

- (nonnull NSString *)getHash {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getHash();
        return ::djinni::String::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nonnull NSArray<LGBitcoinLikeInput *> *)getInputs {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getInputs();
        return ::djinni::List<::djinni_generated::BitcoinLikeInput>::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nonnull NSArray<LGBitcoinLikeOutput *> *)getOutputs {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getOutputs();
        return ::djinni::List<::djinni_generated::BitcoinLikeOutput>::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nullable LGBitcoinLikeBlock *)getBlock {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getBlock();
        return ::djinni::Optional<std::experimental::optional, ::djinni_generated::BitcoinLikeBlock>::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (int64_t)getLockTime {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getLockTime();
        return ::djinni::I64::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nullable LGAmount *)getFees {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getFees();
        return ::djinni_generated::Amount::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nonnull NSDate *)getTime {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getTime();
        return ::djinni::Date::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nullable NSNumber *)getTimestamp {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getTimestamp();
        return ::djinni::Optional<std::experimental::optional, ::djinni::I32>::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (int32_t)getVersion {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getVersion();
        return ::djinni::I32::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nonnull NSData *)serialize {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->serialize();
        return ::djinni::Binary::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nonnull NSData *)serializeOutputs {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->serializeOutputs();
        return ::djinni::Binary::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nullable NSData *)getWitness {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getWitness();
        return ::djinni::Optional<std::experimental::optional, ::djinni::Binary>::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

- (nonnull LGEstimatedSize *)getEstimatedSize {
    try {
        auto objcpp_result_ = _cppRefHandle.get()->getEstimatedSize();
        return ::djinni_generated::EstimatedSize::fromCpp(objcpp_result_);
    } DJINNI_TRANSLATE_EXCEPTIONS()
}

namespace djinni_generated {

auto BitcoinLikeTransaction::toCpp(ObjcType objc) -> CppType
{
    if (!objc) {
        return nullptr;
    }
    return objc->_cppRefHandle.get();
}

auto BitcoinLikeTransaction::fromCppOpt(const CppOptType& cpp) -> ObjcType
{
    if (!cpp) {
        return nil;
    }
    return ::djinni::get_cpp_proxy<LGBitcoinLikeTransaction>(cpp);
}

}  // namespace djinni_generated

@end
