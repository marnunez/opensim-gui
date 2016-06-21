/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class WrapSphere extends WrapObject {
  private transient long swigCPtr;

  public WrapSphere(long cPtr, boolean cMemoryOwn) {
    super(opensimModelSimulationJNI.WrapSphere_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(WrapSphere obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_WrapSphere(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static WrapSphere safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelSimulationJNI.WrapSphere_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new WrapSphere(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelSimulationJNI.WrapSphere_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelSimulationJNI.WrapSphere_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelSimulationJNI.WrapSphere_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new WrapSphere(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelSimulationJNI.WrapSphere_getConcreteClassName(swigCPtr, this);
  }

  public void copyData(WrapSphere aWrapSphere) {
    opensimModelSimulationJNI.WrapSphere_copyData(swigCPtr, this, WrapSphere.getCPtr(aWrapSphere), aWrapSphere);
  }

  public String getWrapTypeName() {
    return opensimModelSimulationJNI.WrapSphere_getWrapTypeName(swigCPtr, this);
  }

  public String getDimensionsString() {
    return opensimModelSimulationJNI.WrapSphere_getDimensionsString(swigCPtr, this);
  }

  public double getRadius() {
    return opensimModelSimulationJNI.WrapSphere_getRadius(swigCPtr, this);
  }

  public void scale(Vec3 aScaleFactors) {
    opensimModelSimulationJNI.WrapSphere_scale(swigCPtr, this, Vec3.getCPtr(aScaleFactors), aScaleFactors);
  }

  public void connectToModelAndBody(Model aModel, PhysicalFrame aBody) {
    opensimModelSimulationJNI.WrapSphere_connectToModelAndBody(swigCPtr, this, Model.getCPtr(aModel), aModel, PhysicalFrame.getCPtr(aBody), aBody);
  }

  public void generateDecorations(boolean fixed, ModelDisplayHints hints, State state, ArrayDecorativeGeometry appendToThis) {
    opensimModelSimulationJNI.WrapSphere_generateDecorations(swigCPtr, this, fixed, ModelDisplayHints.getCPtr(hints), hints, State.getCPtr(state), state, ArrayDecorativeGeometry.getCPtr(appendToThis), appendToThis);
  }

}
