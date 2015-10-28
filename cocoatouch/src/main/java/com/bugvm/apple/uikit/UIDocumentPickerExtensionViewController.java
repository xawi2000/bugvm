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
package com.bugvm.apple.uikit;

/*<imports>*/
import java.util.*;

import com.bugvm.apple.foundation.NSArray;
import com.bugvm.apple.foundation.NSURL;
import com.bugvm.objc.ObjCRuntime;
import com.bugvm.objc.annotation.Method;
import com.bugvm.objc.annotation.NativeClass;
import com.bugvm.objc.annotation.Property;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIDocumentPickerExtensionViewController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIDocumentPickerExtensionViewControllerPtr extends Ptr<UIDocumentPickerExtensionViewController, UIDocumentPickerExtensionViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIDocumentPickerExtensionViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIDocumentPickerExtensionViewController() {}
    protected UIDocumentPickerExtensionViewController(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "documentPickerMode")
    public native UIDocumentPickerMode getDocumentPickerMode();
    @Property(selector = "originalURL")
    public native NSURL getOriginalURL();
    @Property(selector = "validTypes")
    public native @com.bugvm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getValidTypes();
    @Property(selector = "providerIdentifier")
    public native String getProviderIdentifier();
    @Property(selector = "documentStorageURL")
    public native NSURL getDocumentStorageURL();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "dismissGrantingAccessToURL:")
    public native void dismissGrantingAccessToURL(NSURL url);
    @Method(selector = "prepareForPresentationInMode:")
    public native void prepareForPresentation(UIDocumentPickerMode mode);
    /*</methods>*/
}