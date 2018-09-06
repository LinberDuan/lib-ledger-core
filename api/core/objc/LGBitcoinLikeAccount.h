// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from bitcoin_like_wallet.djinni

#import <Foundation/Foundation.h>
@class LGBitcoinLikeTransaction;
@class LGBitcoinLikeTransactionBuilder;
@protocol LGBitcoinLikeOutputListCallback;
@protocol LGI32Callback;
@protocol LGStringCallback;


/**Class representing a Bitcoin account */
@interface LGBitcoinLikeAccount : NSObject

/**
 *Get UTXOs of account in a given range
 *@param from, integer, lower bound for account's UTXO's index
 *@param to, integer, upper bound for account's UTXO's index
 *@param callback, ListCallback object which returns a list of BitcoinLikeOutput if getUTXO succeed
 */
- (void)getUTXO:(int32_t)from
             to:(int32_t)to
       callback:(nullable id<LGBitcoinLikeOutputListCallback>)callback;

/**
 *Get UTXOs count of account
 *@param callback, Callback object which returns number of UTXO owned by this account
 */
- (void)getUTXOCount:(nullable id<LGI32Callback>)callback;

- (void)broadcastRawTransaction:(nonnull NSData *)transaction
                       callback:(nullable id<LGStringCallback>)callback;

- (void)broadcastTransaction:(nullable LGBitcoinLikeTransaction *)transaction
                    callback:(nullable id<LGStringCallback>)callback;

- (nullable LGBitcoinLikeTransactionBuilder *)buildTransaction;

@end
