/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class BodyScale extends OpenSimObject {
  private transient long swigCPtr;

  public BodyScale(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.BodyScale_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(BodyScale obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_BodyScale(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static BodyScale safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.BodyScale_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new BodyScale(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.BodyScale_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.BodyScale_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.BodyScale_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new BodyScale(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.BodyScale_getConcreteClassName(swigCPtr, this);
  }

  public BodyScale() {
    this(opensimSimulationJNI.new_BodyScale__SWIG_0(), true);
  }

  public BodyScale(BodyScale aBodyScale) {
    this(opensimSimulationJNI.new_BodyScale__SWIG_1(BodyScale.getCPtr(aBodyScale), aBodyScale), true);
  }

  public void copyData(BodyScale aBodyScale) {
    opensimSimulationJNI.BodyScale_copyData(swigCPtr, this, BodyScale.getCPtr(aBodyScale), aBodyScale);
  }

  public ArrayStr getAxisNames() {
    return new ArrayStr(opensimSimulationJNI.BodyScale_getAxisNames(swigCPtr, this), false);
  }

  public void setAxisNames(ArrayStr aAxisNames) {
    opensimSimulationJNI.BodyScale_setAxisNames(swigCPtr, this, ArrayStr.getCPtr(aAxisNames), aAxisNames);
  }

}
