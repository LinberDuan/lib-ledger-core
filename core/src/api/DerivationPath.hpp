// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from wallet.djinni

#ifndef DJINNI_GENERATED_DERIVATIONPATH_HPP
#define DJINNI_GENERATED_DERIVATIONPATH_HPP

#include <cstdint>
#include <memory>
#include <string>
#include <vector>

namespace ledger { namespace core { namespace api {

class DerivationPath {
public:
    virtual ~DerivationPath() {}

    /** Get the number of element in this path. */
    virtual int32_t getDepth() = 0;

    /** Get the child num at the given index in the path. */
    virtual int32_t getChildNum(int32_t index) = 0;

    /**
     * Get the child num at the given index in the path. If the child num is hardened, returns it
     * without the hardened marker bit.
     */
    virtual int32_t getUnhardenedChildNum(int32_t index) = 0;

    /** Return true if the given index in the path is an hardened child num. */
    virtual bool isHardened(int32_t index) = 0;

    /** Serialize the given path to a human readable string like "44'/0'/0'/0/0" */
    virtual std::string toString() = 0;

    /**
     * Return a derivation path without the last element, e.g. the parent of "44'/0'/0'/0/0" is
     * "44'/0'/0'/0"
     */
    virtual std::shared_ptr<DerivationPath> getParent() = 0;

    /** Return an array where which item is a child num of the path. */
    virtual std::vector<int32_t> toArray() = 0;

    static std::shared_ptr<DerivationPath> parse(const std::string & path);
};

} } }  // namespace ledger::core::api
#endif //DJINNI_GENERATED_DERIVATIONPATH_HPP
