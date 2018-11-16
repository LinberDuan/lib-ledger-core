// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from bitcoin_like_wallet.djinni

#include "BitcoinLikeTransactionRequest.hpp"  // my header
#include "Amount.hpp"
#include "BitcoinLikeOutput.hpp"
#include "Marshal.hpp"

namespace djinni_generated {

BitcoinLikeTransactionRequest::BitcoinLikeTransactionRequest() = default;

BitcoinLikeTransactionRequest::~BitcoinLikeTransactionRequest() = default;

auto BitcoinLikeTransactionRequest::fromCpp(JNIEnv* jniEnv, const CppType& c) -> ::djinni::LocalRef<JniType> {
    const auto& data = ::djinni::JniClass<BitcoinLikeTransactionRequest>::get();
    auto r = ::djinni::LocalRef<JniType>{jniEnv->NewObject(data.clazz.get(), data.jconstructor,
                                                           ::djinni::get(::djinni::List<::djinni_generated::BitcoinLikeOutput>::fromCpp(jniEnv, c.utxo)),
                                                           ::djinni::get(::djinni::List<::djinni_generated::BitcoinLikeOutput>::fromCpp(jniEnv, c.outputs)),
                                                           ::djinni::get(::djinni::Optional<std::experimental::optional, ::djinni_generated::Amount>::fromCpp(jniEnv, c.baseFees)),
                                                           ::djinni::get(::djinni::Optional<std::experimental::optional, ::djinni_generated::Amount>::fromCpp(jniEnv, c.totalFees)),
                                                           ::djinni::get(::djinni::Optional<std::experimental::optional, ::djinni::I32>::fromCpp(jniEnv, c.lockTime)))};
    ::djinni::jniExceptionCheck(jniEnv);
    return r;
}

auto BitcoinLikeTransactionRequest::toCpp(JNIEnv* jniEnv, JniType j) -> CppType {
    ::djinni::JniLocalScope jscope(jniEnv, 6);
    assert(j != nullptr);
    const auto& data = ::djinni::JniClass<BitcoinLikeTransactionRequest>::get();
    return {::djinni::List<::djinni_generated::BitcoinLikeOutput>::toCpp(jniEnv, jniEnv->GetObjectField(j, data.field_utxo)),
            ::djinni::List<::djinni_generated::BitcoinLikeOutput>::toCpp(jniEnv, jniEnv->GetObjectField(j, data.field_outputs)),
            ::djinni::Optional<std::experimental::optional, ::djinni_generated::Amount>::toCpp(jniEnv, jniEnv->GetObjectField(j, data.field_baseFees)),
            ::djinni::Optional<std::experimental::optional, ::djinni_generated::Amount>::toCpp(jniEnv, jniEnv->GetObjectField(j, data.field_totalFees)),
            ::djinni::Optional<std::experimental::optional, ::djinni::I32>::toCpp(jniEnv, jniEnv->GetObjectField(j, data.field_lockTime))};
}

}  // namespace djinni_generated
