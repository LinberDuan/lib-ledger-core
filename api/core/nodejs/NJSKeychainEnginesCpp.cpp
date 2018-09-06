// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from configuration.djinni

#include "NJSKeychainEnginesCpp.hpp"

using namespace v8;
using namespace node;
using namespace std;


NAN_METHOD(NJSKeychainEngines::New) {
    //Only new allowed
    if(!info.IsConstructCall())
    {
        return Nan::ThrowError("NJSKeychainEngines function can only be called as constructor (use New)");
    }
    NJSKeychainEngines *node_instance = new NJSKeychainEngines(nullptr);

    if(node_instance)
    {
        //Wrap and return node instance
        node_instance->Wrap(info.This());
        node_instance->Ref();
        info.GetReturnValue().Set(info.This());
    }
}


Nan::Persistent<ObjectTemplate> NJSKeychainEngines::KeychainEngines_prototype;

Handle<Object> NJSKeychainEngines::wrap(const std::shared_ptr<ledger::core::api::KeychainEngines> &object) {
    Nan::HandleScope scope;
    Local<ObjectTemplate> local_prototype = Nan::New(KeychainEngines_prototype);

    Handle<Object> obj;
    if(!local_prototype.IsEmpty())
    {
        obj = local_prototype->NewInstance();
        NJSKeychainEngines *new_obj = new NJSKeychainEngines(object);
        if(new_obj)
        {
            new_obj->Wrap(obj);
            new_obj->Ref();
        }
    }
    else
    {
        Nan::ThrowError("NJSKeychainEngines::wrap: object template not valid");
    }
    return obj;
}

NAN_METHOD(NJSKeychainEngines::isNull) {
    NJSKeychainEngines* obj = Nan::ObjectWrap::Unwrap<NJSKeychainEngines>(info.This());
    auto cpp_implementation = obj->getCppImpl();
    auto isNull = !cpp_implementation ? true : false;
    return info.GetReturnValue().Set(Nan::New<Boolean>(isNull));
}

void NJSKeychainEngines::Initialize(Local<Object> target) {
    Nan::HandleScope scope;

    Local<FunctionTemplate> func_template = Nan::New<FunctionTemplate>(NJSKeychainEngines::New);
    Local<ObjectTemplate> objectTemplate = func_template->InstanceTemplate();
    objectTemplate->SetInternalFieldCount(1);

    func_template->SetClassName(Nan::New<String>("NJSKeychainEngines").ToLocalChecked());

    //SetPrototypeMethod all methods
    //Set object prototype
    KeychainEngines_prototype.Reset(objectTemplate);
    Nan::SetPrototypeMethod(func_template,"isNull", isNull);

    //Add template to target
    target->Set(Nan::New<String>("NJSKeychainEngines").ToLocalChecked(), func_template->GetFunction());
}
