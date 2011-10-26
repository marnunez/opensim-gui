/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ObjectGroup extends OpenSimObject {
  private long swigCPtr;

  public ObjectGroup(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.ObjectGroup_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ObjectGroup obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_ObjectGroup(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ObjectGroup() {
    this(opensimModelJNI.new_ObjectGroup__SWIG_0(), true);
  }

  public ObjectGroup(String aName) {
    this(opensimModelJNI.new_ObjectGroup__SWIG_1(aName), true);
  }

  public ObjectGroup(ObjectGroup aGroup) {
    this(opensimModelJNI.new_ObjectGroup__SWIG_2(ObjectGroup.getCPtr(aGroup), aGroup), true);
  }

  public OpenSimObject copy() {
    long cPtr = opensimModelJNI.ObjectGroup_copy__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new OpenSimObject(cPtr, false);
  }

  public void copyData(ObjectGroup aGroup) {
    opensimModelJNI.ObjectGroup_copyData(swigCPtr, this, ObjectGroup.getCPtr(aGroup), aGroup);
  }

  public boolean contains(String aName) {
    return opensimModelJNI.ObjectGroup_contains(swigCPtr, this, aName);
  }

  public void add(OpenSimObject aObject) {
    opensimModelJNI.ObjectGroup_add(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public void remove(OpenSimObject aObject) {
    opensimModelJNI.ObjectGroup_remove(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public void replace(OpenSimObject aOldObject, OpenSimObject aNewObject) {
    opensimModelJNI.ObjectGroup_replace(swigCPtr, this, OpenSimObject.getCPtr(aOldObject), aOldObject, OpenSimObject.getCPtr(aNewObject), aNewObject);
  }

  public void setup(ArrayPtrsObj aObjects) {
    opensimModelJNI.ObjectGroup_setup(swigCPtr, this, ArrayPtrsObj.getCPtr(aObjects), aObjects);
  }

  public ArrayObjPtr getMembers() {
    return new ArrayObjPtr(opensimModelJNI.ObjectGroup_getMembers(swigCPtr, this), false);
  }

  public static boolean isKindOf(String type) {
    return opensimModelJNI.ObjectGroup_isKindOf(type);
  }

  public boolean isA(String type) {
    return opensimModelJNI.ObjectGroup_isA(swigCPtr, this, type);
  }

  public static ObjectGroup safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.ObjectGroup_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

  public void copy(OpenSimObject aObject) {
    opensimModelJNI.ObjectGroup_copy__SWIG_1(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

}