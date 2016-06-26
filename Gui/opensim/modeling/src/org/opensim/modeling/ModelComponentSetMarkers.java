/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ModelComponentSetMarkers extends SetMarkers {
  private long swigCPtr;

  public ModelComponentSetMarkers(long cPtr, boolean cMemoryOwn) {
    super(opensimModelSimulationJNI.ModelComponentSetMarkers_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ModelComponentSetMarkers obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_ModelComponentSetMarkers(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ModelComponentSetMarkers safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelSimulationJNI.ModelComponentSetMarkers_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ModelComponentSetMarkers(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelSimulationJNI.ModelComponentSetMarkers_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelSimulationJNI.ModelComponentSetMarkers_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelSimulationJNI.ModelComponentSetMarkers_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ModelComponentSetMarkers(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelSimulationJNI.ModelComponentSetMarkers_getConcreteClassName(swigCPtr, this);
  }

  public ModelComponentSetMarkers() {
    this(opensimModelSimulationJNI.new_ModelComponentSetMarkers__SWIG_0(), true);
  }

  public ModelComponentSetMarkers(Model model) {
    this(opensimModelSimulationJNI.new_ModelComponentSetMarkers__SWIG_1(Model.getCPtr(model), model), true);
  }

  public ModelComponentSetMarkers(Model model, String fileName, boolean aUpdateFromXMLNode) {
    this(opensimModelSimulationJNI.new_ModelComponentSetMarkers__SWIG_2(Model.getCPtr(model), model, fileName, aUpdateFromXMLNode), true);
  }

  public ModelComponentSetMarkers(Model model, String fileName) {
    this(opensimModelSimulationJNI.new_ModelComponentSetMarkers__SWIG_3(Model.getCPtr(model), model, fileName), true);
  }

  public ModelComponentSetMarkers(ModelComponentSetMarkers source) {
    this(opensimModelSimulationJNI.new_ModelComponentSetMarkers__SWIG_4(ModelComponentSetMarkers.getCPtr(source), source), true);
  }

  public boolean insert(int aIndex, Marker aObject) {
    return opensimModelSimulationJNI.ModelComponentSetMarkers_insert(swigCPtr, this, aIndex, Marker.getCPtr(aObject), aObject);
  }

  public boolean set(int aIndex, Marker aObject, boolean preserveGroups) {
    return opensimModelSimulationJNI.ModelComponentSetMarkers_set__SWIG_0(swigCPtr, this, aIndex, Marker.getCPtr(aObject), aObject, preserveGroups);
  }

  public boolean set(int aIndex, Marker aObject) {
    return opensimModelSimulationJNI.ModelComponentSetMarkers_set__SWIG_1(swigCPtr, this, aIndex, Marker.getCPtr(aObject), aObject);
  }

  public void invokeConnectToModel(Model model) {
    opensimModelSimulationJNI.ModelComponentSetMarkers_invokeConnectToModel(swigCPtr, this, Model.getCPtr(model), model);
  }

  public void invokeInitStateFromProperties(State state) {
    opensimModelSimulationJNI.ModelComponentSetMarkers_invokeInitStateFromProperties(swigCPtr, this, State.getCPtr(state), state);
  }

  public void invokeSetPropertiesFromState(State state) {
    opensimModelSimulationJNI.ModelComponentSetMarkers_invokeSetPropertiesFromState(swigCPtr, this, State.getCPtr(state), state);
  }

  public void invokeGenerateDecorations(boolean fixed, ModelDisplayHints hints, State state, ArrayDecorativeGeometry appendToThis) {
    opensimModelSimulationJNI.ModelComponentSetMarkers_invokeGenerateDecorations(swigCPtr, this, fixed, ModelDisplayHints.getCPtr(hints), hints, State.getCPtr(state), state, ArrayDecorativeGeometry.getCPtr(appendToThis), appendToThis);
  }

}