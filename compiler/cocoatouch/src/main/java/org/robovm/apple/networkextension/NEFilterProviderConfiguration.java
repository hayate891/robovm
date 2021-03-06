/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.networkextension;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("NetworkExtension") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NEFilterProviderConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NEFilterProviderConfigurationPtr extends Ptr<NEFilterProviderConfiguration, NEFilterProviderConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NEFilterProviderConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NEFilterProviderConfiguration() {}
    protected NEFilterProviderConfiguration(Handle h, long handle) { super(h, handle); }
    protected NEFilterProviderConfiguration(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "filterBrowsers")
    public native boolean isFilterBrowsers();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setFilterBrowsers:")
    public native void setFilterBrowsers(boolean v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "filterSockets")
    public native boolean isFilterSockets();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setFilterSockets:")
    public native void setFilterSockets(boolean v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "vendorConfiguration")
    public native NSDictionary<?, ?> getVendorConfiguration();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setVendorConfiguration:")
    public native void setVendorConfiguration(NSDictionary<?, ?> v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "serverAddress")
    public native String getServerAddress();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setServerAddress:")
    public native void setServerAddress(String v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "username")
    public native String getUsername();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setUsername:")
    public native void setUsername(String v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "organization")
    public native String getOrganization();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setOrganization:")
    public native void setOrganization(String v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "passwordReference")
    public native NSData getPasswordReference();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setPasswordReference:")
    public native void setPasswordReference(NSData v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "identityReference")
    public native NSData getIdentityReference();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setIdentityReference:")
    public native void setIdentityReference(NSData v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
