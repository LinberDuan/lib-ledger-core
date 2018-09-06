// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from thread_dispatcher.djinni

#include "Lock.hpp"  // my header
#include "Marshal.hpp"

namespace djinni_generated {

Lock::Lock() : ::djinni::JniInterface<::ledger::core::api::Lock, Lock>() {}

Lock::~Lock() = default;

Lock::JavaProxy::JavaProxy(JniType j) : Handle(::djinni::jniGetThreadEnv(), j) { }

Lock::JavaProxy::~JavaProxy() = default;

void Lock::JavaProxy::lock() {
    auto jniEnv = ::djinni::jniGetThreadEnv();
    ::djinni::JniLocalScope jscope(jniEnv, 10);
    const auto& data = ::djinni::JniClass<::djinni_generated::Lock>::get();
    jniEnv->CallVoidMethod(Handle::get().get(), data.method_lock);
    ::djinni::jniExceptionCheck(jniEnv);
}
bool Lock::JavaProxy::tryLock() {
    auto jniEnv = ::djinni::jniGetThreadEnv();
    ::djinni::JniLocalScope jscope(jniEnv, 10);
    const auto& data = ::djinni::JniClass<::djinni_generated::Lock>::get();
    auto jret = jniEnv->CallBooleanMethod(Handle::get().get(), data.method_tryLock);
    ::djinni::jniExceptionCheck(jniEnv);
    return ::djinni::Bool::toCpp(jniEnv, jret);
}
void Lock::JavaProxy::unlock() {
    auto jniEnv = ::djinni::jniGetThreadEnv();
    ::djinni::JniLocalScope jscope(jniEnv, 10);
    const auto& data = ::djinni::JniClass<::djinni_generated::Lock>::get();
    jniEnv->CallVoidMethod(Handle::get().get(), data.method_unlock);
    ::djinni::jniExceptionCheck(jniEnv);
}

}  // namespace djinni_generated
