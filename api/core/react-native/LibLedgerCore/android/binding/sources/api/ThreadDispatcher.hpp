// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from thread_dispatcher.djinni

#ifndef DJINNI_GENERATED_THREADDISPATCHER_HPP
#define DJINNI_GENERATED_THREADDISPATCHER_HPP

#include <memory>
#include <string>

namespace ledger { namespace core { namespace api {

class ExecutionContext;
class Lock;

/**Class representing a thread dispatcher */
class ThreadDispatcher {
public:
    virtual ~ThreadDispatcher() {}

    /**
     *Get an execution context where tasks are executed sequentially
     *@param name, string, name of execution context to retrieve
     *@return ExecutionContext object
     */
    virtual std::shared_ptr<ExecutionContext> getSerialExecutionContext(const std::string & name) = 0;

    /**
     *Get an execution context where tasks are executed in parallel thanks to a thread pool
     *where a system of inter-thread communication was designed
     *@param name, string, name of execution context to retrieve
     *@return ExecutionContext object
     */
    virtual std::shared_ptr<ExecutionContext> getThreadPoolExecutionContext(const std::string & name) = 0;

    /**
     *Get main execution context (generally where tasks that should never get blocked are executed)
     *@return ExecutionContext object
     */
    virtual std::shared_ptr<ExecutionContext> getMainExecutionContext() = 0;

    /**
     *Get lock to handle multithreading
     *@return Lock object
     */
    virtual std::shared_ptr<Lock> newLock() = 0;
};

} } }  // namespace ledger::core::api
#endif //DJINNI_GENERATED_THREADDISPATCHER_HPP
