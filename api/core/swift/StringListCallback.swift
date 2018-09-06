// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from callback.djinni
import Foundation

final class StringListCallback: NSObject, LGStringListCallback {
    private var onCallbackBlock: ((NSArray?, LGError?) -> Void)?

    func setOnCallback(_ block: @escaping (NSArray?, LGError?) -> Void) -> StringListCallback {
        self.onCallbackBlock = block
        return self
    }

    func onCallback(_ result: NSArray?, error: LGError?) -> Void {
        self.onCallbackBlock?(result, error)
    }
}
