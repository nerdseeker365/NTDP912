package com.nt.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class ProxyHelper implements MethodInterceptor {

	@Override
	public Object intercept(Object target, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		   Object retVal=null;
		if(method.getName().equalsIgnoreCase("withdraw")) {
			   if(((Float)args[1])<=4000)
				   retVal=proxy.invokeSuper(target, args);
			   else {
				   args[1]=4000;
				   retVal=proxy.invokeSuper(target, args);
				   retVal=retVal+" u can not withdraw more than Rs.4000";
			   }//else
		}//
		else if(method.getName().equalsIgnoreCase("deposite")) {
			   if(((Float)args[1])<=50000)
				   retVal=proxy.invokeSuper(target, args);
			   else {
				   args[1]=50000;
				   retVal=proxy.invokeSuper(target, args);
				   retVal=retVal+" u can not deposite more than Rs.50000";
			   }//else
		}
		else {
			retVal=proxy.invokeSuper(target, args);
		}
			
		return retVal;
	}//method
}//class
