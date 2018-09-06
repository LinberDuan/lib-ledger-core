// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from websocket_client.djinni

#include "NJSWebSocketConnectionCpp.hpp"

using namespace v8;
using namespace node;
using namespace std;

NAN_METHOD(NJSWebSocketConnection::onConnect) {

    //Check if method called with right number of arguments
    if(info.Length() != 1)
    {
        return Nan::ThrowError("NJSWebSocketConnection::onConnect needs 1 arguments");
    }

    //Check if parameters have correct types
    auto arg_0 = Nan::To<int32_t>(info[0]).FromJust();

    //Unwrap current object and retrieve its Cpp Implementation
    NJSWebSocketConnection* obj = Nan::ObjectWrap::Unwrap<NJSWebSocketConnection>(info.This());
    auto cpp_impl = obj->getCppImpl();
    if(!cpp_impl)
    {
        return Nan::ThrowError("NJSWebSocketConnection::onConnect : implementation of WebSocketConnection is not valid");
    }
    cpp_impl->onConnect(arg_0);
}
NAN_METHOD(NJSWebSocketConnection::onClose) {

    //Check if method called with right number of arguments
    if(info.Length() != 0)
    {
        return Nan::ThrowError("NJSWebSocketConnection::onClose needs 0 arguments");
    }

    //Check if parameters have correct types

    //Unwrap current object and retrieve its Cpp Implementation
    NJSWebSocketConnection* obj = Nan::ObjectWrap::Unwrap<NJSWebSocketConnection>(info.This());
    auto cpp_impl = obj->getCppImpl();
    if(!cpp_impl)
    {
        return Nan::ThrowError("NJSWebSocketConnection::onClose : implementation of WebSocketConnection is not valid");
    }
    cpp_impl->onClose();
}
NAN_METHOD(NJSWebSocketConnection::onMessage) {

    //Check if method called with right number of arguments
    if(info.Length() != 1)
    {
        return Nan::ThrowError("NJSWebSocketConnection::onMessage needs 1 arguments");
    }

    //Check if parameters have correct types
    String::Utf8Value string_arg_0(info[0]->ToString());
    auto arg_0 = std::string(*string_arg_0);

    //Unwrap current object and retrieve its Cpp Implementation
    NJSWebSocketConnection* obj = Nan::ObjectWrap::Unwrap<NJSWebSocketConnection>(info.This());
    auto cpp_impl = obj->getCppImpl();
    if(!cpp_impl)
    {
        return Nan::ThrowError("NJSWebSocketConnection::onMessage : implementation of WebSocketConnection is not valid");
    }
    cpp_impl->onMessage(arg_0);
}
NAN_METHOD(NJSWebSocketConnection::onError) {

    //Check if method called with right number of arguments
    if(info.Length() != 2)
    {
        return Nan::ThrowError("NJSWebSocketConnection::onError needs 2 arguments");
    }

    //Check if parameters have correct types
    auto arg_0 = (ledger::core::api::ErrorCode)Nan::To<int>(info[0]).FromJust();
    String::Utf8Value string_arg_1(info[1]->ToString());
    auto arg_1 = std::string(*string_arg_1);

    //Unwrap current object and retrieve its Cpp Implementation
    NJSWebSocketConnection* obj = Nan::ObjectWrap::Unwrap<NJSWebSocketConnection>(info.This());
    auto cpp_impl = obj->getCppImpl();
    if(!cpp_impl)
    {
        return Nan::ThrowError("NJSWebSocketConnection::onError : implementation of WebSocketConnection is not valid");
    }
    cpp_impl->onError(arg_0,arg_1);
}
NAN_METHOD(NJSWebSocketConnection::getConnectionId) {

    //Check if method called with right number of arguments
    if(info.Length() != 0)
    {
        return Nan::ThrowError("NJSWebSocketConnection::getConnectionId needs 0 arguments");
    }

    //Check if parameters have correct types

    //Unwrap current object and retrieve its Cpp Implementation
    NJSWebSocketConnection* obj = Nan::ObjectWrap::Unwrap<NJSWebSocketConnection>(info.This());
    auto cpp_impl = obj->getCppImpl();
    if(!cpp_impl)
    {
        return Nan::ThrowError("NJSWebSocketConnection::getConnectionId : implementation of WebSocketConnection is not valid");
    }

    auto result = cpp_impl->getConnectionId();

    //Wrap result in node object
    auto arg_0 = Nan::New<Int32>(result);

    //Return result
    info.GetReturnValue().Set(arg_0);
}

NAN_METHOD(NJSWebSocketConnection::New) {
    //Only new allowed
    if(!info.IsConstructCall())
    {
        return Nan::ThrowError("NJSWebSocketConnection function can only be called as constructor (use New)");
    }
    NJSWebSocketConnection *node_instance = new NJSWebSocketConnection(nullptr);

    if(node_instance)
    {
        //Wrap and return node instance
        node_instance->Wrap(info.This());
        node_instance->Ref();
        info.GetReturnValue().Set(info.This());
    }
}


Nan::Persistent<ObjectTemplate> NJSWebSocketConnection::WebSocketConnection_prototype;

Handle<Object> NJSWebSocketConnection::wrap(const std::shared_ptr<ledger::core::api::WebSocketConnection> &object) {
    Nan::HandleScope scope;
    Local<ObjectTemplate> local_prototype = Nan::New(WebSocketConnection_prototype);

    Handle<Object> obj;
    if(!local_prototype.IsEmpty())
    {
        obj = local_prototype->NewInstance();
        NJSWebSocketConnection *new_obj = new NJSWebSocketConnection(object);
        if(new_obj)
        {
            new_obj->Wrap(obj);
            new_obj->Ref();
        }
    }
    else
    {
        Nan::ThrowError("NJSWebSocketConnection::wrap: object template not valid");
    }
    return obj;
}

NAN_METHOD(NJSWebSocketConnection::isNull) {
    NJSWebSocketConnection* obj = Nan::ObjectWrap::Unwrap<NJSWebSocketConnection>(info.This());
    auto cpp_implementation = obj->getCppImpl();
    auto isNull = !cpp_implementation ? true : false;
    return info.GetReturnValue().Set(Nan::New<Boolean>(isNull));
}

void NJSWebSocketConnection::Initialize(Local<Object> target) {
    Nan::HandleScope scope;

    Local<FunctionTemplate> func_template = Nan::New<FunctionTemplate>(NJSWebSocketConnection::New);
    Local<ObjectTemplate> objectTemplate = func_template->InstanceTemplate();
    objectTemplate->SetInternalFieldCount(1);

    func_template->SetClassName(Nan::New<String>("NJSWebSocketConnection").ToLocalChecked());

    //SetPrototypeMethod all methods
    Nan::SetPrototypeMethod(func_template,"onConnect", onConnect);
    Nan::SetPrototypeMethod(func_template,"onClose", onClose);
    Nan::SetPrototypeMethod(func_template,"onMessage", onMessage);
    Nan::SetPrototypeMethod(func_template,"onError", onError);
    Nan::SetPrototypeMethod(func_template,"getConnectionId", getConnectionId);
    //Set object prototype
    WebSocketConnection_prototype.Reset(objectTemplate);
    Nan::SetPrototypeMethod(func_template,"isNull", isNull);

    //Add template to target
    target->Set(Nan::New<String>("NJSWebSocketConnection").ToLocalChecked(), func_template->GetFunction());
}
