// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from callback.djinni

#include "NJSBitcoinLikeTransactionCallback.hpp"

using namespace v8;
using namespace node;
using namespace std;

void NJSBitcoinLikeTransactionCallback::onCallback(const std::shared_ptr<BitcoinLikeTransaction> & result, const std::experimental::optional<Error> & error)
{
    Nan::HandleScope scope;
    //Wrap parameters
    auto arg_0_wrap = NJSBitcoinLikeTransaction::wrap(result);
    auto arg_0 = Nan::ObjectWrap::Unwrap<NJSBitcoinLikeTransaction>(arg_0_wrap)->handle();


    Local<Value> arg_1;
    if(error)
    {
        auto arg_1_optional = (error).value();
        auto arg_1_tmp = Nan::New<Object>();
        auto arg_1_tmp_1 = Nan::New<Integer>((int)arg_1_optional.code);
        Nan::DefineOwnProperty(arg_1_tmp, Nan::New<String>("code").ToLocalChecked(), arg_1_tmp_1);
        auto arg_1_tmp_2 = Nan::New<String>(arg_1_optional.message).ToLocalChecked();
        Nan::DefineOwnProperty(arg_1_tmp, Nan::New<String>("message").ToLocalChecked(), arg_1_tmp_2);

        arg_1 = arg_1_tmp;
    }

    auto local_resolver = Nan::New<Promise::Resolver>(pers_resolver);
    if(error)
    {
        auto rejected = local_resolver->Reject(Nan::GetCurrentContext(), arg_1);
        rejected.FromJust();
    }
    else
    {
        auto resolve = local_resolver->Resolve(Nan::GetCurrentContext(), arg_0);
        resolve.FromJust();
    }
}

NAN_METHOD(NJSBitcoinLikeTransactionCallback::addRef) {

    NJSBitcoinLikeTransactionCallback *obj = Nan::ObjectWrap::Unwrap<NJSBitcoinLikeTransactionCallback>(info.This());
    obj->Ref();
}

NAN_METHOD(NJSBitcoinLikeTransactionCallback::removeRef) {

    NJSBitcoinLikeTransactionCallback *obj = Nan::ObjectWrap::Unwrap<NJSBitcoinLikeTransactionCallback>(info.This());
    obj->Unref();
}

NAN_METHOD(NJSBitcoinLikeTransactionCallback::New) {
    //Only new allowed
    if(!info.IsConstructCall())
    {
        return Nan::ThrowError("NJSBitcoinLikeTransactionCallback function can only be called as constructor (use New)");
    }

    auto resolver = v8::Promise::Resolver::New(Nan::GetCurrentContext()).ToLocalChecked();
    NJSBitcoinLikeTransactionCallback *node_instance = new NJSBitcoinLikeTransactionCallback(resolver);

    if(node_instance)
    {
        //Wrap and return node instance
        node_instance->Wrap(info.This());
        node_instance->Ref();
        info.GetReturnValue().Set(info.This());
    }
}

void NJSBitcoinLikeTransactionCallback::Initialize(Local<Object> target) {
    Nan::HandleScope scope;

    Local<FunctionTemplate> func_template = Nan::New<FunctionTemplate>(NJSBitcoinLikeTransactionCallback::New);
    Local<ObjectTemplate> objectTemplate = func_template->InstanceTemplate();
    objectTemplate->SetInternalFieldCount(1);

    func_template->SetClassName(Nan::New<String>("NJSBitcoinLikeTransactionCallback").ToLocalChecked());
    Nan::SetPrototypeMethod(func_template,"addRef", addRef);
    Nan::SetPrototypeMethod(func_template,"removeRef", removeRef);

    //Add template to target
    target->Set(Nan::New<String>("NJSBitcoinLikeTransactionCallback").ToLocalChecked(), func_template->GetFunction());
}
