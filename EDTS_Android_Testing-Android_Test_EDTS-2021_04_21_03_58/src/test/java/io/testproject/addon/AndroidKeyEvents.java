package io.testproject.addon;

import io.testproject.sdk.internal.addons.ActionProxy;
import io.testproject.sdk.internal.addons.ProxyDescriptor;
import java.lang.String;

/**
 * Proxy for Android Key Events Addon */
public class AndroidKeyEvents {
  /**
   * Factory method for PressKey */
  public static PressKey getPressKey() {
    return new PressKey();
  }

  /**
   * Factory method for PressKey
   * @param key Key to be pressed. List: https://appium.github.io/java-client/io/appium/java_client/android/nativekey/AndroidKey.html */
  public static PressKey pressKey(String key) {
    return new PressKey(key);
  }

  /**
   * Factory method for PressEnter */
  public static PressEnter getPressEnter() {
    return new PressEnter();
  }

  /**
   * Factory method for PressEscape */
  public static PressEscape getPressEscape() {
    return new PressEscape();
  }

  /**
   * Press Android Key.  */
  public static class PressKey extends ActionProxy {
    /**
     * Key to be pressed. List: https://appium.github.io/java-client/io/appium/java_client/android/nativekey/AndroidKey.html (INPUT) */
    public String key;

    public PressKey() {
      this.setDescriptor(new ProxyDescriptor("gAEqQYu9vUOxP6W-SUvkPg", "io.testproject.addon.PressKey"));
    }

    public PressKey(String key) {
      this();
      this.key = key;
    }
  }

  /**
   * Press Enter.  */
  public static class PressEnter extends ActionProxy {
    public PressEnter() {
      this.setDescriptor(new ProxyDescriptor("gAEqQYu9vUOxP6W-SUvkPg", "io.testproject.addon.PressEnter"));
    }
  }

  /**
   * Press Escape.  */
  public static class PressEscape extends ActionProxy {
    public PressEscape() {
      this.setDescriptor(new ProxyDescriptor("gAEqQYu9vUOxP6W-SUvkPg", "io.testproject.addon.PressEscape"));
    }
  }
}
