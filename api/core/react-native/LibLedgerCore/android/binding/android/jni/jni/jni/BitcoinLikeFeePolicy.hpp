// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from addresses.djinni

#ifndef DJINNI_GENERATED_BITCOINLIKEFEEPOLICY_HPP_JNI_
#define DJINNI_GENERATED_BITCOINLIKEFEEPOLICY_HPP_JNI_

#include "../../include/BitcoinLikeFeePolicy.hpp"
#include "djinni_support.hpp"

namespace djinni_generated {

class BitcoinLikeFeePolicy final : ::djinni::JniEnum {
public:
    using CppType = ::ledger::core::api::BitcoinLikeFeePolicy;
    using JniType = jobject;

    using Boxed = BitcoinLikeFeePolicy;

    static CppType toCpp(JNIEnv* jniEnv, JniType j) { return static_cast<CppType>(::djinni::JniClass<BitcoinLikeFeePolicy>::get().ordinal(jniEnv, j)); }
    static ::djinni::LocalRef<JniType> fromCpp(JNIEnv* jniEnv, CppType c) { return ::djinni::JniClass<BitcoinLikeFeePolicy>::get().create(jniEnv, static_cast<jint>(c)); }

private:
    BitcoinLikeFeePolicy() : JniEnum("BitcoinLikeFeePolicy") {}
    friend ::djinni::JniClass<BitcoinLikeFeePolicy>;
};

}  // namespace djinni_generated
#endif //DJINNI_GENERATED_BITCOINLIKEFEEPOLICY_HPP_JNI_
