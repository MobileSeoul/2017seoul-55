package com.google.appinventor.components.runtime;

public interface HandlesEventDispatching {
    boolean canDispatchEvent(Component component, String str);

    boolean dispatchEvent(Component component, String str, String str2, Object[] objArr);
}
