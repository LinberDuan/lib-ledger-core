// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from callback.djinni

#ifndef DJINNI_GENERATED_CURRENCYCALLBACK_HPP_JNI_
#define DJINNI_GENERATED_CURRENCYCALLBACK_HPP_JNI_

#include "../../api/CurrencyCallback.hpp"
#include "djinni_support.hpp"

namespace djinni_generated {

class CurrencyCallback final : ::djinni::JniInterface<::ledger::core::api::CurrencyCallback, CurrencyCallback> {
public:
    using CppType = std::shared_ptr<::ledger::core::api::CurrencyCallback>;
    using CppOptType = std::shared_ptr<::ledger::core::api::CurrencyCallback>;
    using JniType = jobject;

    using Boxed = CurrencyCallback;

    ~CurrencyCallback();

    static CppType toCpp(JNIEnv* jniEnv, JniType j) { return ::djinni::JniClass<CurrencyCallback>::get()._fromJava(jniEnv, j); }
    static ::djinni::LocalRef<JniType> fromCppOpt(JNIEnv* jniEnv, const CppOptType& c) { return {jniEnv, ::djinni::JniClass<CurrencyCallback>::get()._toJava(jniEnv, c)}; }
    static ::djinni::LocalRef<JniType> fromCpp(JNIEnv* jniEnv, const CppType& c) { return fromCppOpt(jniEnv, c); }

private:
    CurrencyCallback();
    friend ::djinni::JniClass<CurrencyCallback>;
    friend ::djinni::JniInterface<::ledger::core::api::CurrencyCallback, CurrencyCallback>;

    class JavaProxy final : ::djinni::JavaProxyHandle<JavaProxy>, public ::ledger::core::api::CurrencyCallback
    {
    public:
        JavaProxy(JniType j);
        ~JavaProxy();

        void onCallback(const std::experimental::optional<::ledger::core::api::Currency> & result, const std::experimental::optional<::ledger::core::api::Error> & error) override;

    private:
        friend ::djinni::JniInterface<::ledger::core::api::CurrencyCallback, ::djinni_generated::CurrencyCallback>;
    };

    const ::djinni::GlobalRef<jclass> clazz { ::djinni::jniFindClass("co/ledger/core/CurrencyCallback") };
    const jmethodID method_onCallback { ::djinni::jniGetMethodID(clazz.get(), "onCallback", "(Lco/ledger/core/Currency;Lco/ledger/core/Error;)V") };
};

}  // namespace djinni_generated
#endif //DJINNI_GENERATED_CURRENCYCALLBACK_HPP_JNI_
