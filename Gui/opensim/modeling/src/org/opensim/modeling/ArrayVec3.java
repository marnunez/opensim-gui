/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ArrayVec3 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ArrayVec3(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArrayVec3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_ArrayVec3(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArrayVec3(Vec3 aDefaultValue, int aSize, int aCapacity) {
    this(opensimCommonJNI.new_ArrayVec3__SWIG_0(Vec3.getCPtr(aDefaultValue), aDefaultValue, aSize, aCapacity), true);
  }

  public ArrayVec3(Vec3 aDefaultValue, int aSize) {
    this(opensimCommonJNI.new_ArrayVec3__SWIG_1(Vec3.getCPtr(aDefaultValue), aDefaultValue, aSize), true);
  }

  public ArrayVec3(Vec3 aDefaultValue) {
    this(opensimCommonJNI.new_ArrayVec3__SWIG_2(Vec3.getCPtr(aDefaultValue), aDefaultValue), true);
  }

  public ArrayVec3() {
    this(opensimCommonJNI.new_ArrayVec3__SWIG_3(), true);
  }

  public ArrayVec3(ArrayVec3 aArray) {
    this(opensimCommonJNI.new_ArrayVec3__SWIG_4(ArrayVec3.getCPtr(aArray), aArray), true);
  }

  public boolean arrayEquals(ArrayVec3 aArray) {
    return opensimCommonJNI.ArrayVec3_arrayEquals(swigCPtr, this, ArrayVec3.getCPtr(aArray), aArray);
  }

  public void trim() {
    opensimCommonJNI.ArrayVec3_trim(swigCPtr, this);
  }

  public boolean setSize(int aSize) {
    return opensimCommonJNI.ArrayVec3_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimCommonJNI.ArrayVec3_getSize(swigCPtr, this);
  }

  public int size() {
    return opensimCommonJNI.ArrayVec3_size(swigCPtr, this);
  }

  public int append(Vec3 aValue) {
    return opensimCommonJNI.ArrayVec3_append__SWIG_0(swigCPtr, this, Vec3.getCPtr(aValue), aValue);
  }

  public int append(ArrayVec3 aArray) {
    return opensimCommonJNI.ArrayVec3_append__SWIG_1(swigCPtr, this, ArrayVec3.getCPtr(aArray), aArray);
  }

  public int insert(int aIndex, Vec3 aValue) {
    return opensimCommonJNI.ArrayVec3_insert(swigCPtr, this, aIndex, Vec3.getCPtr(aValue), aValue);
  }

  public int remove(int aIndex) {
    return opensimCommonJNI.ArrayVec3_remove(swigCPtr, this, aIndex);
  }

  public void set(int aIndex, Vec3 aValue) {
    opensimCommonJNI.ArrayVec3_set(swigCPtr, this, aIndex, Vec3.getCPtr(aValue), aValue);
  }

  public Vec3 get(int aIndex) {
    return new Vec3(opensimCommonJNI.ArrayVec3_get(swigCPtr, this, aIndex), false);
  }

  public Vec3 getitem(int index) {
    return new Vec3(opensimCommonJNI.ArrayVec3_getitem(swigCPtr, this, index), true);
  }

  public void setitem(int index, Vec3 val) {
    opensimCommonJNI.ArrayVec3_setitem(swigCPtr, this, index, Vec3.getCPtr(val), val);
  }

  public Vec3 getLast() {
    return new Vec3(opensimCommonJNI.ArrayVec3_getLast(swigCPtr, this), false);
  }

  public int findIndex(Vec3 aValue) {
    return opensimCommonJNI.ArrayVec3_findIndex(swigCPtr, this, Vec3.getCPtr(aValue), aValue);
  }

  public int rfindIndex(Vec3 aValue) {
    return opensimCommonJNI.ArrayVec3_rfindIndex(swigCPtr, this, Vec3.getCPtr(aValue), aValue);
  }

  public int searchBinary(Vec3 aValue, boolean aFindFirst, int aLo, int aHi) {
    return opensimCommonJNI.ArrayVec3_searchBinary__SWIG_0(swigCPtr, this, Vec3.getCPtr(aValue), aValue, aFindFirst, aLo, aHi);
  }

  public int searchBinary(Vec3 aValue, boolean aFindFirst, int aLo) {
    return opensimCommonJNI.ArrayVec3_searchBinary__SWIG_1(swigCPtr, this, Vec3.getCPtr(aValue), aValue, aFindFirst, aLo);
  }

  public int searchBinary(Vec3 aValue, boolean aFindFirst) {
    return opensimCommonJNI.ArrayVec3_searchBinary__SWIG_2(swigCPtr, this, Vec3.getCPtr(aValue), aValue, aFindFirst);
  }

  public int searchBinary(Vec3 aValue) {
    return opensimCommonJNI.ArrayVec3_searchBinary__SWIG_3(swigCPtr, this, Vec3.getCPtr(aValue), aValue);
  }

}
