# spring-interceptor
Custom Spring-boot interceptor


> All HandlerMapping implementations support handler interceptors that are useful when you want to apply specific functionality to certain requests — for example, checking for a >  principal. Interceptors must implement HandlerInterceptor from the org.springframework.web.servlet package with three methods that should provide enough flexibility to do all kinds of pre-processing and post-processing:

> preHandle(..): Before the actual handler is run

> postHandle(..): After the handler is run

> afterCompletion(..): After the complete request has finished

> The preHandle(..) method returns a boolean value. You can use this method to break or continue the processing of the execution chain. When this method returns true, the handler execution chain continues. When it returns false, the DispatcherServlet assumes the interceptor itself has taken care of requests (and, for example, rendered an appropriate view) and does not continue executing the other interceptors and the actual handler in the execution chain.

> See Interceptors in the section on MVC configuration for examples of how to configure interceptors. You can also register them directly by using setters on individual HandlerMapping implementations.

> Note that postHandle is less useful with @ResponseBody and ResponseEntity methods for which the response is written and committed within the HandlerAdapter and before postHandle. That means it is too late to make any changes to the response, such as adding an extra header. For such scenarios, you can implement ResponseBodyAdvice and either declare it as an   Controller Advice bean or configure it directly on RequestMappingHandlerAdapter.
