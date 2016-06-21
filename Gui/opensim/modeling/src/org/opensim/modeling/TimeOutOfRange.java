/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class TimeOutOfRange extends InvalidTimestamp {
  private transient long swigCPtr;

  public TimeOutOfRange(long cPtr, boolean cMemoryOwn) {
    super(opensimModelCommonJNI.TimeOutOfRange_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(TimeOutOfRange obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelCommonJNI.delete_TimeOutOfRange(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public TimeOutOfRange(String file, long line, String func, double timestamp, double minTimestamp, double maxTimestamp) {
    this(opensimModelCommonJNI.new_TimeOutOfRange(file, line, func, timestamp, minTimestamp, maxTimestamp), true);
  }

}
