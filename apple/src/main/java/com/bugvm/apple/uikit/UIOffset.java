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
import java.io.*;
import java.nio.*;
import java.util.*;
import com.bugvm.objc.*;
import com.bugvm.objc.annotation.*;
import com.bugvm.objc.block.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
import com.bugvm.apple.foundation.*;
import com.bugvm.apple.coreanimation.*;
import com.bugvm.apple.coregraphics.*;
import com.bugvm.apple.coredata.*;
import com.bugvm.apple.coreimage.*;
import com.bugvm.apple.coretext.*;
import com.bugvm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("UIKit")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIOffset/*</name>*/ 
    extends /*<extends>*/Struct<UIOffset>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIOffsetPtr extends Ptr<UIOffset, UIOffsetPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(UIOffset.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIOffset() {}
    public UIOffset(@MachineSizedFloat double horizontal, @MachineSizedFloat double vertical) {
        this.setHorizontal(horizontal);
        this.setVertical(vertical);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @MachineSizedFloat double getHorizontal();
    @StructMember(0) public native UIOffset setHorizontal(@MachineSizedFloat double horizontal);
    @StructMember(1) public native @MachineSizedFloat double getVertical();
    @StructMember(1) public native UIOffset setVertical(@MachineSizedFloat double vertical);
    /*</members>*/
    
    public boolean equalsTo(UIOffset other) {
        return getHorizontal() == other.getHorizontal() && getVertical() == other.getVertical();
    }
    @Override
    public boolean equals(Object obj) {
        return obj instanceof UIOffset && equalsTo((UIOffset)obj);
    }
    @Override
    public String toString() {
        return toString(this);
    }
    /*<methods>*/
    @GlobalValue(symbol="UIOffsetZero", optional=true)
    public static native @ByVal UIOffset Zero();
    
    @Bridge(symbol="NSStringFromUIOffset", optional=true)
    protected static native String toString(@ByVal UIOffset offset);
    @Bridge(symbol="UIOffsetFromString", optional=true)
    public static native @ByVal UIOffset fromString(String string);
    /*</methods>*/
}