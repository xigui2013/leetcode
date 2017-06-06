package gc;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * leetcode
 * Created by wjw on 29/05/2017.
 * VM Args：-XX：PermSize=10M-XX：MaxPermSize=10M
 * 思路，不断动态生成类，使之方法区溢出
 */
public class JavaMethodAreaOOM {
    public static void main(String[] args) {
        while (true) {
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(OOMObject.class);
            enhancer.setUseCache(false);
            enhancer.setCallback(
                    new MethodInterceptor() {
                        public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
                            return proxy.invokeSuper(obj, args);
                        }
                    }
            );
            enhancer.create();
        }
    }

    static class OOMObject {
    }
}
