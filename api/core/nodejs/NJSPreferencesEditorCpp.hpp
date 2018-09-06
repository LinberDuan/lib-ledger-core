// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from preferences.djinni

#ifndef DJINNI_GENERATED_NJSPREFERENCESEDITOR_HPP
#define DJINNI_GENERATED_NJSPREFERENCESEDITOR_HPP


#include <cstdint>
#include <memory>
#include <string>
#include <vector>

#include <nan.h>
#include <node.h>
#include "../../../core/src/api/PreferencesEditor.hpp"

using namespace v8;
using namespace node;
using namespace std;
using namespace ledger::core::api;

class NJSPreferencesEditor: public Nan::ObjectWrap {
public:

    static void Initialize(Local<Object> target);
    virtual ~NJSPreferencesEditor() {};
    NJSPreferencesEditor(const std::shared_ptr<ledger::core::api::PreferencesEditor> &iPreferencesEditor):_PreferencesEditor(iPreferencesEditor){};

    static Handle<Object> wrap(const std::shared_ptr<ledger::core::api::PreferencesEditor> &object);
    static Nan::Persistent<ObjectTemplate> PreferencesEditor_prototype;
    std::shared_ptr<ledger::core::api::PreferencesEditor> getCppImpl(){return _PreferencesEditor;};

private:
    /**
     * Sets the value to the given key in the Preferences.
     * @param key The data key.
     * @param value The value to store
     * @return The reference of self in order to chain the call to the editor.
     */
    static NAN_METHOD(putString);

    /**
     * Sets the value to the given key in the Preferences.
     * @param key The data key.
     * @param value The value to store
     * @return The reference of self in order to chain the call to the editor.
     */
    static NAN_METHOD(putInt);

    /**
     * Sets the value to the given key in the Preferences.
     * @param key The data key.
     * @param value The value to store
     * @return The reference of self in order to chain the call to the editor.
     */
    static NAN_METHOD(putLong);

    /**
     * Sets the value to the given key in the Preferences.
     * @param key The data key.
     * @param value The value to store
     * @return The reference of self in order to chain the call to the editor.
     */
    static NAN_METHOD(putBoolean);

    /**
     * Sets the value to the given key in the Preferences.
     * @param key The data key.
     * @param value The value to store
     * @return The reference of self in order to chain the call to the editor.
     */
    static NAN_METHOD(putStringArray);

    /**
     * Sets the value to the given key in the Preferences.
     * @param key The data key.
     * @param value The value to store
     * @return The reference of self in order to chain the call to the editor.
     */
    static NAN_METHOD(putData);

    /**
     * Removes the data associated with the given key.
     * @param key The key to remove from the Preferences
     * @return The reference of self in order to chain the call to the editor.
     */
    static NAN_METHOD(remove);

    /** Persists the changes to the Preferences. */
    static NAN_METHOD(commit);

    static NAN_METHOD(New);

    static NAN_METHOD(isNull);
    std::shared_ptr<ledger::core::api::PreferencesEditor> _PreferencesEditor;
};
#endif //DJINNI_GENERATED_NJSPREFERENCESEDITOR_HPP
