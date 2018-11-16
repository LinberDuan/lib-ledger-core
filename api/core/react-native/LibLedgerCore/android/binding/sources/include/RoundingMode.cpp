// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from amount.djinni

#include "RoundingMode.hpp"  // my header
#include "enum_from_string.hpp"

namespace ledger { namespace core { namespace api {

std::string to_string(const RoundingMode& roundingMode) {
    switch (roundingMode) {
        case RoundingMode::TRUNCATED: return "TRUNCATED";
        case RoundingMode::ROUND_HALF_DOWN: return "ROUND_HALF_DOWN";
        case RoundingMode::ROUND_HALF_EVEN: return "ROUND_HALF_EVEN";
        case RoundingMode::ROUND_HALF_UP: return "ROUND_HALF_UP";
    };
};
template <>
RoundingMode from_string(const std::string& roundingMode) {
    if (roundingMode == "TRUNCATED") return RoundingMode::TRUNCATED;
    else if (roundingMode == "ROUND_HALF_DOWN") return RoundingMode::ROUND_HALF_DOWN;
    else if (roundingMode == "ROUND_HALF_EVEN") return RoundingMode::ROUND_HALF_EVEN;
    else return RoundingMode::ROUND_HALF_UP;
};

std::ostream &operator<<(std::ostream &os, const RoundingMode &o)
{
    switch (o) {
        case RoundingMode::TRUNCATED:  return os << "TRUNCATED";
        case RoundingMode::ROUND_HALF_DOWN:  return os << "ROUND_HALF_DOWN";
        case RoundingMode::ROUND_HALF_EVEN:  return os << "ROUND_HALF_EVEN";
        case RoundingMode::ROUND_HALF_UP:  return os << "ROUND_HALF_UP";
    }
}

} } }  // namespace ledger::core::api
