/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Component extends OpenSimObject {
  private transient long swigCPtr;

  public Component(long cPtr, boolean cMemoryOwn) {
    super(opensimModelCommonJNI.Component_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Component obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelCommonJNI.delete_Component(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void addComponent(Component comp) {
      comp.markAdopted();
      private_addComponent(comp);
  }

  public static Component safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelCommonJNI.Component_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Component(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelCommonJNI.Component_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelCommonJNI.Component_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelCommonJNI.Component_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Component(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelCommonJNI.Component_getConcreteClassName(swigCPtr, this);
  }

  public void finalizeFromProperties() {
    opensimModelCommonJNI.Component_finalizeFromProperties(swigCPtr, this);
  }

  public void connect(Component root) {
    opensimModelCommonJNI.Component_connect(swigCPtr, this, Component.getCPtr(root), root);
  }

  public void disconnect() {
    opensimModelCommonJNI.Component_disconnect(swigCPtr, this);
  }

  public void addToSystem(SWIGTYPE_p_SimTK__MultibodySystem system) {
    opensimModelCommonJNI.Component_addToSystem(swigCPtr, this, SWIGTYPE_p_SimTK__MultibodySystem.getCPtr(system));
  }

  public void initStateFromProperties(State state) {
    opensimModelCommonJNI.Component_initStateFromProperties(swigCPtr, this, State.getCPtr(state), state);
  }

  public void setPropertiesFromState(State state) {
    opensimModelCommonJNI.Component_setPropertiesFromState(swigCPtr, this, State.getCPtr(state), state);
  }

  public void generateDecorations(boolean fixed, ModelDisplayHints hints, State state, ArrayDecorativeGeometry appendToThis) {
    opensimModelCommonJNI.Component_generateDecorations(swigCPtr, this, fixed, ModelDisplayHints.getCPtr(hints), hints, State.getCPtr(state), state, ArrayDecorativeGeometry.getCPtr(appendToThis), appendToThis);
  }

  public SWIGTYPE_p_SimTK__MultibodySystem getSystem() {
    return new SWIGTYPE_p_SimTK__MultibodySystem(opensimModelCommonJNI.Component_getSystem(swigCPtr, this), false);
  }

  public boolean hasSystem() {
    return opensimModelCommonJNI.Component_hasSystem(swigCPtr, this);
  }

  private void private_addComponent(Component comp) {
    opensimModelCommonJNI.Component_private_addComponent(swigCPtr, this, Component.getCPtr(comp), comp);
  }

  public String getFullPathName() {
    return opensimModelCommonJNI.Component_getFullPathName(swigCPtr, this);
  }

  public String getRelativePathName(Component wrt) {
    return opensimModelCommonJNI.Component_getRelativePathName(swigCPtr, this, Component.getCPtr(wrt), wrt);
  }

  public int getNumStateVariables() {
    return opensimModelCommonJNI.Component_getNumStateVariables(swigCPtr, this);
  }

  public ArrayStr getStateVariableNames() {
    return new ArrayStr(opensimModelCommonJNI.Component_getStateVariableNames(swigCPtr, this), true);
  }

  public int getNumConnectors() {
    return opensimModelCommonJNI.Component_getNumConnectors(swigCPtr, this);
  }

  public int getNumInputs() {
    return opensimModelCommonJNI.Component_getNumInputs(swigCPtr, this);
  }

  public int getNumOutputs() {
    return opensimModelCommonJNI.Component_getNumOutputs(swigCPtr, this);
  }

  public StdVectorString getOutputNames() {
    return new StdVectorString(opensimModelCommonJNI.Component_getOutputNames(swigCPtr, this), true);
  }

  public AbstractConnector getConnector(int i) {
    return new AbstractConnector(opensimModelCommonJNI.Component_getConnector(swigCPtr, this, i), false);
  }

  public AbstractConnector updConnector(int i) {
    return new AbstractConnector(opensimModelCommonJNI.Component_updConnector(swigCPtr, this, i), false);
  }

  public AbstractInput getInput(String name) {
    return new AbstractInput(opensimModelCommonJNI.Component_getInput(swigCPtr, this, name), false);
  }

  public AbstractInput updInput(String name) {
    return new AbstractInput(opensimModelCommonJNI.Component_updInput(swigCPtr, this, name), false);
  }

  public AbstractOutput getOutput(String name) {
    return new AbstractOutput(opensimModelCommonJNI.Component_getOutput(swigCPtr, this, name), false);
  }

  public AbstractOutput updOutput(String name) {
    return new AbstractOutput(opensimModelCommonJNI.Component_updOutput(swigCPtr, this, name), false);
  }

  public SWIGTYPE_p_std__mapT_std__string_SimTK__ClonePtrT_OpenSim__AbstractOutput_t_t__const_iterator getOutputsBegin() {
    return new SWIGTYPE_p_std__mapT_std__string_SimTK__ClonePtrT_OpenSim__AbstractOutput_t_t__const_iterator(opensimModelCommonJNI.Component_getOutputsBegin(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__mapT_std__string_SimTK__ClonePtrT_OpenSim__AbstractOutput_t_t__const_iterator getOutputsEnd() {
    return new SWIGTYPE_p_std__mapT_std__string_SimTK__ClonePtrT_OpenSim__AbstractOutput_t_t__const_iterator(opensimModelCommonJNI.Component_getOutputsEnd(swigCPtr, this), true);
  }

  public int getModelingOption(State state, String name) {
    return opensimModelCommonJNI.Component_getModelingOption(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setModelingOption(State state, String name, int flag) {
    opensimModelCommonJNI.Component_setModelingOption(swigCPtr, this, State.getCPtr(state), state, name, flag);
  }

  public double getStateVariableValue(State state, String name) {
    return opensimModelCommonJNI.Component_getStateVariableValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setStateVariableValue(State state, String name, double value) {
    opensimModelCommonJNI.Component_setStateVariableValue(swigCPtr, this, State.getCPtr(state), state, name, value);
  }

  public Vector getStateVariableValues(State state) {
    return new Vector(opensimModelCommonJNI.Component_getStateVariableValues(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public void setStateVariableValues(State state, Vector values) {
    opensimModelCommonJNI.Component_setStateVariableValues(swigCPtr, this, State.getCPtr(state), state, Vector.getCPtr(values), values);
  }

  public double getStateVariableDerivativeValue(State state, String name) {
    return opensimModelCommonJNI.Component_getStateVariableDerivativeValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public double getDiscreteVariableValue(State state, String name) {
    return opensimModelCommonJNI.Component_getDiscreteVariableValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setDiscreteVariableValue(State state, String name, double value) {
    opensimModelCommonJNI.Component_setDiscreteVariableValue(swigCPtr, this, State.getCPtr(state), state, name, value);
  }

  public void markCacheVariableValid(State state, String name) {
    opensimModelCommonJNI.Component_markCacheVariableValid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void markCacheVariableInvalid(State state, String name) {
    opensimModelCommonJNI.Component_markCacheVariableInvalid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public boolean isCacheVariableValid(State state, String name) {
    return opensimModelCommonJNI.Component_isCacheVariableValid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void dumpSubcomponents(int depth) {
    opensimModelCommonJNI.Component_dumpSubcomponents__SWIG_0(swigCPtr, this, depth);
  }

  public void dumpSubcomponents() {
    opensimModelCommonJNI.Component_dumpSubcomponents__SWIG_1(swigCPtr, this);
  }

  public void dumpConnections() {
    opensimModelCommonJNI.Component_dumpConnections(swigCPtr, this);
  }

  public AbstractConnector findConnector(String name) {
    long cPtr = opensimModelCommonJNI.Component_findConnector(swigCPtr, this, name);
    return (cPtr == 0) ? null : new AbstractConnector(cPtr, false);
  }

  public Component getParent() {
    return new Component(opensimModelCommonJNI.Component_getParent(swigCPtr, this), false);
  }

  public boolean hasParent() {
    return opensimModelCommonJNI.Component_hasParent(swigCPtr, this);
  }

  public ComponentsList getComponentsList() {
    return new ComponentsList(opensimModelCommonJNI.Component_getComponentsList(swigCPtr, this), true);
  }

}
