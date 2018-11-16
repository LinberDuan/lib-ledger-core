// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from callback.djinni

#include "WalletPoolCallback.hpp"  // my header
#include "Error.hpp"
#include "Marshal.hpp"
#include "WalletPool.hpp"

namespace djinni_generated {

WalletPoolCallback::WalletPoolCallback() : ::djinni::JniInterface<::ledger::core::api::WalletPoolCallback, WalletPoolCallback>() {}

WalletPoolCallback::~WalletPoolCallback() = default;

WalletPoolCallback::JavaProxy::JavaProxy(JniType j) : Handle(::djinni::jniGetThreadEnv(), j) { }

WalletPoolCallback::JavaProxy::~JavaProxy() = default;

void WalletPoolCallback::JavaProxy::onCallback(const std::shared_ptr<::ledger::core::api::WalletPool> & c_result, const std::experimental::optional<::ledger::core::api::Error> & c_error) {
    auto jniEnv = ::djinni::jniGetThreadEnv();
    ::djinni::JniLocalScope jscope(jniEnv, 10);
    const auto& data = ::djinni::JniClass<::djinni_generated::WalletPoolCallback>::get();
    jniEnv->CallVoidMethod(Handle::get().get(), data.method_onCallback,
                           ::djinni::get(::djinni::Optional<std::experimental::optional, ::djinni_generated::WalletPool>::fromCpp(jniEnv, c_result)),
                           ::djinni::get(::djinni::Optional<std::experimental::optional, ::djinni_generated::Error>::fromCpp(jniEnv, c_error)));
    ::djinni::jniExceptionCheck(jniEnv);
}

}  // namespace djinni_generated
