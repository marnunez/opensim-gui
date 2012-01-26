/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Controller extends ModelComponent {
  private long swigCPtr;

  public Controller(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.Controller_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Controller obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_Controller(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public int getNumStateVariables() {
    return opensimModelJNI.Controller_getNumStateVariables(swigCPtr, this);
  }

  public boolean isDisabled() {
    return opensimModelJNI.Controller_isDisabled(swigCPtr, this);
  }

  public void setDisabled(boolean disableFlag) {
    opensimModelJNI.Controller_setDisabled(swigCPtr, this, disableFlag);
  }

  public void computeControls(SWIGTYPE_p_SimTK__State s, SWIGTYPE_p_SimTK__Vector controls) {
    opensimModelJNI.Controller_computeControls(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s), SWIGTYPE_p_SimTK__Vector.getCPtr(controls));
  }

  public void setActuators(SetActuators actuators) {
    opensimModelJNI.Controller_setActuators(swigCPtr, this, SetActuators.getCPtr(actuators), actuators);
  }

  public void addActuator(Actuator actuator) {
    opensimModelJNI.Controller_addActuator(swigCPtr, this, Actuator.getCPtr(actuator), actuator);
  }

  public SetActuators getActuatorSet() {
    return new SetActuators(opensimModelJNI.Controller_getActuatorSet(swigCPtr, this), false);
  }

  public SetActuators updActuators() {
    return new SetActuators(opensimModelJNI.Controller_updActuators(swigCPtr, this), false);
  }

  public ArrayStr getActuatorNames() {
    return new ArrayStr(opensimModelJNI.Controller_getActuatorNames(swigCPtr, this), false);
  }

}
