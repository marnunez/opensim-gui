/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class FrameIterator {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public FrameIterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(FrameIterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_FrameIterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean equals(FrameIterator other) {
    return opensimSimulationJNI.FrameIterator_equals(swigCPtr, this, FrameIterator.getCPtr(other), other);
  }

  public Frame __ref__() {
    return new Frame(opensimSimulationJNI.FrameIterator___ref__(swigCPtr, this), false);
  }

  public Frame deref() {
    return new Frame(opensimSimulationJNI.FrameIterator_deref(swigCPtr, this), false);
  }

  public Frame __deref__() {
    long cPtr = opensimSimulationJNI.FrameIterator___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new Frame(cPtr, false);
  }

  public FrameIterator next() {
    return new FrameIterator(opensimSimulationJNI.FrameIterator_next(swigCPtr, this), false);
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.FrameIterator_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Frame(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.FrameIterator_getConcreteClassName(swigCPtr, this);
  }

  public FrameGeometry get_frame_geometry(int i) {
    return new FrameGeometry(opensimSimulationJNI.FrameIterator_get_frame_geometry__SWIG_0(swigCPtr, this, i), false);
  }

  public FrameGeometry get_frame_geometry() {
    return new FrameGeometry(opensimSimulationJNI.FrameIterator_get_frame_geometry__SWIG_1(swigCPtr, this), false);
  }

  public Geometry get_attached_geometry(int i) {
    return new Geometry(opensimSimulationJNI.FrameIterator_get_attached_geometry(swigCPtr, this, i), false);
  }

  public boolean get_has_output_position() {
    return opensimSimulationJNI.FrameIterator__has_output_position_get(swigCPtr, this);
  }

  public boolean get_has_output_transform() {
    return opensimSimulationJNI.FrameIterator__has_output_transform_get(swigCPtr, this);
  }

  public boolean get_has_output_velocity() {
    return opensimSimulationJNI.FrameIterator__has_output_velocity_get(swigCPtr, this);
  }

  public boolean get_has_output_angular_velocity() {
    return opensimSimulationJNI.FrameIterator__has_output_angular_velocity_get(swigCPtr, this);
  }

  public boolean get_has_output_linear_velocity() {
    return opensimSimulationJNI.FrameIterator__has_output_linear_velocity_get(swigCPtr, this);
  }

  public boolean get_has_output_acceleration() {
    return opensimSimulationJNI.FrameIterator__has_output_acceleration_get(swigCPtr, this);
  }

  public boolean get_has_output_angular_acceleration() {
    return opensimSimulationJNI.FrameIterator__has_output_angular_acceleration_get(swigCPtr, this);
  }

  public boolean get_has_output_linear_acceleration() {
    return opensimSimulationJNI.FrameIterator__has_output_linear_acceleration_get(swigCPtr, this);
  }

  public Transform getTransformInGround(State state) {
    return new Transform(opensimSimulationJNI.FrameIterator_getTransformInGround(swigCPtr, this, State.getCPtr(state), state), false);
  }

  public SpatialVec getVelocityInGround(State state) {
    return new SpatialVec(opensimSimulationJNI.FrameIterator_getVelocityInGround(swigCPtr, this, State.getCPtr(state), state), false);
  }

  public Vec3 getAngularVelocityInGround(State state) {
    return new Vec3(opensimSimulationJNI.FrameIterator_getAngularVelocityInGround(swigCPtr, this, State.getCPtr(state), state), false);
  }

  public Vec3 getLinearVelocityInGround(State state) {
    return new Vec3(opensimSimulationJNI.FrameIterator_getLinearVelocityInGround(swigCPtr, this, State.getCPtr(state), state), false);
  }

  public SpatialVec getAccelerationInGround(State state) {
    return new SpatialVec(opensimSimulationJNI.FrameIterator_getAccelerationInGround(swigCPtr, this, State.getCPtr(state), state), false);
  }

  public Vec3 getAngularAccelerationInGround(State state) {
    return new Vec3(opensimSimulationJNI.FrameIterator_getAngularAccelerationInGround(swigCPtr, this, State.getCPtr(state), state), false);
  }

  public Vec3 getLinearAccelerationInGround(State state) {
    return new Vec3(opensimSimulationJNI.FrameIterator_getLinearAccelerationInGround(swigCPtr, this, State.getCPtr(state), state), false);
  }

  public Transform findTransformBetween(State state, Frame otherFrame) {
    return new Transform(opensimSimulationJNI.FrameIterator_findTransformBetween(swigCPtr, this, State.getCPtr(state), state, Frame.getCPtr(otherFrame), otherFrame), true);
  }

  public Vec3 expressVectorInAnotherFrame(State state, Vec3 vec_F, Frame otherFrame) {
    return new Vec3(opensimSimulationJNI.FrameIterator_expressVectorInAnotherFrame(swigCPtr, this, State.getCPtr(state), state, Vec3.getCPtr(vec_F), vec_F, Frame.getCPtr(otherFrame), otherFrame), true);
  }

  public Vec3 expressVectorInGround(State state, Vec3 vec_F) {
    return new Vec3(opensimSimulationJNI.FrameIterator_expressVectorInGround(swigCPtr, this, State.getCPtr(state), state, Vec3.getCPtr(vec_F), vec_F), true);
  }

  public Vec3 findStationLocationInAnotherFrame(State state, Vec3 station_F, Frame otherFrame) {
    return new Vec3(opensimSimulationJNI.FrameIterator_findStationLocationInAnotherFrame(swigCPtr, this, State.getCPtr(state), state, Vec3.getCPtr(station_F), station_F, Frame.getCPtr(otherFrame), otherFrame), true);
  }

  public Vec3 findStationLocationInGround(State state, Vec3 station_F) {
    return new Vec3(opensimSimulationJNI.FrameIterator_findStationLocationInGround(swigCPtr, this, State.getCPtr(state), state, Vec3.getCPtr(station_F), station_F), true);
  }

  public Vec3 findStationVelocityInGround(State state, Vec3 station_F) {
    return new Vec3(opensimSimulationJNI.FrameIterator_findStationVelocityInGround(swigCPtr, this, State.getCPtr(state), state, Vec3.getCPtr(station_F), station_F), true);
  }

  public Vec3 findStationAccelerationInGround(State state, Vec3 station_F) {
    return new Vec3(opensimSimulationJNI.FrameIterator_findStationAccelerationInGround(swigCPtr, this, State.getCPtr(state), state, Vec3.getCPtr(station_F), station_F), true);
  }

  public Frame findBaseFrame() {
    return new Frame(opensimSimulationJNI.FrameIterator_findBaseFrame(swigCPtr, this), false);
  }

  public Transform findTransformInBaseFrame() {
    return new Transform(opensimSimulationJNI.FrameIterator_findTransformInBaseFrame(swigCPtr, this), true);
  }

  public Vec3 getPositionInGround(State state) {
    return new Vec3(opensimSimulationJNI.FrameIterator_getPositionInGround(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public Model getModel() {
    return new Model(opensimSimulationJNI.FrameIterator_getModel(swigCPtr, this), false);
  }

  public boolean hasModel() {
    return opensimSimulationJNI.FrameIterator_hasModel(swigCPtr, this);
  }

  public void addToSystem(SWIGTYPE_p_SimTK__MultibodySystem system) {
    opensimSimulationJNI.FrameIterator_addToSystem(swigCPtr, this, SWIGTYPE_p_SimTK__MultibodySystem.getCPtr(system));
  }

  public void initStateFromProperties(State state) {
    opensimSimulationJNI.FrameIterator_initStateFromProperties(swigCPtr, this, State.getCPtr(state), state);
  }

  public void generateDecorations(boolean fixed, ModelDisplayHints hints, State state, ArrayDecorativeGeometry appendToThis) {
    opensimSimulationJNI.FrameIterator_generateDecorations(swigCPtr, this, fixed, ModelDisplayHints.getCPtr(hints), hints, State.getCPtr(state), state, ArrayDecorativeGeometry.getCPtr(appendToThis), appendToThis);
  }

  public SWIGTYPE_p_SimTK__MultibodySystem getSystem() {
    return new SWIGTYPE_p_SimTK__MultibodySystem(opensimSimulationJNI.FrameIterator_getSystem(swigCPtr, this), false);
  }

  public boolean hasSystem() {
    return opensimSimulationJNI.FrameIterator_hasSystem(swigCPtr, this);
  }

  public boolean isComponentInOwnershipTree(Component component) {
    return opensimSimulationJNI.FrameIterator_isComponentInOwnershipTree(swigCPtr, this, Component.getCPtr(component), component);
  }

  public String getAbsolutePathString() {
    return opensimSimulationJNI.FrameIterator_getAbsolutePathString(swigCPtr, this);
  }

  public ComponentPath getAbsolutePath() {
    return new ComponentPath(opensimSimulationJNI.FrameIterator_getAbsolutePath(swigCPtr, this), true);
  }

  public String getRelativePathString(Component wrt) {
    return opensimSimulationJNI.FrameIterator_getRelativePathString(swigCPtr, this, Component.getCPtr(wrt), wrt);
  }

  public ComponentPath getRelativePath(Component wrt) {
    return new ComponentPath(opensimSimulationJNI.FrameIterator_getRelativePath(swigCPtr, this, Component.getCPtr(wrt), wrt), true);
  }

  public boolean hasComponent(String pathname) {
    return opensimSimulationJNI.FrameIterator_hasComponent(swigCPtr, this, pathname);
  }

  public Component getComponent(String pathname) {
    return new Component(opensimSimulationJNI.FrameIterator_getComponent(swigCPtr, this, pathname), false);
  }

  public long printComponentsMatching(String substring) {
    return opensimSimulationJNI.FrameIterator_printComponentsMatching(swigCPtr, this, substring);
  }

  public int getNumStateVariables() {
    return opensimSimulationJNI.FrameIterator_getNumStateVariables(swigCPtr, this);
  }

  public ArrayStr getStateVariableNames() {
    return new ArrayStr(opensimSimulationJNI.FrameIterator_getStateVariableNames(swigCPtr, this), true);
  }

  public int getNumSockets() {
    return opensimSimulationJNI.FrameIterator_getNumSockets(swigCPtr, this);
  }

  public OpenSimObject getConnectee(String name) {
    return new OpenSimObject(opensimSimulationJNI.FrameIterator_getConnectee(swigCPtr, this, name), false);
  }

  public AbstractSocket getSocket(String name) {
    return new AbstractSocket(opensimSimulationJNI.FrameIterator_getSocket(swigCPtr, this, name), false);
  }

  public int getNumInputs() {
    return opensimSimulationJNI.FrameIterator_getNumInputs(swigCPtr, this);
  }

  public int getNumOutputs() {
    return opensimSimulationJNI.FrameIterator_getNumOutputs(swigCPtr, this);
  }

  public StdVectorString getInputNames() {
    return new StdVectorString(opensimSimulationJNI.FrameIterator_getInputNames(swigCPtr, this), true);
  }

  public StdVectorString getOutputNames() {
    return new StdVectorString(opensimSimulationJNI.FrameIterator_getOutputNames(swigCPtr, this), true);
  }

  public AbstractInput getInput(String name) {
    return new AbstractInput(opensimSimulationJNI.FrameIterator_getInput(swigCPtr, this, name), false);
  }

  public AbstractOutput getOutput(String name) {
    return new AbstractOutput(opensimSimulationJNI.FrameIterator_getOutput(swigCPtr, this, name), false);
  }

  public int getModelingOption(State state, String name) {
    return opensimSimulationJNI.FrameIterator_getModelingOption(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setModelingOption(State state, String name, int flag) {
    opensimSimulationJNI.FrameIterator_setModelingOption(swigCPtr, this, State.getCPtr(state), state, name, flag);
  }

  public double getStateVariableValue(State state, String name) {
    return opensimSimulationJNI.FrameIterator_getStateVariableValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setStateVariableValue(State state, String name, double value) {
    opensimSimulationJNI.FrameIterator_setStateVariableValue(swigCPtr, this, State.getCPtr(state), state, name, value);
  }

  public Vector getStateVariableValues(State state) {
    return new Vector(opensimSimulationJNI.FrameIterator_getStateVariableValues(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public void setStateVariableValues(State state, Vector values) {
    opensimSimulationJNI.FrameIterator_setStateVariableValues(swigCPtr, this, State.getCPtr(state), state, Vector.getCPtr(values), values);
  }

  public double getStateVariableDerivativeValue(State state, String name) {
    return opensimSimulationJNI.FrameIterator_getStateVariableDerivativeValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public double getDiscreteVariableValue(State state, String name) {
    return opensimSimulationJNI.FrameIterator_getDiscreteVariableValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setDiscreteVariableValue(State state, String name, double value) {
    opensimSimulationJNI.FrameIterator_setDiscreteVariableValue(swigCPtr, this, State.getCPtr(state), state, name, value);
  }

  public void markCacheVariableValid(State state, String name) {
    opensimSimulationJNI.FrameIterator_markCacheVariableValid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void markCacheVariableInvalid(State state, String name) {
    opensimSimulationJNI.FrameIterator_markCacheVariableInvalid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public boolean isCacheVariableValid(State state, String name) {
    return opensimSimulationJNI.FrameIterator_isCacheVariableValid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void printSubcomponentInfo() {
    opensimSimulationJNI.FrameIterator_printSubcomponentInfo(swigCPtr, this);
  }

  public void printSocketInfo() {
    opensimSimulationJNI.FrameIterator_printSocketInfo(swigCPtr, this);
  }

  public void printInputInfo() {
    opensimSimulationJNI.FrameIterator_printInputInfo(swigCPtr, this);
  }

  public void printOutputInfo(boolean includeDescendants) {
    opensimSimulationJNI.FrameIterator_printOutputInfo__SWIG_0(swigCPtr, this, includeDescendants);
  }

  public void printOutputInfo() {
    opensimSimulationJNI.FrameIterator_printOutputInfo__SWIG_1(swigCPtr, this);
  }

  public Component getOwner() {
    return new Component(opensimSimulationJNI.FrameIterator_getOwner(swigCPtr, this), false);
  }

  public boolean hasOwner() {
    return opensimSimulationJNI.FrameIterator_hasOwner(swigCPtr, this);
  }

  public Component getRoot() {
    return new Component(opensimSimulationJNI.FrameIterator_getRoot(swigCPtr, this), false);
  }

  public Component findComponent(ComponentPath pathToFind) {
    long cPtr = opensimSimulationJNI.FrameIterator_findComponent__SWIG_2(swigCPtr, this, ComponentPath.getCPtr(pathToFind), pathToFind);
    return (cPtr == 0) ? null : new Component(cPtr, false);
  }

  public Component findComponent(String pathToFind) {
    long cPtr = opensimSimulationJNI.FrameIterator_findComponent__SWIG_3(swigCPtr, this, pathToFind);
    return (cPtr == 0) ? null : new Component(cPtr, false);
  }

  public ComponentsList getComponentsList() {
    return new ComponentsList(opensimSimulationJNI.FrameIterator_getComponentsList(swigCPtr, this), true);
  }

  public boolean isEqualTo(OpenSimObject aObject) {
    return opensimSimulationJNI.FrameIterator_isEqualTo(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public String getName() {
    return opensimSimulationJNI.FrameIterator_getName(swigCPtr, this);
  }

  public String getDescription() {
    return opensimSimulationJNI.FrameIterator_getDescription(swigCPtr, this);
  }

  public String getAuthors() {
    return opensimSimulationJNI.FrameIterator_getAuthors(swigCPtr, this);
  }

  public String getReferences() {
    return opensimSimulationJNI.FrameIterator_getReferences(swigCPtr, this);
  }

  public int getNumProperties() {
    return opensimSimulationJNI.FrameIterator_getNumProperties(swigCPtr, this);
  }

  public AbstractProperty getPropertyByIndex(int propertyIndex) {
    return new AbstractProperty(opensimSimulationJNI.FrameIterator_getPropertyByIndex(swigCPtr, this, propertyIndex), false);
  }

  public boolean hasProperty(String name) {
    return opensimSimulationJNI.FrameIterator_hasProperty(swigCPtr, this, name);
  }

  public AbstractProperty getPropertyByName(String name) {
    return new AbstractProperty(opensimSimulationJNI.FrameIterator_getPropertyByName(swigCPtr, this, name), false);
  }

  public boolean isObjectUpToDateWithProperties() {
    return opensimSimulationJNI.FrameIterator_isObjectUpToDateWithProperties(swigCPtr, this);
  }

  public void updateXMLNode(SWIGTYPE_p_SimTK__Xml__Element parent, AbstractProperty prop) {
    opensimSimulationJNI.FrameIterator_updateXMLNode__SWIG_0(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(parent), AbstractProperty.getCPtr(prop), prop);
  }

  public void updateXMLNode(SWIGTYPE_p_SimTK__Xml__Element parent) {
    opensimSimulationJNI.FrameIterator_updateXMLNode__SWIG_1(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(parent));
  }

  public boolean getInlined() {
    return opensimSimulationJNI.FrameIterator_getInlined(swigCPtr, this);
  }

  public String getDocumentFileName() {
    return opensimSimulationJNI.FrameIterator_getDocumentFileName(swigCPtr, this);
  }

  public int getDocumentFileVersion() {
    return opensimSimulationJNI.FrameIterator_getDocumentFileVersion(swigCPtr, this);
  }

  public boolean print(String fileName) {
    return opensimSimulationJNI.FrameIterator_print(swigCPtr, this, fileName);
  }

  public boolean isA(String type) {
    return opensimSimulationJNI.FrameIterator_isA(swigCPtr, this, type);
  }

  public String toString() {
    return opensimSimulationJNI.FrameIterator_toString(swigCPtr, this);
  }

}
