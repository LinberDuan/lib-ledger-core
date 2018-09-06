// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from addresses.djinni

#include "BitcoinLikeNetworkParameters.hpp"  // my header
#include "BitcoinLikeFeePolicy.hpp"
#include "Marshal.hpp"

namespace djinni_generated {

BitcoinLikeNetworkParameters::BitcoinLikeNetworkParameters() = default;

BitcoinLikeNetworkParameters::~BitcoinLikeNetworkParameters() = default;

auto BitcoinLikeNetworkParameters::fromCpp(JNIEnv* jniEnv, const CppType& c) -> ::djinni::LocalRef<JniType> {
    const auto& data = ::djinni::JniClass<BitcoinLikeNetworkParameters>::get();
    auto r = ::djinni::LocalRef<JniType>{jniEnv->NewObject(data.clazz.get(), data.jconstructor,
                                                           ::djinni::get(::djinni::String::fromCpp(jniEnv, c.Identifier)),
                                                           ::djinni::get(::djinni::Binary::fromCpp(jniEnv, c.P2PKHVersion)),
                                                           ::djinni::get(::djinni::Binary::fromCpp(jniEnv, c.P2SHVersion)),
                                                           ::djinni::get(::djinni::Binary::fromCpp(jniEnv, c.XPUBVersion)),
                                                           ::djinni::get(::djinni_generated::BitcoinLikeFeePolicy::fromCpp(jniEnv, c.FeePolicy)),
                                                           ::djinni::get(::djinni::I64::fromCpp(jniEnv, c.DustAmount)),
                                                           ::djinni::get(::djinni::String::fromCpp(jniEnv, c.MessagePrefix)),
                                                           ::djinni::get(::djinni::Bool::fromCpp(jniEnv, c.UsesTimestampedTransaction)),
                                                           ::djinni::get(::djinni::I64::fromCpp(jniEnv, c.TimestampDelay)),
                                                           ::djinni::get(::djinni::Binary::fromCpp(jniEnv, c.SigHash)),
                                                           ::djinni::get(::djinni::List<::djinni::String>::fromCpp(jniEnv, c.AdditionalBIPs)))};
    ::djinni::jniExceptionCheck(jniEnv);
    return r;
}

auto BitcoinLikeNetworkParameters::toCpp(JNIEnv* jniEnv, JniType j) -> CppType {
    ::djinni::JniLocalScope jscope(jniEnv, 12);
    assert(j != nullptr);
    const auto& data = ::djinni::JniClass<BitcoinLikeNetworkParameters>::get();
    return {::djinni::String::toCpp(jniEnv, (jstring)jniEnv->GetObjectField(j, data.field_Identifier)),
            ::djinni::Binary::toCpp(jniEnv, (jbyteArray)jniEnv->GetObjectField(j, data.field_P2PKHVersion)),
            ::djinni::Binary::toCpp(jniEnv, (jbyteArray)jniEnv->GetObjectField(j, data.field_P2SHVersion)),
            ::djinni::Binary::toCpp(jniEnv, (jbyteArray)jniEnv->GetObjectField(j, data.field_XPUBVersion)),
            ::djinni_generated::BitcoinLikeFeePolicy::toCpp(jniEnv, jniEnv->GetObjectField(j, data.field_FeePolicy)),
            ::djinni::I64::toCpp(jniEnv, jniEnv->GetLongField(j, data.field_DustAmount)),
            ::djinni::String::toCpp(jniEnv, (jstring)jniEnv->GetObjectField(j, data.field_MessagePrefix)),
            ::djinni::Bool::toCpp(jniEnv, jniEnv->GetBooleanField(j, data.field_UsesTimestampedTransaction)),
            ::djinni::I64::toCpp(jniEnv, jniEnv->GetLongField(j, data.field_TimestampDelay)),
            ::djinni::Binary::toCpp(jniEnv, (jbyteArray)jniEnv->GetObjectField(j, data.field_SigHash)),
            ::djinni::List<::djinni::String>::toCpp(jniEnv, jniEnv->GetObjectField(j, data.field_AdditionalBIPs))};
}

}  // namespace djinni_generated
