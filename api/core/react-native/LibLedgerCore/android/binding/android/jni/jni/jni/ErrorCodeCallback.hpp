// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from callback.djinni

#ifndef DJINNI_GENERATED_ERRORCODECALLBACK_HPP_JNI_
#define DJINNI_GENERATED_ERRORCODECALLBACK_HPP_JNI_

#include "../../include/ErrorCodeCallback.hpp"
#include "djinni_support.hpp"

namespace djinni_generated {

class ErrorCodeCallback final : ::djinni::JniInterface<::ledger::core::api::ErrorCodeCallback, ErrorCodeCallback> {
public:
    using CppType = std::shared_ptr<::ledger::core::api::ErrorCodeCallback>;
    using CppOptType = std::shared_ptr<::ledger::core::api::ErrorCodeCallback>;
    using JniType = jobject;

    using Boxed = ErrorCodeCallback;

    ~ErrorCodeCallback();

    static CppType toCpp(JNIEnv* jniEnv, JniType j) { return ::djinni::JniClass<ErrorCodeCallback>::get()._fromJava(jniEnv, j); }
    static ::djinni::LocalRef<JniType> fromCppOpt(JNIEnv* jniEnv, const CppOptType& c) { return {jniEnv, ::djinni::JniClass<ErrorCodeCallback>::get()._toJava(jniEnv, c)}; }
    static ::djinni::LocalRef<JniType> fromCpp(JNIEnv* jniEnv, const CppType& c) { return fromCppOpt(jniEnv, c); }

private:
    ErrorCodeCallback();
    friend ::djinni::JniClass<ErrorCodeCallback>;
    friend ::djinni::JniInterface<::ledger::core::api::ErrorCodeCallback, ErrorCodeCallback>;

    class JavaProxy final : ::djinni::JavaProxyHandle<JavaProxy>, public ::ledger::core::api::ErrorCodeCallback
    {
    public:
        JavaProxy(JniType j);
        ~JavaProxy();

        void onCallback(std::experimental::optional<::ledger::core::api::ErrorCode> result, const std::experimental::optional<::ledger::core::api::Error> & error) override;

    private:
        friend ::djinni::JniInterface<::ledger::core::api::ErrorCodeCallback, ::djinni_generated::ErrorCodeCallback>;
    };

    const ::djinni::GlobalRef<jclass> clazz { ::djinni::jniFindClass("ErrorCodeCallback") };
    const jmethodID method_onCallback { ::djinni::jniGetMethodID(clazz.get(), "onCallback", "(LErrorCode;LError;)V") };
};

}  // namespace djinni_generated
#endif //DJINNI_GENERATED_ERRORCODECALLBACK_HPP_JNI_
