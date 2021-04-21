package io.testproject.addon;

import io.testproject.sdk.internal.addons.ActionProxy;
import io.testproject.sdk.internal.addons.ProxyDescriptor;
import java.lang.String;

/**
 * Proxy for Mobile Extensions Addon */
public class MobileExtensions {
  /**
   * Factory method for CheckIfScreenIsLocked */
  public static CheckIfScreenIsLocked getCheckIfScreenIsLocked() {
    return new CheckIfScreenIsLocked();
  }

  /**
   * Factory method for ClickKeyBoardSearch */
  public static ClickKeyBoardSearch getClickKeyBoardSearch() {
    return new ClickKeyBoardSearch();
  }

  /**
   * Factory method for DoubleTapOnElementAndroid */
  public static DoubleTapOnElementAndroid getDoubleTapOnElementAndroid() {
    return new DoubleTapOnElementAndroid();
  }

  /**
   * Factory method for DragAndDropElementByOffsetAndroid */
  public static DragAndDropElementByOffsetAndroid getDragAndDropElementByOffsetAndroid() {
    return new DragAndDropElementByOffsetAndroid();
  }

  /**
   * Factory method for DragAndDropElementByOffsetAndroid
   * @param xOffset Horizontal move offset
   * @param yOffset Vertical move offset */
  public static DragAndDropElementByOffsetAndroid dragAndDropElementByOffsetAndroid(int xOffset,
      int yOffset) {
    return new DragAndDropElementByOffsetAndroid(xOffset,yOffset);
  }

  /**
   * Factory method for GetAttributeValue */
  public static GetAttributeValue getGetAttributeValue() {
    return new GetAttributeValue();
  }

  /**
   * Factory method for GetAttributeValue
   * @param attribute The attribute name */
  public static GetAttributeValue getAttributeValue(String attribute) {
    return new GetAttributeValue(attribute);
  }

  /**
   * Factory method for GetElementSizeAndroid */
  public static GetElementSizeAndroid getGetElementSizeAndroid() {
    return new GetElementSizeAndroid();
  }

  /**
   * Factory method for PinchElementAndroid */
  public static PinchElementAndroid getPinchElementAndroid() {
    return new PinchElementAndroid();
  }

  /**
   * Factory method for PinchElementAndroid
   * @param scale Amount of pinches to perform (>0) */
  public static PinchElementAndroid pinchElementAndroid(String scale) {
    return new PinchElementAndroid(scale);
  }

  /**
   * Factory method for SendKeysWithADB */
  public static SendKeysWithADB getSendKeysWithADB() {
    return new SendKeysWithADB();
  }

  /**
   * Factory method for SendKeysWithADB
   * @param keys The text to be typed into the mobile */
  public static SendKeysWithADB sendKeysWithADB(String keys) {
    return new SendKeysWithADB(keys);
  }

  /**
   * Factory method for ZoomToElementAndroid */
  public static ZoomToElementAndroid getZoomToElementAndroid() {
    return new ZoomToElementAndroid();
  }

  /**
   * Factory method for ZoomToElementAndroid
   * @param scale Amount of zooms to perform (>0) */
  public static ZoomToElementAndroid zoomToElementAndroid(String scale) {
    return new ZoomToElementAndroid(scale);
  }

  /**
   * Factory method for FlickGestureAndroid */
  public static FlickGestureAndroid getFlickGestureAndroid() {
    return new FlickGestureAndroid();
  }

  /**
   * Factory method for FlickGestureAndroid
   * @param direction Direction (UP, DOWN, RIGHT or LEFT */
  public static FlickGestureAndroid flickGestureAndroid(String direction) {
    return new FlickGestureAndroid(direction);
  }

  /**
   * Factory method for GetCurrentActivity */
  public static GetCurrentActivity getGetCurrentActivity() {
    return new GetCurrentActivity();
  }

  /**
   * Factory method for GetDeviceOrientationAndroid */
  public static GetDeviceOrientationAndroid getGetDeviceOrientationAndroid() {
    return new GetDeviceOrientationAndroid();
  }

  /**
   * Factory method for GetNetworkConnectionCellularData */
  public static GetNetworkConnectionCellularData getGetNetworkConnectionCellularData() {
    return new GetNetworkConnectionCellularData();
  }

  /**
   * Factory method for GetNetworkConnectionFlightMode */
  public static GetNetworkConnectionFlightMode getGetNetworkConnectionFlightMode() {
    return new GetNetworkConnectionFlightMode();
  }

  /**
   * Factory method for GetNetworkConnectionWiFiState */
  public static GetNetworkConnectionWiFiState getGetNetworkConnectionWiFiState() {
    return new GetNetworkConnectionWiFiState();
  }

  /**
   * Factory method for GetPackageName */
  public static GetPackageName getGetPackageName() {
    return new GetPackageName();
  }

  /**
   * Factory method for HideKeyboardAndroid */
  public static HideKeyboardAndroid getHideKeyboardAndroid() {
    return new HideKeyboardAndroid();
  }

  /**
   * Factory method for InstallApp */
  public static InstallApp getInstallApp() {
    return new InstallApp();
  }

  /**
   * Factory method for InstallApp
   * @param path Path to the locally stored APK file */
  public static InstallApp installApp(String path) {
    return new InstallApp(path);
  }

  /**
   * Factory method for IsAppInstalled */
  public static IsAppInstalled getIsAppInstalled() {
    return new IsAppInstalled();
  }

  /**
   * Factory method for IsAppInstalled
   * @param packageName The package name of the application */
  public static IsAppInstalled isAppInstalled(String packageName) {
    return new IsAppInstalled(packageName);
  }

  /**
   * Factory method for OpenNotifications */
  public static OpenNotifications getOpenNotifications() {
    return new OpenNotifications();
  }

  /**
   * Factory method for PanGesturesAndroid */
  public static PanGesturesAndroid getPanGesturesAndroid() {
    return new PanGesturesAndroid();
  }

  /**
   * Factory method for PanGesturesAndroid
   * @param coordinates Coordinates in order to perform Pan Gestures for example: '5,1;-4,0;3,3...' */
  public static PanGesturesAndroid panGesturesAndroid(String coordinates) {
    return new PanGesturesAndroid(coordinates);
  }

  /**
   * Factory method for PullFile */
  public static PullFile getPullFile() {
    return new PullFile();
  }

  /**
   * Factory method for PullFile
   * @param remote Path to the file on the mobile device
   * @param local Path to store the file locally on your machine */
  public static PullFile pullFile(String remote, String local) {
    return new PullFile(remote,local);
  }

  /**
   * Factory method for PushFile */
  public static PushFile getPushFile() {
    return new PushFile();
  }

  /**
   * Factory method for PushFile
   * @param remotePath Path to file to write data to on remote device
   * @param localPath A path to the file that will be saved on the device */
  public static PushFile pushFile(String remotePath, String localPath) {
    return new PushFile(remotePath,localPath);
  }

  /**
   * Factory method for RemoveApp */
  public static RemoveApp getRemoveApp() {
    return new RemoveApp();
  }

  /**
   * Factory method for RemoveApp
   * @param packageName The package name that you want to uninstall */
  public static RemoveApp removeApp(String packageName) {
    return new RemoveApp(packageName);
  }

  /**
   * Factory method for SetAnimations */
  public static SetAnimations getSetAnimations() {
    return new SetAnimations();
  }

  /**
   * Factory method for SetAnimations
   * @param animator_duration_scale Adjust the Animator Duration Scale (0, 0.5, 1, 1.5, 2, 5 or 10)
   * @param transition_animation_scale Adjust the Transition Animation Scale (0, 0.5, 1, 1.5, 2, 5 or 10)
   * @param window_animation_scale Adjust the Window Animation Scale (0, 0.5, 1, 1.5, 2, 5 or 10) */
  public static SetAnimations setAnimations(float animator_duration_scale,
      float transition_animation_scale, float window_animation_scale) {
    return new SetAnimations(animator_duration_scale,transition_animation_scale,window_animation_scale);
  }

  /**
   * Factory method for SetNetworkConnectionCellularData */
  public static SetNetworkConnectionCellularData getSetNetworkConnectionCellularData() {
    return new SetNetworkConnectionCellularData();
  }

  /**
   * Factory method for SetNetworkConnectionCellularData
   * @param expectedState Expected state (ON/OFF) */
  public static SetNetworkConnectionCellularData setNetworkConnectionCellularData(String expectedState) {
    return new SetNetworkConnectionCellularData(expectedState);
  }

  /**
   * Factory method for SetNetworkConnectionFlightMode */
  public static SetNetworkConnectionFlightMode getSetNetworkConnectionFlightMode() {
    return new SetNetworkConnectionFlightMode();
  }

  /**
   * Factory method for SetNetworkConnectionFlightMode
   * @param expectedState Expected state (ON/OFF) */
  public static SetNetworkConnectionFlightMode setNetworkConnectionFlightMode(String expectedState) {
    return new SetNetworkConnectionFlightMode(expectedState);
  }

  /**
   * Factory method for SetNetworkConnectionSettings */
  public static SetNetworkConnectionSettings getSetNetworkConnectionSettings() {
    return new SetNetworkConnectionSettings();
  }

  /**
   * Factory method for SetNetworkConnectionSettings
   * @param connectionSetting Set connection to one of the following: AIRPLANE, WIFI, DATA */
  public static SetNetworkConnectionSettings setNetworkConnectionSettings(String connectionSetting) {
    return new SetNetworkConnectionSettings(connectionSetting);
  }

  /**
   * Factory method for SetNetworkConnectionWiFiState */
  public static SetNetworkConnectionWiFiState getSetNetworkConnectionWiFiState() {
    return new SetNetworkConnectionWiFiState();
  }

  /**
   * Factory method for SetNetworkConnectionWiFiState
   * @param expectedState Expected state (ON/OFF) */
  public static SetNetworkConnectionWiFiState setNetworkConnectionWiFiState(String expectedState) {
    return new SetNetworkConnectionWiFiState(expectedState);
  }

  /**
   * Factory method for SimulateFingerPrint */
  public static SimulateFingerPrint getSimulateFingerPrint() {
    return new SimulateFingerPrint();
  }

  /**
   * Factory method for SimulateFingerPrint
   * @param indexOfFinger Index of the finger to use (Default: 1) */
  public static SimulateFingerPrint simulateFingerPrint(String indexOfFinger) {
    return new SimulateFingerPrint(indexOfFinger);
  }

  /**
   * Factory method for ToggleLocationServices */
  public static ToggleLocationServices getToggleLocationServices() {
    return new ToggleLocationServices();
  }

  /**
   * Factory method for DoubleTapOnElementIOS */
  public static DoubleTapOnElementIOS getDoubleTapOnElementIOS() {
    return new DoubleTapOnElementIOS();
  }

  /**
   * Factory method for DragAndDropElementByOffsetIOS */
  public static DragAndDropElementByOffsetIOS getDragAndDropElementByOffsetIOS() {
    return new DragAndDropElementByOffsetIOS();
  }

  /**
   * Factory method for DragAndDropElementByOffsetIOS
   * @param xOffset Horizontal move offset
   * @param yOffset Vertical move offset */
  public static DragAndDropElementByOffsetIOS dragAndDropElementByOffsetIOS(int xOffset,
      int yOffset) {
    return new DragAndDropElementByOffsetIOS(xOffset,yOffset);
  }

  /**
   * Factory method for GetElementSizeIOS */
  public static GetElementSizeIOS getGetElementSizeIOS() {
    return new GetElementSizeIOS();
  }

  /**
   * Factory method for PinchElementIOS */
  public static PinchElementIOS getPinchElementIOS() {
    return new PinchElementIOS();
  }

  /**
   * Factory method for PinchElementIOS
   * @param scale Amount of pinches to perform (>0) */
  public static PinchElementIOS pinchElementIOS(String scale) {
    return new PinchElementIOS(scale);
  }

  /**
   * Factory method for ZoomToElementIOS */
  public static ZoomToElementIOS getZoomToElementIOS() {
    return new ZoomToElementIOS();
  }

  /**
   * Factory method for ZoomToElementIOS
   * @param scale Scale (between 0-1: 'pinch', greater than 1: 'zoom')
   * @param velocity Velocity (for pinch: less than zero, for zoom: greater than 0) */
  public static ZoomToElementIOS zoomToElementIOS(String scale, String velocity) {
    return new ZoomToElementIOS(scale,velocity);
  }

  /**
   * Factory method for FlickGestureIOS */
  public static FlickGestureIOS getFlickGestureIOS() {
    return new FlickGestureIOS();
  }

  /**
   * Factory method for FlickGestureIOS
   * @param direction Direction (UP, DOWN, RIGHT or LEFT */
  public static FlickGestureIOS flickGestureIOS(String direction) {
    return new FlickGestureIOS(direction);
  }

  /**
   * Factory method for GetDeviceOrientationIOS */
  public static GetDeviceOrientationIOS getGetDeviceOrientationIOS() {
    return new GetDeviceOrientationIOS();
  }

  /**
   * Factory method for HideKeyboardIOS */
  public static HideKeyboardIOS getHideKeyboardIOS() {
    return new HideKeyboardIOS();
  }

  /**
   * Factory method for PanGesturesIOS */
  public static PanGesturesIOS getPanGesturesIOS() {
    return new PanGesturesIOS();
  }

  /**
   * Factory method for PanGesturesIOS
   * @param coordinates Coordinates in order to perform Pan Gestures for example: '5,1;-4,0;3,3...' */
  public static PanGesturesIOS panGesturesIOS(String coordinates) {
    return new PanGesturesIOS(coordinates);
  }

  /**
   * Factory method for Shake */
  public static Shake getShake() {
    return new Shake();
  }

  /**
   * Factory method for SimulateTouchID */
  public static SimulateTouchID getSimulateTouchID() {
    return new SimulateTouchID();
  }

  /**
   * Factory method for SimulateTouchID
   * @param failedOrPassedTouch True if the touch should pass, false if it should fail (Default: true) */
  public static SimulateTouchID simulateTouchID(String failedOrPassedTouch) {
    return new SimulateTouchID(failedOrPassedTouch);
  }

  /**
   * Factory method for TypeTextKeyboardIOS */
  public static TypeTextKeyboardIOS getTypeTextKeyboardIOS() {
    return new TypeTextKeyboardIOS();
  }

  /**
   * Factory method for TypeTextKeyboardIOS
   * @param input Text to type (Using labels, Example: ABC) */
  public static TypeTextKeyboardIOS typeTextKeyboardIOS(String input) {
    return new TypeTextKeyboardIOS(input);
  }

  /**
   * Is screen locked?.  */
  public static class CheckIfScreenIsLocked extends ActionProxy {
    /**
     *  (OUTPUT) */
    public boolean isLocked;

    public CheckIfScreenIsLocked() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.android.CheckIfScreenIsLocked"));
    }
  }

  /**
   * Click Android Keyboard Search.  */
  public static class ClickKeyBoardSearch extends ActionProxy {
    public ClickKeyBoardSearch() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.android.ClickKeyBoardSearch"));
    }
  }

  /**
   * Double tap gesture. null */
  public static class DoubleTapOnElementAndroid extends ActionProxy {
    public DoubleTapOnElementAndroid() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.android.element.DoubleTapOnElementAndroid"));
    }
  }

  /**
   * Drag and drop by offset.  */
  public static class DragAndDropElementByOffsetAndroid extends ActionProxy {
    /**
     * Horizontal move offset (INPUT) */
    public int xOffset;

    /**
     * Vertical move offset (INPUT) */
    public int yOffset;

    public DragAndDropElementByOffsetAndroid() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.android.element.DragAndDropElementByOffsetAndroid"));
    }

    public DragAndDropElementByOffsetAndroid(int xOffset, int yOffset) {
      this();
      this.xOffset = xOffset;
      this.yOffset = yOffset;
    }
  }

  /**
   * Get Attribute Value.  */
  public static class GetAttributeValue extends ActionProxy {
    /**
     * The attribute name (INPUT) */
    public String attribute;

    /**
     * The attribute value (OUTPUT) */
    public String value;

    public GetAttributeValue() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.android.element.GetAttributeValue"));
    }

    public GetAttributeValue(String attribute) {
      this();
      this.attribute = attribute;
    }
  }

  /**
   * Get Element Size.  */
  public static class GetElementSizeAndroid extends ActionProxy {
    /**
     * Element size in pixels (OUTPUT) */
    public String size;

    /**
     * Element height in pixels (OUTPUT) */
    public int height;

    /**
     * Element width in pixels (OUTPUT) */
    public int width;

    public GetElementSizeAndroid() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.android.element.GetElementSizeAndroid"));
    }
  }

  /**
   * Pinch gesture. null */
  public static class PinchElementAndroid extends ActionProxy {
    /**
     * Amount of pinches to perform (>0) (INPUT) */
    public String scale;

    public PinchElementAndroid() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.android.element.PinchElementAndroid"));
    }

    public PinchElementAndroid(String scale) {
      this();
      this.scale = scale;
    }
  }

  /**
   * Type text (using ADB).  */
  public static class SendKeysWithADB extends ActionProxy {
    /**
     * The text to be typed into the mobile (INPUT) */
    public String keys;

    public SendKeysWithADB() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.android.element.SendKeysWithADB"));
    }

    public SendKeysWithADB(String keys) {
      this();
      this.keys = keys;
    }
  }

  /**
   * Zoom gesture. null */
  public static class ZoomToElementAndroid extends ActionProxy {
    /**
     * Amount of zooms to perform (>0) (INPUT) */
    public String scale;

    public ZoomToElementAndroid() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.android.element.ZoomToElementAndroid"));
    }

    public ZoomToElementAndroid(String scale) {
      this();
      this.scale = scale;
    }
  }

  /**
   * Flick gesture.  */
  public static class FlickGestureAndroid extends ActionProxy {
    /**
     * Direction (UP, DOWN, RIGHT or LEFT (INPUT) */
    public String direction;

    public FlickGestureAndroid() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.android.FlickGestureAndroid"));
    }

    public FlickGestureAndroid(String direction) {
      this();
      this.direction = direction;
    }
  }

  /**
   * Get current activity.  */
  public static class GetCurrentActivity extends ActionProxy {
    /**
     * Current activity (OUTPUT) */
    public String currentActivity;

    public GetCurrentActivity() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.android.GetCurrentActivity"));
    }
  }

  /**
   * Get orientation.  */
  public static class GetDeviceOrientationAndroid extends ActionProxy {
    /**
     *  (OUTPUT) */
    public String orientation;

    public GetDeviceOrientationAndroid() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.android.GetDeviceOrientationAndroid"));
    }
  }

  /**
   * Is Cellular Data enabled?.  */
  public static class GetNetworkConnectionCellularData extends ActionProxy {
    /**
     * Cellular Data status (OUTPUT) */
    public boolean cellularDataEnabled;

    public GetNetworkConnectionCellularData() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.android.GetNetworkConnectionCellularData"));
    }
  }

  /**
   * Is Airplane Mode enabled?.  */
  public static class GetNetworkConnectionFlightMode extends ActionProxy {
    /**
     * Airplane Mode status (OUTPUT) */
    public boolean airplaneModeEnabled;

    public GetNetworkConnectionFlightMode() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.android.GetNetworkConnectionFlightMode"));
    }
  }

  /**
   * Is WiFi enabled?.  */
  public static class GetNetworkConnectionWiFiState extends ActionProxy {
    /**
     *  (OUTPUT) */
    public boolean wifiEnabled;

    public GetNetworkConnectionWiFiState() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.android.GetNetworkConnectionWiFiState"));
    }
  }

  /**
   * Get package name. Returns the current package name */
  public static class GetPackageName extends ActionProxy {
    /**
     * Package name (OUTPUT) */
    public String packageName;

    public GetPackageName() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.android.GetPackageName"));
    }
  }

  /**
   * Hide keyboard.  */
  public static class HideKeyboardAndroid extends ActionProxy {
    public HideKeyboardAndroid() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.android.HideKeyboardAndroid"));
    }
  }

  /**
   * Install application. Install provided APK onto the device */
  public static class InstallApp extends ActionProxy {
    /**
     * Path to the locally stored APK file (INPUT) */
    public String path;

    public InstallApp() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.android.InstallApp"));
    }

    public InstallApp(String path) {
      this();
      this.path = path;
    }
  }

  /**
   * Is application installed?. Checks if the given application is installed on the device */
  public static class IsAppInstalled extends ActionProxy {
    /**
     * The package name of the application (INPUT) */
    public String packageName;

    public IsAppInstalled() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.android.IsAppInstalled"));
    }

    public IsAppInstalled(String packageName) {
      this();
      this.packageName = packageName;
    }
  }

  /**
   * Open notifications.  */
  public static class OpenNotifications extends ActionProxy {
    public OpenNotifications() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.android.OpenNotifications"));
    }
  }

  /**
   * Handling Pan Gestures.  */
  public static class PanGesturesAndroid extends ActionProxy {
    /**
     * Coordinates in order to perform Pan Gestures for example: '5,1;-4,0;3,3...' (INPUT) */
    public String coordinates;

    public PanGesturesAndroid() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.android.PanGesturesAndroid"));
    }

    public PanGesturesAndroid(String coordinates) {
      this();
      this.coordinates = coordinates;
    }
  }

  /**
   * Pull file. Pull a file from an Android device to the local machine */
  public static class PullFile extends ActionProxy {
    /**
     * Path to the file on the mobile device (INPUT) */
    public String remote;

    /**
     * Path to store the file locally on your machine (INPUT) */
    public String local;

    /**
     * Path to locally stored file in your machine (OUTPUT) */
    public String result;

    public PullFile() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.android.PullFile"));
    }

    public PullFile(String remote, String local) {
      this();
      this.remote = remote;
      this.local = local;
    }
  }

  /**
   * Push file to device.  */
  public static class PushFile extends ActionProxy {
    /**
     * Path to file to write data to on remote device (INPUT) */
    public String remotePath;

    /**
     * A path to the file that will be saved on the device (INPUT) */
    public String localPath;

    public PushFile() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.android.PushFile"));
    }

    public PushFile(String remotePath, String localPath) {
      this();
      this.remotePath = remotePath;
      this.localPath = localPath;
    }
  }

  /**
   * Uninstall application. Uninstall the given package from the Android device */
  public static class RemoveApp extends ActionProxy {
    /**
     * The package name that you want to uninstall (INPUT) */
    public String packageName;

    public RemoveApp() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.android.RemoveApp"));
    }

    public RemoveApp(String packageName) {
      this();
      this.packageName = packageName;
    }
  }

  /**
   * Set animations.  */
  public static class SetAnimations extends ActionProxy {
    /**
     * Adjust the Animator Duration Scale (0, 0.5, 1, 1.5, 2, 5 or 10) (INPUT) */
    public float animator_duration_scale;

    /**
     * Adjust the Transition Animation Scale (0, 0.5, 1, 1.5, 2, 5 or 10) (INPUT) */
    public float transition_animation_scale;

    /**
     * Adjust the Window Animation Scale (0, 0.5, 1, 1.5, 2, 5 or 10) (INPUT) */
    public float window_animation_scale;

    public SetAnimations() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.android.SetAnimations"));
    }

    public SetAnimations(float animator_duration_scale, float transition_animation_scale,
        float window_animation_scale) {
      this();
      this.animator_duration_scale = animator_duration_scale;
      this.transition_animation_scale = transition_animation_scale;
      this.window_animation_scale = window_animation_scale;
    }
  }

  /**
   * Set the Cellular Data state.  */
  public static class SetNetworkConnectionCellularData extends ActionProxy {
    /**
     * Expected state (ON/OFF) (INPUT) */
    public String expectedState;

    public SetNetworkConnectionCellularData() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.android.SetNetworkConnectionCellularData"));
    }

    public SetNetworkConnectionCellularData(String expectedState) {
      this();
      this.expectedState = expectedState;
    }
  }

  /**
   * Set the Airplane Mode state.  */
  public static class SetNetworkConnectionFlightMode extends ActionProxy {
    /**
     * Expected state (ON/OFF) (INPUT) */
    public String expectedState;

    public SetNetworkConnectionFlightMode() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.android.SetNetworkConnectionFlightMode"));
    }

    public SetNetworkConnectionFlightMode(String expectedState) {
      this();
      this.expectedState = expectedState;
    }
  }

  /**
   * Set network state.  */
  public static class SetNetworkConnectionSettings extends ActionProxy {
    /**
     * Set connection to one of the following: AIRPLANE, WIFI, DATA (INPUT) */
    public String connectionSetting;

    public SetNetworkConnectionSettings() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.android.SetNetworkConnectionSettings"));
    }

    public SetNetworkConnectionSettings(String connectionSetting) {
      this();
      this.connectionSetting = connectionSetting;
    }
  }

  /**
   * Set the WiFi state.  */
  public static class SetNetworkConnectionWiFiState extends ActionProxy {
    /**
     * Expected state (ON/OFF) (INPUT) */
    public String expectedState;

    public SetNetworkConnectionWiFiState() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.android.SetNetworkConnectionWiFiState"));
    }

    public SetNetworkConnectionWiFiState(String expectedState) {
      this();
      this.expectedState = expectedState;
    }
  }

  /**
   * Simulate Fingerprint (Emulators Only).  */
  public static class SimulateFingerPrint extends ActionProxy {
    /**
     * Index of the finger to use (Default: 1) (INPUT) */
    public String indexOfFinger;

    public SimulateFingerPrint() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.android.SimulateFingerPrint"));
    }

    public SimulateFingerPrint(String indexOfFinger) {
      this();
      this.indexOfFinger = indexOfFinger;
    }
  }

  /**
   * Toggle location services.  */
  public static class ToggleLocationServices extends ActionProxy {
    public ToggleLocationServices() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.android.ToggleLocationServices"));
    }
  }

  /**
   * Double tap gesture. null */
  public static class DoubleTapOnElementIOS extends ActionProxy {
    public DoubleTapOnElementIOS() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.ios.element.DoubleTapOnElementIOS"));
    }
  }

  /**
   * Drag and drop by offset.  */
  public static class DragAndDropElementByOffsetIOS extends ActionProxy {
    /**
     * Horizontal move offset (INPUT) */
    public int xOffset;

    /**
     * Vertical move offset (INPUT) */
    public int yOffset;

    public DragAndDropElementByOffsetIOS() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.ios.element.DragAndDropElementByOffsetIOS"));
    }

    public DragAndDropElementByOffsetIOS(int xOffset, int yOffset) {
      this();
      this.xOffset = xOffset;
      this.yOffset = yOffset;
    }
  }

  /**
   * Get Element Size.  */
  public static class GetElementSizeIOS extends ActionProxy {
    /**
     * Element size in pixels (OUTPUT) */
    public String size;

    /**
     * Element height in pixels (OUTPUT) */
    public int height;

    /**
     * Element width in pixels (OUTPUT) */
    public int width;

    public GetElementSizeIOS() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.ios.element.GetElementSizeIOS"));
    }
  }

  /**
   * Pinch gesture. null */
  public static class PinchElementIOS extends ActionProxy {
    /**
     * Amount of pinches to perform (>0) (INPUT) */
    public String scale;

    public PinchElementIOS() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.ios.element.PinchElementIOS"));
    }

    public PinchElementIOS(String scale) {
      this();
      this.scale = scale;
    }
  }

  /**
   * Zoom gesture. null */
  public static class ZoomToElementIOS extends ActionProxy {
    /**
     * Scale (between 0-1: 'pinch', greater than 1: 'zoom') (INPUT) */
    public String scale;

    /**
     * Velocity (for pinch: less than zero, for zoom: greater than 0) (INPUT) */
    public String velocity;

    public ZoomToElementIOS() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.ios.element.ZoomToElementIOS"));
    }

    public ZoomToElementIOS(String scale, String velocity) {
      this();
      this.scale = scale;
      this.velocity = velocity;
    }
  }

  /**
   * Flick gesture.  */
  public static class FlickGestureIOS extends ActionProxy {
    /**
     * Direction (UP, DOWN, RIGHT or LEFT (INPUT) */
    public String direction;

    public FlickGestureIOS() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.ios.FlickGestureIOS"));
    }

    public FlickGestureIOS(String direction) {
      this();
      this.direction = direction;
    }
  }

  /**
   * Get orientation.  */
  public static class GetDeviceOrientationIOS extends ActionProxy {
    /**
     *  (OUTPUT) */
    public String orientation;

    public GetDeviceOrientationIOS() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.ios.GetDeviceOrientationIOS"));
    }
  }

  /**
   * Hide keyboard.  */
  public static class HideKeyboardIOS extends ActionProxy {
    public HideKeyboardIOS() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.ios.HideKeyboardIOS"));
    }
  }

  /**
   * Handling Pan Gestures.  */
  public static class PanGesturesIOS extends ActionProxy {
    /**
     * Coordinates in order to perform Pan Gestures for example: '5,1;-4,0;3,3...' (INPUT) */
    public String coordinates;

    public PanGesturesIOS() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.ios.PanGesturesIOS"));
    }

    public PanGesturesIOS(String coordinates) {
      this();
      this.coordinates = coordinates;
    }
  }

  /**
   * Shake gesture.  */
  public static class Shake extends ActionProxy {
    public Shake() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.ios.Shake"));
    }
  }

  /**
   * Simulate TouchID (Simulators Only).  */
  public static class SimulateTouchID extends ActionProxy {
    /**
     * True if the touch should pass, false if it should fail (Default: true) (INPUT) */
    public String failedOrPassedTouch;

    public SimulateTouchID() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.ios.SimulateTouchID"));
    }

    public SimulateTouchID(String failedOrPassedTouch) {
      this();
      this.failedOrPassedTouch = failedOrPassedTouch;
    }
  }

  /**
   * Type Text (Using iOS Keyboard). Use iOS keyboard to type text */
  public static class TypeTextKeyboardIOS extends ActionProxy {
    /**
     * Text to type (Using labels, Example: ABC) (INPUT) */
    public String input;

    public TypeTextKeyboardIOS() {
      this.setDescriptor(new ProxyDescriptor("Pc5arX-ClUCFkcuhm-r25A", "io.testproject.addons.mobile.ios.TypeTextKeyboardIOS"));
    }

    public TypeTextKeyboardIOS(String input) {
      this();
      this.input = input;
    }
  }
}
