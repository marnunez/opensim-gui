/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class JointFramesAreTheSame extends OpenSimException {
  private transient long swigCPtr;

  public JointFramesAreTheSame(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.JointFramesAreTheSame_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(JointFramesAreTheSame obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_JointFramesAreTheSame(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public JointFramesAreTheSame(String file, long line, String func, String thisName, String sameName) {
    this(opensimSimulationJNI.new_JointFramesAreTheSame(file, line, func, thisName, sameName), true);
  }

}
